package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Configuration.Clientbound.SELECT_KNOWN_PACKS,
        group = Packets.Configuration.Clientbound.NAME,
        catalogue = Packets.Configuration.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundConfigurationKnownPacks implements ClientboundPacket {

    private DataPack[] knownPacks;

}
