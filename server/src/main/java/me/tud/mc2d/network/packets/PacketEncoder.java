package me.tud.mc2d.network.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.netty.NettyDataVisitor;

@RequiredArgsConstructor
public class PacketEncoder extends MessageToByteEncoder<Packet> {

    private static final Packet.Direction DIRECTION = Packet.Direction.CLIENTBOUND;

    private final ClientConnection connection;
    private final PacketFactory factory;
    private final PacketProcessorRegistry processorRegistry;

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet packet, ByteBuf out) {
        System.out.println("OUTGOING: " + packet);
        processorRegistry.processPacket(packet, connection);
        try {
            factory.write(packet, Packet.group(connection.state(), DIRECTION), new NettyDataVisitor(out));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
