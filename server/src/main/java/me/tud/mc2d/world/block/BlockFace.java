package me.tud.mc2d.world.block;

import com.google.common.collect.ImmutableMap;

import java.util.Locale;
import java.util.Map;

public enum BlockFace {
    NORTH,
    EAST,
    SOUTH,
    WEST,
    UP,
    DOWN;

    private static final Map<String, BlockFace> STRING_TO_BLOCK_FACE;

    static {
        ImmutableMap.Builder<String, BlockFace> builder = ImmutableMap.builder();
        for (BlockFace value : values())
            builder.put(value.name().toLowerCase(Locale.ENGLISH), value);
        STRING_TO_BLOCK_FACE = builder.build();
    }

    public static BlockFace parse(String string) {
        return STRING_TO_BLOCK_FACE.get(string.toLowerCase(Locale.ENGLISH)); 
    }

    public @interface Values {
        BlockFace[] value();
    }
}
