package me.tud.mc2d.canvas;

import me.tud.mc2d.canvas.textdisplay.TextDisplayCanvas;
import me.tud.mc2d.canvas.world.PhysicalBlockWorldCanvas;
import me.tud.mc2d.network.server.Server;

public record CanvasFactory(Server server) {

    public PhysicalBlockWorldCanvas.Builder physicalBlockCanvas() {
        return PhysicalBlockWorldCanvas.builder();
    }

    public TextDisplayCanvas.Builder textDisplayCanvas() {
        return TextDisplayCanvas.builder();
    }

}
