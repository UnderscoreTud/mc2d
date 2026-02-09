package me.tud.mc2d.network.packets.processor;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.Packet;

@FunctionalInterface
public interface PacketProcessor<P extends Packet> {

    void process(P packet, ClientConnection connection);

}
