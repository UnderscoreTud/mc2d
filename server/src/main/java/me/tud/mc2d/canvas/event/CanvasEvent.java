package me.tud.mc2d.canvas.event;

public sealed interface CanvasEvent<P> {

    record PixelChange<P>(int x, int y, P previousPixel, P newPixel) implements CanvasEvent<P> {}

    record Fill<P>(P newPixel) implements CanvasEvent<P> {}

    record FillRect<P>(int x, int y, int width, int height, P newPixel) implements CanvasEvent<P> {}

}
