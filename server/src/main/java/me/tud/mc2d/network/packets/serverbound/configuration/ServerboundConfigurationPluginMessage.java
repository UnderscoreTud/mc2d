package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.paklet.CustomPacket;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.metadata.DoNotPrefix;
import org.machinemc.paklet.serialization.SerializerContext;

@Data
@Packet(
        id = Packets.Configuration.Serverbound.CUSTOM_PAYLOAD,
        group = Packets.Configuration.Serverbound.NAME,
        catalogue = Packets.Configuration.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundConfigurationPluginMessage implements ServerboundPacket, CustomPacket {

    private NamespacedKey channel;
    private byte[] data;

    @Override
    public void construct(SerializerContext context, DataVisitor visitor) {
        channel = context.serializerProvider().getFor(NamespacedKey.class).deserialize(context, visitor);
        data = visitor.finish();
    }

    @Override
    public void deconstruct(SerializerContext context, DataVisitor visitor) {
        visitor.write(context, context.serializerProvider().getFor(NamespacedKey.class), channel);
        visitor.writeBytes(data);
    }

}
