package me.tud.mc2d.canvas;

public interface NativePixelGetter<C, P> {

    P get(C canvas, int x, int y);

}
