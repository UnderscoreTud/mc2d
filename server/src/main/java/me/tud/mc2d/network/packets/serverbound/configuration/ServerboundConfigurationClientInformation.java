package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.entity.player.ClientInformation;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Configuration.Serverbound.CLIENT_INFORMATION,
        group = Packets.Configuration.Serverbound.NAME,
        catalogue = Packets.Configuration.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundConfigurationClientInformation implements ServerboundPacket {

    private ClientInformation clientInformation;

}
