package me.tud.mc2d.network.packets.clientbound.status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Status.Clientbound.PONG_RESPONSE,
        group = Packets.Status.Clientbound.NAME,
        catalogue = Packets.Status.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundStatusPongResponse implements ClientboundPacket {

    private long timestamp;

}
