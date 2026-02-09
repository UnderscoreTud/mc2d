package me.tud.mc2d.network.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.io.IOException;
import java.util.List;

public class PacketLengthDecoder extends ByteToMessageDecoder {

    // https://minecraft.wiki/w/Java_Edition_protocol#Packet_format
    private static final int MAX_PACKET_SIZE = 2097151;
    private static final int SEGMENT_BITS = 0x7F;
    private static final int CONTINUE_BIT = 0x80;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        if (!in.isReadable())
            return;
        in.markReaderIndex();
        int length = 0;
        int position = 0;
        byte currentByte;

        while (in.isReadable()) {
            currentByte = in.readByte();
            length |= (currentByte & SEGMENT_BITS) << position;

            if ((currentByte & CONTINUE_BIT) == 0) {
                if (length > MAX_PACKET_SIZE)
                    throw new IOException("Packet size exceeds limit of " + MAX_PACKET_SIZE + " bytes");
                if (!in.isReadable(length)) break;
                out.add(in.readBytes(length));
                return;
            }

            position += 7;

            if (position >= 32) throw new RuntimeException("VarInt is too big");
        }

        in.resetReaderIndex();
    }

}
