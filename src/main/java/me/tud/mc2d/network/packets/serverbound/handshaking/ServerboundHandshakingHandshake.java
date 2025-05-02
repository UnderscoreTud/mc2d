package me.tud.mc2d.network.packets.serverbound.handshaking;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

public class ServerboundHandshakingHandshake implements ServerboundPacket {

    private static final int ID = 0x00;

    @RegisterHandler(ConnectionState.HANDSHAKING)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundHandshakingHandshake.class, ServerboundHandshakingHandshake::new);
    }

    private int protocolVersion;
    private String serverAddress;
    private int serverPort;
    private ConnectionState nextState;

    public ServerboundHandshakingHandshake() {}

    public ServerboundHandshakingHandshake(int protocolVersion, String serverAddress, int serverPort, ConnectionState nextState) {
        this.protocolVersion = protocolVersion;
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
        this.nextState = nextState;
    }

    public int protocolVersion() {
        return protocolVersion;
    }

    public String serverAddress() {
        return serverAddress;
    }

    public int serverPort() {
        return serverPort;
    }

    public ConnectionState nextState() {
        return nextState;
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

    @Override
    public void deserialize(FriendlyByteBuf buf) {
        protocolVersion = buf.readVarInt();
        serverAddress = buf.readString();
        serverPort = buf.readShort();
        nextState = ConnectionState.values()[buf.readVarInt()];
    }

}
