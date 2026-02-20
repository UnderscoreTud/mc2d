package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Configuration.Clientbound.FINISH_CONFIGURATION,
        group = Packets.Configuration.Clientbound.NAME,
        catalogue = Packets.Configuration.Clientbound.class
)
public class ClientboundConfigurationFinishConfiguration implements ClientboundPacket {}
