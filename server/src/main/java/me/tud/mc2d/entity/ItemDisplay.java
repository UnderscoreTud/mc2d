package me.tud.mc2d.entity;

import java.util.UUID;

public class ItemDisplay extends Display {

    public ItemDisplay(UUID uuid) {
        this(uuid, EntityType.ITEM_DISPLAY);
    }

    public ItemDisplay(UUID uuid, EntityType type) {
        super(uuid, type);
    }

    public enum DisplayType {
        NONE,
        THIRD_PERSON_LEFT_HAND,
        THIRD_PERSON_RIGHT_HAND,
        FIRST_PERSON_LEFT_HAND,
        FIRST_PERSON_RIGHT_HAND,
        HEAD,
        GUI,
        GROUND,
        FIXED
    }

}
