package me.tud.mc2d.entity;

import java.util.UUID;

public abstract class Display extends Entity {

    public Display(UUID uuid, EntityType type) {
        super(uuid, type);
    }

    public enum Billboard {
        FIXED,
        VERTICAL,
        HORIZONTAL,
        CENTER
    }
}
