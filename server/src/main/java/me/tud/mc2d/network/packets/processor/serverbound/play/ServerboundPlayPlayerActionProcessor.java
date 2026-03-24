package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayPlayerAction;

public class ServerboundPlayPlayerActionProcessor implements PacketProcessor<ServerboundPlayPlayerAction> {

    @Override
    public void process(ServerboundPlayPlayerAction packet, ClientConnection connection) {
        Control control;
        switch (packet.status()) {
            case DROP_ITEM_STACK -> control = Control.DROP_STACK;
            case DROP_ITEM -> control = Control.DROP_ITEM;
            case SWAP_ITEM_IN_HAND -> control = Control.SWAP_ITEM_IN_HAND;
            default -> { return; }
        }

        connection.simulatePress(control);
    }

}
