package me.tud.mc2d.canvas;

import lombok.Getter;
import lombok.ToString;
import me.tud.mc2d.canvas.event.CanvasEvent;
import me.tud.mc2d.canvas.event.CanvasObserver;
import me.tud.mc2d.canvas.event.ObservableCanvas;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

@Getter
@ToString
public class MemoryCanvas extends AbstractMutableCanvas implements ObservableCanvas<Integer> {

    private final int[] pixels;
    private final List<CanvasObserver<Integer>> observers = new ArrayList<>();

    private final int width, height, size;

    public MemoryCanvas(Builder<?, ?> builder) {
        this.width = builder.width();
        this.height = builder.height();
        this.size = width() * height();
        this.pixels = new int[size];
    }

    @Override
    public int getRGB(int x, int y) {
        return pixels[index(x, y)];
    }

    @Override
    public void setRGB(int x, int y, int rgb) {
        int index = index(x, y);
        int previous = pixels[index];
        if (previous == rgb)
            return;
        pixels[index] = rgb;
        notifyObservers(CanvasObserver::onPixelChange, new CanvasEvent.PixelChange<>(x, y, previous, rgb));
        markDirty(x, y);
    }

    @Override
    public void fillRGB(int rgb) {
        notifyObservers(CanvasObserver::onFill, new CanvasEvent.Fill<>(rgb));
        for (int x = 0; x < width(); x++) {
            for (int y = 0; y < height(); y++)
                setRGB(x, y, rgb);
        }
    }

    @Override
    public void fillRectRGB(int startX, int startY, int width, int height, int rgb) {
        notifyObservers(CanvasObserver::onFillRect, new CanvasEvent.FillRect<>(startX, startY, width, height, rgb));
        int endX = startX + width, endY = startY + height;
        for (int x = startX; x < endX; x++) {
            for (int y = startY; y < endY; y++)
                setRGB(x, y, rgb);
        }
    }

    @Override
    public void addObserver(CanvasObserver<Integer> observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(CanvasObserver<Integer> observer) {
        return observers.remove(observer);
    }

    @Override
    public @UnmodifiableView Collection<CanvasObserver<Integer>> observers() {
        return Collections.unmodifiableCollection(observers);
    }

    private <E extends CanvasEvent<Integer>> void notifyObservers(BiConsumer<CanvasObserver<Integer>, E> consumer, E event) {
        for (CanvasObserver<Integer> observer : observers)
            consumer.accept(observer, event);
    }

    protected int index(int x, int y) {
        check(x, y);
        return x + y * width;
    }

    protected void check(int x, int y) {
        checkRange(x, 0, width(), "X");
        checkRange(y, 0, height(), "Y");
    }

    protected void checkRange(int actual, int min, int max, String name) {
        if (actual >= min && actual < max)
            return;
        throw new IllegalArgumentException(name + " must be in [" + min + ", " + max + "), got " + actual);
    }

}
