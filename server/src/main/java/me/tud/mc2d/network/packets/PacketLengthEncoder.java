package me.tud.mc2d.network.packets;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import me.tud.mc2d.util.ProtocolUtils;

/**
 * Channel handler that prefix the outgoing packets with their length, where all packets are
 * prefixed with a var-int.
 */
public class PacketLengthEncoder extends MessageToByteEncoder<ByteBuf> {

    private static final int MAX_LENGTH = 3;

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ByteBuf msg, ByteBuf out) {
        int size = msg.readableBytes();

        int varIntSize = ProtocolUtils.varIntLength(size);
        Preconditions.checkArgument(varIntSize <= MAX_LENGTH, "Packet is too large: " + size);

        ProtocolUtils.writeVarInt(out, size);
        out.writeBytes(msg);
    }

}
