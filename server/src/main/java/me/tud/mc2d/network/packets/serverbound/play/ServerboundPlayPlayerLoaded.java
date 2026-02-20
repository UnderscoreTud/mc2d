package me.tud.mc2d.network.packets.serverbound.play;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Serverbound.PLAYER_LOADED,
        group = Packets.Play.Serverbound.NAME,
        catalogue = Packets.Play.Serverbound.class
)
public class ServerboundPlayPlayerLoaded implements ServerboundPacket {}
