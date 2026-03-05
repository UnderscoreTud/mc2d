package me.tud.mc2d.network.packets;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayClientTickEnd;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.netty.NettyDataVisitor;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public class PacketDecoder extends ByteToMessageDecoder {

    private static final Packet.Direction DIRECTION = Packet.Direction.SERVERBOUND;
    private static final Set<Class<?>> LOG_IGNORE = Set.of(ServerboundPlayClientTickEnd.class);

    private final PacketFactory packetFactory;
    private final Supplier<ConnectionState> state;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        if (!in.isReadable())
            return;
        try {
            Packet packet = packetFactory.create(Packet.group(state.get(), DIRECTION), new NettyDataVisitor(in));
            Preconditions.checkState(packet.direction() == DIRECTION, "Decoded client-bound packet in server-bound context");
    
            if (!LOG_IGNORE.contains(packet.getClass()))
                System.out.println("INCOMING: " + packet);
            out.add(packet);
        } catch (Exception e) {
            System.out.println(format(e.getMessage()));
        }
    }

    private static String format(String message) {
        int from = message.indexOf("id ");
        if (from == -1)
            return message;
        from += 3;
        int to = message.indexOf(" ", from);
        String id = id(Integer.parseInt(message.substring(from, to)));
        return "INCOMING: " + id + " (unknown)";
    }

    private static String id(int id) {
        return id + String.format(" (0x%02X)", id);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
