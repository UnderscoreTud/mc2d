package me.tud.mc2d.canvas;

import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collection;

public interface MutableCanvas extends Canvas {

    boolean isDirty();

    @UnmodifiableView Collection<CanvasRegion> dirtyRegions();

    void clearDirty();

}
