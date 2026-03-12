package me.tud.mc2d;

import me.tud.mc2d.canvas.runtime.CanvasApp;
import me.tud.mc2d.canvas.runtime.CanvasContext;
import me.tud.mc2d.canvas.runtime.CanvasRuntime;
import me.tud.mc2d.canvas.textdisplay.TextDisplayCanvas;
import me.tud.mc2d.canvas.world.WorldCanvas;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.world.Biome;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.scriptive.style.ChatColor;

import java.io.IOException;

public class Main implements CanvasApp {

    public static final ClassLoader CLASS_LOADER = Main.class.getClassLoader();

    @Override
    public void setup(CanvasContext ctx) {
        TextDisplayCanvas scene = ctx.canvases().textDisplayCanvas()
                .size(16 * 8, 9 * 8)
                .direction(WorldCanvas.Direction.HORIZONTAL)
                .dimensionType(DimensionType.OVERWORLD.toBuilder()
                        .skybox(DimensionType.Skybox.NONE)
                        .attributes(new NBTCompound())
                        .build())
                .biome(Biome.PLAINS.toBuilder()
                        .attributes(new NBTCompound())
                        .build())
                .build();

        int border = ChatColor.YELLOW.getRGB();
        int fill = ChatColor.WHITE.getRGB();
        for (int y = 0; y < scene.height(); y++) {
            for (int x = 0; x < scene.width(); x++) {
                int color = x == 0 || y == 0 || x == scene.width() - 1 || y == scene.height() - 1 ? border : fill;
                scene.setRGB(x, y, color);
            }
        }

        scene.present();

        ctx.scenes().defaultScene(scene);

        ctx.ticker().runRepeatedly(new Runnable() {
            double t = 0.0;

            @Override
            public void run() {
                // code from chatgpt!
                for (int y = 0; y < scene.height(); y++) {
                    for (int x = 0; x < scene.width(); x++) {
                        double v = Math.sin(x * 0.04 + t)
                                + Math.sin(y * 0.06 + t * 1.3)
                                + Math.sin((x + y) * 0.03 + t * 0.7);

                        int r = (int) (128 + 127 * Math.sin(v + t));
                        int g = (int) (128 + 127 * Math.sin(v + t + 2.094));
                        int b = (int) (128 + 127 * Math.sin(v + t + 4.188));

                        int color = ((r << 16) | (g << 8) | b) & 0xFFFFFF;
                        scene.setRGB(x, y, color);
                    }
                }

                scene.present();
                t += 0.08;
            }
        }, 50, 1);
    }

    @Override
    public void close(CanvasContext ctx) {}

    static void main() throws IOException {
        CanvasRuntime.builder()
                .port(25565)
                .app(new Main())
                .build()
                .run();
    }

}
