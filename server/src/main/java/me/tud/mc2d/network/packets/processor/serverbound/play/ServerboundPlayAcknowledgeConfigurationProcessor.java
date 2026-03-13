package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayAcknowledgeConfiguration;

public class ServerboundPlayAcknowledgeConfigurationProcessor implements PacketProcessor<ServerboundPlayAcknowledgeConfiguration> {

    @Override
    public void process(ServerboundPlayAcknowledgeConfiguration packet, ClientConnection connection) {
        connection.incomingState(ConnectionState.CONFIGURATION);
        connection.configure();
        connection.finishConfiguration();
    }

}
