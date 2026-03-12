package me.tud.mc2d.canvas.runtime;

import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.canvas.view.ViewableCanvas;

public interface SceneManager {

    ViewableCanvas defaultScene();

    void defaultScene(ViewableCanvas canvas);

    ViewableCanvas scene(CanvasViewer viewer);

    default CanvasSession session(CanvasViewer viewer) {
        ViewableCanvas scene = scene(viewer);
        System.out.println("FOUND SCENE " + scene + " FOR " + viewer);
        if (scene == null)
            return null;
        return scene.sessions().stream()
                .filter(session -> session.viewer().identity().equals(viewer.identity()))
                .filter(session -> !session.loaded())
                .findFirst()
                .orElse(null);
    }

    CanvasSession attach(CanvasViewer viewer);

    CanvasSession transitionScene(CanvasViewer viewer, ViewableCanvas canvas);

}
