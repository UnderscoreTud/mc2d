package me.tud.mc2d.network.packets.serverbound;

import me.tud.mc2d.network.packets.Packet;

public interface ServerboundPacket extends Packet {

    @Override
    default Direction direction() {
        return Direction.SERVERBOUND;
    }

}
