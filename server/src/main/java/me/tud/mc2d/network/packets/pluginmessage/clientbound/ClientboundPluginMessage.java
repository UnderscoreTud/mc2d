package me.tud.mc2d.network.packets.pluginmessage.clientbound;

import io.netty.buffer.Unpooled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.PacketIDMap;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.pluginmessage.PluginMessagePackets;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.paklet.CustomPacket;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.PacketID;
import org.machinemc.paklet.serialization.SerializerContext;

@Data
@Packet(
        id = Packet.DYNAMIC_PACKET,
        group = {
                Packets.Configuration.Clientbound.NAME,
                Packets.Play.Clientbound.NAME
        },
        catalogue = PluginMessagePackets.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundPluginMessage implements ClientboundPacket, CustomPacket {

    @PacketID
    private static int id() {
        return PacketIDMap.compute(
                Packets.Configuration.Clientbound.NAME, Packets.Configuration.Clientbound.CUSTOM_PAYLOAD,
                Packets.Play.Clientbound.NAME, Packets.Play.Clientbound.CUSTOM_PAYLOAD
        );
    }

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

    public static ClientboundPluginMessage brand(String brand) {
        FriendlyByteBuf buf = new FriendlyByteBuf();
        buf.writeString(brand);
        return new ClientboundPluginMessage(NamespacedKey.minecraft("brand"), buf.finish());
    }

}
