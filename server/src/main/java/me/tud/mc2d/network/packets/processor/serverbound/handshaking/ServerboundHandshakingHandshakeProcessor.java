package me.tud.mc2d.network.packets.processor.serverbound.handshaking;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.handshaking.ServerboundHandshakingHandshake;

public class ServerboundHandshakingHandshakeProcessor implements PacketProcessor<ServerboundHandshakingHandshake> {

    @Override
    public void process(ServerboundHandshakingHandshake packet, ClientConnection connection) {
        connection.protocolVersion(packet.protocolVersion());
        connection.serverAddress(packet.serverAddress());
        connection.serverPort(packet.serverPort());
        connection.state(packet.nextState());
    }

}
