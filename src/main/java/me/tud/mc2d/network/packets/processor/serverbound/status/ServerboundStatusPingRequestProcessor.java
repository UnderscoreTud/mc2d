package me.tud.mc2d.network.packets.processor.serverbound.status;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.status.ClientboundStatusPongResponse;
import me.tud.mc2d.network.packets.clientbound.status.ClientboundStatusStatusResponse;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.status.ServerboundStatusPingRequest;

public class ServerboundStatusPingRequestProcessor implements PacketProcessor<ServerboundStatusPingRequest> {

    @Override
    public void process(ServerboundStatusPingRequest packet, ClientConnection connection) {
        connection.sendPacket(new ClientboundStatusPongResponse(packet.timestamp()));
    }

}
