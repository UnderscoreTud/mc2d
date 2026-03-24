package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Clientbound.SET_HELD_SLOT,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundPlaySetHeldItem implements ClientboundPacket {

    private int slot;

}
