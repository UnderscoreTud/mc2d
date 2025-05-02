package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationKnownPacks;

public class ServerboundConfigurationKnownPacksProcessor implements PacketProcessor<ServerboundConfigurationKnownPacks> {

    @Override
    public void process(ServerboundConfigurationKnownPacks packet, ClientConnection connection) {
        connection.knownPacks(packet.knownPacks());
        // Registry Data (Multiple)
        // Update Tags (Optional)
        // Finish Configuration
    }

}
