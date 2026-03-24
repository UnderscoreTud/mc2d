package me.tud.mc2d.canvas.runtime;

import lombok.Getter;
import lombok.Locked;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.ViewableCanvas;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayStartConfiguration;
import me.tud.mc2d.network.server.Server;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

@RequiredArgsConstructor
public class ServerSceneManager implements SceneManager<ClientConnection> {

    private final @Getter Server server;

    private final ReentrantLock $lock = new ReentrantLock();
    private final Map<ClientConnection, ViewableCanvas> viewers = new HashMap<>();
    private final Map<ClientConnection, CanvasSession> sessions = new HashMap<>();

    private ViewableCanvas defaultScene;
    private @NotNull SceneSelector<ClientConnection> sceneSelector = _ -> defaultScene;

    @Locked
    @Override
    public ViewableCanvas defaultScene() {
        return defaultScene;
    }

    @Locked
    @Override
    public void defaultScene(ViewableCanvas defaultScene) {
        this.defaultScene = defaultScene;
    }

    @Locked
    @Override
    public @NotNull SceneSelector<ClientConnection> sceneSelector() {
        return sceneSelector;
    }

    @Locked
    @Override
    public void sceneSelector(@NotNull SceneSelector<ClientConnection> sceneSelector) {
        this.sceneSelector = sceneSelector;
    }

    @Locked
    @Override
    public ViewableCanvas scene(ClientConnection viewer) {
        return viewers.get(viewer);
    }

    @Locked
    @Override
    public CanvasSession session(ClientConnection viewer) {
        return sessions.get(viewer);
    }

    @Locked
    @Override
    public CanvasSession attach(ClientConnection viewer) {
        CanvasSession existing = sessions.get(viewer);
        if (existing != null)
            return existing;

        ViewableCanvas scene = sceneSelector.select(viewer);
        CanvasSession session = scene.attach(viewer);

        viewers.put(viewer, scene);
        sessions.put(viewer, session);
        return session;
    }

    @Override
    public CanvasSession transitionScene(ClientConnection viewer, ViewableCanvas canvas) {
        boolean similar;
        CanvasSession session;

        $lock.lock();
        try {
            if (!viewers.containsKey(viewer))
                throw new IllegalArgumentException("Viewer " + viewer + " is not handled by this scene manager. Use SceneManager#attach instead.");
    
            ViewableCanvas previous = viewers.put(viewer, canvas);
            if (canvas.equals(previous))
                return sessions.get(viewer);
    
            if (previous != null)
                previous.detach(viewer);
    
            similar = canvas.similarTo(previous);
    
            session = canvas.attach(viewer);
            sessions.put(viewer, session);
        } finally {
            $lock.unlock();
        }

        if (!similar)
            viewer.sendPacket(new ClientboundPlayStartConfiguration());
        if (similar) {
            if (!session.initialized())
                session.initialize();

            if (session.initialized() && !session.loaded())
                session.load();
        }
        return session;
    }

}
