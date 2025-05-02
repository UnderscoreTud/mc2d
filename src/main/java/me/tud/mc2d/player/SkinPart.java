package me.tud.mc2d.player;

import java.util.Arrays;

public enum SkinPart {
    CAPE(0x01),
    JACKET(0x02),
    LEFT_SLEEVE(0x04),
    RIGHT_SLEEVE(0x08),
    LEFT_PANT_LEG(0x10),
    RIGHT_PANT_LEG(0x20),
    HAT(0x40);

    private final int id;

    SkinPart(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public static SkinPart fromID(int id) {
        for (SkinPart part : values()) {
            if (part.id == id)
                return part;
        }
        throw new IllegalArgumentException("Invalid skin part ID: " + id);
    }

    public static byte toBitmask(SkinPart... parts) {
        int bitmask = 0;
        for (SkinPart part : parts) {
            bitmask |= part.getID();
        }
        return (byte) bitmask;
    }

    public static SkinPart[] fromBitmask(int bitmask) {
        return Arrays.stream(SkinPart.values())
                .filter(part -> (bitmask & part.getID()) != 0)
                .toArray(SkinPart[]::new);
    }

}
