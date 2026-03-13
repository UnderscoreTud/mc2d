package me.tud.mc2d.canvas.view;

import me.tud.mc2d.canvas.MutableCanvas;
import me.tud.mc2d.canvas.lifecycle.Presentable;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collection;

public interface ViewableCanvas extends MutableCanvas, Presentable {

    @UnmodifiableView Collection<? extends CanvasSession> sessions();

    boolean similarTo(ViewableCanvas other);

    CanvasSession attach(CanvasViewer viewer);

    boolean detach(CanvasViewer viewer);

}
