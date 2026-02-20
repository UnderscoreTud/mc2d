package me.tud.mc2d.network.packets.serverbound.handshaking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Handshake.Serverbound.INTENTION,
        group = Packets.Handshake.Serverbound.NAME,
        catalogue = Packets.Handshake.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundHandshakingHandshake implements ServerboundPacket {

    private int protocolVersion;
    private String serverAddress;
    private short serverPort;
    private ConnectionState nextState;

}
