package me.tud.mc2d.chat;

public enum ChatMode {

    ENABLED(0),
    COMMANDS_ONLY(1),
    HIDDEN(2);

    private final int id;

    ChatMode(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public static ChatMode fromID(int id) {
        for (ChatMode mode : values()) {
            if (mode.id == id)
                return mode;
        }
        throw new IllegalArgumentException("Invalid chat mode ID: " + id);
    }

}
