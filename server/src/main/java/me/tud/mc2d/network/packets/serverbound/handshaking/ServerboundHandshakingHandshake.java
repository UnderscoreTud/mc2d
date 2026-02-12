package me.tud.mc2d.network.packets.serverbound.handshaking;

import lombok.With;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ServerboundHandshakingHandshake(int protocolVersion, String serverAddress, int serverPort,
                                              ConnectionState nextState) implements Packet {

    private static final Packet.Info INFO = Packets.Handshake.Serverbound.INTENTION;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ServerboundHandshakingHandshake.class, ServerboundHandshakingHandshake::new);
    }

    public ServerboundHandshakingHandshake(FriendlyByteBuf buf) {
        this(buf.readVarInt(), buf.readString(), buf.readShort(), ConnectionState.values()[buf.readVarInt()]);
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeVarInt(protocolVersion);
        buf.writeString(serverAddress);
        buf.writeShort((short) serverPort);
        buf.writeVarInt(nextState.ordinal());
    }

}
