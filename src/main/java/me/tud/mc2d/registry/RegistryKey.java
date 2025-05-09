package me.tud.mc2d.registry;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RegistryKey<T extends NBTSerializable, R extends Registry<T>> {

    private static final List<RegistryKey<?, ?>> REGISTRY_KEYS = new ArrayList<>();

    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> ARMOR_TRIM_MATERIAL = create("trim_material");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> ARMOR_TRIM_PATTERN = create("trim_pattern");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> BANNER_PATTERN = create("banner_pattern");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> BIOME = create("worldgen/biome");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> CAT_VARIANT = create("cat_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> CHAT_TYPE = create("chat_type");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> CHICKEN_VARIANT = create("chicken_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> COW_VARIANT = create("chicken_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> DAMAGE_TYPE = create("damage_type");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> DIMENSION_TYPE = create("dimension_type");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> FROG_VARIANT = create("frog_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> PAINTING_VARIANT = create("painting_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> PIG_VARIANT = create("pig_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> WOLF_SOUND_VARIANT = create("wolf_sound_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> WOLF_VARIANT = create("wolf_variant");

    private final NamespacedKey key;

    private static <T extends NBTSerializable, R extends Registry<T>> RegistryKey<T, R> create(@NamespacedKey.KeyPattern String key) {
        RegistryKey<T, R> registryKey = new RegistryKey<>(NamespacedKey.minecraft(key));
        REGISTRY_KEYS.add(registryKey);
        RegistryKey<NBTSerializable, BuiltInRegistry<NBTSerializable>> test = of(NamespacedKey.minecraft("test"));
        return registryKey;
    }

    public static <T extends NBTSerializable, R extends Registry<T>> RegistryKey<T, R> of(NamespacedKey key) {
        return new RegistryKey<>(key);
    }

    public static RegistryKey<?, ?>[] values() {
        return REGISTRY_KEYS.toArray(new RegistryKey[0]);
    }

}
