package me.tud.mc2d.util;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Contains utility methods to construct common data handler implementations.
 */
public final class CommonHandlers {

    /**
     * Returns a {@link DataHandler} that performs an identity transformation.
     * That is, it returns the same instance as it receives.
     *
     * @param <T> data type
     * @return identity data handler
     */
    public static <T> DataHandler<T, T> identity() {
        return o -> o;
    }

    /**
     * Returns a {@link DataHandler} that wraps all items data
     * into an optional.
     * <p>
     * This handler allows application of operations such as {@link #filter(Predicate)}
     * further down the pipeline.
     *
     * @return data handler
     * @param <T> type
     */
    public static <T> DataHandler<T, Optional<T>> protect() {
        return Optional::ofNullable;
    }

    /**
     * Returns a {@link DataHandler} that wraps around a function,
     * applying it to only present items.
     *
     * @param mapper mapper function
     * @return data handler
     * @param <I> input type
     * @param <O> output type
     */
    public static <I, O> DataHandler<Optional<I>, Optional<O>> map(Function<@NonNull I, @NonNull O> mapper) {
        return input -> input.map(mapper);
    }

    /**
     * Returns a {@link DataHandler} that applies the wrapped data handler only on present
     * items.
     *
     * @param handler handler to apply
     * @return data handler that wraps around given handler
     * @param <I> input type
     * @param <O> output type
     */
    public static <I, O> DataHandler<Optional<I>, Optional<O>> map(DataHandler<I, O> handler) {
        return input -> input.isPresent()
                ? Optional.ofNullable(handler.transform(input.get()))
                : Optional.empty();
    }

    /**
     * Returns a {@link DataHandler} that filters incoming items.
     *
     * @param filter filter predicate
     * @return data handler
     * @param <T> type
     */
    public static <T> DataHandler<Optional<T>, Optional<T>> filter(Predicate<@NonNull T> filter) {
        return input -> input.filter(filter);
    }

    /**
     * Returns a {@link DataHandler} that returns the same item if it is present,
     * else provides a new value using given supplier.
     *
     * @param supplier supplier for missing items
     * @return data handler
     * @param <T> type
     */
    public static <T> DataHandler<Optional<T>, Optional<T>> or(Supplier<@NonNull T> supplier) {
        return input -> input.or(() -> Optional.of(supplier.get()));
    }

    /**
     * Returns a {@link DataHandler} that unwraps the items from optional.
     *
     * @return data handler
     * @param <T> type
     */
    public static <T> DataHandler<Optional<T>, @Nullable T> elseNull() {
        return input -> input.orElse(null);
    }

    private CommonHandlers() {
        throw new UnsupportedOperationException();
    }

}
