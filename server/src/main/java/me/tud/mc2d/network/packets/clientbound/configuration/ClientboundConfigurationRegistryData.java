package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.util.Writable;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.paklet.CustomPacket;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;

import java.util.logging.Level;

@Data
@Packet(
        id = Packets.Configuration.Clientbound.REGISTRY_DATA,
        group = Packets.Configuration.Clientbound.NAME,
        catalogue = Packets.Configuration.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundConfigurationRegistryData implements ClientboundPacket, CustomPacket {

    private NamespacedKey registryID;
    private Entry[] entries;

    public ClientboundConfigurationRegistryData(NamespacedKey registryID, Registry<? extends NBTSerializable>.Entry[] entries) {
        this(registryID, new Entry[entries.length]);
        for (int i = 0; i < entries.length; i++)
            this.entries[i] = new Entry(entries[i].key(), entries[i].value().toNBT());
    }

    @Override
    public void construct(SerializerContext context, DataVisitor visitor) {
        Serializer<NamespacedKey> namespacedKeySerializer = context.serializerProvider().getFor(NamespacedKey.class);
        Serializer<NBTCompound> nbtCompoundSerializer = context.serializerProvider().getFor(NBTCompound.class);
        registryID = visitor.read(context, namespacedKeySerializer);
        int length = visitor.read(context, context.serializerProvider().getFor(Integer.class));
        entries = new Entry[length];
        for (int i = 0; i < length; i++) {
            visitor.read(context, namespacedKeySerializer);
            if (visitor.readBoolean())
                visitor.read(context, nbtCompoundSerializer);
        }
    }

    @Override
    public void deconstruct(SerializerContext context, DataVisitor visitor) {
        Serializer<NamespacedKey> namespacedKeySerializer = context.serializerProvider().getFor(NamespacedKey.class);
        Serializer<NBTCompound> nbtCompoundSerializer = context.serializerProvider().getFor(NBTCompound.class);
        visitor.write(context, namespacedKeySerializer, registryID);
        visitor.write(context, context.serializerProvider().getFor(Integer.class), entries.length);
        for (Entry entry : entries) {
            visitor.write(context, namespacedKeySerializer, entry.id());
            if (entry.data() == null) {
                visitor.writeBoolean(false);
                continue;
            }
            visitor.writeBoolean(true);
            visitor.write(context, nbtCompoundSerializer, entry.data());
        }
    }

    public record Entry(NamespacedKey id, @Nullable NBTCompound data) {}

}
