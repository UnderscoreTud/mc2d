package me.tud.mc2d.network.packets.serverbound.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

import java.util.UUID;

@Data
@Packet(
        id = Packets.Login.Serverbound.HELLO,
        group = Packets.Login.Serverbound.NAME,
        catalogue = Packets.Login.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundLoginLoginStart implements ServerboundPacket {

    private String name;
    private UUID uuid;

}
