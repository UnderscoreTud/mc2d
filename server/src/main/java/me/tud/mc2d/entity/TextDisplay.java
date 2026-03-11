package me.tud.mc2d.entity;

import java.util.UUID;

public class TextDisplay extends Display {

    public TextDisplay() {
        this(UUID.randomUUID());
    }

    public TextDisplay(UUID uuid) {
        this(uuid, EntityType.TEXT_DISPLAY);
    }

    public TextDisplay(UUID uuid, EntityType type) {
        super(uuid, type);
    }

    public enum Alignment {
        CENTER,
        LEFT,
        RIGHT
    }

}
