package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayPlayerRotation;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlaySetPlayerRotation;
import org.joml.Vector2d;

public class ServerboundPlaySetPlayerRotationProcessor implements PacketProcessor<ServerboundPlaySetPlayerRotation> {

    @Override
    public void process(ServerboundPlaySetPlayerRotation packet, ClientConnection connection) {
        if (!connection.stable())
            return;
        Vector2d delta = new Vector2d(packet.yaw(), packet.pitch() * -1);
        if (delta.x() == 0 && delta.y() == 0)
            return;
        connection.simulateMouseMove(delta);
        connection.sendPacket(ClientboundPlayPlayerRotation.absolute(0, 0));
    }

}
