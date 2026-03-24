package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.canvas.control.Controls;
import me.tud.mc2d.canvas.control.InputEvent;
import me.tud.mc2d.canvas.control.Interactive;
import me.tud.mc2d.canvas.runtime.CanvasContext;
import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayPlayerCommand;

public class ServerboundPlayPlayerCommandProcessor implements PacketProcessor<ServerboundPlayPlayerCommand> {

    @Override
    public void process(ServerboundPlayPlayerCommand packet, ClientConnection connection) {
        if (packet.action() != ServerboundPlayPlayerCommand.Action.OPEN_VEHICLE_INVENTORY)
            return;
        connection.simulatePress(Control.OPEN_INVENTORY);
    }

}
