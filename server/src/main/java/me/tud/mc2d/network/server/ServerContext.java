package me.tud.mc2d.network.server;

import com.google.gson.Gson;
import lombok.With;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import me.tud.mc2d.registry.RegistryAccess;
import org.machinemc.scriptive.serialization.ComponentSerializer;
import org.machinemc.scriptive.serialization.JSONPropertiesSerializer;

@With
public record ServerContext(
        Gson gson,
        ConnectionManager connectionManager,
        PacketRegistry packetRegistry,
        PacketProcessorRegistry packetProcessorRegistry,
        RegistryAccess registryAccess,
        ComponentSerializer componentSerializer
) {

    // TODO this should not depend on the server
    public ServerContext(Server server) {
        this(
                new Gson(),
                new ConnectionManager(),
                new PacketRegistry(),
                new PacketProcessorRegistry(),
                RegistryAccess.createDefault(server),
                new ComponentSerializer()
        );
    }

    public JSONPropertiesSerializer jsonPropertiesSerializer() {
        return new JSONPropertiesSerializer(gson);
    }

}
