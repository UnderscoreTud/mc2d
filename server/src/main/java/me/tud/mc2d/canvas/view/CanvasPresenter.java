package me.tud.mc2d.canvas.view;

import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collection;

public interface CanvasPresenter {

    void register(ViewableCanvas canvas);

    boolean unregister(ViewableCanvas canvas);

    boolean isRegistered(ViewableCanvas canvas);

    void requestPresent(ViewableCanvas canvas);

    void presentNow(ViewableCanvas canvas);

    void endTick();

    @UnmodifiableView Collection<ViewableCanvas> registeredCanvases();

}
