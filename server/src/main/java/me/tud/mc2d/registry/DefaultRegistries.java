package me.tud.mc2d.registry;

import me.tud.mc2d.block.Block;
import me.tud.mc2d.chat.ChatType;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.EntityType;
import me.tud.mc2d.entity.MobVariant;
import me.tud.mc2d.entity.WolfSoundVariant;
import me.tud.mc2d.entity.WolfVariant;
import me.tud.mc2d.entity.attribute.Attribute;
import me.tud.mc2d.entity.damage.DamageType;
import me.tud.mc2d.item.Item;
import me.tud.mc2d.item.armortrim.ArmorTrimMaterial;
import me.tud.mc2d.item.armortrim.ArmorTrimPattern;
import me.tud.mc2d.item.banner.BannerPattern;
import me.tud.mc2d.painting.PaintingVariant;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.Biome;

import java.util.Map;

/**
 * Builds the default {@link RegistryAccess} for the server.
 */
public final class DefaultRegistries {

    private DefaultRegistries() {}

    public static RegistryAccess create() {
        RegistryAccess access = RegistryAccess.empty();

        access.register(Attribute.KEY, Attribute.createDefaultRegistry());
        access.register(Block.KEY, Block.createDefaultRegistry());
        access.register(EntityType.KEY, EntityType.createDefaultRegistry());
        access.register(Item.KEY, Item.createDefaultRegistry());

        access.register(ArmorTrimMaterial.KEY, ArmorTrimMaterial.createDefaultRegistry());
        access.register(ArmorTrimPattern.KEY, ArmorTrimPattern.createDefaultRegistry());
        access.register(BannerPattern.KEY, BannerPattern.createDefaultRegistry());
        access.register(Biome.KEY, Biome.createDefaultRegistry());
        access.register(DamageType.KEY, DamageType.createDefaultRegistry());
        access.register(DimensionType.KEY, DimensionType.createDefaultRegistry());
        dataDriven(access, MobVariant.CAT_VARIANT_KEY, Map.entry(NamespacedKey.minecraft("tabby"), MobVariant.CAT_TABBY));
        access.register(ChatType.KEY, ChatType.createDefaultRegistry());
        dataDriven(access, MobVariant.CHICKEN_VARIANT_KEY, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.CHICKEN_TEMPERATE));
        dataDriven(access, MobVariant.COW_VARIANT_KEY, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.COW_TEMPERATE));
        dataDriven(access, MobVariant.FROG_VARIANT_KEY, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.FROG_TEMPERATE));
        access.register(PaintingVariant.KEY, PaintingVariant.createDefaultRegistry());
        dataDriven(access, MobVariant.PIG_VARIANT_KEY, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.PIG_TEMPERATE));
        dataDriven(access, WolfSoundVariant.KEY, Map.entry(NamespacedKey.minecraft("classic"), WolfSoundVariant.CLASSIC));
        dataDriven(access, WolfVariant.KEY, Map.entry(NamespacedKey.minecraft("ashen"), WolfVariant.ASHEN));
        dataDriven(access, MobVariant.ZOMBIE_NAUTILUS_VARIANT_KEY, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.ZOMBIE_NAUTILUS_TEMPERATE));
        return access;
    }

    @SafeVarargs
    private static <T extends NBTSerializable, R extends DataDrivenRegistry<T>> void dataDriven(
            RegistryAccess access,
            RegistryKey<T, R> key,
            Map.Entry<NamespacedKey, T>... entries
    ) {
        DataDrivenRegistry<T> registry = new DataDrivenRegistry<>(key.key());
        registry.modify(modifiable -> {
            for (Map.Entry<NamespacedKey, T> entry : entries)
                modifiable.register(entry.getKey(), entry.getValue());
        });
        //noinspection unchecked
        access.register(key, (R) registry);
    }

}
