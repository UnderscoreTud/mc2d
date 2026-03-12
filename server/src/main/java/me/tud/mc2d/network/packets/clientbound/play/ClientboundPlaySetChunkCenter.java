package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Clientbound.SET_CHUNK_CACHE_CENTER,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlaySetChunkCenter implements ClientboundPacket {

    private int x, z;

}
