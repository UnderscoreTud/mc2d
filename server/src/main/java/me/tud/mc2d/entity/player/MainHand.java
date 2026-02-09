package me.tud.mc2d.entity.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum MainHand {

    LEFT(0),
    RIGHT(1);

    private final @Getter int id;

    public static MainHand fromID(int id) {
        for (MainHand hand : values()) {
            if (hand.id == id)
                return hand;
        }
        throw new IllegalArgumentException("Invalid main hand ID: " + id);
    }

}
