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

    // Sphere movement actions
    private static final ActionID MOVE_LEFT = ActionID.of("move_left");
    private static final ActionID MOVE_RIGHT = ActionID.of("move_right");
    private static final ActionID MOVE_UP = ActionID.of("move_up");
    private static final ActionID MOVE_DOWN = ActionID.of("move_down");

    // Light movement actions
    private static final ActionID LIGHT_LEFT = ActionID.of("light_left");
    private static final ActionID LIGHT_RIGHT = ActionID.of("light_right");
    private static final ActionID LIGHT_UP = ActionID.of("light_up");
    private static final ActionID LIGHT_DOWN = ActionID.of("light_down");

    // Other actions
    private static final ActionID LIGHT_NEAR = ActionID.of("light_near");
    private static final ActionID LIGHT_FAR = ActionID.of("light_far");
    private static final ActionID TOGGLE_AUTO_LIGHT = ActionID.of("toggle_auto_light");
    private static final ActionID CYCLE_COLOR = ActionID.of("cycle_color");
    private static final ActionID RESET = ActionID.of("reset");

    private int tickCount;

    // Sphere position in world/screen space
    private double sphereX = 0.0;
    private double sphereY = 0.0;
    private double sphereRadius = 0.62;

    // Light position in world space
    private double lightX = -1.4;
    private double lightY = -1.1;
    private double lightZ = 1.8;

    private boolean autoLight = false;
    private int palette = 0;

    @Override
    public void setup(ServerCanvasContext ctx) {
        ViewableCanvas scene = ctx.canvases().textDisplayCanvas()
                .size(16 * 12, 9 * 12)
                .dimensionType(DimensionType.OVERWORLD.toBuilder()
                        .skybox(DimensionType.Skybox.NONE)
                        .attributes(new NBTCompound())
                        .build())
                .build();

        ctx.controls().bind(MOVE_LEFT, Control.LEFT);
        ctx.controls().bind(MOVE_RIGHT, Control.RIGHT);
        ctx.controls().bind(MOVE_UP, Control.FORWARD);
        ctx.controls().bind(MOVE_DOWN, Control.BACKWARD);

        ctx.controls().bind(LIGHT_LEFT, Control.SLOT_0);
        ctx.controls().bind(LIGHT_RIGHT, Control.SLOT_1);
        ctx.controls().bind(LIGHT_UP, Control.SLOT_2);
        ctx.controls().bind(LIGHT_DOWN, Control.SLOT_3);

        ctx.controls().bind(CYCLE_COLOR, Control.SLOT_4);
        ctx.controls().bind(LIGHT_NEAR, Control.LEFT_CLICK);
        ctx.controls().bind(LIGHT_FAR, Control.RIGHT_CLICK);
        ctx.controls().bind(TOGGLE_AUTO_LIGHT, Control.JUMP);
        ctx.controls().bind(RESET, Control.SNEAK);

        ctx.controls().onActionPress(MOVE_LEFT, _ -> sphereX -= 0.14);
        ctx.controls().onActionPress(MOVE_RIGHT, _ -> sphereX += 0.14);
        ctx.controls().onActionPress(MOVE_UP, _ -> sphereY -= 0.14);
        ctx.controls().onActionPress(MOVE_DOWN, _ -> sphereY += 0.14);

        ctx.controls().onActionPress(LIGHT_LEFT, _ -> lightX -= 0.18);
        ctx.controls().onActionPress(LIGHT_RIGHT, _ -> lightX += 0.18);
        ctx.controls().onActionPress(LIGHT_UP, _ -> lightY -= 0.18);
        ctx.controls().onActionPress(LIGHT_DOWN, _ -> lightY += 0.18);

        ctx.controls().onActionPress(LIGHT_NEAR, _ -> lightZ = Math.max(0.3, lightZ - 0.18));
        ctx.controls().onActionPress(LIGHT_FAR, _ -> lightZ = Math.min(4.5, lightZ + 0.18));

        ctx.controls().onActionPress(TOGGLE_AUTO_LIGHT, _ -> autoLight = !autoLight);
        ctx.controls().onActionPress(CYCLE_COLOR, _ -> palette = (palette + 1) % 5);

        ctx.controls().onActionPress(RESET, _ -> {
            sphereX = 0.0;
            sphereY = 0.0;
            lightX = -1.4;
            lightY = -1.1;
            lightZ = 1.8;
            autoLight = false;
            palette = 0;
        });
        
        ctx.controls().onMouseMove(event -> {
            Vector2d delta = event.delta();
            System.out.println("MOVED -> (" + delta.x() + ", " + delta.y() + ")");
        });

        ctx.scenes().defaultScene(scene);

        ctx.ticker().scheduleAtFixedRate(() -> {
            try {
                update();
                render(scene);
                scene.present();
                tickCount++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 25, TimeUnit.MILLISECONDS);
    }

    private void update() {
        sphereX = clamp(sphereX, -1.8, 1.8);
        sphereY = clamp(sphereY, -1.15, 1.15);

        if (autoLight) {
            double t = tickCount * 0.03;
            lightX = Math.cos(t) * 1.9;
            lightY = Math.sin(t * 1.3) * 1.1;
            lightZ = 1.4 + 0.8 * Math.sin(t * 0.7);
        }
    }

    private void render(Canvas scene) {
        int w = scene.width();
        int h = scene.height();

        double aspect = (double) w / h;
        double t = tickCount * 0.02;

        int[] sphereBase = paletteColor();

        for (int py = 0; py < h; py++) {
            for (int px = 0; px < w; px++) {

                // Screen -> world coords
                double sx = ((px + 0.5) / w) * 2.0 - 1.0;
                double sy = ((py + 0.5) / h) * 2.0 - 1.0;
                sx *= aspect * 2.0;
                sy *= 2.0;

                // Background
                int bg = background(sx, sy, t);

                // Ground shadow under the sphere
                bg = applyShadow(bg, sx, sy);

                // Sphere shading
                int color = shadeSphereOrBackground(sx, sy, bg, sphereBase);

                scene.setRGB(px, py, color);
            }
        }

        drawLightMarker(scene, aspect);
        drawHUD(scene);
    }

    private int shadeSphereOrBackground(double sx, double sy, int bg, int[] sphereBase) {
        double dx = sx - sphereX;
        double dy = sy - sphereY;
        double rr = sphereRadius * sphereRadius;
        double d2 = dx * dx + dy * dy;

        if (d2 > rr) return bg;

        // Front hemisphere z from sphere equation x²+y²+z²=r²
        double z = Math.sqrt(rr - d2);

        // Surface normal
        double nx = dx / sphereRadius;
        double ny = dy / sphereRadius;
        double nz = z / sphereRadius;

        // Light vector
        double lx = lightX - sx;
        double ly = lightY - sy;
        double lz = lightZ - z;
        double llen = Math.sqrt(lx * lx + ly * ly + lz * lz);
        lx /= llen;
        ly /= llen;
        lz /= llen;

        // View vector (camera facing forward on +z axis)
        double vx = 0.0;
        double vy = 0.0;
        double vz = 1.0;

        // Lambert diffuse
        double diffuse = Math.max(0.0, nx * lx + ny * ly + nz * lz);

        // Half vector specular
        double hx = lx + vx;
        double hy = ly + vy;
        double hz = lz + vz;
        double hlen = Math.sqrt(hx * hx + hy * hy + hz * hz);
        hx /= hlen;
        hy /= hlen;
        hz /= hlen;

        double spec = Math.pow(Math.max(0.0, nx * hx + ny * hy + nz * hz), 48.0);

        // Rim light
        double rim = Math.pow(1.0 - Math.max(0.0, nz), 2.2) * 0.35;

        // Distance attenuation
        double attenuation = 1.0 / (1.0 + 0.22 * llen * llen);

        double ambient = 0.16;
        double light = ambient + diffuse * 1.15 * attenuation + rim;
        double highlight = spec * 1.8 * attenuation;

        // Slight procedural surface banding so movement reads better on stage
        double bands = 0.92 + 0.08 * Math.sin((nx * 7.0 + ny * 6.0 + nz * 10.0) * 2.0);

        int r = clamp255((int) (sphereBase[0] * light * bands + 255 * highlight));
        int g = clamp255((int) (sphereBase[1] * light * bands + 255 * highlight));
        int b = clamp255((int) (sphereBase[2] * light * bands + 255 * highlight));

        // Soft edge darkening for depth
        double edge = Math.sqrt(d2) / sphereRadius;
        double vignette = 1.0 - 0.22 * Math.pow(edge, 3.0);

        r = clamp255((int) (r * vignette));
        g = clamp255((int) (g * vignette));
        b = clamp255((int) (b * vignette));

        return (r << 16) | (g << 8) | b;
    }

    private int background(double sx, double sy, double t) {
        double grid = 0.5 + 0.5 * Math.sin(sx * 4.2 + t) * Math.cos(sy * 4.8 - t * 0.7);
        double glow = 0.5 + 0.5 * Math.sin((sx * sx + sy * sy) * 5.5 - t * 1.4);

        int r = (int) (10 + 18 * glow + 10 * grid);
        int g = (int) (16 + 24 * glow + 16 * grid);
        int b = (int) (28 + 34 * glow + 26 * grid);

        return (clamp255(r) << 16) | (clamp255(g) << 8) | clamp255(b);
    }

    private int applyShadow(int bg, double sx, double sy) {
        // Project shadow opposite light direction onto "ground" plane visually
        double shadowX = sphereX - (lightX - sphereX) * 0.30;
        double shadowY = sphereY + sphereRadius * 0.95 - (lightY - sphereY) * 0.12;

        double ex = 1.10 + Math.abs(lightX - sphereX) * 0.18;
        double ey = 0.36 + Math.max(0.0, lightZ) * 0.05;

        double nx = (sx - shadowX) / ex;
        double ny = (sy - shadowY) / ey;
        double d = nx * nx + ny * ny;

        if (d > 1.0) return bg;

        double shadow = (1.0 - d);
        shadow *= 0.42;

        int br = (bg >> 16) & 255;
        int bgc = (bg >> 8) & 255;
        int bb = bg & 255;

        br = clamp255((int) (br * (1.0 - shadow)));
        bgc = clamp255((int) (bgc * (1.0 - shadow)));
        bb = clamp255((int) (bb * (1.0 - shadow)));

        return (br << 16) | (bgc << 8) | bb;
    }

    private void drawLightMarker(Canvas scene, double aspect) {
        int w = scene.width();
        int h = scene.height();

        int px = (int) ((((lightX / (aspect * 2.0)) + 1.0) * 0.5) * w);
        int py = (int) ((((lightY / 2.0) + 1.0) * 0.5) * h);

        int glow = clamp255((int) (220 + 35 * Math.sin(tickCount * 0.2)));
        int color = (glow << 16) | (glow << 8) | 180;

        for (int oy = -2; oy <= 2; oy++) {
            for (int ox = -2; ox <= 2; ox++) {
                int x = px + ox;
                int y = py + oy;
                if (x < 0 || y < 0 || x >= w || y >= h) continue;

                if (Math.abs(ox) + Math.abs(oy) <= 2) {
                    scene.setRGB(x, y, color);
                }
            }
        }
    }

    private void drawHUD(Canvas scene) {
        int w = scene.width();

        // top-left: sphere position bars
        int sx = 4;
        int sy = 4;

        drawBar(scene, sx, sy, 30, normalize(sphereX, -1.8, 1.8), 0x66CCFF);
        drawBar(scene, sx, sy + 4, 30, normalize(sphereY, -1.15, 1.15), 0x88FFAA);

        // top-right: light z
        drawBar(scene, w - 36, 4, 30, normalize(lightZ, 0.3, 4.5), 0xFFD966);

        // palette indicator
        for (int i = 0; i < 5; i++) {
            int color = i == palette ? 0xFFFFFF : 0x444444;
            int baseX = w - 36 + i * 6;
            for (int x = baseX; x < baseX + 4; x++) {
                scene.setRGB(x, 12, color);
                scene.setRGB(x, 13, color);
            }
        }

        // auto-light indicator
        int indicator = autoLight ? 0xFFFFFF : 0x333333;
        for (int y = 18; y < 22; y++) {
            scene.setRGB(w - 12, y, indicator);
            scene.setRGB(w - 11, y, indicator);
            scene.setRGB(w - 10, y, indicator);
        }
    }

    private void drawBar(Canvas scene, int x, int y, int width, double value, int color) {
        int filled = (int) (width * clamp(value, 0.0, 1.0));

        for (int i = 0; i < width; i++) {
            int c = i < filled ? color : 0x2A2A2A;
            scene.setRGB(x + i, y, c);
            scene.setRGB(x + i, y + 1, c);
        }
    }

    private int[] paletteColor() {
        return switch (palette) {
            case 0 -> new int[]{80, 170, 255};   // blue
            case 1 -> new int[]{255, 110, 110};  // red
            case 2 -> new int[]{255, 200, 90};   // gold
            case 3 -> new int[]{180, 120, 255};  // violet
            case 4 -> new int[]{110, 255, 180};  // mint
            default -> new int[]{80, 170, 255};
        };
    }

    private double normalize(double value, double min, double max) {
        return (value - min) / (max - min);
    }

    private double clamp(double v, double min, double max) {
        return Math.max(min, Math.min(max, v));
    }

    private int clamp255(int v) {
        return Math.max(0, Math.min(255, v));
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
