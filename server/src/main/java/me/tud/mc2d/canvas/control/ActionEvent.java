package me.tud.mc2d.canvas.control;

import me.tud.mc2d.canvas.view.CanvasViewer;

public sealed interface ActionEvent<V extends CanvasViewer> {

    ActionID action();

    record ActionPress<V extends CanvasViewer>(ActionID action, InputEvent.KeyPress<V> source) implements ActionEvent<V> {}

    record ActionRelease<V extends CanvasViewer>(ActionID action, InputEvent.KeyRelease<V> source) implements ActionEvent<V> {}

}
