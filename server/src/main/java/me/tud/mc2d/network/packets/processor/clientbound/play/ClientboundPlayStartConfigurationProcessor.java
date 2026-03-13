package me.tud.mc2d.network.packets.processor.clientbound.play;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayStartConfiguration;

public class ClientboundPlayStartConfigurationProcessor
        implements PacketProcessor<ClientboundPlayStartConfiguration> {

    @Override
    public void process(ClientboundPlayStartConfiguration packet, ClientConnection connection) {
        connection.outgoingState(ConnectionState.CONFIGURATION);
    }

}
