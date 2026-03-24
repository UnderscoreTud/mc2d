package me.tud.mc2d.canvas.runtime;

import me.tud.mc2d.canvas.view.CanvasViewer;

public interface CanvasApp<C extends CanvasContext<V>, V extends CanvasViewer> {

    void setup(C ctx);

    void close(C ctx);

}
