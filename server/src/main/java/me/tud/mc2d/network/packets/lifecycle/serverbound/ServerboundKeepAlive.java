package me.tud.mc2d.network.packets.lifecycle.serverbound;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.PacketIDMap;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.lifecycle.LifeCyclePackets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.PacketID;

@Data
@Packet(
        id = Packet.DYNAMIC_PACKET,
        group = {
                Packets.Configuration.Serverbound.NAME,
                Packets.Play.Serverbound.NAME
        },
        catalogue = LifeCyclePackets.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundKeepAlive implements ServerboundPacket {

    @PacketID
    private static int id() {
        return PacketIDMap.compute(
                Packets.Configuration.Serverbound.NAME, Packets.Configuration.Serverbound.KEEP_ALIVE,
                Packets.Play.Serverbound.NAME, Packets.Play.Serverbound.KEEP_ALIVE
        );
    }

    private long keepAliveID;

}
