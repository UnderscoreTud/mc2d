package me.tud.mc2d.network.packets.processor.lifecycle.serverbound;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.lifecycle.serverbound.ServerboundKeepAlive;
import me.tud.mc2d.network.packets.processor.PacketProcessor;

public class ServerboundKeepAliveProcessor implements PacketProcessor<ServerboundKeepAlive> {

    @Override
    public void process(ServerboundKeepAlive packet, ClientConnection connection) {
        if (packet.keepAliveID() == connection.keepAliveID())
            connection.keepAlive();
    }

}
