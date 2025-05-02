package me.tud.mc2d.network.packets;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessorRegistry;

public class PacketInboundHandler extends SimpleChannelInboundHandler<Packet> {

    private final ClientConnection connection;
    private final PacketProcessorRegistry processorRegistry;

    public PacketInboundHandler(ClientConnection connection, PacketProcessorRegistry processorRegistry) {
        this.connection = connection;
        this.processorRegistry = processorRegistry;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Packet packet) {
        processorRegistry.processPacket(packet, connection);
    }

}
