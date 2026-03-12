package me.tud.mc2d.network.packets;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayClientTickEnd;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayMoveVehicle;
import org.machinemc.paklet.PacketFactory;
import org.machinemc.paklet.netty.NettyDataVisitor;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public class PacketDecoder extends ByteToMessageDecoder {

    private static final Packet.Direction DIRECTION = Packet.Direction.SERVERBOUND;
    private static final Set<Object> LOG_IGNORE = Set.of(
            ServerboundPlayClientTickEnd.class,
            ServerboundPlayMoveVehicle.class,
            0x1D, // move_player_pos
            0x1E, // move_player_pos_rot
            0x1F, // move_player_rot
            0x22, // paddle_boat
            0x2A  // player_input
    );

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
            int id = id(e.getMessage());
            if (id == -1)
                throw e;

            if (!LOG_IGNORE.contains(id))
                System.out.println("INCOMING: " + format(id) + " (unknown)");
        }
    }

    private static int id(String message) {
        int from = message.indexOf("id ");
        if (from == -1)
            return -1;
        from += 3;
        int to = message.indexOf(" ", from);
        return Integer.parseInt(message.substring(from, to));
    }

    private static String format(int id) {
        return id + String.format(" (0x%02X)", id);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
