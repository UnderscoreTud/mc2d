package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.entity.player.Hand;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayInteract;

public class ServerboundPlayInteractProcessor implements PacketProcessor<ServerboundPlayInteract> {

    @Override
    public void process(ServerboundPlayInteract packet, ClientConnection connection) {
        if (packet.type() == ServerboundPlayInteract.Type.INTERACT_AT || packet.hand() == Hand.OFFHAND)
            return;
        Control click = packet.type() == ServerboundPlayInteract.Type.ATTACK ? Control.LEFT_CLICK : Control.RIGHT_CLICK;
        connection.simulatePress(click);
    }

}
