package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.joml.Vector3d;
import org.machinemc.paklet.Packet;

import java.util.EnumSet;
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
    private Set<TeleportFlags> flags;

    public enum TeleportFlags {
        RELATIVE_Y,
        RELATIVE_X,
        RELATIVE_Z,
        RELATIVE_PITCH,
        RELATIVE_YAW,
        RELATIVE_VELOCITY_Y,
        RELATIVE_VELOCITY_X,
        RELATIVE_VELOCITY_Z,
        RELATIVE_VELOCITY_ROTATION;

        private int getMask() {
            return 1 << ordinal();
        }

        private boolean isSet(int flag) {
            return (flag & getMask()) == getMask();
        }

        public static Set<TeleportFlags> unpack(int flag) {
            Set<TeleportFlags> set = EnumSet.noneOf(TeleportFlags.class);
            for (TeleportFlags value : values()) {
                if (value.isSet(flag))
                    set.add(value);
            }
            return set;
        }

        public static int pack(Set<TeleportFlags> flags) {
            int flag = 0;

            for (TeleportFlags teleportFlag : flags)
                flag |= teleportFlag.getMask();

            return flag;
        }

    }

}
