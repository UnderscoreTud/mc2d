package me.tud.mc2d.entity.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.util.Packable;

import java.util.Arrays;
import java.util.Set;

@RequiredArgsConstructor
public enum SkinPart implements Packable {
    CAPE(0x01),
    JACKET(0x02),
    LEFT_SLEEVE(0x04),
    RIGHT_SLEEVE(0x08),
    LEFT_PANT_LEG(0x10),
    RIGHT_PANT_LEG(0x20),
    HAT(0x40);

    private final @Getter int mask;

    public static Set<SkinPart> unpack(int packed) {
        return Packable.unpack(SkinPart.class, packed);
    }

}
