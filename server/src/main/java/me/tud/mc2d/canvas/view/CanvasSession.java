package me.tud.mc2d.canvas.view;

public interface CanvasSession {

    CanvasViewer viewer();

    boolean initialized();

    boolean loaded();

    boolean active();

    boolean initialize();

    boolean load();

    void close();

}
