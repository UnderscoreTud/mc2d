package me.tud.mc2d.canvas.textdisplay;

import me.tud.mc2d.canvas.view.ClientCanvasViewer;
import me.tud.mc2d.canvas.world.WorldCanvasSession;
import me.tud.mc2d.entity.TextDisplay;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayRemoveEntities;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySetEntityMetadata;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySpawnEntity;
import me.tud.mc2d.util.LinearCalibration;
import org.joml.Vector3d;

import static me.tud.mc2d.canvas.textdisplay.TextDisplayCanvas.PIXEL_LENGTH;

public class TextDisplayCanvasSession extends WorldCanvasSession {

    private static final LinearCalibration CALIBRATION = new LinearCalibration(
            calculateTheoreticalZ(128, 72, 70, 16.0 / 9.0), 51.4,
            calculateTheoreticalZ(64, 36, 70, 16.0 / 9.0), 25.7
    );

    public TextDisplayCanvasSession(TextDisplayCanvas canvas, ClientCanvasViewer viewer) {
        super(canvas, viewer);
    }

    @Override
    public TextDisplayCanvas canvas() {
        return (TextDisplayCanvas) super.canvas();
    }

    @Override
    public boolean load() {
        boolean load = super.load();
        if (!load)
            return false;

        Packet[] packets = new Packet[canvas().height() * 2]; // 2 packets per line (spawn, metadata)
        for (int i = 0; i < canvas().height(); i++) {
            TextDisplay line = canvas().lines()[i];
            packets[i * 2] = new ClientboundPlaySpawnEntity(line);
            packets[i * 2 + 1] = new ClientboundPlaySetEntityMetadata(line);
        }
        viewer().sendPackets(packets);

        return true;
    }

    @Override
    public void close() {
        super.close();
        viewer().sendPacket(new ClientboundPlayRemoveEntities(canvas().lines()));
    }

    private Vector3d global(int x, int y) {
        return new Vector3d(x, y, 0).mul(PIXEL_LENGTH);
    }

    @Override
    protected Vector3d calculateCameraPosition() {
        return global(canvas().width() / 2, canvas().height() / 2).add(0, 0, calculateZ(CALIBRATION) * PIXEL_LENGTH);
    }

}
