package me.tud.mc2d.network.packets.clientbound.play;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Clientbound.BUNDLE_DELIMITER,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
public class ClientboundPlayBundleDelimiter implements ClientboundPacket {

    public static final int MAX_PACKETS = 4096;

}
