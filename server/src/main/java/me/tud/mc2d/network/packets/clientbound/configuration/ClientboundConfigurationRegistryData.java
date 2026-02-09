package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.util.Writable;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;

@With
public record ClientboundConfigurationRegistryData(NamespacedKey registryID,
                                                   Entry[] entries) implements ClientboundPacket {

    private static final int ID = 0x07;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundConfigurationRegistryData.class, ClientboundConfigurationRegistryData::new);
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
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.CONFIGURATION;
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
