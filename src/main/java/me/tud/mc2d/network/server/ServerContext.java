package me.tud.mc2d.network.server;

import com.google.gson.Gson;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import me.tud.mc2d.registry.RegistryAccess;
import org.machinemc.scriptive.serialization.ComponentSerializer;

public record ServerContext(
        Gson gson,
        ConnectionManager connectionManager,
        PacketRegistry packetRegistry,
        PacketProcessorRegistry packetProcessorRegistry,
        RegistryAccess registryAccess,
        ComponentSerializer componentSerializer
) {

    public ServerContext(Server server) {
        this(
                new Gson(),
                new ConnectionManager(),
                new PacketRegistry(),
                new PacketProcessorRegistry(),
                new RegistryAccess(server),
                new ComponentSerializer()
        );
    }

}
