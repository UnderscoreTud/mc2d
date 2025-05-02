package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import io.netty.buffer.Unpooled;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationClientInformation;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationPluginMessage;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;

public class ServerboundConfigurationClientInformationProcessor implements PacketProcessor<ServerboundConfigurationClientInformation> {

    @Override
    public void process(ServerboundConfigurationClientInformation packet, ClientConnection connection) {
        connection.clientInformation(packet.clientInformation());
    }

}
