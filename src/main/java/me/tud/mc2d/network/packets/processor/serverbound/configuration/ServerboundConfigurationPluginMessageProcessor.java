package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import io.netty.buffer.Unpooled;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationPluginMessage;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;

public class ServerboundConfigurationPluginMessageProcessor implements PacketProcessor<ServerboundConfigurationPluginMessage> {

    private static final NamespacedKey BRAND = NamespacedKey.minecraft("brand");

    @Override
    public void process(ServerboundConfigurationPluginMessage packet, ClientConnection connection) {
        if (packet.channel().equals(BRAND)) {
            FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.wrappedBuffer(packet.data()));
            connection.brand(buf.readString());
        }
    }

}
