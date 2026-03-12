package me.tud.mc2d.canvas.event;

public interface CanvasObserver<P> {

    default void onPixelChange(CanvasEvent.PixelChange<P> event) {}

    default void onFill(CanvasEvent.Fill<P> event) {}

    default void onFillRect(CanvasEvent.FillRect<P> event) {}

}
