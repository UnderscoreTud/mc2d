package me.tud.mc2d.network.server;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioIoHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.*;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.ClassUtils;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.serialization.ComponentSerializer;
import org.machinemc.scriptive.serialization.JSONPropertiesSerializer;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Server {

    public static final String VERSION_NAME = "1.21.5";
    public static final int PROTOCOL_VERSION = 770;

    private final int port;
    private final ServerContext context;
    private final ServerProperties properties;
    private boolean initialized = false;

    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private ChannelFuture bindFuture;

    public Server(int port) {
        this(port, new ServerContext(), new ServerProperties());
    }

    public Server(int port, ServerContext context) {
        this(port, context, new ServerProperties());
    }

    public Server(int port, ServerProperties properties) {
        this(port, new ServerContext(), properties);
    }

    public Server(int port, ServerContext context, ServerProperties properties) {
        this.port = port;
        this.context = context;
        this.properties = properties;
    }

    public int port() {
        return port;
    }

    public ServerContext context() {
        return context;
    }

    public ServerProperties properties() {
        return properties;
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
            Gson gson = context.gson();
            ComponentSerializer componentSerializer = context.componentSerializer();
            JSONPropertiesSerializer propertiesSerializer = new JSONPropertiesSerializer();
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

        bossGroup = new MultiThreadIoEventLoopGroup(NioIoHandler.newFactory());
        workerGroup = new MultiThreadIoEventLoopGroup(NioIoHandler.newFactory());
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) {
                        ClientConnection connection = new ClientConnection(Server.this, ch);
                        ch.pipeline().addLast(
                                new PacketLengthDecoder(),
                                new PacketDecoder(context.packetRegistry().dynamicFactory(
                                        Packet.Direction.SERVERBOUND,
                                        connection::state
                                )),
                                new PacketInboundHandler(connection, context.packetProcessorRegistry()),
                                new PacketEncoder(connection, context.packetProcessorRegistry())
                        );
                        context.connectionManager().addClient(connection);
                        ch.closeFuture().addListener(future ->
                                context.connectionManager().removeClient(connection));
                    }
                })
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true);
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

    private void registerPackets() throws IOException {
        PacketRegistry registry = context.packetRegistry();
        ClassUtils.loadClasses("me.tud.mc2d.network.packets", cls -> {
            if (!Packet.class.isAssignableFrom(cls) || cls.isInterface() || Modifier.isAbstract(cls.getModifiers()))
                return;
            Method registerMethod = null;
            ConnectionState state = null;
            for (Method method : cls.getDeclaredMethods()) {
                RegisterHandler annotation = method.getAnnotation(RegisterHandler.class);
                if (annotation == null) continue;
                registerMethod = method;
                state = annotation.value();
                break;
            }
            if (registerMethod == null) {
                System.err.println("No register method found for packet " + cls.getName());
                return;
            }
            if (!validateRegisterMethod(registerMethod))
                return;
            try {
                if (ClientboundPacket.class.isAssignableFrom(cls))
                    registerMethod.invoke(null, registry.group(Packet.Direction.CLIENTBOUND, state));
                if (ServerboundPacket.class.isAssignableFrom(cls))
                    registerMethod.invoke(null, registry.group(Packet.Direction.SERVERBOUND, state));
            } catch (Exception e) {
                System.err.println("Failed to register packet " + cls.getName() + ": " + e.getMessage());
            }
        });
    }

    private static boolean validateRegisterMethod(Method method) {
        if (method.getParameterCount() != 1) {
            System.err.println("Register method must have exactly one parameter");
            return false;
        }
        if (!PacketRegistry.Group.class.isAssignableFrom(method.getParameterTypes()[0])) {
            System.err.println("Register method must have a Packet parameter");
            return false;
        }
        if (method.getReturnType() != void.class) {
            System.err.println("Register method must return void");
            return false;
        }
        if (!Modifier.isStatic(method.getModifiers())) {
            System.err.println("Register method must be static");
            return false;
        }
        if (!Modifier.isPublic(method.getModifiers())) {
            System.err.println("Register method must be public");
            return false;
        }
        return true;
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
