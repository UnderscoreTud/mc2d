package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationFinishConfiguration;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationRegistryData;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationKnownPacks;
import me.tud.mc2d.registry.DataDrivenRegistry;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.util.NamespacedKey;

public class ServerboundConfigurationKnownPacksProcessor implements PacketProcessor<ServerboundConfigurationKnownPacks> {

    @Override
    public void process(ServerboundConfigurationKnownPacks packet, ClientConnection connection) {
        connection.knownPacks(packet.knownPacks());
    }

}
