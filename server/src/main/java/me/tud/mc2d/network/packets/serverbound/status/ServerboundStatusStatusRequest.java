package me.tud.mc2d.network.packets.serverbound.status;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Status.Serverbound.STATUS_REQUEST,
        group = Packets.Status.Serverbound.NAME,
        catalogue = Packets.Status.Serverbound.class
)
public class ServerboundStatusStatusRequest implements ServerboundPacket {}
