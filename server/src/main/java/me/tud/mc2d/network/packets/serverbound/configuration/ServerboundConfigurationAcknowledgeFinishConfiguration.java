package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Configuration.Serverbound.FINISH_CONFIGURATION,
        group = Packets.Configuration.Serverbound.NAME,
        catalogue = Packets.Configuration.Serverbound.class
)
public class ServerboundConfigurationAcknowledgeFinishConfiguration implements ServerboundPacket {}
