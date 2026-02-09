package me.tud.mc2d.network.packets.clientbound;

import me.tud.mc2d.network.packets.Packet;

public interface ClientboundPacket extends Packet {

    @Override
    default Direction direction() {
        return Direction.CLIENTBOUND;
    }

}
