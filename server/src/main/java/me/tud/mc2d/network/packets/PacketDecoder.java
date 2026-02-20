package me.tud.mc2d.network.packets;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.ConnectionState;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.netty.NettyDataVisitor;

import java.util.List;

@RequiredArgsConstructor
public class PacketDecoder extends ByteToMessageDecoder {

    private static final Packet.Direction DIRECTION = Packet.Direction.SERVERBOUND;

    private final PacketFactory packetFactory;
    private final Supplier<ConnectionState> state;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        if (!in.isReadable())
            return;
        try {
            Packet packet = packetFactory.create(Packet.group(state.get(), DIRECTION), new NettyDataVisitor(in));
            Preconditions.checkState(packet.direction() == DIRECTION, "Decoded client-bound packet in server-bound context");
    
            System.out.println("INCOMING: " + packet);
            out.add(packet);
        } catch (Exception e) {
            System.out.println("INCOMING: (unknown): " + e.getMessage());
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
