package me.tud.mc2d.canvas;

import org.jetbrains.annotations.UnmodifiableView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class AbstractMutableCanvas implements MutableCanvas {

    private final List<CanvasRegion> dirtyRegions = new ArrayList<>();

    @Override
    public boolean isDirty() {
        return !dirtyRegions.isEmpty();
    }

    @Override
    public @UnmodifiableView Collection<CanvasRegion> dirtyRegions() {
        return Collections.unmodifiableCollection(dirtyRegions);
    }

    @Override
    public void clearDirty() {
        dirtyRegions.clear();
    }

    protected final void markDirty(int x, int y) {
        markDirty(new CanvasRegion(x, y, 1, 1));
    }

    protected final void markDirty(CanvasRegion region) {
        // TODO implement merging
        dirtyRegions.add(region);
    }

}
