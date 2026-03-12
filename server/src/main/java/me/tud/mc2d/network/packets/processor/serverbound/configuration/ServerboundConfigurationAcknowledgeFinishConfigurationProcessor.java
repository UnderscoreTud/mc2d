package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.Main;
import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.ClientCanvasViewer;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.*;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationAcknowledgeFinishConfiguration;

public class ServerboundConfigurationAcknowledgeFinishConfigurationProcessor
        implements PacketProcessor<ServerboundConfigurationAcknowledgeFinishConfiguration> {

    @Override
    public void process(ServerboundConfigurationAcknowledgeFinishConfiguration packet, ClientConnection connection) {
        connection.state(ConnectionState.PLAY);
        CanvasSession session = connection.server().canvasContext().scenes().session(new ClientCanvasViewer(connection));
        System.out.println("FOUND SESSION " + session + " FOR " + connection);
        if (session != null)
            session.load();
    }

}
