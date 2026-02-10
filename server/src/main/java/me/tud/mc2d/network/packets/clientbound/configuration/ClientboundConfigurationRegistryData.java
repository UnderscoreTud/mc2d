package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.With;
import me.tud.mc2d.generated.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.util.Writable;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;

@With
public record ClientboundConfigurationRegistryData(NamespacedKey registryID,
                                                   Entry[] entries) implements Packet {

    private static final Packet.Info INFO = Packets.Configuration.Clientbound.REGISTRY_DATA;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ClientboundConfigurationRegistryData.class, ClientboundConfigurationRegistryData::new);
    }

    public ClientboundConfigurationRegistryData(FriendlyByteBuf buf) {
        this(buf.readNamespacedKey(), buf.readArray(Entry[]::new, Entry::read));
    }

    public ClientboundConfigurationRegistryData(NamespacedKey registryID, Registry<?>.Entry[] entries) {
        this(registryID, new Entry[entries.length]);
        for (int i = 0; i < entries.length; i++)
            this.entries[i] = new Entry(entries[i].key(), entries[i].value().toNBT());
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeNamespacedKey(registryID);
        buf.writeArray(entries, FriendlyByteBuf::write);
    }

    public record Entry(NamespacedKey id, @Nullable NBTCompound data) implements Writable {

        @Override
        public void write(FriendlyByteBuf buf) {
            buf.writeNamespacedKey(id);
            buf.writeOptional(data, FriendlyByteBuf::writeNBT);
        }

        public static Entry read(FriendlyByteBuf buf) {
            NamespacedKey id = buf.readNamespacedKey();
            NBTCompound data = buf.readOptional(FriendlyByteBuf::readNBT).orElse(null);
            return new Entry(id, data);
        }

    }

}
