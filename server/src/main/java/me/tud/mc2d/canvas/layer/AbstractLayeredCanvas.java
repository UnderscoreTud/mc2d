package me.tud.mc2d.canvas.layer;

import lombok.Data;
import me.tud.mc2d.canvas.*;
import me.tud.mc2d.canvas.lifecycle.Presentable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;
import org.jspecify.annotations.NullMarked;

import java.util.*;

public abstract class AbstractLayeredCanvas<C extends MutableCanvas & Presentable> implements LayeredCanvas<C> {

    protected final List<Layer<C>> layers = new ArrayList<>();
    protected final C output;
    @SuppressWarnings("rawtypes")
    protected final NativePixelGetter pixelGetter;
    @SuppressWarnings("rawtypes")
    protected final NativePixelSetter pixelSetter;
    @SuppressWarnings("rawtypes")
    protected final CanvasCompositor compositor;

    protected <P> AbstractLayeredCanvas(NativePixelGetter<C, P> pixelGetter, NativePixelSetter<C, P> pixelSetter, CanvasCompositor<P> compositor) {
        this.output = createCanvas();
        this.pixelGetter = pixelGetter;
        this.pixelSetter = pixelSetter;
        this.compositor = compositor;
    }

    @Override
    public @UnmodifiableView List<? extends CanvasLayer<C>> layers() {
        return Collections.unmodifiableList(layers);
    }

    @Override
    public CanvasLayer<C> addLayer(String name, int zIndex) {
        Layer<C> layer = new Layer<>(name, createCanvas(), zIndex);
        layers.add(layer);
        return layer;
    }

    @Override
    public boolean removeLayer(String name) {
        return layers.removeIf(layer -> layer.name().equals(name));
    }

    @Override
    public Optional<? extends CanvasLayer<C>> layer(String name) {
        return layers.stream()
                .filter(layer -> layer.name().equals(name))
                .findFirst();
    }
    
    protected abstract Optional<? extends Layer<C>> internalLayer(String name);

    @Override
    public Optional<@NotNull C> canvas(String name) {
        return layer(name).map(CanvasLayer::canvas);
    }

    @Override
    public void moveLayer(String name, int zIndex) {
        internalLayer(name).ifPresent(layer -> layer.zIndex(zIndex));
    }

    @Override
    public void setLayerVisible(String name, boolean visible) {
        internalLayer(name).ifPresent(layer -> layer.visible(visible));
    }

    @Override
    public C output() {
        return output;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void flatten() {
        List<CanvasLayer<C>> ordered = new ArrayList<>(layers);
        ordered.sort(Comparator.<CanvasLayer<C>>comparingInt(CanvasLayer::zIndex).reversed());
        for (int x = 0; x < width(); x++) {
            for (int y = 0; y < height(); y++) {
                Object pixel = compositor.empty();
                for (CanvasLayer<C> layer : ordered) {
                    if (!layer.visible())
                        continue;
                    pixel = compositor.compose(pixel, pixelGetter.get(layer.canvas(), x, y));
                }
                pixelSetter.set(output, x, y, pixel);
            }
        }
    }

    @Override
    public boolean isDirty() {
        if (output.isDirty())
            return true;
        for (Layer<C> layer : layers) {
            if (layer.canvas().isDirty())
                return true;
        }
        return false;
    }

    @Override
    public @UnmodifiableView Collection<CanvasRegion> dirtyRegions() {
        return List.of(); // TODO
    }

    @Override
    public void clearDirty() {
        output.clearDirty();
        for (Layer<C> layer : layers)
            layer.canvas().clearDirty();
    }

    @Override
    public void present() {
        if (!isDirty())
            return;
        flatten();
        output.present();
        clearDirty();
    }

    protected abstract C createCanvas();

    @Data
    protected static class Layer<C extends Canvas> implements CanvasLayer<C> {

        private final String name;
        private final C canvas;
        private int zIndex;
        private boolean visible = true;

        public Layer(String name, C canvas, int zIndex) {
            this.name = name;
            this.canvas = canvas;
            this.zIndex = zIndex;
        }

        @Override
        public String name() {
            return name;
        }

        @Override
        public C canvas() {
            return canvas;
        }

        @Override
        public int zIndex() {
            return zIndex;
        }

        protected void zIndex(int zIndex) {
            this.zIndex = zIndex;
        }

        @Override
        public boolean visible() {
            return visible;
        }

        public void visible(boolean visible) {
            this.visible = visible;
        }

    }

}
