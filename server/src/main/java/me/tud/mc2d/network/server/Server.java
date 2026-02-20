package me.tud.mc2d.network.server;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioIoHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.Getter;
import lombok.experimental.Delegate;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.*;
import me.tud.mc2d.network.packets.lifecycle.LifeCyclePackets;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import me.tud.mc2d.network.packets.serializers.MC2DNetworkSerializers;
import me.tud.mc2d.util.ClassUtils;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.Nullable;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.serialization.SerializerProvider;
import org.machinemc.paklet.serialization.Serializers;
import org.machinemc.paklet.serialization.VarIntSerializer;
import org.machinemc.paklet.serialization.catalogue.DefaultSerializationRules;
import org.machinemc.paklet.serialization.catalogue.DefaultSerializers;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.serialization.ComponentSerializer;
import org.machinemc.scriptive.serialization.JSONPropertiesSerializer;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Server {

    public static final String VERSION_NAME = "1.21.5";
    public static final int PROTOCOL_VERSION = 770;
    public static final DataPack CORE_PACK = new DataPack(NamespacedKey.minecraft("core"), VERSION_NAME);

    public static final Duration READ_IDLE_TIMEOUT = Duration.of(30, ChronoUnit.SECONDS);
    public static final Duration KEEP_ALIVE_FREQ = Duration.of(20, ChronoUnit.SECONDS);

    private final @Getter int port;
    private final @Getter @Delegate ServerContext context;
    private final @Getter ServerProperties properties;
    private @Getter boolean initialized = false;

    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private ChannelFuture bindFuture;

    public Server(int port) {
        this(port, null, null);
    }

    public Server(int port, ServerContext context) {
        this(port, context, null);
    }

    public Server(int port, ServerProperties properties) {
        this(port, null, properties);
    }

    public Server(int port, @Nullable ServerContext context, @Nullable ServerProperties properties) {
        this.port = port;
        this.context = context != null ? context : new ServerContext(this);
        this.properties = properties != null ? properties : new ServerProperties();
    }

    public boolean running() {
        return bindFuture != null && bindFuture.channel().isOpen();
    }

    public JsonObject status() {
        JsonObject status = new JsonObject();

        JsonObject version = new JsonObject();
        version.addProperty("name", VERSION_NAME);
        version.addProperty("protocol", PROTOCOL_VERSION);
        status.add("version", version);

        if (!properties.hidePlayers()) {
            JsonObject players = new JsonObject();
            players.addProperty("online", 69420);
            players.addProperty("max", 200000);
            status.add("players", players);
        }

        TextComponent motd = properties.motd();
        if (motd != null) {
            ComponentSerializer componentSerializer = context.componentSerializer();
            JSONPropertiesSerializer propertiesSerializer = context.jsonPropertiesSerializer();
            JsonElement description = JsonParser.parseString(componentSerializer.serialize(motd, propertiesSerializer));
            status.add("description", description);
        }

        String icon = properties.icon();
        if (icon != null)
            status.addProperty("favicon", icon);

        status.addProperty("enforcesSecureChat", false);
        return status;
    }

    public void init() throws IOException {
        if (initialized)
            throw new IllegalStateException("Server is already initialized");
        initialized = true;
        registerPackets();
        registerPacketProcessors();
    }

    public ChannelFuture run() {
        if (running())
            throw new IllegalStateException("Server is already running");

        IoHandlerFactory factory = NioIoHandler.newFactory();
        bossGroup = new MultiThreadIoEventLoopGroup(factory);
        workerGroup = new MultiThreadIoEventLoopGroup(factory);
        ServerBootstrap bootstrap = new ServerBootstrap()
                .group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) {
                        ClientConnection connection = new ClientConnection(Server.this, ch);
                        ch.pipeline()
                                .addLast("packet_length_decoder", new PacketLengthDecoder())
                                .addLast("packet_decoder", new PacketDecoder(context.packetFactory(), connection::state))
                                .addLast("packet_inbound_handler", new PacketInboundHandler(connection, context.packetProcessorRegistry()))

                                .addLast("packet_length_encoder", new PacketLengthEncoder())
                                .addLast("packet_encoder", new PacketEncoder(connection, context.packetFactory(), context.packetProcessorRegistry()))
                        ;
                        context.connectionManager().addClient(connection);
                        ch.closeFuture().addListener(_ -> {
                            context.connectionManager().removeClient(connection);
                            connection.cleanup();
                        });
                    }
                })
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.IP_TOS, 0b00011000); // 3 - throughput, 4 - low delay
        bindFuture = bootstrap.bind(port).addListener(future -> {
            if (future.isSuccess()) {
                System.out.println("Server started on port " + port);
            } else {
                System.err.println("Failed to start server: " + future.cause());
            }
        });
        return bindFuture;
    }

    public ChannelFuture shutdown() {
        if (!running())
            throw new IllegalStateException("Server is not running");
        return bindFuture.channel().close().addListener(future -> {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
            System.out.println("Server stopped");
            bindFuture = null;
        });
    }

    private void registerPackets() {
        SerializerProvider provider = context.packetSerializerProvider();

        provider.addSerializers(DefaultSerializers.class);
        provider.removeSerializer(Serializers.Integer.class);
        provider.addSerializer(VarIntSerializer.class);

        provider.addSerializers(new MC2DNetworkSerializers(context));

        provider.addSerializationRules(DefaultSerializationRules.class);

        PacketFactory factory = context.packetFactory();
        factory.addPackets(Packets.Handshake.Serverbound.class);
        factory.addPackets(Packets.Status.Clientbound.class);
        factory.addPackets(Packets.Status.Serverbound.class);
        factory.addPackets(Packets.Login.Clientbound.class);
        factory.addPackets(Packets.Login.Serverbound.class);
        factory.addPackets(Packets.Configuration.Clientbound.class);
        factory.addPackets(Packets.Configuration.Serverbound.class);
        factory.addPackets(Packets.Play.Clientbound.class);
        factory.addPackets(Packets.Play.Serverbound.class);

        factory.addPackets(LifeCyclePackets.class);
    }

    public <P extends Packet> void registerPacketProcessors() throws IOException {
        PacketProcessorRegistry registry = context.packetProcessorRegistry();
        ClassUtils.loadClasses("me.tud.mc2d.network.packets.processor", cls -> {
            if (!PacketProcessor.class.isAssignableFrom(cls) || cls.isInterface() || Modifier.isAbstract(cls.getModifiers()))
                return;
            //noinspection unchecked
            Class<PacketProcessor<P>> processorClass = (Class<PacketProcessor<P>>) cls;

            try {
                Class<P> packetClass = findPacketClass(processorClass);
                if (packetClass == null)
                    throw new IllegalArgumentException("Packet type could not be determined for processor " + cls.getName());
                PacketProcessor<P> processor = processorClass.getDeclaredConstructor().newInstance();
                registry.registerProcessor(packetClass, processor);
            } catch (Exception e) {
                throw new RuntimeException("Failed to register packet processor" + cls.getName(), e);
            }
        });
    }

    private <P extends Packet> Class<P> findPacketClass(Class<? extends PacketProcessor<P>> processorClass) {
        for (Type type : processorClass.getGenericInterfaces()) {
            if (!(type instanceof ParameterizedType parameterizedType))
                continue;
            if (parameterizedType.getRawType() != PacketProcessor.class)
                continue;
            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            if (typeArguments.length == 1 && typeArguments[0] instanceof Class<?>)
                //noinspection unchecked
                return (Class<P>) typeArguments[0];
        }
        return null;
    }

}
