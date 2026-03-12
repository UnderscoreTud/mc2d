package me.tud.mc2d.canvas.textdisplay;

import me.tud.mc2d.canvas.view.ClientCanvasViewer;
import me.tud.mc2d.canvas.world.WorldCanvasSession;
import me.tud.mc2d.entity.TextDisplay;
import me.tud.mc2d.entity.metadata.Metadata;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySetEntityMetadata;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySpawnEntity;
import me.tud.mc2d.util.LinearCalibration;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.serialization.ComponentProperties;
import org.machinemc.scriptive.style.ChatColor;
import org.machinemc.scriptive.style.ChatStyle;
import org.machinemc.scriptive.style.HexColor;
import org.machinemc.scriptive.style.TextFormat;

import java.util.Map;

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
        ClientConnection connection = viewer().connection();
        for (TextDisplay line : canvas().lines()) {
            connection.sendPacket(new ClientboundPlaySpawnEntity(line));
            connection.sendPacket(new ClientboundPlaySetEntityMetadata(line));
        }
        return true;
    }

    private Vector3d global(int x, int y) {
        return new Vector3d(x, y, 0).mul(PIXEL_LENGTH);
    }

    @Override
    protected Vector3d cameraPosition() {
        return global(canvas().width() / 2, canvas().height() / 2).add(0, 0, calculateZ(CALIBRATION) * PIXEL_LENGTH);
    }

}
