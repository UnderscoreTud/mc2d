package me.tud.mc2d.chunk;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

public record Heightmap(Type type, long[] data) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeVarInt(type.id);
        buf.writeLongArray(data);
    }

    @Getter
    @RequiredArgsConstructor
    public enum Type {
        WORLD_SURFACE(1),
        MOTION_BLOCKING(4),
        MOTION_BLOCKING_NO_LEAVES(5);

        private final int id;
    }

}
