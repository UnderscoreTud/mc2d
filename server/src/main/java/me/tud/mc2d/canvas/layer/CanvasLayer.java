package me.tud.mc2d.canvas.layer;

import me.tud.mc2d.canvas.Canvas;

public interface CanvasLayer<C extends Canvas> {

    String name();

    C canvas();

    int zIndex();

    boolean visible();

}
