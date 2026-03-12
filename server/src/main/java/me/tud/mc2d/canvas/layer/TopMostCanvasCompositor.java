package me.tud.mc2d.canvas.layer;

import java.util.function.Predicate;

public record TopMostCanvasCompositor<P>(P empty, Predicate<P> transparentPredicate) implements CanvasCompositor<P> {

    public TopMostCanvasCompositor(P empty) {
        this(empty, empty::equals);
    }

    @Override
    public boolean isTransparent(P pixel) {
        return transparentPredicate.test(pixel);
    }

    @Override
    public P compose(P below, P above) {
        return isTransparent(above) ? below : above;
    }

}
