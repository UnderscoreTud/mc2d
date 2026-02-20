package me.tud.mc2d.network.packets.clientbound.status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Status.Clientbound.STATUS_RESPONSE,
        group = Packets.Status.Clientbound.NAME,
        catalogue = Packets.Status.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundStatusStatusResponse implements ClientboundPacket {

    private String jsonResponse;

}
