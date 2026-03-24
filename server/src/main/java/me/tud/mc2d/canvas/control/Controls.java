package me.tud.mc2d.canvas.control;

import com.google.common.base.Preconditions;
import lombok.Locked;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.canvas.view.CanvasViewer;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

@RequiredArgsConstructor
public class Controls<V extends CanvasViewer> {

    private final @Nullable Controls<V> parent;
    private final Map<ActionID, Set<Control>> binds = new HashMap<>();
    private final Map<Control, Listeners<InputEvent.KeyPress<V>, InputEvent.KeyRelease<V>>> controlListeners = new HashMap<>();
    private final Map<ActionID, Listeners<ActionEvent.ActionPress<V>, ActionEvent.ActionRelease<V>>> actionListeners = new HashMap<>();
    private final Set<Consumer<InputEvent.MouseMoveEvent<V>>> mouseMoveListeners = new HashSet<>();

    public Controls() {
        this(null);
    }

    @Locked.Write
    public void bind(ActionID action, Control control) {
        binds.computeIfAbsent(action, _ -> new HashSet<>()).add(control);
    }

    @Locked.Write
    public boolean unbind(ActionID action, Control control) {
        Set<Control> controls = binds.get(action);
        return controls != null && controls.remove(control);
    }

    @Locked.Write
    public void onKeyPress(Control control, Consumer<InputEvent.KeyPress<V>> listener) {
        controlListeners.computeIfAbsent(control, _ -> new Listeners<>()).onPress(listener);
    }

    @Locked.Write
    public void onKeyRelease(Control control, Consumer<InputEvent.KeyRelease<V>> listener) {
        Preconditions.checkArgument(control.toggleable(), "Cannot listen to key release for " + control);
        controlListeners.computeIfAbsent(control, _ -> new Listeners<>()).onRelease(listener);
    }

    @Locked.Write
    public void onKeyToggle(Control control, Consumer<InputEvent.KeyEvent<V>> listener) {
        onKeyPress(control, listener::accept);
        if (control.toggleable())
            onKeyRelease(control, listener::accept);
    }

    @Locked.Write
    public void onActionPress(ActionID id, Consumer<ActionEvent.ActionPress<V>> listener) {
        actionListeners.computeIfAbsent(id, _ -> new Listeners<>()).onPress(listener);
    }

    @Locked.Write
    public void onActionRelease(ActionID id, Consumer<ActionEvent.ActionRelease<V>> listener) {
        actionListeners.computeIfAbsent(id, _ -> new Listeners<>()).onRelease(listener);
    }

    @Locked.Write
    public void onActionToggle(ActionID id, Consumer<ActionEvent<V>> listener) {
        onActionPress(id, listener::accept);
        onActionRelease(id, listener::accept);
    }

    @Locked.Write
    public void onMouseMove(Consumer<InputEvent.MouseMoveEvent<V>> listener) {
        mouseMoveListeners.add(listener);
    }

    @Locked.Read
    public void dispatch(InputEvent<V> event) {
        switch (event) {
            case InputEvent.KeyPress<V> press -> {
                dispatchPress(press, controls -> controls.controlListeners.get(press.control()));
                ActionID action = action(press.control());
                dispatchPress(
                        new ActionEvent.ActionPress<>(action, press),
                        controls -> controls.actionListeners.get(action)
                );
            }
            case InputEvent.KeyRelease<V> release -> {
                dispatchRelease(release, controls -> controls.controlListeners.get(release.control()));
                ActionID action = action(release.control());
                dispatchRelease(
                        new ActionEvent.ActionRelease<>(action, release),
                        controls -> controls.actionListeners.get(action)
                );
            }
            case InputEvent.MouseMoveEvent<V> mouseMove ->
                    dispatchMouseMove(mouseMove, controls -> controls.mouseMoveListeners);
            default -> {}
        }
    }

    private <E> void dispatchPress(E event, Function<Controls<V>, Listeners<E, ?>> listenersGetter) {
        Listeners<E, ?> listeners = listenersGetter.apply(this);
        if (listeners != null)
            listeners.dispatchPress(event);

        if (parent != null)
            parent.dispatchPress(event, listenersGetter);
    }

    private <E> void dispatchRelease(E event, Function<Controls<V>, Listeners<?, E>> listenersGetter) {
        Listeners<?, E> listeners = listenersGetter.apply(this);
        if (listeners != null)
            listeners.dispatchRelease(event);

        if (parent != null)
            parent.dispatchRelease(event, listenersGetter);
    }

    private void dispatchMouseMove(InputEvent.MouseMoveEvent<V> event, Function<Controls<V>, Set<Consumer<InputEvent.MouseMoveEvent<V>>>> listenersGetter) {
        var listeners = listenersGetter.apply(this);
        if (listeners != null) {
            for (Consumer<InputEvent.MouseMoveEvent<V>> listener : listeners)
                listener.accept(event);
        }

        if (parent != null)
            parent.dispatchMouseMove(event, listenersGetter);
    }

    private ActionID action(Control control) {
        for (Map.Entry<ActionID, Set<Control>> entry : binds.entrySet())
            if (entry.getValue().contains(control))
                return entry.getKey();
        return parent != null ? parent.action(control) : null;
    }

    private record Listeners<P, R>(Set<Consumer<? extends P>> pressListeners, Set<Consumer<? extends R>> releaseListeners) {

        public Listeners() {
            this(new HashSet<>(), new HashSet<>());
        }

        public void onPress(Consumer<? extends P> listener) {
            pressListeners.add(listener);
        }

        public void onRelease(Consumer<? extends R> listener) {
            releaseListeners.add(listener);
        }

        public void dispatchPress(P event) {
            //noinspection rawtypes
            for (Consumer pressListener : pressListeners)
                //noinspection unchecked
                pressListener.accept(event);
        }

        public void dispatchRelease(R event) {
            //noinspection rawtypes
            for (Consumer releaseListener : releaseListeners)
                //noinspection unchecked
                releaseListener.accept(event);
        }

    }

}
