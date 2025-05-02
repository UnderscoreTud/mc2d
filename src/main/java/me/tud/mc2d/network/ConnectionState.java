package me.tud.mc2d.network;

public enum ConnectionState {

    HANDSHAKING,
    STATUS,
    LOGIN,
    CONFIGURATION,
    PLAY;

    public static ConnectionState fromId(int id) {
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
