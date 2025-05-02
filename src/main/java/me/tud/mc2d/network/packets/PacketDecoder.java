package me.tud.mc2d.network.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.List;

public class PacketDecoder extends ByteToMessageDecoder {

    private final PacketFactory packetFactory;

    public PacketDecoder(PacketFactory packetFactory) {
        this.packetFactory = packetFactory;
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        FriendlyByteBuf buf = new FriendlyByteBuf(in);
        int id = buf.readVarInt();
        byte[] data = buf.finish();
        Packet packet = packetFactory.createPacket(id, data);
        if (packet == null)
            return;
        System.out.println("INCOMING: " + packet.getClass().getSimpleName());
        out.add(packet);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
