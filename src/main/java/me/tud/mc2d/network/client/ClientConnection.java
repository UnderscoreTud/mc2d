package me.tud.mc2d.network.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketFactory;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.player.ClientInformation;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

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

    private String brand;

    public ClientConnection(Server server, Channel channel) {
        this.server = server;
        this.channel = channel;
    }

    public Server server() {
        return server;
    }

    public Channel channel() {
        return channel;
    }

    public ConnectionState state() {
        return state;
    }

    public void state(ConnectionState state) {
        System.out.println("State changed from " + this.state + " to " + state);
        this.state = state;
    }

    public int protocolVersion() {
        return protocolVersion;
    }

    public void protocolVersion(int protocolVersion) {
        if (this.protocolVersion != -1)
            throw new IllegalStateException("Protocol version already set");
        this.protocolVersion = protocolVersion;
    }

    public String serverAddress() {
        return serverAddress;
    }

    public void serverAddress(String serverAddress) {
        if (this.serverAddress != null)
            throw new IllegalStateException("Server address already set");
        this.serverAddress = serverAddress;
    }

    public int serverPort() {
        return serverPort;
    }

    public void serverPort(int serverPort) {
        if (this.serverPort != -1)
            throw new IllegalStateException("Server port already set");
        this.serverPort = serverPort;
    }

    public UUID uuid() {
        return uuid;
    }

    public void uuid(UUID uuid) {
        if (this.uuid != null)
            throw new IllegalStateException("UUID already set");
        this.uuid = uuid;
    }

    public String username() {
        return username;
    }

    public void username(String name) {
        if (this.username != null)
            throw new IllegalStateException("Name already set");
        this.username = name;
    }

    public ClientInformation clientInformation() {
        return clientInformation;
    }

    public void clientInformation(ClientInformation clientInformation) {
        this.clientInformation = clientInformation;
    }

    public String brand() {
        return brand;
    }

    public void brand(String brand) {
        this.brand = brand;
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
