package me.tud.mc2d;

import me.tud.mc2d.canvas.textdisplay.TextDisplayCanvas;
import me.tud.mc2d.canvas.world.WorldCanvas;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.world.Biome;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.scriptive.style.ChatColor;

import java.io.IOException;

public class Main {

    public static final ClassLoader CLASS_LOADER = Main.class.getClassLoader();
    public static final WorldCanvas CANVAS; // temporary till a proper entry-point API

    static {
        TextDisplayCanvas canvas = TextDisplayCanvas.builder()
                .size(16 * 2, 9 * 2)
                .direction(WorldCanvas.Direction.HORIZONTAL)
                .dimensionType(DimensionType.OVERWORLD.toBuilder()
                        .skybox(DimensionType.Skybox.NONE)
                        .attributes(new NBTCompound())
                        .build())
                .biome(Biome.PLAINS.toBuilder()
                        .attributes(new NBTCompound())
                        .build())
                .build();
        CANVAS = canvas;

        int border = ChatColor.YELLOW.getRGB();
        int fill = ChatColor.WHITE.getRGB();
        for (int y = 0; y < canvas.height(); y++) {
            for (int x = 0; x < canvas.width(); x++) {
                int color = x == 0 || y == 0 || x == canvas.width() - 1 || y == canvas.height() - 1 ? border : fill;
                canvas.setRGB(x, y, color);
            }
        }
        canvas.present();

//        Thread.ofVirtual().start(() -> {
//            try {
//                Thread.sleep(2500);
//
//                double t = 0.0;
//
//                // code from chatgpt!
//                while (true) {
//                    for (int y = 0; y < canvas.height(); y++) {
//                        for (int x = 0; x < canvas.width(); x++) {
//                            double v = Math.sin(x * 0.04 + t)
//                                    + Math.sin(y * 0.06 + t * 1.3)
//                                    + Math.sin((x + y) * 0.03 + t * 0.7);
//
//                            int r = (int) (128 + 127 * Math.sin(v + t));
//                            int g = (int) (128 + 127 * Math.sin(v + t + 2.094));
//                            int b = (int) (128 + 127 * Math.sin(v + t + 4.188));
//
//                            int color = ((r << 16) | (g << 8) | b) & 0xFFFFFF;
//                            canvas.setRGB(x, y, color);
//                        }
//                    }
//
//                    canvas.present();
//                    t += 0.08;
//                    Thread.sleep(50);
//                }
//            } catch (Exception _) {}
//        });
    }

    static void main() throws IOException {
        Server server = new Server(25565);
        server.init();
        server.run();
    }

}
