package me.tud.mc2d;

import me.tud.mc2d.canvas.Canvas;
import me.tud.mc2d.canvas.control.ActionID;
import me.tud.mc2d.canvas.control.Control;
import me.tud.mc2d.canvas.runtime.server.ServerCanvasContext;
import me.tud.mc2d.canvas.runtime.CanvasRuntime;
import me.tud.mc2d.canvas.runtime.server.ServerCanvasApp;
import me.tud.mc2d.canvas.view.ViewableCanvas;
import me.tud.mc2d.dimension.DimensionType;
import org.joml.Vector2d;
import org.machinemc.nbt.*;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Demo implements ServerCanvasApp {

    public static final ClassLoader CLASS_LOADER = Demo.class.getClassLoader();

    private static final ActionID MOVE_LEFT = ActionID.of("move_left");
    private static final ActionID MOVE_RIGHT = ActionID.of("move_right");
    private static final ActionID MOVE_UP = ActionID.of("move_up");
    private static final ActionID MOVE_DOWN = ActionID.of("move_down");

    private static final int[][][] LETTERS = {
            {
                // m
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
            },
            {
                // c
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 1, 1, 1, 0},
            },
            {
                // 2
                {0, 1, 1, 1, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1},
            },
            {
                // d
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1},
                {1, 0, 0, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {0, 1, 1, 1, 1},
            },
            {
                // :
                {0},
                {0},
                {1},
                {0},
                {0},
                {0},
                {1},
            },
            {
                // )
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
                {0, 0, 1},
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0},
            },
    };

    private double offsetX, offsetY;

    @Override
    public void setup(ServerCanvasContext ctx) {
        ViewableCanvas scene = ctx.canvases().textDisplayCanvas()
                .size(16 * 12, 9 * 12)
                .dimensionType(DimensionType.OVERWORLD.toBuilder()
                        .skybox(DimensionType.Skybox.NONE)
                        .attributes(new NBTCompound())
                        .build())
                .build();

        offsetX = (double) scene.width() / 2;
        offsetY = (double) scene.height() / 2;

        ctx.controls().bind(MOVE_LEFT, Control.LEFT);
        ctx.controls().bind(MOVE_RIGHT, Control.RIGHT);
        ctx.controls().bind(MOVE_UP, Control.FORWARD);
        ctx.controls().bind(MOVE_DOWN, Control.BACKWARD);

        ctx.controls().onActionPress(MOVE_LEFT, _ -> offsetX--);
        ctx.controls().onActionPress(MOVE_RIGHT, _ -> offsetX++);
        ctx.controls().onActionPress(MOVE_UP, _ -> offsetY++);
        ctx.controls().onActionPress(MOVE_DOWN, _ -> offsetY--);

        ctx.controls().onMouseMove(event -> {
            Vector2d delta = event.delta();
            offsetX += delta.x();
            offsetY += delta.y();
        });

        ctx.scenes().defaultScene(scene);

        ctx.ticker().scheduleAtFixedRate(() -> {
            try {
                render(scene);
                scene.present();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 25, TimeUnit.MILLISECONDS);
    }

    private void render(Canvas scene) {
        scene.fillRGB(Color.WHITE.getRGB());
        int offset = 0;
        for (int i = 0; i < LETTERS.length; i++) {
            int[][] letter = LETTERS[i];
            for (int y = 0; y < letter.length; y++) {
                for (int x = 0; x < letter[y].length; x++) {
                    if (letter[letter.length - y - 1][x] == 0)
                        continue;
                    int finalX = (int) (offset + offsetX + x);
                    int finalY = (int) (offsetY + y);
                    if (!scene.contains(finalX, finalY))
                        continue;
                    scene.setRGB(finalX, finalY, Color.BLACK.getRGB());
                }
            }
            offset += letter[0].length + 1;
        }
    }

    @Override
    public void close(ServerCanvasContext ctx) {
    }

    static void main() throws IOException {
        CanvasRuntime.builder()
                .app(new Demo())
                .build()
                .run();
    }

}
