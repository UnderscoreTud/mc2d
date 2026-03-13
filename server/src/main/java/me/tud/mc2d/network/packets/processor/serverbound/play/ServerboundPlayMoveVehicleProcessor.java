package me.tud.mc2d.network.packets.processor.serverbound.play;

import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayMoveVehicle;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.play.ServerboundPlayMoveVehicle;
import org.joml.Vector3d;

public class ServerboundPlayMoveVehicleProcessor implements PacketProcessor<ServerboundPlayMoveVehicle> {

    @Override
    public void process(ServerboundPlayMoveVehicle packet, ClientConnection connection) {
        if (connection.outgoingState() != ConnectionState.PLAY || connection.incomingState() != ConnectionState.PLAY)
            return;

        CanvasSession session = connection.canvasSession();
        if (session == null || !session.loaded())
            return;

        DimensionType dimensionType = connection.dimensionType();
        if (dimensionType == null)
            return;

        int maxY = dimensionType.maxY();
        connection.sendPacket(new ClientboundPlayMoveVehicle(new Vector3d(0, maxY + 50, 0), 0f, 0f));
    }

}
