package me.tud.mc2d.canvas.world;

import me.tud.mc2d.canvas.MutableCanvas;
import me.tud.mc2d.world.block.Block;
import me.tud.mc2d.world.blockdata.BlockData;

public interface BlockCanvas extends MutableCanvas {

    Block<?> getBlock(int x, int y);

    BlockData getBlockData(int x, int y);

    void setBlock(int x, int y, Block<?> block);

    void setBlockData(int x, int y, BlockData blockData);

    void fillBlock(Block<?> block);

    void fillBlockData(BlockData blockData);

    void fillRectBlock(int x, int y, int width, int height, Block<?> block);

    void fillRectBlockData(int x, int y, int width, int height, BlockData blockData);

}
