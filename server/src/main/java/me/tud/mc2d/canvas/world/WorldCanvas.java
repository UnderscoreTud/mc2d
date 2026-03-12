package me.tud.mc2d.canvas.world;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.canvas.lifecycle.Disposable;
import me.tud.mc2d.canvas.view.ViewableCanvas;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collection;

public interface WorldCanvas extends ViewableCanvas, Disposable {

    NamespacedKey DIMENSION_KEY = NamespacedKey.mc2d("canvas");
    NamespacedKey BIOME_KEY = NamespacedKey.mc2d("canvas");

    Direction direction();

    DimensionType dimensionType();

    @Override
    @UnmodifiableView Collection<? extends WorldCanvasSession> sessions();

    @Getter
    @RequiredArgsConstructor
    enum Direction {
        HORIZONTAL(180, 0),
        UP(0, -90),
        DOWN(0, 90);

        private final float yaw, pitch;
    }

}
