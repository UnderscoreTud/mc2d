package me.tud.mc2d.canvas.runtime.server;

import lombok.Data;
import me.tud.mc2d.canvas.CanvasFactory;
import me.tud.mc2d.canvas.control.Controls;
import me.tud.mc2d.canvas.runtime.CanvasContext;
import me.tud.mc2d.canvas.runtime.SceneManager;
import me.tud.mc2d.canvas.runtime.ServerSceneManager;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.ticker.Ticker;

@Data
public class ServerCanvasContext implements CanvasContext<ClientConnection> {

    private final Server server;
    private final CanvasFactory canvases;
    private final SceneManager<ClientConnection> scenes;
    private final Controls<ClientConnection> controls;

    public ServerCanvasContext(Server server) {
        this.server = server;
        this.canvases = new CanvasFactory(server);
        this.scenes = new ServerSceneManager(server);
        this.controls = new Controls<>();
    }

    public Ticker ticker() {
        return server.ticker();
    }

}
