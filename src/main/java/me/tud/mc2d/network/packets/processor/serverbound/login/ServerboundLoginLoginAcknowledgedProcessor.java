package me.tud.mc2d.network.packets.processor.serverbound.login;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationKnownPacks;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.login.ServerboundLoginLoginAcknowledged;
import me.tud.mc2d.network.server.Server;

public class ServerboundLoginLoginAcknowledgedProcessor implements PacketProcessor<ServerboundLoginLoginAcknowledged> {

    @Override
    public void process(ServerboundLoginLoginAcknowledged packet, ClientConnection connection) {
        connection.state(ConnectionState.CONFIGURATION);
        // TODO Clientbound Plugin Message (Optional, minecraft:brand with the server's brand)
        // TODO Feature Flags (Optional)
        connection.sendPacket(new ClientboundConfigurationKnownPacks(Server.CORE_PACK));
    }

}
