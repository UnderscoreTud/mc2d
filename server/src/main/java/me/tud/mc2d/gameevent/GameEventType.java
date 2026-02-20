package me.tud.mc2d.gameevent;

import lombok.*;
import me.tud.mc2d.entity.player.GameMode;
import me.tud.mc2d.util.Codec;
import me.tud.mc2d.util.Result;

import java.util.HashMap;
import java.util.Map;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class GameEventType<T> {

    private static final Map<Byte, GameEventType<?>> ID_TO_TYPE_MAP = new HashMap<>();

    /**
     * Displays message 'block.minecraft.spawn.not_valid'
     * (You have no home bed or charged respawn anchor, or it was obstructed) to the player.
     */
    public static GameEventType<Void> NO_RESPAWN_BLOCK_AVAILABLE = id(0);
    public static GameEventType<Void> BEGIN_RAINING = id(1);
    public static GameEventType<Void> END_RAINING = id(2);
    public static GameEventType<GameMode> CHANGE_GAME_MODE = id(3, Codec.of(
            gameMode -> (float) gameMode.id(),
            id -> Result.ok(GameMode.fromID(id.intValue()))
    ));
    public static GameEventType<GameEvent.WinGame> WIN_GAME = id(4, Codec.of(
            winGame -> (float) winGame.id(),
            id -> Result.ok(GameEvent.WinGame.fromID(id.intValue()))
    ));
    public static GameEventType<GameEvent.DemoEvent> DEMO_EVENT = id(5, Codec.of(
            demoEvent -> (float) demoEvent.id(),
            id -> Result.ok(GameEvent.DemoEvent.fromID(id.intValue()))
    ));
    public static GameEventType<Void> ARROW_HIT_PLAYER = id(6);
    public static GameEventType<Float> RAIN_LEVEL_CHANGE = id(7, Codec.identity());
    public static GameEventType<Float> THUNDER_LEVEL_CHANGE = id(8, Codec.identity());
    public static GameEventType<Void> PLAY_PUFFERFISH_STING_SOUND = id(9);
    public static GameEventType<Void> PLAY_ELDER_GUARDIAN_APPEARANCE = id(10);
    public static GameEventType<Boolean> ENABLE_RESPAWN_SCREEN = id(11, Codec.of(
            flag -> (float) (flag ? 0 : 1),
            value -> Result.ok(value.intValue() == 0)
    ));
    public static GameEventType<Boolean> LIMITED_CRAFTING = id(12, Codec.of(
            flag -> (float) (flag ? 1 : 0),
            value -> Result.ok(value.intValue() == 1)
    ));
    /**
     * Instructs the client to begin the waiting process for level chunks.
     */
    public static GameEventType<Void> START_WAITING_FOR_CHUNKS = id(13);

    private final byte id;
    private final @ToString.Exclude @EqualsAndHashCode.Exclude Codec<T, Float> codec;

    public GameEvent<T> create(T value) {
        return new GameEvent<>(this, value);
    }

    private static <T> GameEventType<T> id(int id) {
        return id(id, Codec.of(_ -> 0f, f -> null));
    }

    private static <T> GameEventType<T> id(int id, Codec<T, Float> codec) {
        GameEventType<T> type = new GameEventType<>((byte) id, codec);
        ID_TO_TYPE_MAP.put((byte) id, type);
        return type;
    }

    public static <T> GameEventType<T> fromID(byte id) {
        GameEventType<?> type = ID_TO_TYPE_MAP.get(id);
        if (type == null)
            throw new IllegalArgumentException("Invalid game event type ID: " + id);
        //noinspection unchecked
        return (GameEventType<T>) type;
    }

}
