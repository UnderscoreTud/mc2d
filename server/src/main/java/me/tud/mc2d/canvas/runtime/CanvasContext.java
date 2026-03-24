package me.tud.mc2d.canvas.runtime;

import me.tud.mc2d.canvas.CanvasFactory;
import me.tud.mc2d.canvas.control.Controls;
import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.ticker.Ticker;

public interface CanvasContext<V extends CanvasViewer> {

    CanvasFactory canvases();

    SceneManager<V> scenes();

    Controls<V> controls();

    Ticker ticker();

}
