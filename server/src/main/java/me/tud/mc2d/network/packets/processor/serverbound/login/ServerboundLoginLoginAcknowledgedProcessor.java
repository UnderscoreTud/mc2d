package me.tud.mc2d.network.packets.processor.serverbound.login;

import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationKnownPacks;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.login.ServerboundLoginLoginAcknowledged;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.registry.DataDrivenRegistry;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.registry.RegistryKey;

import java.util.ArrayList;
import java.util.List;

public class ServerboundLoginLoginAcknowledgedProcessor implements PacketProcessor<ServerboundLoginLoginAcknowledged> {

    @Override
    public void process(ServerboundLoginLoginAcknowledged packet, ClientConnection connection) {
        connection.state(ConnectionState.CONFIGURATION);
        // TODO Clientbound Plugin Message (Optional, minecraft:brand with the server's brand)
        // TODO Feature Flags (Optional)
        List<DataPack> knownPacks = new ArrayList<>();
        knownPacks.add(Server.CORE_PACK);
        RegistryAccess registryAccess = connection.server().context().registryAccess();
        for (RegistryKey<?, ?> registryKey : RegistryKey.values()) {
            if (!(registryAccess.get(registryKey) instanceof DataDrivenRegistry<?> registry))
                continue;
            knownPacks.add(new DataPack(registry.key(), Server.VERSION_NAME));
        }
        connection.sendPacket(new ClientboundConfigurationKnownPacks(knownPacks.toArray(new DataPack[0])));
    }

}
