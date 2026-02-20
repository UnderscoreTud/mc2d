package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.serializers.Mask;
import me.tud.mc2d.util.Packable;
import org.joml.Vector3d;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.modifiers.SerializeWith;

import java.util.Set;

@Data
@Packet(
        id = Packets.Play.Clientbound.PLAYER_POSITION,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundPlaySynchronizePosition implements ClientboundPacket {

    private int teleportID;
    private Vector3d position, velocity;
    private float yaw, pitch;
    private @Mask.Int Set<TeleportFlags> flags;

    public enum TeleportFlags implements Packable {
        RELATIVE_Y,
        RELATIVE_X,
        RELATIVE_Z,
        RELATIVE_PITCH,
        RELATIVE_YAW,
        RELATIVE_VELOCITY_Y,
        RELATIVE_VELOCITY_X,
        RELATIVE_VELOCITY_Z,
        RELATIVE_VELOCITY_ROTATION;

        @Override
        public int mask() {
            return 1 << ordinal();
        }

    }

}
