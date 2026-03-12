package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;
import org.machinemc.scriptive.components.Component;

@Data
@Packet(
        id = Packets.Play.Clientbound.SET_ACTION_BAR_TEXT,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundPlaySetActionBarText implements ClientboundPacket {

    private Component text;

}
