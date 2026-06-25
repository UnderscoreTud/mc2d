package me.tud.mc2d.session;

import me.tud.mc2d.view.CanvasViewer;
import me.tud.mc2d.view.Scene;

public interface CanvasSession {

    CanvasViewer viewer();

    Scene scene();

}
