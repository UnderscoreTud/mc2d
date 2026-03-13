package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.entity.Entity;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Clientbound.REMOVE_ENTITIES,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlayRemoveEntities implements ClientboundPacket {

    private int[] entities;

    public ClientboundPlayRemoveEntities(Entity... entities) {
        int[] entityIDs = new int[entities.length];
        for (int i = 0; i < entities.length; i++)
            entityIDs[i] = entities[i].entityID();
        this(entityIDs);
    }

}
