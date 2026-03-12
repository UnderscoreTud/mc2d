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
        id = Packets.Play.Clientbound.SET_PASSENGERS,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlaySetPassengers implements ClientboundPacket {

    private int entityID;
    private int[] passengers;

    public ClientboundPlaySetPassengers(Entity entity, Entity... passengers) {
        int[] passengerIDs = new int[passengers.length];
        for (int i = 0; i < passengers.length; i++)
            passengerIDs[i] = passengers[i].entityID();
        this(entity.entityID(), passengerIDs);
    }

}
