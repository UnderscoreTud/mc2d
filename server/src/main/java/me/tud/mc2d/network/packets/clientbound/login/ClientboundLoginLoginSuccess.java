package me.tud.mc2d.network.packets.clientbound.login;

import lombok.*;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;

import java.util.UUID;

@Data
@Packet(
        id = Packets.Login.Clientbound.LOGIN_FINISHED,
        group = Packets.Login.Clientbound.NAME,
        catalogue = Packets.Login.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundLoginLoginSuccess implements ClientboundPacket {

    private UUID uuid;
    private String username;
    private int properties;

}
