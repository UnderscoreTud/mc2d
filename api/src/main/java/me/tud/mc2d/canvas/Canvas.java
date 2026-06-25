package me.tud.mc2d.canvas;

public interface Canvas {

    int width();

    int height();

    default boolean contains(int x, int y) {
        return 0 <= x && x < width() && 0 <= y && y < height();
    }

    int getRGB(int x, int y);

    void setRGB(int x, int y, int rgb);

    void fillRGB(int rgb);

    void fillRectRGB(int x, int y, int width, int height, int rgb);

}
