package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlaySetHeldItem;

import java.awt.*;

public class ServerboundPlaySetHeldItemProcessor implements PacketProcessor<ServerboundPlaySetHeldItem> {

    @Override
    public void process(ServerboundPlaySetHeldItem packet, ClientConnection connection) {
        connection.simulatePress(Control.values()[packet.slot()]);
    }

}
