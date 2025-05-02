package me.tud.mc2d.network.server;

import com.google.gson.Gson;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import org.machinemc.scriptive.serialization.ComponentSerializer;

public record ServerContext(
        Gson gson,
        ConnectionManager connectionManager,
        PacketRegistry packetRegistry,
        PacketProcessorRegistry packetProcessorRegistry,
        ComponentSerializer componentSerializer
) {

    public ServerContext() {
        this(
                new Gson(),
                new ConnectionManager(),
                new PacketRegistry(),
                new PacketProcessorRegistry(),
                new ComponentSerializer()
        );
    }

}
