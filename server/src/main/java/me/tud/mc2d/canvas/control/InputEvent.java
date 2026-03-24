package me.tud.mc2d.canvas.control;

import me.tud.mc2d.canvas.view.CanvasViewer;
import org.joml.Vector2d;

public sealed interface InputEvent<V extends CanvasViewer> {

    V source();

    sealed interface KeyEvent<V extends CanvasViewer> extends InputEvent<V> {
        Control control();
    }

    record KeyPress<V extends CanvasViewer>(V source, Control control) implements KeyEvent<V> {}

    record KeyRelease<V extends CanvasViewer>(V source, Control control) implements KeyEvent<V> {}

    record MouseMoveEvent<V extends CanvasViewer>(V source, Vector2d delta) implements InputEvent<V> {}

}
