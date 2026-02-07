package me.tud.mc2d.network.packets.serverbound.handshaking;

import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ServerboundHandshakingHandshake(int protocolVersion, String serverAddress, int serverPort,
                                              ConnectionState nextState) implements ServerboundPacket {

    private static final int ID = 0x00;

    @RegisterHandler(ConnectionState.HANDSHAKING)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundHandshakingHandshake.class, ServerboundHandshakingHandshake::new);
    }

    public ServerboundHandshakingHandshake(FriendlyByteBuf buf) {
        this(buf.readVarInt(), buf.readString(), buf.readShort(), ConnectionState.values()[buf.readVarInt()]);
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.HANDSHAKING;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeVarInt(protocolVersion);
        buf.writeString(serverAddress);
        buf.writeShort((short) serverPort);
        buf.writeVarInt(nextState.ordinal());
    }

}
