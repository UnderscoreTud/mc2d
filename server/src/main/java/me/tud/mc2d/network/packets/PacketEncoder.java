package me.tud.mc2d.network.packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;
import me.tud.mc2d.util.FriendlyByteBuf;

@RequiredArgsConstructor
public class PacketEncoder extends MessageToByteEncoder<Packet> {

    private final ClientConnection connection;
    private final PacketProcessorRegistry processorRegistry;

    @Override
    protected void encode(ChannelHandlerContext ctx, Packet msg, ByteBuf out) {
        System.out.println("OUTGOING: " + msg.getClass().getSimpleName());
        processorRegistry.processPacket(msg, connection);
        FriendlyByteBuf buf = new FriendlyByteBuf(out);
        buf.write(msg);
    }

}
