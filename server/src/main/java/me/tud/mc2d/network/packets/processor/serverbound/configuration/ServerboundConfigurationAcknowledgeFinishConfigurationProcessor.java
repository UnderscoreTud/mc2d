package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationAcknowledgeFinishConfiguration;

public class ServerboundConfigurationAcknowledgeFinishConfigurationProcessor
        implements PacketProcessor<ServerboundConfigurationAcknowledgeFinishConfiguration> {

    @Override
    public void process(ServerboundConfigurationAcknowledgeFinishConfiguration packet, ClientConnection connection) {
        connection.incomingState(ConnectionState.PLAY);
        CanvasSession session = connection.canvasSession();
        if (session != null)
            session.load();
    }

}
