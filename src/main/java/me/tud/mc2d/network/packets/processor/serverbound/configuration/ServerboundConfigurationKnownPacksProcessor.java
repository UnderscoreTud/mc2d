package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationFinishConfiguration;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationKnownPacks;

public class ServerboundConfigurationKnownPacksProcessor implements PacketProcessor<ServerboundConfigurationKnownPacks> {

    @Override
    public void process(ServerboundConfigurationKnownPacks packet, ClientConnection connection) {
        connection.knownPacks(packet.knownPacks());
//        RegistryAccess registryAccess = connection.server().context().registryAccess();
//        for (RegistryKey<?, ?> registryKey : RegistryKey.values()) {
//            if (!(registryAccess.get(registryKey) instanceof DataDrivenRegistry<?> registry))
//                continue;
//            NamespacedKey registryID = registryKey.key();
//            Registry<?>.Entry[] entries = registry.entries().toArray(new Registry.Entry[0]);
//            connection.sendPacket(new ClientboundConfigurationRegistryData(registryID, entries));
//        }
        // TODO Update Tags (Optional)
        connection.sendPacket(new ClientboundConfigurationFinishConfiguration());
    }

}
