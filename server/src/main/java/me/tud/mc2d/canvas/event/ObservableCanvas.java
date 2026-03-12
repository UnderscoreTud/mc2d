package me.tud.mc2d.canvas.event;

import me.tud.mc2d.canvas.MutableCanvas;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collection;

public interface ObservableCanvas<P> extends MutableCanvas {

    void addObserver(CanvasObserver<P> observer);

    boolean removeObserver(CanvasObserver<P> observer);

    @UnmodifiableView Collection<CanvasObserver<P>> observers();

}
