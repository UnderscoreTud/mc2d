package me.tud.mc2d.network.packets.serverbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serializers.Mask;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.machinemc.paklet.Packet;

import java.util.Set;

@Data
@Packet(
        id = Packets.Play.Serverbound.PLAYER_INPUT,
        group = Packets.Play.Serverbound.NAME,
        catalogue = Packets.Play.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundPlayPlayerInput implements ServerboundPacket {

    private @Mask.Byte Set<Control> controls;

}
