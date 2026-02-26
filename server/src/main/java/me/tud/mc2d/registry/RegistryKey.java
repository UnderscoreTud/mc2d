package me.tud.mc2d.registry;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.damage.DamageType;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.MobVariant;
import me.tud.mc2d.entity.WolfSoundVariant;
import me.tud.mc2d.entity.WolfVariant;
import me.tud.mc2d.item.Item;
import me.tud.mc2d.item.armortrim.ArmorTrimMaterial;
import me.tud.mc2d.item.armortrim.ArmorTrimPattern;
import me.tud.mc2d.painting.PaintingVariant;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.Biome;
import me.tud.mc2d.world.block.Block;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RegistryKey<T, R extends Registry<T>> {

    private static final List<RegistryKey<?, ?>> REGISTRY_KEYS = new ArrayList<>();

    public static final RegistryKey<Block<?>, BuiltInRegistry<Block<?>>> BLOCKS = create("block");
    public static final RegistryKey<Item, BuiltInRegistry<Item>> ITEMS = create("item");

    public static final RegistryKey<ArmorTrimMaterial, DataDrivenRegistry<ArmorTrimMaterial>> ARMOR_TRIM_MATERIAL = create("trim_material");
    public static final RegistryKey<ArmorTrimPattern, DataDrivenRegistry<ArmorTrimPattern>> ARMOR_TRIM_PATTERN = create("trim_pattern");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> BANNER_PATTERN = create("banner_pattern");
    public static final RegistryKey<Biome, DataDrivenRegistry<Biome>> BIOME = create("worldgen/biome");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> CAT_VARIANT = create("cat_variant");
    public static final RegistryKey<NBTSerializable, DataDrivenRegistry<NBTSerializable>> CHAT_TYPE = create("chat_type");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> CHICKEN_VARIANT = create("chicken_variant");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> COW_VARIANT = create("cow_variant");
    public static final RegistryKey<DamageType, DataDrivenRegistry<DamageType>> DAMAGE_TYPE = create("damage_type");
    public static final RegistryKey<DimensionType, DataDrivenRegistry<DimensionType>> DIMENSION_TYPE = create("dimension_type");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> FROG_VARIANT = create("frog_variant");
    public static final RegistryKey<PaintingVariant, DataDrivenRegistry<PaintingVariant>> PAINTING_VARIANT = create("painting_variant");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> PIG_VARIANT = create("pig_variant");
    public static final RegistryKey<WolfSoundVariant, DataDrivenRegistry<WolfSoundVariant>> WOLF_SOUND_VARIANT = create("wolf_sound_variant");
    public static final RegistryKey<WolfVariant, DataDrivenRegistry<WolfVariant>> WOLF_VARIANT = create("wolf_variant");

    private final NamespacedKey key;

    private static <T, R extends Registry<T>> RegistryKey<T, R> create(@NamespacedKey.KeyPattern String key) {
        RegistryKey<T, R> registryKey = new RegistryKey<>(NamespacedKey.minecraft(key));
        REGISTRY_KEYS.add(registryKey);
        return registryKey;
    }

    public static <T, R extends Registry<T>> RegistryKey<T, R> of(NamespacedKey key) {
        return new RegistryKey<>(key);
    }

    public static RegistryKey<?, ?>[] values() {
        return REGISTRY_KEYS.toArray(new RegistryKey[0]);
    }

}
