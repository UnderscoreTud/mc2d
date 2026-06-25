package me.tud.mc2d.view;

import me.tud.mc2d.canvas.Canvas;

import java.util.Collection;

public interface Scene {

    /**
     * The canvas associated with this scene.
     *
     * @return the canvas associated with this scene
     */
    Canvas canvas();

    /**
     * Presents the current snapshot of the canvas to all viewers
     */
    void present();

    Collection<CanvasViewer> viewers();

    void addViewer(CanvasViewer viewer);

    void removeViewer(CanvasViewer viewer);

    boolean similarTo(Scene scene);

}
