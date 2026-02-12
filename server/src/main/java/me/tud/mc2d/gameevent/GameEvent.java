package me.tud.mc2d.gameevent;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.util.FriendlyByteBuf;

public record GameEvent<T>(GameEventType<T> type, T value) {

    public float asFloat() {
        return type.codec().encode(value);
    }

    public static <T> GameEvent<T> deserialize(FriendlyByteBuf buf) {
        GameEventType<T> type = GameEventType.fromID(buf.readByte());
        float encoded = buf.readFloat();
        return type.create(type.codec().decode(encoded).expect("Unable to deserialize " + encoded + " as " + type));
    }

    @Getter
    @RequiredArgsConstructor
    public enum WinGame {
        RESPAWN(0),
        ROLL_CREDITS_AND_RESPAWN(1);

        private final int id;

        public static WinGame fromID(int id) {
            for (WinGame winGame : values()) {
                if (winGame.id == id)
                    return winGame;
            }
            throw new IllegalArgumentException("Invalid win game ID: " + id);
        }

    }

    @Getter
    @RequiredArgsConstructor
    public enum DemoEvent {
        SHOW_WELCOME_TO_DEMO(0),
        TELL_MOVEMENT_CONTROLS(101),
        TELL_JUMP_CONTROL(102),
        TELL_INVENTORY_CONTROL(103),
        DEMO_OVER(104);

        private final int id;

        public static DemoEvent fromID(int id) {
            for (DemoEvent demoEvent : values()) {
                if (demoEvent.id == id)
                    return demoEvent;
            }
            throw new IllegalArgumentException("Invalid demo event ID: " + id);
        }

    }

}
