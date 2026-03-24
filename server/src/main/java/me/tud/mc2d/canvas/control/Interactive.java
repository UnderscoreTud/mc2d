package me.tud.mc2d.canvas.control;

import me.tud.mc2d.canvas.view.CanvasViewer;

public interface Interactive<V extends CanvasViewer> {

    Controls<V> controls();

}
