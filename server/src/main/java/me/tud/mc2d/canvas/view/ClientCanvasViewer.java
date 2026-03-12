package me.tud.mc2d.canvas.view;

import io.netty.channel.ChannelFuture;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.Packet;

public record ClientCanvasViewer(ClientConnection connection, int assumedFOV, double assumedAspectRatio) implements CanvasViewer {

    private static final int DEFAULT_FOV = 70;
    private static final double DEFAULT_ASPECT_RATIO = 16.0 / 9.0;

    public ClientCanvasViewer(ClientConnection connection) {
        this(connection, DEFAULT_FOV, DEFAULT_ASPECT_RATIO);
    }

    @Override
    public Object identity() {
        return connection;
    }

    public ChannelFuture sendPacket(Packet packet) {
        return connection.sendPacket(packet);
    }

}
