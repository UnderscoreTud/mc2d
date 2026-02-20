package me.tud.mc2d.ticker;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FutureCallback;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import it.unimi.dsi.fastutil.longs.LongLists;
import lombok.Getter;
import lombok.SneakyThrows;
import me.tud.mc2d.util.FunctionalFutureCallback;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/**
 * The Ticker is a core component of the server responsible for managing time within the game.
 * <p>
 * It ensures that the game world is updated at regular intervals, known as "ticks".
 * A server tick is a single cycle of the game loop where various game mechanics are updated,
 * including entity movement, block changes, and scheduled events.
 * <p>
 * This always happens on the main server thread (tick thread).
 * <p>
 * The game runs at a fixed tick rate of 20 ticks per second (TPS),
 * meaning each tick occurs every 50 milliseconds.
 * Maintaining a consistent TPS is crucial for smooth gameplay.
 */
public class Ticker implements ScheduledExecutorService {

    /**
     * Returns ticker for current thread if such a ticker
     * exists.
     *
     * @return ticker for current thread
     */
    static Optional<Ticker> current() {
        Thread current = Thread.currentThread();
        if (!(current instanceof TickThread tickThread)) return Optional.empty();
        return Optional.of(tickThread.ticker());
    }

    private Thread tickThread;

    private volatile boolean frozen = false; // if the ticker is frozen right now

    // future used by the #freeze method, if present, indicates the
    // freeze has been requested and the ticker should freeze before next tick
    private @Nullable CompletableFuture<Void> freezeFuture;

    private final ReentrantLock freezeLock = new ReentrantLock();
    private final Condition freezeCondition = freezeLock.newCondition(); // stops the tick thread if frozen

    // ticks to step forward while being frozen
    private final AtomicLong steppingTicks = new AtomicLong(0);

    /**
     * Target tick rate.
     */
    @Getter
    private volatile float targetTickRate;

    /**
     * Active tasks left to execute.
     */
    private final Set<TickingTask<?>> tasks = Collections.synchronizedSet(new LinkedHashSet<>());

    /**
     * Tasks to add on the next tick.
     */
    private final Set<TickingTask<?>> tasksToAdd = Collections.synchronizedSet(new LinkedHashSet<>());

    /**
     * Tasks to remove before the next tick.
     */
    private final Set<TickingTask<?>> tasksToRemove = Collections.synchronizedSet(new LinkedHashSet<>());

    private volatile boolean shuttingDown = false;
    private volatile boolean shuttingDownNow = false;

    private final CompletableFuture<Void> terminateFuture = new CompletableFuture<>();

    /**
     * List containing the durations of last 20 server ticks in millis.
     */
    private final LongList lastTicks = LongLists.synchronize(new LongArrayList());

    /**
     * Creates and starts a new server ticker.
     *
     * @param targetTickRate target tick rate of the ticker
     */
    public Ticker(float targetTickRate) {
        this(Thread.currentThread().getThreadGroup(), targetTickRate);
    }

    /**
     * Creates and starts a new server ticker.
     *
     * @param tickThreadGroup group used by the tick thread
     * @param targetTickRate target tick rate of the ticker
     */
    public Ticker(ThreadGroup tickThreadGroup, float targetTickRate) {
        Preconditions.checkNotNull(tickThreadGroup, "Tick thread group can not be null");
        targetTickRate(targetTickRate);
        new TickThread(tickThreadGroup, this::run, () -> this).start();
    }

    /**
     * Starts the ticker.
     */
    private void run() {
        Preconditions.checkState(tickThread == null, "Ticker is already running");
        tickThread = Thread.currentThread();
        startTicking();
    }

    /**
     * Executes the next tick.
     */
    @SneakyThrows
    private void startTicking() {
        Preconditions.checkState(isTickThread(), "Ticking on not a tick thread");
        while (true) {
            Instant tickStart = Instant.now();

            for (TickingTask<?> task : tasks) {
                if (shuttingDownNow) break;
                if (handleTask(task)) tasksToRemove.add(task);
            }

            if (shuttingDown) {
                terminateFuture.complete(null);
                return;
            }

            tasks.removeAll(tasksToRemove);
            tasksToRemove.clear();

            // normal tick
            if (!frozen && steppingTicks.get() == 0) {
                long took = ChronoUnit.MILLIS.between(tickStart, Instant.now());
                long target = (long) (1000 / targetTickRate);

                if (took < target) {
                    //noinspection BusyWait
                    Thread.sleep(target - took);
                    lastTicks.addFirst(target);
                } else {
                    lastTicks.addFirst(took);
                }

                while (lastTicks.size() > 20)
                    lastTicks.removeLast();
            }

            // last stepping tick while frozen
            if (frozen && steppingTicks.get() == 1) {
                steppingTicks.decrementAndGet();
                freezeLock.lock();
                try {
                    freezeCondition.await();
                } finally {
                    freezeLock.unlock();
                }
            }

            // freezing the ticker
            if (freezeFuture != null && steppingTicks.get() == 0) {
                freezeLock.lock();
                try {
                    frozen = true;
                    freezeFuture.complete(null);
                    freezeFuture = null;
                    freezeCondition.await();
                } finally {
                    freezeLock.unlock();
                }
            }

            tasks.addAll(tasksToAdd);
            tasksToAdd.clear();
        }
    }

    /**
     * Handles the next task to execute.
     * <p>
     * This can either execute the task if it is ready for execution or
     * delay it for later.
     * <p>
     * This also takes care of the rescheduling the task if needed.
     *
     * @param task task to handle
     * @return whether the task should be removed
     */
    @SuppressWarnings("unchecked")
    private boolean handleTask(TickingTask<?> task) {
        if (task.isCancelled()) {
            return true;
        }

        if (shuttingDownNow) {
            return false;
        }

        if (task.remainingTicks() != 0) {
            task.tick();
            return false;
        }

        if (task.period() == -1) {
            executeTask((TickingTask<Object>) task, true);
            return true;
        } else {
            task.resetRemainingTicks();
            executeTask((TickingTask<Object>) task, false);
            return task.isDone();
        }
    }

    /**
     * Executes given task.
     * <p>
     * The task is completed if exception is thrown during the execution or is marked
     * as {@code shouldFinish}.
     *
     * @param task task to execute
     * @param shouldFinish whether the task is expected to finish or will be rescheduled later
     */
    private void executeTask(TickingTask<Object> task, boolean shouldFinish) {
        task.running(true);
        try {
            Object result = task.callable().call();
            if (shouldFinish) task.finish(result, null);
        } catch (Exception exception) {
            task.finish(null, exception);
        }
        task.running(false);
    }

    /**
     * Adds task to the tasks to run.
     *
     * @param task task to add
     * @return task
     * @param <T> return type
     */
    @Contract("_ -> param1")
    private <T> TickingTask<T> addTask(TickingTask<T> task) {
        if (shuttingDown) return task;
        Preconditions.checkNotNull(task, "Task can not be null");
        Preconditions.checkState(!task.isDone(), "Task has already finished");
        tasksToAdd.add(task);
        return task;
    }

    /**
     * Returns whether the ticker accepts new tasks;
     * meaning is ticking or may be ticking in the future.
     * <p>
     * If the ticker is frozen but not closed, this will always return {@code true}.
     * If the ticker is closed, it means it can not tick again and this
     * will always return {@code false}.
     *
     * @return whether the ticker is running
     */
    public boolean acceptsTasks() {
        return !shuttingDown;
    }

    /**
     * Returns whether the ticker is currently frozen.
     * <p>
     * In frozen state it is possible to call {@link #step(int)} to
     * advances the processing by the specified number of ticks.
     *
     * @return whether the ticker is frozen
     */
    public boolean frozen() {
        return frozen;
    }

    /**
     * Stops the ticker from ticking.
     * <p>
     * Does nothing if the ticker is already frozen.
     * <p>
     * This does not happen instantly. The current tick is finished and
     * then the ticker is frozen.
     * <p>
     * Freezing the ticker has no effect on {@link #tickRate()} ()}.
     *
     * @return future of when the ticker is frozen, if the ticker is closed during the
     * freeze request, the future is canceled
     * @see #frozen()
     */
    public CompletableFuture<Void> freeze() {
        if (frozen) return CompletableFuture.completedFuture(null);
        freezeLock.lock();
        try {
            if (freezeFuture == null) freezeFuture = new CompletableFuture<>();
            return freezeFuture;
        } finally {
            freezeLock.unlock();
        }
    }

    /**
     * Starts ticking again if the ticker is frozen.
     * <p>
     * Does nothing if the ticker is running.
     *
     * @return whether the ticker has been unfrozen
     * @see #frozen()
     */
    public boolean unfreeze() {
        if (!frozen) return false;
        frozen = false;
        freezeLock.lock();
        try {
            freezeCondition.signalAll();
            return true;
        } finally {
            freezeLock.unlock();
        }
    }

    /**
     * Advances the processing by one tick.
     * <p>
     * Stepping ticks forward has no effect on {@link #tickRate()} ()}.
     *
     * @return future when the ticks are processed
     */
    public CompletableFuture<Void> step() {
        return step(1);
    }

    /**
     * Advances the processing by the specified number of ticks.
     * <p>
     * Stepping ticks forward has no effect on {@link #tickRate()} ()}.
     *
     * @param ticks number of ticks to process
     * @return future when the ticks are processed
     */
    public CompletableFuture<Void> step(int ticks) {
        if (ticks <= 0) return CompletableFuture.completedFuture(null);
        steppingTicks.addAndGet(ticks);
        CompletableFuture<Void> future = runAfter(() -> null, ticks - 1); // 0 means running next tick which is the same as step 1 tick forward
        if (frozen) {
            freezeLock.lock();
            try {
                freezeCondition.signalAll();
            } finally {
                freezeLock.unlock();
            }
        }
        return future;
    }

    /**
     * Returns tick rate of the ticker.
     * <p>
     * This is not the value set by {@link #targetTickRate(float)} but
     * the real tick rate of the ticker.
     *
     * @return server tick rate or {@code 0} if the information is not available
     */
    public float tickRate() {
        return (float) (1000 / lastTicks.longStream().average().orElse(0));
    }

    /**
     * Changes the target tick rate of the ticker.
     * <p>
     * This is not the value received by {@link #tickRate()} ()} but
     * the target tick rate of the ticker under perfect conditions.
     *
     * @param tickRate target tick rate
     */
    public void targetTickRate(float tickRate) {
        Preconditions.checkState(tickRate > 0, "Target tick rate has to be more than 0");
        targetTickRate = tickRate;
    }

    /**
     * Returns the average tick duration of this ticker
     * in milliseconds.
     *
     * @return average tick duration or {@code 0} if the information is not available
     */
    public long averageTickDuration() {
        return (long) (targetTickRate() / tickRate() * targetTickDuration());
    }

    /**
     * Returns the target tick duration under perfect
     * conditions.
     *
     * @return target tick duration
     */
    public long targetTickDuration() {
        return (long) (1000 / targetTickRate());
    }

    /**
     * Runs given task the next tick.
     *
     * @param supplier task to run
     * @return future
     * @param <T> return type
     */
    public <T> CompletableFuture<T> runNextTick(Supplier<T> supplier) {
        return runAfter(supplier, 0);
    }

    /**
     * Runs given task the next tick.
     *
     * @param supplier task to run
     * @param callback callback
     * @param <T> return type
     */
    public <T> void runNextTick(Supplier<T> supplier, @Nullable FutureCallback<T> callback) {
        runAfter(supplier, 0, callback);
    }

    /**
     * Runs given task the next tick.
     *
     * @param runnable task to run
     * @return future
     */
    public CompletableFuture<Void> runNextTick(Runnable runnable) {
        return runNextTick(() -> { runnable.run(); return null; });
    }

    /**
     * Runs given task the next tick.
     *
     * @param runnable task to run
     * @param callback callback
     */
    public void runNextTick(Runnable runnable, @Nullable FutureCallback<Void> callback) {
        runNextTick(() -> { runnable.run(); return null; }, callback);
    }

    /**
     * Runs given task after given number of ticks.
     *
     * @param supplier task to run
     * @param ticks delay in ticks
     * @return future
     * @param <T> return type
     */
    public <T> CompletableFuture<T> runAfter(Supplier<T> supplier, long ticks) {
        return runRepeatedly(supplier, ticks, -1);
    }

    /**
     * Runs given task after given number of ticks.
     *
     * @param supplier task to run
     * @param ticks delay in ticks
     * @param callback callback
     * @param <T> return type
     */
    public <T> void runAfter(Supplier<T> supplier, long ticks, @Nullable FutureCallback<T> callback) {
        runRepeatedly(supplier, ticks, -1, callback);
    }

    /**
     * Runs given task after given number of ticks.
     *
     * @param runnable task to run
     * @param ticks delay in ticks
     * @return future
     */
    public CompletableFuture<Void> runAfter(Runnable runnable, long ticks) {
        return runRepeatedly(() -> { runnable.run(); return null; }, ticks, -1);
    }

    /**
     * Runs given task after given number of ticks with given period.
     *
     * @param runnable task to run
     * @param ticks delay in ticks
     * @param callback callback
     */
    public void runAfter(Runnable runnable, long ticks, @Nullable FutureCallback<Void> callback) {
        runRepeatedly(() -> { runnable.run(); return null; }, ticks, -1, callback);
    }

    /**
     * Runs given task after given number of ticks with given period.
     *
     * @param supplier task to run
     * @param ticks delay in ticks
     * @param period period, {@code -1} to run the task only once and not repeat it
     * @return future
     * @param <T> return type
     */
    public <T> CompletableFuture<T> runRepeatedly(Supplier<T> supplier, long ticks, long period) {
        CompletableFuture<T> future = new CompletableFuture<>();
        AtomicReference<TickingTask<T>> reference = new AtomicReference<>();
        TickingTask<T> task = new TickingTask<>(supplier::get, ticks, period, FunctionalFutureCallback.create(
                success -> {
                    if (reference.get().isCancelled()) future.cancel(true);
                    else future.complete(success);
                },
                future::completeExceptionally
        ));
        reference.set(task);
        addTask(task);
        return future;
    }

    /**
     * Runs given task after given number of ticks with given period.
     *
     * @param supplier task to run
     * @param ticks delay in ticks
     * @param period period, {@code -1} to run the task only once and not repeat it
     * @param callback callback
     * @param <T> return type
     */
    public <T> void runRepeatedly(Supplier<T> supplier, long ticks, long period, @Nullable FutureCallback<T> callback) {
        addTask(new TickingTask<>(supplier::get, ticks, period, callback));
    }

    /**
     * Runs given task after given number of ticks with given period.
     *
     * @param runnable task to run
     * @param ticks delay in ticks
     * @param period period, {@code -1} to run the task only once and not repeat it
     * @return future
     */
    public CompletableFuture<Void> runRepeatedly(Runnable runnable, long ticks, long period) {
        return runRepeatedly(() -> { runnable.run(); return null; }, ticks, period);
    }

    /**
     * Runs given task after given number of ticks with given period.
     *
     * @param runnable task to run
     * @param ticks delay in ticks
     * @param period period, {@code -1} to run the task only once and not repeat it
     * @param callback callback
     */
    public void runRepeatedly(Runnable runnable, long ticks, long period, @Nullable FutureCallback<Void> callback) {
        runRepeatedly(() -> { runnable.run(); return null; }, ticks, period, callback);
    }

    /**
     * Returns whether the current thread is the tick thread.
     *
     * @return whether the current thread is the tick thread
     */
    public boolean isTickThread() {
        return isTickThread(Thread.currentThread());
    }

    /**
     * Returns whether the given thread is the tick thread.
     *
     * @param thread thread
     * @return whether the given thread is the tick thread
     */
    public boolean isTickThread(Thread thread) {
        return tickThread.equals(thread);
    }

    /**
     * Returns an executor that will run tasks on the next server tick.
     *
     * @return executor using the tick thread
     */
    public Executor tickThreadExecutor() {
        return this::runNextTick;
    }

    /**
     * Returns a scheduled executor that will run tasks on the main thread,
     * using {@link Tick} for conversion for delays and periods.
     * <p>
     * Meaning if task is scheduled to run with delay of 1 second, it
     * will run 20 ticks later which can be longer if the server does
     * not operate smoothly.
     * <p>
     * Due to nature of ticks, it makes no difference whether the tasks
     * scheduled by this service run at fixed rate or with fixed delay.
     * The period of the scheduled task is recalculated as number of ticks
     * using {@link Tick} for conversion. For tick to complete,
     * all pending tasks need to be executed. This makes the scheduling
     * at fixed rate impossible because the next tick is always delayed
     * by the task execution.
     *
     * @return scheduled executor service using the tick thread
     */
    public ScheduledExecutorService tickScheduledExecutor() {
        return this;
    }

    /**
     * Shutdowns the ticker.
     * <p>
     * After that ticker can not accept any new tasks or continue ticking.
     * <p>
     * Before the ticker is shutdown, it will complete the current tick,
     * if the ticker is frozen, it can not be closed safely.
     * <p>
     * To shut down frozen ticker, it is necessary to call {@link ScheduledExecutorService#shutdownNow()}
     * of service return by {@link #tickScheduledExecutor()}. This way the current tick will not be
     * finished and list of unfinished tasks will be returned.
     */
    public void close() {
        ScheduledExecutorService.super.close();
    }

    public @NotNull ScheduledFuture<?> schedule(@NotNull Runnable command, long delay, @NotNull TimeUnit unit) {
        return addTask(new TickingTask<>(command, Tick.of(delay, unit)));
    }

    public <V> @NotNull ScheduledFuture<V> schedule(@NotNull Callable<V> callable, long delay, @NotNull TimeUnit unit) {
        return addTask(new TickingTask<>(callable, Tick.of(delay, unit)));
    }

    public @NotNull ScheduledFuture<?> scheduleAtFixedRate(@NotNull Runnable command, long initialDelay, long period, @NotNull TimeUnit unit) {
        return addTask(new TickingTask<>(command, Tick.of(initialDelay, unit), Tick.of(period, unit)));
    }

    public @NotNull ScheduledFuture<?> scheduleWithFixedDelay(@NotNull Runnable command, long initialDelay, long delay, @NotNull TimeUnit unit) {
        return addTask(new TickingTask<>(command, Tick.of(initialDelay, unit), Tick.of(delay, unit)));
    }

    public void shutdown() {
        shuttingDown = true;
        if (freezeFuture != null) freezeFuture.cancel(true);
    }

    public @NotNull List<Runnable> shutdownNow() {
        shutdown();
        shuttingDownNow = true;
        return tasks.stream()
                .filter(task -> !tasksToRemove.contains(task))
                .map(TickingTask::callable)
                .map(callable -> (Runnable) () -> {
                    try {
                        callable.call();
                    } catch (Exception exception) {
                        throw new RuntimeException(exception);
                    }
                })
                .toList();
    }

    public boolean isShutdown() {
        return shuttingDown;
    }

    public boolean isTerminated() {
        return terminateFuture.isDone();
    }

    public boolean awaitTermination(long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        if (isTerminated()) return true;
        try {
            terminateFuture.get(timeout, unit);
            return true;
        } catch (ExecutionException exception) {
            throw new AssertionError(null, exception);
        } catch (TimeoutException exception) {
            return false;
        }
    }

    public <T> @NotNull Future<T> submit(@NotNull Callable<T> task) {
        return addTask(new TickingTask<>(task, 0));
    }

    public <T> @NotNull Future<T> submit(@NotNull Runnable task, T result) {
        return addTask(new TickingTask<>(() -> {
            task.run();
            return result;
        }, 0));
    }

    public @NotNull Future<?> submit(@NotNull Runnable task) {
        return addTask(new TickingTask<>(task, 0));
    }

    public <T> @NotNull List<Future<T>> invokeAll(@NotNull Collection<? extends Callable<T>> tasks) {
        return invokeAll(tasks, 0, TimeUnit.MILLISECONDS);
    }

    public <T> @NotNull List<Future<T>> invokeAll(@NotNull Collection<? extends Callable<T>> tasks, long timeout, @NotNull TimeUnit unit) {
        return tasks.stream()
                .map(callable -> schedule(callable, timeout, unit))
                .map(future -> (Future<T>) future)
                .toList();
    }

    public <T> @NotNull T invokeAny(@NotNull Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        Preconditions.checkNotNull(tasks, "Tasks can not be null");
        Preconditions.checkState(!tasks.isEmpty(), "Tasks collection is empty");

        CompletionService<T> service = new ExecutorCompletionService<>(this);
        for (Callable<T> task : tasks) service.submit(task);

        while (true) {
            Future<T> future = service.poll();
            if (future.state() != Future.State.SUCCESS) continue;
            return future.get();
        }
    }

    public <T> T invokeAny(@NotNull Collection<? extends Callable<T>> tasks, long timeout, @NotNull TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException {
        Preconditions.checkNotNull(tasks, "Tasks can not be null");

        CompletionService<T> service = new ExecutorCompletionService<>(this);
        for (Callable<T> task : tasks) service.submit(task);

        while (true) {
            Future<T> future = service.poll(timeout, unit);
            if (future == null) throw new TimeoutException();
            if (future.state() != Future.State.SUCCESS) continue;
            return future.get();
        }
    }

    public void execute(@NotNull Runnable command) {
        runNextTick(command);
    }

}
