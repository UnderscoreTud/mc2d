package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayClientTickEnd;

public class ServerboundPlayClientTickEndProcessor implements PacketProcessor<ServerboundPlayClientTickEnd> {

    @Override
    public void process(ServerboundPlayClientTickEnd packet, ClientConnection connection) {
    }

}
