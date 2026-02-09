package me.tud.mc2d.canvas;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public sealed abstract class WorldCanvas<T> implements Canvas<T>
        permits WorldCanvas.BlockWorldCanvas, WorldCanvas.DisplayBlockWorldCanvas {

    private final int width, height;
    private final Direction direction;

    public static WorldCanvas<Object> block(int width, int height) {
        return new BlockWorldCanvas(width, height, Direction.NORTH);
    }

    public static WorldCanvas<Object> block(int width, int height, Direction direction) {
        return new BlockWorldCanvas(width, height, direction);
    }

    public static WorldCanvas<Object> displayBlock(int width, int height) {
        return new DisplayBlockWorldCanvas(width, height, Direction.NORTH);
    }

    public static WorldCanvas<Object> displayBlock(int width, int height, Direction direction) {
        return new DisplayBlockWorldCanvas(width, height, direction);
    }

    public enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST,
        UP,
        DOWN
    }

    public static non-sealed class BlockWorldCanvas extends WorldCanvas<Object> { // TODO replace with Block once implemented

        public BlockWorldCanvas(int width, int height, Direction direction) {
            super(width, height, direction);
        }

        @Override
        public Object getPixel(int x, int y) {
            return null;
        }

        @Override
        public void setPixel(int x, int y, Object pixel) {

        }

        @Override
        public void fill(Object pixel) {

        }

        @Override
        public void fill(Object pixel, int x, int y, int width, int height) {

        }

    }

    public static non-sealed class DisplayBlockWorldCanvas extends WorldCanvas<Object> { // TODO replace with DisplayBlock once implemented

        public DisplayBlockWorldCanvas(int width, int height, Direction direction) {
            super(width, height, direction);
        }

        @Override
        public Object getPixel(int x, int y) {
            return null;
        }

        @Override
        public void setPixel(int x, int y, Object pixel) {

        }

        @Override
        public void fill(Object pixel) {

        }

        @Override
        public void fill(Object pixel, int x, int y, int width, int height) {

        }

    }

}
