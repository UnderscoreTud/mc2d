package me.tud.mc2d.canvas.runtime;

import lombok.Data;
import me.tud.mc2d.canvas.CanvasFactory;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.ticker.Ticker;

@Data
public class CanvasContext {

    private final Server server;
    private final CanvasFactory canvases;
    private final SceneManager scenes;

    public CanvasContext(Server server) {
        this.server = server;
        this.scenes = new ServerSceneManager(server);
        this.canvases = new CanvasFactory(server);
    }

    public Ticker ticker() {
        return server.ticker();
    }

}
