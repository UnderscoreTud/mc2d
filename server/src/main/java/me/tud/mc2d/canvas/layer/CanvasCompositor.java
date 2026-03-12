package me.tud.mc2d.canvas.layer;

public interface CanvasCompositor<P> {

    P empty();

    boolean isTransparent(P pixel);

    P compose(P below, P above);

}
