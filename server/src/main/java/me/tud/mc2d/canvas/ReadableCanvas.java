package me.tud.mc2d.canvas;

public interface ReadableCanvas {

    int width();

    int height();

    int size();

    default boolean contains(int x, int y) {
        return x >= 0 && x < width() && y >= 0 && y < height();
    }

    int getRGB(int x, int y);

}
