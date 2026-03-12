package me.tud.mc2d.canvas.world;

import me.tud.mc2d.entity.BlockDisplay;

public interface DisplayBlockCanvas extends BlockCanvas {

    BlockDisplay getBlockDisplay(int x, int y);

    void setBlockDisplay(int x, int y, BlockDisplay display);

    void fillBlockDisplay(int x, int y, BlockDisplay display);

    void fillRectBlockDisplay(int x, int y, int width, int height, BlockDisplay display);


}
