package me.tud.mc2d.network.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import lombok.*;
import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.canvas.control.Controls;
import me.tud.mc2d.canvas.control.InputEvent;
import me.tud.mc2d.canvas.control.Interactive;
import me.tud.mc2d.canvas.runtime.server.ServerCanvasContext;
import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.canvas.view.ViewableCanvas;
import me.tud.mc2d.canvas.world.WorldCanvas;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationFinishConfiguration;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationKnownPacks;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationRegistryData;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayBundleDelimiter;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySetActionBarText;
import me.tud.mc2d.network.packets.lifecycle.clientbound.ClientboundDisconnect;
import me.tud.mc2d.network.packets.lifecycle.clientbound.ClientboundKeepAlive;
import me.tud.mc2d.network.packets.pluginmessage.clientbound.ClientboundPluginMessage;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.entity.player.ClientInformation;
import me.tud.mc2d.registry.DataDrivenRegistry;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.ticker.Tick;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NBTSerializable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector2d;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.netty.NettyDataVisitor;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.components.TranslationComponent;

import java.util.*;
import java.util.concurrent.CompletableFuture;

@Data
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ClientConnection implements CanvasViewer, Interactive<ClientConnection> {

    private static final int DEFAULT_FOV = 70;
    private static final double DEFAULT_ASPECT_RATIO = 16.0 / 9.0;

    private final Server server;
    private final @EqualsAndHashCode.Include Channel channel;
    private ConnectionState outgoingState = ConnectionState.HANDSHAKE;
    private ConnectionState incomingState = ConnectionState.HANDSHAKE;
    private int protocolVersion = -1;
    private String serverAddress;
    private int serverPort = -1;

    private @ToString.Include UUID uuid;
    private @ToString.Include String username;
    private ClientInformation clientInformation;

    private long keepAliveID;
    private long keepAliveRequest;
    private long keepAliveResponse;
    private CompletableFuture<Void> keepAliveFuture;

    private @Getter Set<Control> pressedControls = EnumSet.noneOf(Control.class);
    private Controls<ClientConnection> controls;

    private @Getter @Setter int assumedFOV = DEFAULT_FOV;
    private @Getter @Setter double assumedAspectRatio = DEFAULT_ASPECT_RATIO;

    private DataPack[] knownPacks;

    private String brand;

    public ClientConnection(Server server, Channel channel) {
        this.server = server;
        this.channel = channel;
        this.controls = new Controls<>(server.canvasContext().controls());
    }

    public void outgoingState(ConnectionState state) {
        System.out.println("Outgoing state changed from " + this.outgoingState + " to " + state);
        this.outgoingState = state;
        attemptStartKeepAliveLoop();
    }

    public void incomingState(ConnectionState state) {
        System.out.println("Incoming state changed from " + this.incomingState + " to " + state);
        this.incomingState = state;
        attemptStartKeepAliveLoop();
    }

    public void state(ConnectionState state) {
        System.out.println("State changed from " + this.incomingState + " to " + state);
        outgoingState = incomingState = state;
        attemptStartKeepAliveLoop();
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

    public void sendActionBar(Component component) {
        sendPacket(new ClientboundPlaySetActionBarText(component));
    }

    public void disconnect() {
        disconnect(TranslationComponent.of("multiplayer.disconnect.generic"));
    }

    public void disconnect(Component reason) {
        sendPacket(new ClientboundDisconnect(reason));
    }

    private void attemptStartKeepAliveLoop() {
        if (keepAliveFuture == null && canKeepAlive())
            startKeepAliveLoop();
    }

    private boolean canKeepAlive() {
        return validKeepAliveState(outgoingState) && validKeepAliveState(incomingState);
    }

    private boolean validKeepAliveState(ConnectionState state) {
        return state == ConnectionState.CONFIGURATION || state == ConnectionState.PLAY;
    }

    public void startKeepAliveLoop() {
        if (keepAliveFuture != null)
            throw new IllegalStateException("Keep alive loop is already running.");
        Random random = new Random();
        keepAliveFuture = server.context().ticker().runRepeatedly(() -> {
            if (!canKeepAlive())
                return;
            if (keepAliveRequest - keepAliveResponse > Server.READ_IDLE_TIMEOUT.toMillis())
                disconnect();
            keepAliveID = random.nextLong();
            keepAliveRequest = System.currentTimeMillis();
            sendPacket(new ClientboundKeepAlive(keepAliveID));
        }, Tick.of(Server.KEEP_ALIVE_FREQ), Tick.of(Server.KEEP_ALIVE_FREQ));
    }

    public void keepAlive() {
        if (!canKeepAlive())
            throw new IllegalStateException("Keep alive is only supported in CONFIGURATION and PLAY connection states");
        if (keepAliveResponse > keepAliveRequest) // Client already responded
            return;
        keepAliveResponse = System.currentTimeMillis();
    }

    @Override
    public ServerCanvasContext context() {
        return server().canvasContext();
    }

    @ApiStatus.Internal
    public Set<Control> pressedControls(Set<Control> controls) {
        Set<Control> previous = pressedControls;
        pressedControls = controls;
        return previous;
    }

    @ApiStatus.Internal
    public void simulatePress(Control[] controls) {
        for (Control control : controls)
            simulatePress(control);
    }

    @ApiStatus.Internal
    public void simulatePress(Control control) {
        dispatch(new InputEvent.KeyPress<>(this, control));
    }

    @ApiStatus.Internal
    public void simulateRelease(Control[] controls) {
        for (Control control : controls)
            simulateRelease(control);
    }

    @ApiStatus.Internal
    public void simulateRelease(Control control) {
        dispatch(new InputEvent.KeyRelease<>(this, control));
    }

    public void simulateMouseMove(Vector2d delta) {
        controls.dispatch(new InputEvent.MouseMoveEvent<>(this, delta));
    }

    private void dispatch(InputEvent.KeyEvent<ClientConnection> event) {
        controls.dispatch(event);
    }

    public void knownPacks(DataPack[] knownPacks) {
        if (incomingState != ConnectionState.CONFIGURATION)
            throw new IllegalStateException("Known packs can only be set in CONFIGURATION state");
        this.knownPacks = knownPacks;
    }

    public @Nullable CanvasSession canvasSession() {
        return server().canvasContext().scenes().session(this);
    }

    public @Nullable DimensionType dimensionType() {
        ViewableCanvas scene = server().canvasContext().scenes().scene(this);
        return scene instanceof WorldCanvas worldCanvas ? worldCanvas.dimensionType() : null;
    }

    @Override
    public ClientConnection identity() {
        return this;
    }

    public void configure() {
        sendPacket(ClientboundPluginMessage.brand(server().brand()));
        // TODO Feature Flags (Optional)
        List<DataPack> knownPacks = new ArrayList<>();
        knownPacks.add(Server.CORE_PACK);
        RegistryAccess registryAccess = server().context().registryAccess();
        registryAccess.registries().forEach((key, registry) -> {
            if (!(registry instanceof DataDrivenRegistry<?>))
                return;
            knownPacks.add(new DataPack(key.key(), Server.VERSION_NAME));
            if (key.equals(RegistryKey.DIMENSION_TYPE) || key.equals(RegistryKey.BIOME))
                return; // handled by canvas
            //noinspection unchecked
            Registry<? extends NBTSerializable>.Entry[] entries = registry.entries().toArray(new Registry.Entry[0]);
            sendPacket(new ClientboundConfigurationRegistryData(key.key(), entries));
        });

        CanvasSession session = server().canvasContext().scenes().attach(this);
        if (!session.initialized())
            session.initialize();

        sendPacket(new ClientboundConfigurationKnownPacks(knownPacks.toArray(new DataPack[0])));
        // TODO Update Tags (Optional)
    }

    public void finishConfiguration() {
        sendPacket(new ClientboundConfigurationFinishConfiguration());
    }

    public ChannelFuture sendPacket(byte[] data) {
        return sendPacket(Unpooled.wrappedBuffer(data));
    }

    public ChannelFuture sendPacket(FriendlyByteBuf buf) {
        return sendPacket(buf.asByteBuf());
    }

    public ChannelFuture sendPacket(ByteBuf buf) {
        PacketFactory factory = server().context().packetFactory();
        Packet packet = factory.create(Packet.group(outgoingState, Packet.Direction.CLIENTBOUND), new NettyDataVisitor(buf));
        return sendPacket(packet);
    }

    public ChannelFuture sendPacket(Packet packet) {
        return channel.writeAndFlush(packet);
    }

    public ChannelFuture sendPackets(Packet... packets) {
        return sendPackets(Arrays.asList(packets));
    }

    public ChannelFuture sendPackets(Collection<Packet> packets) {
        if (packets.isEmpty())
            throw new IllegalArgumentException("Cannot send empty packets");

        ChannelPromise done = channel.newPromise();

        channel.write(new ClientboundPlayBundleDelimiter());
        int count = 0;
        for (Packet packet : packets) {
            if (count > 0 && count % ClientboundPlayBundleDelimiter.MAX_PACKETS == 0) {
                channel.write(new ClientboundPlayBundleDelimiter()); // close current bundle
                channel.write(new ClientboundPlayBundleDelimiter()); // open next bundle
            }
            channel.write(packet);
            count++;
        }
        channel.writeAndFlush(new ClientboundPlayBundleDelimiter(), done);
        return done;
    }

    public void cleanup() {
        if (keepAliveFuture != null) {
            keepAliveFuture.cancel(true);
            keepAliveFuture = null;
        }
    }

}
