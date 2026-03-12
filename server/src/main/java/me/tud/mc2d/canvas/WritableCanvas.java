package me.tud.mc2d.canvas;

public interface WritableCanvas {

    void setRGB(int x, int y, int rgb);

    void fillRGB(int rgb);

    void fillRectRGB(int x, int y, int width, int height, int rgb);

}
