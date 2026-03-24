package me.tud.mc2d.network.packets.serverbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Serverbound.MOVE_PLAYER_ROT,
        group = Packets.Play.Serverbound.NAME,
        catalogue = Packets.Play.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundPlaySetPlayerRotation implements ServerboundPacket {

    private float yaw, pitch;
    private byte flags;

}
