package me.tud.mc2d.canvas;

import lombok.Getter;

public interface Canvas extends ReadableCanvas, WritableCanvas {

    @Getter
    abstract class Builder<T, B extends Builder<T, B>> {

        protected int width, height;

        public B width(int width) {
            this.width = width;
            return self();
        }

        public B height(int height) {
            this.height = height;
            return self();
        }

        public B size(int width, int height) {
            return width(width).height(height);
        }

        protected abstract B self();

        public abstract T build();

    }

}
