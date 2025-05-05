package me.tud.mc2d.registry;

import me.tud.mc2d.chat.ChatMode;
import me.tud.mc2d.util.NamespacedKey;

import java.util.Arrays;

public class RegistryKey<T, R extends Registry<T>> {

    public static final RegistryKey<Object, DataDrivenRegistry<Object>> ARMOR_TRIM_MATERIAL = of(NamespacedKey.minecraft("trim_material"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> ARMOR_TRIM_PATTERN = of(NamespacedKey.minecraft("trim_pattern"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> BANNER_PATTERN = of(NamespacedKey.minecraft("banner_pattern"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> BIOME = of(NamespacedKey.minecraft("worldgen/biome"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> CHAT_TYPE = of(NamespacedKey.minecraft("chat_type"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> DAMAGE_TYPE = of(NamespacedKey.minecraft("damage_type"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> DIMENSION_TYPE = of(NamespacedKey.minecraft("dimension_type"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> WOLF_VARIANT = of(NamespacedKey.minecraft("wolf_variant"));
    public static final RegistryKey<Object, DataDrivenRegistry<Object>> PAINTING_VARIANT = of(NamespacedKey.minecraft("painting_variant"));

    private static final RegistryKey<?, ?>[] VALUES = {
        ARMOR_TRIM_MATERIAL,
        ARMOR_TRIM_PATTERN,
        BANNER_PATTERN,
        BIOME,
        CHAT_TYPE,
        DAMAGE_TYPE,
        DIMENSION_TYPE,
        WOLF_VARIANT,
        PAINTING_VARIANT
    };

    private final NamespacedKey key;

    private RegistryKey(NamespacedKey key) {
        this.key = key;
    }

    public NamespacedKey key() {
        return key;
    }

    public static <T, R extends Registry<T>> RegistryKey<T, R> of(NamespacedKey key) {
        return new RegistryKey<>(key);
    }

    public static RegistryKey<?, ?>[] values() {
        return Arrays.copyOf(VALUES, VALUES.length);
    }

}
