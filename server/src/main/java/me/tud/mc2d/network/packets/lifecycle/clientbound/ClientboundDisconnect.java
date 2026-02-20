package me.tud.mc2d.network.packets.lifecycle.clientbound;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.PacketIDMap;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.lifecycle.LifeCyclePackets;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.PacketID;
import org.machinemc.scriptive.components.Component;

@Data
@Packet(
        id = Packet.DYNAMIC_PACKET,
        group = {
                Packets.Configuration.Clientbound.NAME,
                Packets.Play.Clientbound.NAME
        },
        catalogue = LifeCyclePackets.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundDisconnect implements ClientboundPacket {

    @PacketID
    private static int id() {
        return PacketIDMap.compute(
                Packets.Configuration.Clientbound.NAME, Packets.Configuration.Clientbound.DISCONNECT,
                Packets.Play.Clientbound.NAME, Packets.Play.Clientbound.DISCONNECT
        );
    }

    private Component reason;

}
