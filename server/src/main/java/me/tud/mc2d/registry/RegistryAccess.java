package me.tud.mc2d.registry;

import lombok.Getter;
import me.tud.mc2d.damage.DamageType;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.MobVariant;
import me.tud.mc2d.entity.WolfSoundVariant;
import me.tud.mc2d.entity.WolfVariant;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.painting.PaintingVariant;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.Biome;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RegistryAccess {

    private final @Getter Server server;
    private final Map<RegistryKey<?, ?>, Registry<?>> registries = new HashMap<>();

    private RegistryAccess(Server server) {
        this.server = server;
    }

    public <T extends NBTSerializable, R extends Registry<T>> void register(RegistryKey<T, R> key, R registry) {
        if (registries.containsKey(key))
            throw new IllegalArgumentException("Registry already registered: " + key);
        registries.put(key, registry);
    }

    public <T extends NBTSerializable, R extends Registry<T>> R get(RegistryKey<T, R> key) {
        //noinspection unchecked
        return (R) registries.get(key);
    }

    public <T extends NBTSerializable, R extends Registry<T>> R get(NamespacedKey key) {
        return get(RegistryKey.<T, R>of(key));
    }

    public @UnmodifiableView Map<RegistryKey<?, ?>, Registry<?>> registries() {
        return Collections.unmodifiableMap(registries);
    }

    public static RegistryAccess empty(Server server) {
        return new RegistryAccess(server);
    }

    public static RegistryAccess createDefault(Server server) {
        RegistryAccess access = new RegistryAccess(server);
        access.dataDriven(RegistryKey.BIOME, Map.entry(NamespacedKey.minecraft("plains"), Biome.PLAINS));
        access.register(RegistryKey.DAMAGE_TYPE, DamageType.createDefaultRegistry(server));
        access.register(RegistryKey.DIMENSION_TYPE, DimensionType.createDefaultRegistry(server));
        access.dataDriven(RegistryKey.CAT_VARIANT, Map.entry(NamespacedKey.minecraft("tabby"), MobVariant.CAT_TABBY));
        access.dataDriven(RegistryKey.CHICKEN_VARIANT, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.CHICKEN_TEMPERATE));
        access.dataDriven(RegistryKey.COW_VARIANT, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.COW_TEMPERATE));
        access.dataDriven(RegistryKey.FROG_VARIANT, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.FROG_TEMPERATE));
        access.dataDriven(RegistryKey.PAINTING_VARIANT, Map.entry(NamespacedKey.minecraft("alban"), PaintingVariant.ALBAN));
        access.dataDriven(RegistryKey.PIG_VARIANT, Map.entry(NamespacedKey.minecraft("temperate"), MobVariant.PIG_TEMPERATE));
        access.dataDriven(RegistryKey.WOLF_SOUND_VARIANT, Map.entry(NamespacedKey.minecraft("classic"), WolfSoundVariant.CLASSIC));
        access.dataDriven(RegistryKey.WOLF_VARIANT, Map.entry(NamespacedKey.minecraft("ashen"), WolfVariant.ASHEN));
        return access;
    }

    @SafeVarargs
    private <T extends NBTSerializable, R extends DataDrivenRegistry<T>> void dataDriven(
            RegistryKey<T, R> key,
            Map.Entry<NamespacedKey, T>... entries
    ) {
        if (registries.containsKey(key))
            throw new IllegalArgumentException("Registry already registered: " + key);
        DataDrivenRegistry<T> registry = new DataDrivenRegistry<>(server, key.key());
        registry.modify(modifiable -> {
            for (Map.Entry<NamespacedKey, T> entry : entries)
                modifiable.register(entry.getKey(), entry.getValue());
        });
        registries.put(key, registry);
    }

}
