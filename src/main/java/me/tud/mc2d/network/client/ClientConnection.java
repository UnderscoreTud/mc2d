package me.tud.mc2d.network.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import lombok.Data;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketFactory;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.entity.player.ClientInformation;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

@Data
public class ClientConnection {

    private final Server server;
    private final Channel channel;
    private ConnectionState state = ConnectionState.HANDSHAKING;
    private int protocolVersion = -1;
    private String serverAddress;
    private int serverPort = -1;

    private UUID uuid;
    private String username;
    private ClientInformation clientInformation;

    private DataPack[] knownPacks;

    private String brand;

    public void state(ConnectionState state) {
        System.out.println("State changed from " + this.state + " to " + state);
        this.state = state;
    }

    public void protocolVersion(int protocolVersion) {
        if (this.protocolVersion != -1)
            throw new IllegalStateException("Protocol version already set");
        this.protocolVersion = protocolVersion;
    }

    public void serverAddress(String serverAddress) {
        if (this.serverAddress != null)
            throw new IllegalStateException("Server address already set");
        this.serverAddress = serverAddress;
    }

    public void serverPort(int serverPort) {
        if (this.serverPort != -1)
            throw new IllegalStateException("Server port already set");
        this.serverPort = serverPort;
    }

    public void uuid(UUID uuid) {
        if (this.uuid != null)
            throw new IllegalStateException("UUID already set");
        this.uuid = uuid;
    }

    public void username(String name) {
        if (this.username != null)
            throw new IllegalStateException("Name already set");
        this.username = name;
    }

    public void knownPacks(DataPack[] knownPacks) {
        if (state != ConnectionState.CONFIGURATION)
            throw new IllegalStateException("Known packs can only be set in CONFIGURATION state");
        this.knownPacks = knownPacks;
    }

    public ChannelFuture sendPacket(byte[] data) {
        return sendPacket(Unpooled.wrappedBuffer(data));
    }

    public ChannelFuture sendPacket(ByteBuf buf) {
        return sendPacket(new FriendlyByteBuf(buf));
    }

    public ChannelFuture sendPacket(FriendlyByteBuf buf) {
        PacketFactory factory = server().context().packetRegistry().group(Packet.Direction.CLIENTBOUND, state);
        int id = buf.readVarInt();
        byte[] data = buf.finish();
        Packet packet = factory.createPacket(id, data);
        if (packet == null) {
            // TODO better error
            throw new RuntimeException();
        }
        return sendPacket(packet);
    }

    public ChannelFuture sendPacket(Packet packet) {
        return channel.writeAndFlush(packet);
    }

}
