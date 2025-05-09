package me.tud.mc2d.chat;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ChatMode {

    ENABLED(0),
    COMMANDS_ONLY(1),
    HIDDEN(2);

    private final @Getter int id;

    public static ChatMode fromID(int id) {
        for (ChatMode mode : values()) {
            if (mode.id == id)
                return mode;
        }
        throw new IllegalArgumentException("Invalid chat mode ID: " + id);
    }

}
