package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Clientbound.PLAYER_ROTATION,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundPlayPlayerRotation implements ClientboundPacket {

    private float yaw;
    private boolean relativeYaw;
    private float pitch;
    private boolean relativePitch;

    public static ClientboundPlayPlayerRotation absolute(float yaw, float pitch) {
        return new ClientboundPlayPlayerRotation(yaw, false, pitch, false);
    }

    public static ClientboundPlayPlayerRotation relative(float yaw, float pitch) {
        return new ClientboundPlayPlayerRotation(yaw, true, pitch, true);
    }

}
