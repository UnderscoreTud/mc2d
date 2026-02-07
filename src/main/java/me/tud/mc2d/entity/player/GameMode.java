package me.tud.mc2d.entity.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum GameMode {

    SURVIVAL(0),
    CREATIVE(1),
    ADVENTURE(2),
    SPECTATOR(3);

    private final @Getter int id;

    public static GameMode fromID(int id) {
        for (GameMode hand : values()) {
            if (hand.id == id)
                return hand;
        }
        throw new IllegalArgumentException("Invalid game mode ID: " + id);
    }

}
