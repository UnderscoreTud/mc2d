package me.tud.mc2d.canvas.layer;

import me.tud.mc2d.canvas.MutableCanvas;
import me.tud.mc2d.canvas.lifecycle.Presentable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.List;
import java.util.Optional;

public interface LayeredCanvas<C extends MutableCanvas & Presentable> extends MutableCanvas, Presentable {

    @UnmodifiableView List<? extends CanvasLayer<C>> layers();

    CanvasLayer<C> addLayer(String name, int zIndex);

    boolean removeLayer(String name);

    Optional<? extends CanvasLayer<C>> layer(String name);

    Optional<@NotNull C> canvas(String name);

    void moveLayer(String name, int zIndex);

    void setLayerVisible(String name, boolean visible);

    C output();

    void flatten();

    @Override
    default void setRGB(int x, int y, int rgb) {
        throw new UnsupportedOperationException("Cannot write to directly to a layered canvas");
    }

    @Override
    default void fillRGB(int rgb) {
        throw new UnsupportedOperationException("Cannot write to directly to a layered canvas");
    }

    @Override
    default void fillRectRGB(int x, int y, int width, int height, int rgb) {
        throw new UnsupportedOperationException("Cannot write to directly to a layered canvas");
    }

}
