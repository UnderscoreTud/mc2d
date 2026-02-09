package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationClientInformation;

public class ServerboundConfigurationClientInformationProcessor implements PacketProcessor<ServerboundConfigurationClientInformation> {

    @Override
    public void process(ServerboundConfigurationClientInformation packet, ClientConnection connection) {
        connection.clientInformation(packet.clientInformation());
    }

}
