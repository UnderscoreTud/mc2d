package me.tud.mc2d.canvas;

public record CanvasRegion(int x, int y, int width, int height) {

    public int maxX() {
        return x + width;
    }

    public int maxY() {
        return y + height;
    }

}
