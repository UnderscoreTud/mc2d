package me.tud.mc2d.network.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayBundleDelimiter;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySetEntityMetadata;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.netty.NettyDataVisitor;

import java.util.Set;

@RequiredArgsConstructor
public class PacketEncoder extends MessageToByteEncoder<Packet> {

    private static final Packet.Direction DIRECTION = Packet.Direction.CLIENTBOUND;
    private static final Set<Class<? extends ClientboundPacket>> LOG_IGNORE = Set.of(
            ClientboundPlaySetEntityMetadata.class,
            ClientboundPlayBundleDelimiter.class
    );

    private final ClientConnection connection;
    private final PacketFactory factory;
    private final PacketProcessorRegistry processorRegistry;

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet packet, ByteBuf out) {
        if (!LOG_IGNORE.contains(packet.getClass()))
            System.out.println("S->C: " + packet);
        try {
            factory.write(packet, Packet.group(connection.outgoingState(), DIRECTION), new NettyDataVisitor(out));
            processorRegistry.processPacket(packet, connection);
        } catch (Exception e) {
            System.out.println("ATTEMPTED TO WRITE: " + packet);
            e.printStackTrace();
        }
    }

}
