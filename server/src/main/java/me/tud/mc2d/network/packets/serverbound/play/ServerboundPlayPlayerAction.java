package me.tud.mc2d.network.packets.serverbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.BlockPosition;
import me.tud.mc2d.world.block.BlockFace;
import org.machinemc.paklet.Packet;

@Data
@Packet(
        id = Packets.Play.Serverbound.PLAYER_ACTION,
        group = Packets.Play.Serverbound.NAME,
        catalogue = Packets.Play.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundPlayPlayerAction implements ServerboundPacket {

    private Status status;
    private BlockPosition position;
    private BlockFace blockFace;
    private int sequence;

    public enum Status {
        START_DIGGING,
        CANCELLED_DIGGING,
        FINISHED_DIGGING,
        DROP_ITEM_STACK,
        DROP_ITEM,
        UPDATE_HELD_ITEM,
        SWAP_ITEM_IN_HAND
    }
}
