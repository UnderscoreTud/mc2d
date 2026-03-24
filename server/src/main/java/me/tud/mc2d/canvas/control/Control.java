package me.tud.mc2d.canvas.control;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.util.Packable;

import java.util.Set;

@Getter
@RequiredArgsConstructor
public enum Control implements Packable {
    SLOT_0,
    SLOT_1,
    SLOT_2,
    SLOT_3,
    SLOT_4,
    SLOT_5,
    SLOT_6,
    SLOT_7,
    SLOT_8,
    LEFT_CLICK,
    RIGHT_CLICK,
    OPEN_INVENTORY,
    DROP_ITEM,
    DROP_STACK,
    SWAP_ITEM_IN_HAND,
    FORWARD(0x01),
    BACKWARD(0x02),
    LEFT(0x04),
    RIGHT(0x08),
    JUMP(0x10),
    SNEAK(0x20),
    SPRINT(0x40);

    private final int mask;
    private final boolean toggleable;

    Control() {
        this(0, false);
    }

    Control(int index) {
        this(index, true);
    }

    public static Set<Control> unpack(int packed) {
        return Packable.unpack(Control.class, packed);
    }

}
