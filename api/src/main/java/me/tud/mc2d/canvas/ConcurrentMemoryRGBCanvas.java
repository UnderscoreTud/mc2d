package me.tud.mc2d.canvas;

import com.google.common.base.Preconditions;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class ConcurrentMemoryRGBCanvas implements Canvas {

    private final AtomicIntegerArray pixels;
    private final @Getter int width, height;

    public ConcurrentMemoryRGBCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new AtomicIntegerArray(width * height);
    }

    @Override
    public int getRGB(int x, int y) {
        checkBounds(x, y);
        return pixels.get(index(x, y));
    }

    @Override
    public void setRGB(int x, int y, int rgb) {
        checkBounds(x, y);
        pixels.lazySet(index(x, y), rgb);
    }

    @Override
    public void fillRGB(int rgb) {
        int len = width * height;
        for (int i = 0; i < len; i++) {
            pixels.lazySet(i, rgb);
        }
    }

    @Override
    public void fillRectRGB(int x, int y, int width, int height, int rgb) {
        checkBounds(x, y, width, height);
        for (int j = y; j < y + height; j++) {
            for (int i = x; i < x + width; i++)
                pixels.lazySet(index(i, j), rgb);
        }
    }

    private int index(int x, int y) {
        return y * width + x;
    }

    private void checkBounds(int x, int y) {
        Preconditions.checkArgument(x >= 0 && x < this.width,
                "x must be within [0, " + (this.width - 1) + "], got " + x);
        Preconditions.checkArgument(y >= 0 && y < this.height,
                "y must be within [0, " + (this.height - 1) + "], got " + y);
    }

    private void checkBounds(int x, int y, int width, int height) {
        Preconditions.checkArgument(width >= 0, "width cannot be negative");
        Preconditions.checkArgument(height >= 0, "height cannot be negative");
        Preconditions.checkArgument(x >= 0 && x + width <= this.width,
                "rectangle width out of bounds");
        Preconditions.checkArgument(y >= 0 && y + height <= this.height,
                "rectangle height out of bounds");
    }

}
