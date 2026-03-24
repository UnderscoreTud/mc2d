package me.tud.mc2d.canvas.runtime.server;

import me.tud.mc2d.canvas.runtime.CanvasApp;
import me.tud.mc2d.network.client.ClientConnection;

public interface ServerCanvasApp extends CanvasApp<ServerCanvasContext, ClientConnection> {}
