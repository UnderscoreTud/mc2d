package me.tud.mc2d.network.server;

import com.google.gson.Gson;
import lombok.With;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.text.ComponentProcessor;
import me.tud.mc2d.ticker.Tick;
import me.tud.mc2d.ticker.Ticker;
import org.machinemc.paklet.PacketEncoder;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.PacketFactoryImpl;
import org.machinemc.paklet.SerializerProviderImpl;
import org.machinemc.paklet.serialization.SerializerProvider;
import org.machinemc.scriptive.serialization.ComponentSerializer;
import org.machinemc.scriptive.serialization.JSONPropertiesSerializer;

@With
public record ServerContext(
        Gson gson,
        ConnectionManager connectionManager,
        Ticker ticker,
        SerializerProvider packetSerializerProvider,
        PacketFactory packetFactory,
        PacketProcessorRegistry packetProcessorRegistry,
        RegistryAccess registryAccess,
        ComponentProcessor componentProcessor,
        ComponentSerializer componentSerializer
) {

    // TODO this should not depend on the server
    public ServerContext(Server server) {
        SerializerProvider provider = new SerializerProviderImpl();
        ComponentSerializer componentSerializer = new ComponentSerializer();
        this(
                new Gson(),
                new ConnectionManager(),
                new Ticker(
                        new ThreadGroup(Thread.currentThread().getThreadGroup(), "MC2DServer"),
                        (float) 1 / Tick.TICK_MILLIS * 1000
                ),
                provider,
                new PacketFactoryImpl(PacketEncoder.varInt(), provider),
                new PacketProcessorRegistry(),
                RegistryAccess.createDefault(server),
                new ComponentProcessor(componentSerializer),
                componentSerializer
        );
    }

    public JSONPropertiesSerializer jsonPropertiesSerializer() {
        return new JSONPropertiesSerializer(gson);
    }

}
