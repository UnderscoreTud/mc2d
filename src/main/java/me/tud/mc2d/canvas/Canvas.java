package me.tud.mc2d.canvas;

public interface Canvas<T> {

    int width();

    int height();

    T getPixel(int x, int y);

    void setPixel(int x, int y, T pixel);

    void fill(T pixel);

    void fill(T pixel, int x, int y, int width, int height);

}
