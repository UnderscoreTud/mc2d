package me.tud.mc2d.canvas.runtime;

import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.canvas.view.ViewableCanvas;

public interface SceneManager<V extends CanvasViewer> {

    ViewableCanvas defaultScene();

    void defaultScene(ViewableCanvas canvas);

    SceneSelector<V> sceneSelector();

    void sceneSelector(SceneSelector<V> sceneSelector);

    ViewableCanvas scene(V viewer);

    CanvasSession session(V viewer);

    CanvasSession attach(V viewer);

    CanvasSession transitionScene(V viewer, ViewableCanvas canvas);

}
