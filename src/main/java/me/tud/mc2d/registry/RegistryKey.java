package me.tud.mc2d.registry;

import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

import java.util.Arrays;

public class RegistryKey<T extends NBTSerializable, R extends Registry<T>> {

    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> ARMOR_TRIM_MATERIAL = of(NamespacedKey.minecraft("trim_material"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> ARMOR_TRIM_PATTERN = of(NamespacedKey.minecraft("trim_pattern"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> BANNER_PATTERN = of(NamespacedKey.minecraft("banner_pattern"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> BIOME = of(NamespacedKey.minecraft("worldgen/biome"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> CHAT_TYPE = of(NamespacedKey.minecraft("chat_type"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> DAMAGE_TYPE = of(NamespacedKey.minecraft("damage_type"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> DIMENSION_TYPE = of(NamespacedKey.minecraft("dimension_type"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> WOLF_VARIANT = of(NamespacedKey.minecraft("wolf_variant"));
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> PAINTING_VARIANT = of(NamespacedKey.minecraft("painting_variant"));

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

    @Override
    public String toString() {
        return "RegistryKey{" +
            "key=" + key +
            '}';
    }

    public static <T extends NBTSerializable, R extends Registry<T>> RegistryKey<T, R> of(NamespacedKey key) {
        return new RegistryKey<>(key);
    }

    public static RegistryKey<?, ?>[] values() {
        return Arrays.copyOf(VALUES, VALUES.length);
    }

}
