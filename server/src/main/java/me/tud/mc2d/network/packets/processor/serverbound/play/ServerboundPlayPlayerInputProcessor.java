package me.tud.mc2d.network.packets.processor.serverbound.play;

import com.google.common.collect.Sets;
import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayPlayerInput;

import java.util.Set;

public class ServerboundPlayPlayerInputProcessor implements PacketProcessor<ServerboundPlayPlayerInput> {

    @Override
    public void process(ServerboundPlayPlayerInput packet, ClientConnection connection) {
        Set<Control> newControls = packet.controls();
        Set<Control> previous = connection.pressedControls(newControls);
        Set<Control> pressed = Sets.difference(newControls, previous);
        Set<Control> released = Sets.difference(previous, newControls);
        connection.simulatePress(pressed.toArray(new Control[0]));
        connection.simulateRelease(released.toArray(new Control[0]));
    }

}
