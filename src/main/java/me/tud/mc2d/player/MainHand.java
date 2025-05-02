package me.tud.mc2d.player;

public enum MainHand {

    LEFT(0),
    RIGHT(1);

    private final int id;

    MainHand(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public static MainHand fromID(int id) {
        for (MainHand hand : values()) {
            if (hand.id == id)
                return hand;
        }
        throw new IllegalArgumentException("Invalid main hand ID: " + id);
    }

}
