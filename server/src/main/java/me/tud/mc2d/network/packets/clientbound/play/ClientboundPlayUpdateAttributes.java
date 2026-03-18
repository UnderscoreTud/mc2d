package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.entity.Entity;
import me.tud.mc2d.entity.attribute.AttributeProperty;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.serializers.WritableSerializer;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.modifiers.SerializeWith;

@Data
@Packet(
        id = Packets.Play.Clientbound.UPDATE_ATTRIBUTES,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlayUpdateAttributes implements ClientboundPacket {

    private int entityID;
    private @SerializeWith(WritableSerializer.class) AttributeProperty[] properties;

    public ClientboundPlayUpdateAttributes(Entity entity, AttributeProperty... properties) {
        this(entity.entityID(), properties);
    }

}
