package me.tud.mc2d.network.packets.serverbound.status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Status.Serverbound.PING_REQUEST,
        group = Packets.Status.Serverbound.NAME,
        catalogue = Packets.Status.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundStatusPingRequest implements ServerboundPacket {

    private long timestamp;

}
