package me.tud.mc2d.network.packets.clientbound.play;

import io.netty.buffer.Unpooled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import me.tud.mc2d.entity.Entity;
import me.tud.mc2d.entity.metadata.MetadataContainer;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.metadata.DoNotPrefix;

@Data
@Packet(
        id = Packets.Play.Clientbound.SET_ENTITY_DATA,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlaySetEntityMetadata implements ClientboundPacket {

    private int entityID;
    private @ToString.Exclude byte @DoNotPrefix [] metadata;

    public ClientboundPlaySetEntityMetadata(Entity entity) {
        this(entity.entityID(), entity.metadataContainer());
    }

    public ClientboundPlaySetEntityMetadata(int entityID, MetadataContainer metadata) {
        this.entityID = entityID;
        this.metadata = new FriendlyByteBuf(Unpooled.buffer()).write(metadata).bytes();
    }

}
