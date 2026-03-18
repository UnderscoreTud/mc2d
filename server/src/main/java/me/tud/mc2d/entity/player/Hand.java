package me.tud.mc2d.entity.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Hand {

    MAIN_HAND(0),
    OFFHAND(1);

    private final @Getter int id;

    public static Hand fromID(int id) {
        for (Hand hand : values()) {
            if (hand.id == id)
                return hand;
        }
        throw new IllegalArgumentException("Invalid main hand ID: " + id);
    }

}
