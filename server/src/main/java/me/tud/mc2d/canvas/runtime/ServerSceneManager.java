package me.tud.mc2d.canvas.runtime;

import lombok.Data;
import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.ViewableCanvas;
import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.canvas.view.ClientCanvasViewer;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayStartConfiguration;
import me.tud.mc2d.network.server.Server;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

@Data
public class ServerSceneManager implements SceneManager {

    private final Server server;
    private final Map<Object, ViewableCanvas> viewers = new HashMap<>();
    private ViewableCanvas defaultScene;
    private @NotNull SceneSelector<ClientCanvasViewer> sceneSelector = _ -> defaultScene;

    public ViewableCanvas defaultScene() {
        return defaultScene;
    }

    public void defaultScene(ViewableCanvas defaultScene) {
        this.defaultScene = defaultScene;
    }

    @Override
    public ViewableCanvas scene(CanvasViewer viewer) {
        return viewers.get(viewer.identity());
    }

    @Override
    public CanvasSession attach(CanvasViewer viewer) {
        if (!(viewer instanceof ClientCanvasViewer clientViewer))
            throw new IllegalArgumentException("Expected a ClientCanvasViewer, got " + viewer);
        ViewableCanvas scene = sceneSelector.select(clientViewer);
        System.out.println("ATTACHING " + viewer + " TO " + scene);
        viewers.put(clientViewer.identity(), scene);
        return scene.attach(clientViewer);
    }

    @Override
    public CanvasSession transitionScene(CanvasViewer viewer, ViewableCanvas canvas) {
        if (!viewers.containsKey(viewer.identity()))
            throw new IllegalArgumentException("Viewer " + viewer + " is not handled by this scene manager. Use SceneManager#attach instead.");
        viewers.put(viewer.identity(), canvas);
        ((ClientCanvasViewer) viewer).sendPacket(new ClientboundPlayStartConfiguration());
        return canvas.attach(viewer);
    }

}
