package me.tud.mc2d.network.packets;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;

@RequiredArgsConstructor
public class PacketInboundHandler extends SimpleChannelInboundHandler<Packet> {

    private final ClientConnection connection;
    private final PacketProcessorRegistry processorRegistry;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Packet packet) {
        processorRegistry.processPacket(packet, connection);
    }

}
