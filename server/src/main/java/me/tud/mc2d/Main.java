package me.tud.mc2d;

import me.tud.mc2d.canvas.Canvas;
import me.tud.mc2d.canvas.runtime.CanvasApp;
import me.tud.mc2d.canvas.runtime.CanvasContext;
import me.tud.mc2d.canvas.runtime.CanvasRuntime;
import me.tud.mc2d.canvas.view.ViewableCanvas;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.world.Biome;
import org.machinemc.nbt.NBTCompound;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main implements CanvasApp {

    public static final ClassLoader CLASS_LOADER = Main.class.getClassLoader();

    private int tickCount;

    @Override
    public void setup(CanvasContext ctx) {
        ViewableCanvas scene = ctx.canvases().textDisplayCanvas()
                .size(16 * 12, 9 * 12)
                .dimensionType(DimensionType.OVERWORLD.toBuilder()
                        .skybox(DimensionType.Skybox.NONE)
                        .attributes(new NBTCompound())
                        .build())
                .biome(Biome.PLAINS.toBuilder()
                        .attributes(new NBTCompound())
                        .build())
                .build();

        ctx.scenes().defaultScene(scene);

        ctx.ticker().scheduleAtFixedRate(() -> {
            try {
                animate(scene);
                scene.present();
                tickCount++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 25, TimeUnit.MILLISECONDS);
    }

    private void animate(Canvas scene) {
        // code from chatgpt!
        double t = tickCount * 0.015;
        int points = 10;

        double[] px = new double[points];
        double[] py = new double[points];

        for (int i = 0; i < points; i++) {
            px[i] = scene.width() * (0.5 + 0.4 * Math.cos(t * (0.7 + i * 0.11) + i));
            py[i] = scene.height() * (0.5 + 0.4 * Math.sin(t * (0.9 + i * 0.13) + i * 1.7));
        }

        for (int y = 0; y < scene.height(); y++) {
            for (int x = 0; x < scene.width(); x++) {
                double nearest = Double.MAX_VALUE;
                double second = Double.MAX_VALUE;
                int nearestIndex = 0;

                for (int i = 0; i < points; i++) {
                    double dx = x - px[i];
                    double dy = y - py[i];
                    double d = dx * dx + dy * dy;

                    if (d < nearest) {
                        second = nearest;
                        nearest = d;
                        nearestIndex = i;
                    } else if (d < second) {
                        second = d;
                    }
                }

                double edge = Math.sqrt(second) - Math.sqrt(nearest);
                double base = Math.sqrt(nearest) * 0.03;

                int r = (int) (80 + 80 * Math.sin(nearestIndex * 1.7 + t + base));
                int g = (int) (80 + 80 * Math.sin(nearestIndex * 2.3 + t * 1.2 + base));
                int b = (int) (80 + 80 * Math.sin(nearestIndex * 2.9 + t * 1.4 + base));

                if (edge < 2.5) {
                    r = 255;
                    g = 255;
                    b = 255;
                }

                int color = (clamp(r) << 16) | (clamp(g) << 8) | clamp(b);
                scene.setRGB(x, y, color);
            }
        }
    }

    private int clamp(int v) {
        return Math.max(0, Math.min(255, v));
    }

    @Override
    public void close(CanvasContext ctx) {}

    static void main() throws IOException {
        CanvasRuntime.builder()
                .app(new Main())
                .build()
                .run();
    }

}
