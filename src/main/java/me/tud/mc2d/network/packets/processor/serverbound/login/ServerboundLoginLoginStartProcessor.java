package me.tud.mc2d.network.packets.processor.serverbound.login;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.login.ClientboundLoginLoginSuccess;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.login.ServerboundLoginLoginStart;

public class ServerboundLoginLoginStartProcessor implements PacketProcessor<ServerboundLoginLoginStart> {

    @Override
    public void process(ServerboundLoginLoginStart packet, ClientConnection connection) {
        connection.uuid(packet.uuid());
        connection.username(packet.username());
        connection.sendPacket(new ClientboundLoginLoginSuccess(connection.uuid(), connection.username()));
    }

}
