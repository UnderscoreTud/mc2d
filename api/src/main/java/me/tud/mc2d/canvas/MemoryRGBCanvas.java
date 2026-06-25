package me.tud.mc2d.canvas;

import com.google.common.base.Preconditions;
import lombok.Getter;

import java.util.Arrays;

public class MemoryRGBCanvas implements Canvas {

    private final int[] pixels;
    private final @Getter int width, height;

    public MemoryRGBCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new int[width * height];
    }

    @Override
    public int getRGB(int x, int y) {
        checkBounds(x, y);
        return pixels[index(x, y)];
    }

    @Override
    public void setRGB(int x, int y, int rgb) {
        checkBounds(x, y);
        pixels[index(x, y)] = rgb;
    }

    @Override
    public void fillRGB(int rgb) {
        Arrays.fill(pixels, rgb);
    }

    @Override
    public void fillRectRGB(int x, int y, int width, int height, int rgb) {
        checkBounds(x, y, width, height);
        for (int j = y; j < y + height; j++) {
            int startIndex = index(x, j);
            Arrays.fill(pixels, startIndex, startIndex + width, rgb);
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
