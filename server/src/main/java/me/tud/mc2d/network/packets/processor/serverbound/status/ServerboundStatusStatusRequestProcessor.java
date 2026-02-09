package me.tud.mc2d.network.packets.processor.serverbound.status;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.status.ClientboundStatusStatusResponse;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.status.ServerboundStatusStatusRequest;

public class ServerboundStatusStatusRequestProcessor implements PacketProcessor<ServerboundStatusStatusRequest> {

    @Override
    public void process(ServerboundStatusStatusRequest packet, ClientConnection connection) {
        connection.sendPacket(new ClientboundStatusStatusResponse(connection.server().status().toString()));
    }

}
