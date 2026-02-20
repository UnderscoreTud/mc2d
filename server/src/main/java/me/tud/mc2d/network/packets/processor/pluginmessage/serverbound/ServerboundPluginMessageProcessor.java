package me.tud.mc2d.network.packets.processor.pluginmessage.serverbound;

import io.netty.buffer.Unpooled;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.pluginmessage.serverbound.ServerboundPluginMessage;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;

public class ServerboundPluginMessageProcessor implements PacketProcessor<ServerboundPluginMessage> {

    private static final NamespacedKey BRAND = NamespacedKey.minecraft("brand");

    @Override
    public void process(ServerboundPluginMessage packet, ClientConnection connection) {
        if (packet.channel().equals(BRAND)) {
            FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.wrappedBuffer(packet.data()));
            connection.brand(buf.readString());
        }
    }

}
