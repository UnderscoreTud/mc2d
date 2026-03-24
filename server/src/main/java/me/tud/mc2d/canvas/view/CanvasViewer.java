package me.tud.mc2d.canvas.view;

import me.tud.mc2d.canvas.runtime.CanvasContext;

public interface CanvasViewer {

    CanvasContext<?> context();

    int assumedFOV();

    double assumedAspectRatio();

    Object identity();

}
