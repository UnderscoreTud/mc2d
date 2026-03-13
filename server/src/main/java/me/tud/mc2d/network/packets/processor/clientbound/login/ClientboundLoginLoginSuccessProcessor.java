package me.tud.mc2d.network.packets.processor.clientbound.login;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.login.ClientboundLoginLoginSuccess;
import me.tud.mc2d.network.packets.processor.PacketProcessor;

public class ClientboundLoginLoginSuccessProcessor
        implements PacketProcessor<ClientboundLoginLoginSuccess> {

    @Override
    public void process(ClientboundLoginLoginSuccess packet, ClientConnection connection) {
        connection.outgoingState(ConnectionState.CONFIGURATION);
    }

}
