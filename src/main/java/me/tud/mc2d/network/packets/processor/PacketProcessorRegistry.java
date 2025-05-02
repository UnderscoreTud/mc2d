package me.tud.mc2d.network.packets.processor;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.Packet;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.*;

public class PacketProcessorRegistry {

    private final Map<Class<? extends Packet>, Set<PacketProcessor<? extends Packet>>> processors = new HashMap<>();

    public <P extends Packet> void registerProcessor(Class<P> packetClass, PacketProcessor<P> processor) {
        processors.computeIfAbsent(packetClass, k -> new HashSet<>()).add(processor);
    }

    public <P extends Packet> @UnmodifiableView Set<PacketProcessor<P>> getProcessors(P packet) {
        //noinspection unchecked,rawtypes
        Set<PacketProcessor<P>> processors = (Set) this.processors.get(packet.getClass());
        if (processors == null)
            return Collections.emptySet();
        return Collections.unmodifiableSet(processors);
    }

    public void processPacket(Packet packet, ClientConnection connection) {
        Set<PacketProcessor<Packet>> processors = getProcessors(packet);
        for (PacketProcessor<Packet> processor : processors)
            processor.process(packet, connection);
    }

}
