package me.tud.mc2d.canvas;

public interface NativePixelSetter<C, P> {

    void set(C canvas, int x, int y, P pixel);

}
