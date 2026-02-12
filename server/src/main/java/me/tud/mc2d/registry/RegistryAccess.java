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
        access.dataDriven(RegistryKey.DAMAGE_TYPE,
                Map.entry(NamespacedKey.minecraft("arrow"), DamageType.ARROW),
                Map.entry(NamespacedKey.minecraft("bad_respawn_point"), DamageType.BAD_RESPAWN_POINT),
                Map.entry(NamespacedKey.minecraft("cactus"), DamageType.CACTUS),
                Map.entry(NamespacedKey.minecraft("campfire"), DamageType.CAMPFIRE),
                Map.entry(NamespacedKey.minecraft("cramming"), DamageType.CRAMMING),
                Map.entry(NamespacedKey.minecraft("dragon_breath"), DamageType.DRAGON_BREATH),
                Map.entry(NamespacedKey.minecraft("drown"), DamageType.DROWN),
                Map.entry(NamespacedKey.minecraft("dry_out"), DamageType.DRY_OUT),
                Map.entry(NamespacedKey.minecraft("ender_pearl"), DamageType.ENDER_PEARL),
                Map.entry(NamespacedKey.minecraft("explosion"), DamageType.EXPLOSION),
                Map.entry(NamespacedKey.minecraft("fall"), DamageType.FALL),
                Map.entry(NamespacedKey.minecraft("falling_anvil"), DamageType.FALLING_ANVIL),
                Map.entry(NamespacedKey.minecraft("falling_block"), DamageType.FALLING_BLOCK),
                Map.entry(NamespacedKey.minecraft("falling_stalactite"), DamageType.FALLING_STALACTITE),
                Map.entry(NamespacedKey.minecraft("fireball"), DamageType.FIREBALL),
                Map.entry(NamespacedKey.minecraft("fireworks"), DamageType.FIREWORKS),
                Map.entry(NamespacedKey.minecraft("fly_into_wall"), DamageType.FLY_INTO_WALL),
                Map.entry(NamespacedKey.minecraft("freeze"), DamageType.FREEZE),
                Map.entry(NamespacedKey.minecraft("generic_kill"), DamageType.GENERIC_KILL),
                Map.entry(NamespacedKey.minecraft("generic"), DamageType.GENERIC),
                Map.entry(NamespacedKey.minecraft("hot_floor"), DamageType.HOT_FLOOR),
                Map.entry(NamespacedKey.minecraft("in_fire"), DamageType.IN_FIRE),
                Map.entry(NamespacedKey.minecraft("in_wall"), DamageType.IN_WALL),
                Map.entry(NamespacedKey.minecraft("indirect_magic"), DamageType.INDIRECT_MAGIC),
                Map.entry(NamespacedKey.minecraft("lava"), DamageType.LAVA),
                Map.entry(NamespacedKey.minecraft("lightning_bolt"), DamageType.LIGHTNING_BOLT),
                Map.entry(NamespacedKey.minecraft("mace_smash"), DamageType.MACE_SMASH),
                Map.entry(NamespacedKey.minecraft("magic"), DamageType.MAGIC),
                Map.entry(NamespacedKey.minecraft("mob_attack_no_aggro"), DamageType.MOB_ATTACK_NO_AGRO),
                Map.entry(NamespacedKey.minecraft("mob_attack"), DamageType.MOB_ATTACK),
                Map.entry(NamespacedKey.minecraft("mob_projectile"), DamageType.MOB_PROJECTILE),
                Map.entry(NamespacedKey.minecraft("on_fire"), DamageType.ON_FIRE),
                Map.entry(NamespacedKey.minecraft("out_of_world"), DamageType.OUT_OF_WORLD),
                Map.entry(NamespacedKey.minecraft("outside_border"), DamageType.OUTSIDE_BORDER),
                Map.entry(NamespacedKey.minecraft("player_attack"), DamageType.PLAYER_ATTACK),
                Map.entry(NamespacedKey.minecraft("player_explosion"), DamageType.PLAYER_EXPLOSION),
                Map.entry(NamespacedKey.minecraft("sonic_boom"), DamageType.SONIC_BOOM),
                Map.entry(NamespacedKey.minecraft("spit"), DamageType.SPIT),
                Map.entry(NamespacedKey.minecraft("stalagmite"), DamageType.STALAGMITE),
                Map.entry(NamespacedKey.minecraft("starve"), DamageType.STARVE),
                Map.entry(NamespacedKey.minecraft("sting"), DamageType.STING),
                Map.entry(NamespacedKey.minecraft("sweet_berry_bush"), DamageType.SWEET_BERRY_BUSH),
                Map.entry(NamespacedKey.minecraft("thorns"), DamageType.THORNS),
                Map.entry(NamespacedKey.minecraft("thrown"), DamageType.THROWN),
                Map.entry(NamespacedKey.minecraft("trident"), DamageType.TRIDENT),
                Map.entry(NamespacedKey.minecraft("unattributed_fireball"), DamageType.UNATTRIBUTED_FIREBALL),
                Map.entry(NamespacedKey.minecraft("wind_charge"), DamageType.WIND_CHARGE),
                Map.entry(NamespacedKey.minecraft("wither_skull"), DamageType.WITHER_SKULL),
                Map.entry(NamespacedKey.minecraft("wither"), DamageType.WITHER)
        );
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
