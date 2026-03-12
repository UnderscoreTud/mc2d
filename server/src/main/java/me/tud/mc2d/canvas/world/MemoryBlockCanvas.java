package me.tud.mc2d.canvas.world;

import lombok.Getter;
import lombok.ToString;
import me.tud.mc2d.canvas.AbstractMutableCanvas;
import me.tud.mc2d.canvas.event.CanvasEvent;
import me.tud.mc2d.canvas.event.CanvasObserver;
import me.tud.mc2d.canvas.event.ObservableCanvas;
import me.tud.mc2d.world.block.Block;
import me.tud.mc2d.world.blockdata.BlockData;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

@Getter
@ToString
public class MemoryBlockCanvas extends AbstractMutableCanvas implements BlockCanvas, ObservableCanvas<BlockData> {

    private final BlockData[] pixels;
    private final List<CanvasObserver<BlockData>> observers = new ArrayList<>();

    private final int width, height, size;

    protected MemoryBlockCanvas(Builder<?, ?> builder) {
        this.width = builder.width();
        this.height = builder.height();
        this.size = width() * height();
        this.pixels = new BlockData[size];
    }

    @Override
    public int getRGB(int x, int y) {
        throw new UnsupportedOperationException(); // TODO
    }

    @Override
    public void setRGB(int x, int y, int rgb) {
        throw new UnsupportedOperationException(); // TODO
    }

    @Override
    public void fillRGB(int rgb) {
        throw new UnsupportedOperationException(); // TODO
    }

    @Override
    public void fillRectRGB(int x, int y, int width, int height, int rgb) {
        throw new UnsupportedOperationException(); // TODO
    }

    @Override
    public Block<?> getBlock(int x, int y) {
        return getBlockData(x, y).blockType();
    }

    @Override
    public BlockData getBlockData(int x, int y) {
        return pixels[index(x, y)];
    }

    @Override
    public void setBlock(int x, int y, Block<?> block) {
        setBlockData(x, y, block.createBlockData());
    }

    @Override
    public void setBlockData(int x, int y, BlockData blockData) {
        int index = index(x, y);
        BlockData previous = pixels[index];
        if (blockData.equals(previous))
            return;
        pixels[index] = blockData;
        notifyObservers(CanvasObserver::onPixelChange, new CanvasEvent.PixelChange<>(x, y, previous, blockData));
        markDirty(x, y);
    }

    @Override
    public void fillBlock(Block<?> block) {
        fillBlockData(block.createBlockData());
    }

    @Override
    public void fillBlockData(BlockData blockData) {
        notifyObservers(CanvasObserver::onFill, new CanvasEvent.Fill<>(blockData));
        for (int x = 0; x < width(); x++) {
            for (int y = 0; y < height(); y++)
                setBlockData(x, y, blockData);
        }
    }

    @Override
    public void fillRectBlock(int startX, int startY, int width, int height, Block<?> block) {
        fillRectBlockData(startX, startY, width, height, block.createBlockData());
    }

    @Override
    public void fillRectBlockData(int startX, int startY, int width, int height, BlockData blockData) {
        notifyObservers(CanvasObserver::onFillRect, new CanvasEvent.FillRect<>(startX, startY, width, height, blockData));
        int endX = startX + width, endY = startY + height;
        for (int x = startX; x < endX; x++) {
            for (int y = startY; y < endY; y++)
                setBlockData(x, y, blockData);
        }
    }

    @Override
    public void addObserver(CanvasObserver<BlockData> observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(CanvasObserver<BlockData> observer) {
        return observers.remove(observer);
    }

    @Override
    public @UnmodifiableView Collection<CanvasObserver<BlockData>> observers() {
        return Collections.unmodifiableCollection(observers);
    }

    private <E extends CanvasEvent<BlockData>> void notifyObservers(BiConsumer<CanvasObserver<BlockData>, E> consumer, E event) {
        for (CanvasObserver<BlockData> observer : observers)
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
