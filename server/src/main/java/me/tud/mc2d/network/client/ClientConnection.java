package me.tud.mc2d.network.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import lombok.Data;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.lifecycle.clientbound.ClientboundDisconnect;
import me.tud.mc2d.network.packets.lifecycle.clientbound.ClientboundKeepAlive;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.entity.player.ClientInformation;
import me.tud.mc2d.ticker.Tick;
import me.tud.mc2d.util.FriendlyByteBuf;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.netty.NettyDataVisitor;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.components.TranslationComponent;

import java.time.Instant;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

@Data
public class ClientConnection {

    private final Server server;
    private final Channel channel;
    private ConnectionState state = ConnectionState.HANDSHAKE;
    private int protocolVersion = -1;
    private String serverAddress;
    private int serverPort = -1;

    private UUID uuid;
    private String username;
    private ClientInformation clientInformation;

    private long keepAliveID;
    private long keepAliveRequest;
    private long keepAliveResponse;
    private CompletableFuture<Void> keepAliveFuture;

    private DataPack[] knownPacks;

    private String brand;

    public void state(ConnectionState state) {
        System.out.println("State changed from " + this.state + " to " + state);
        if (keepAliveFuture == null && (state == ConnectionState.CONFIGURATION || state == ConnectionState.PLAY))
            startKeepAliveLoop();
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

    public void disconnect() {
        disconnect(TranslationComponent.of("multiplayer.disconnect.generic"));
    }

    public void disconnect(Component reason) {
        sendPacket(new ClientboundDisconnect(reason));
    }

    public void startKeepAliveLoop() {
        if (keepAliveFuture != null)
            throw new IllegalStateException("Keep alive loop is already running.");
        Random random = new Random();
        keepAliveFuture = server.context().ticker().runRepeatedly(() -> {
            if (state != ConnectionState.CONFIGURATION && state != ConnectionState.PLAY)
                return;
            if (keepAliveRequest - keepAliveResponse > Server.READ_IDLE_TIMEOUT.toMillis())
                disconnect();
            keepAliveID = random.nextLong();
            keepAliveRequest = System.currentTimeMillis();
            sendPacket(new ClientboundKeepAlive(keepAliveID));
        }, Tick.of(Server.KEEP_ALIVE_FREQ), Tick.of(Server.KEEP_ALIVE_FREQ));
    }

    public void keepAlive() {
        if (state != ConnectionState.CONFIGURATION && state != ConnectionState.PLAY)
            throw new IllegalStateException("Keep alive is only supported in CONFIGURATION and PLAY connection states");
        if (keepAliveResponse > keepAliveRequest) // Client already responded
            return;
        keepAliveResponse = System.currentTimeMillis();
    }

    public void knownPacks(DataPack[] knownPacks) {
        if (state != ConnectionState.CONFIGURATION)
            throw new IllegalStateException("Known packs can only be set in CONFIGURATION state");
        this.knownPacks = knownPacks;
    }

    public ChannelFuture sendPacket(byte[] data) {
        return sendPacket(Unpooled.wrappedBuffer(data));
    }

    public ChannelFuture sendPacket(FriendlyByteBuf buf) {
        return sendPacket(buf.asByteBuf());
    }

    public ChannelFuture sendPacket(ByteBuf buf) {
        PacketFactory factory = server().context().packetFactory();
        Packet packet = factory.create(Packet.group(state, Packet.Direction.CLIENTBOUND), new NettyDataVisitor(buf));
        return sendPacket(packet);
    }

    public ChannelFuture sendPacket(Packet packet) {
        return channel.writeAndFlush(packet);
    }

    public void cleanup() {
        if (keepAliveFuture != null) {
            keepAliveFuture.cancel(true);
            keepAliveFuture = null;
        }
    }

}
