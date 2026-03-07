package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.modifiers.SerializeWith;
import org.machinemc.paklet.serialization.Serializers;

@Data
@Packet(
        id = Packets.Play.Clientbound.SET_CAMERA,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlaySetCamera implements ClientboundPacket {

    private int cameraID;

}
