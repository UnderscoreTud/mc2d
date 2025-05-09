package me.tud.mc2d.network;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ConnectionState {

    HANDSHAKING(0),
    STATUS(1),
    LOGIN(2),
    CONFIGURATION(3),
    PLAY(4);

    private final @Getter int id;

    public static ConnectionState fromID(int id) {
        return switch (id) {
            case 0 -> HANDSHAKING;
            case 1 -> STATUS;
            case 2 -> LOGIN;
            case 3 -> CONFIGURATION;
            case 4 -> PLAY;
            default -> throw new IllegalArgumentException("Invalid connection state ID: " + id);
        };
    }

}
