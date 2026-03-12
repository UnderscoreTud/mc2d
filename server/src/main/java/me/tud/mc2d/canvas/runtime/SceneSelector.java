package me.tud.mc2d.canvas.runtime;

import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.canvas.view.ViewableCanvas;

@FunctionalInterface
public interface SceneSelector<V extends CanvasViewer> {

    ViewableCanvas select(V viewer);

}
