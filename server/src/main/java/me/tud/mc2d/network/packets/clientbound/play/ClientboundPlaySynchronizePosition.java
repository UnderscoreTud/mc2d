package me.tud.mc2d.network.packets.clientbound.play;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;
import org.joml.Vector3d;

import java.util.EnumSet;
import java.util.Set;

public record ClientboundPlaySynchronizePosition(int teleportID, Vector3d position, Vector3d velocity, float yaw, float pitch, Set<TeleportFlags> flags) 
        implements ClientboundPacket {

    public static int ID = 0x41;

    @RegisterHandler(ConnectionState.PLAY)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundPlaySynchronizePosition.class, ClientboundPlaySynchronizePosition::new);
    }

    public ClientboundPlaySynchronizePosition(FriendlyByteBuf buf) {
        this(
                buf.readVarInt(),
                new Vector3d(buf.readDouble(), buf.readDouble(), buf.readDouble()),
                new Vector3d(buf.readDouble(), buf.readDouble(), buf.readDouble()),
                buf.readFloat(), buf.readFloat(),
                TeleportFlags.unpack(buf.readInt())
        );
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.PLAY;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeVarInt(teleportID)
                .writeDouble(position.x()).writeDouble(position.y()).writeDouble(position.z())
                .writeDouble(velocity.x()).writeDouble(velocity.y()).writeDouble(velocity.z())
                .writeFloat(yaw).writeFloat(pitch)
                .writeInt(TeleportFlags.pack(flags));
    }

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
