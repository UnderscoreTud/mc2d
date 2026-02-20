package me.tud.mc2d.network.packets.serverbound.login;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Login.Serverbound.LOGIN_ACKNOWLEDGED,
        group = Packets.Login.Serverbound.NAME,
        catalogue = Packets.Login.Serverbound.class
)
public class ServerboundLoginLoginAcknowledged implements ServerboundPacket {}
