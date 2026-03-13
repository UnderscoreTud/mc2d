package me.tud.mc2d.network.packets.processor.clientbound.configuration;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationFinishConfiguration;
import me.tud.mc2d.network.packets.processor.PacketProcessor;

public class ClientboundConfigurationFinishConfigurationProcessor
        implements PacketProcessor<ClientboundConfigurationFinishConfiguration> {

    @Override
    public void process(ClientboundConfigurationFinishConfiguration packet, ClientConnection connection) {
        connection.outgoingState(ConnectionState.PLAY);
    }

}
