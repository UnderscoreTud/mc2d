package me.tud.mc2d.entity;

import java.util.UUID;

public class BlockDisplay extends Display {

    public BlockDisplay(UUID uuid) {
        this(uuid, EntityType.BLOCK_DISPLAY);
    }

    public BlockDisplay(UUID uuid, EntityType type) {
        super(uuid, type);
    }

}
