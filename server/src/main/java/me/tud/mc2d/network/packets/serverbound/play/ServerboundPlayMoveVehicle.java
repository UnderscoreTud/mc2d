package me.tud.mc2d.network.packets.serverbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.joml.Vector3d;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Serverbound.MOVE_VEHICLE,
        group = Packets.Play.Serverbound.NAME,
        catalogue = Packets.Play.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundPlayMoveVehicle implements ServerboundPacket {

    private Vector3d position;
    private float yaw, pitch;
    private boolean onGround;

}
