package me.tud.mc2d.damage;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;

import java.util.Locale;

@Builder(builderClassName = "Builder", toBuilder = true)
public class DamageType implements NBTSerializable {

    public static final DamageType ARROW = DamageType.builder()
            .messageID("arrow")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();
    
    public static final DamageType BAD_RESPAWN_POINT = DamageType.builder()
            .messageID("badRespawnPoint")
            .scaling(Scaling.ALWAYS)
            .exhaustion(0.1f)
            .deathMessageType(DeathMessageType.INTENTIONAL_GAME_DESIGN)
            .build();
    
    public static final DamageType CACTUS = DamageType.builder()
            .messageID("cactus")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType CAMPFIRE = DamageType.builder()
            .messageID("inFire")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .effects(Effects.BURNING)
            .build();
    
    public static final DamageType CRAMMING = DamageType.builder()
            .messageID("cramming")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType DRAGON_BREATH = DamageType.builder()
            .messageID("dragonBreath")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();
    
    public static final DamageType DROWN = DamageType.builder()
            .messageID("drown")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .effects(Effects.DROWNING)
            .build();

    public static final DamageType DRY_OUT = DamageType.builder()
            .messageID("dryout")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType ENDER_PEARL = DamageType.builder()
            .messageID("fall")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .deathMessageType(DeathMessageType.FALL_VARIANTS)
            .build();

    public static final DamageType EXPLOSION = DamageType.builder()
            .messageID("explosion")
            .scaling(Scaling.ALWAYS)
            .exhaustion(0.1f)
            .build();

    public static final DamageType FALL = DamageType.builder()
            .messageID("fall")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .deathMessageType(DeathMessageType.FALL_VARIANTS)
            .build();

    public static final DamageType FALLING_ANVIL = DamageType.builder()
            .messageID("anvil")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType FALLING_BLOCK = DamageType.builder()
            .messageID("fallingBlock")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType FALLING_STALACTITE = DamageType.builder()
            .messageID("fallingStalactite")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType FIREBALL = DamageType.builder()
            .messageID("fireball")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .effects(Effects.BURNING)
            .build();

    public static final DamageType FIREWORKS = DamageType.builder()
            .messageID("fireworks")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType FLY_INTO_WALL = DamageType.builder()
            .messageID("flyIntoWall")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType FREEZE = DamageType.builder()
            .messageID("freeze")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType GENERIC_KILL = DamageType.builder()
            .messageID("genericKill")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType GENERIC = DamageType.builder()
            .messageID("generic")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType HOT_FLOOR = DamageType.builder()
            .messageID("hotFloor")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .effects(Effects.BURNING)
            .build();

    public static final DamageType IN_FIRE = DamageType.builder()
            .messageID("inFire")
            .scaling(Scaling.NEVER)
            .exhaustion(0.1f)
            .effects(Effects.BURNING)
            .build();

    public static final DamageType IN_WALL = DamageType.builder()
            .messageID("inWall")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType INDIRECT_MAGIC = DamageType.builder()
            .messageID("indirectMagic")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType LAVA = DamageType.builder()
            .messageID("lava")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .effects(Effects.BURNING)
            .build();

    public static final DamageType LIGHTNING_BOLT = DamageType.builder()
            .messageID("lightningBolt")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType MACE_SMASH = DamageType.builder()
            .messageID("mace_smash")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType MAGIC = DamageType.builder()
            .messageID("magic")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType MOB_ATTACK_NO_AGRO = DamageType.builder()
            .messageID("mob")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType MOB_ATTACK = DamageType.builder()
            .messageID("mob")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType MOB_PROJECTILE = DamageType.builder()
            .messageID("mob")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType ON_FIRE = DamageType.builder()
            .messageID("onFire")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .effects(Effects.BURNING)
            .build();

    public static final DamageType OUT_OF_WORLD = DamageType.builder()
            .messageID("outOfWorld")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType OUTSIDE_BORDER = DamageType.builder()
            .messageID("outsideBorder")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType PLAYER_ATTACK = DamageType.builder()
            .messageID("player")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType PLAYER_EXPLOSION = DamageType.builder()
            .messageID("explosion.player")
            .scaling(Scaling.ALWAYS)
            .exhaustion(0.1f)
            .build();

    public static final DamageType SONIC_BOOM = DamageType.builder()
            .messageID("sonic_boom")
            .scaling(Scaling.ALWAYS)
            .exhaustion(0.0f)
            .build();

    public static final DamageType SPIT = DamageType.builder()
            .messageID("mob")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType STALAGMITE = DamageType.builder()
            .messageID("stalagmite")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType STARVE = DamageType.builder()
            .messageID("starve")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    public static final DamageType STING = DamageType.builder()
            .messageID("sting")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType SWEET_BERRY_BUSH = DamageType.builder()
            .messageID("swweetBerryBush")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .effects(Effects.POKING)
            .build();

    public static final DamageType THORNS = DamageType.builder()
            .messageID("thorns")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .effects(Effects.THORNS)
            .build();

    public static final DamageType THROWN = DamageType.builder()
            .messageID("thrown")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType TRIDENT = DamageType.builder()
            .messageID("trident")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType UNATTRIBUTED_FIREBALL = DamageType.builder()
            .messageID("onFire")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .effects(Effects.BURNING)
            .build();

    public static final DamageType WIND_CHARGE = DamageType.builder()
            .messageID("mob")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType WITHER_SKULL = DamageType.builder()
            .messageID("witherSkull")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.1f)
            .build();

    public static final DamageType WITHER = DamageType.builder()
            .messageID("wither")
            .scaling(Scaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER)
            .exhaustion(0.0f)
            .build();

    private final String messageID;
    private final Scaling scaling;
    private final float exhaustion;
    private final @Nullable Effects effects;
    private final @Nullable DeathMessageType deathMessageType;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("message_id", messageID);
        nbt.set("scaling", scaling.name().toLowerCase(Locale.ENGLISH));
        nbt.set("exhaustion", exhaustion);
        if (effects != null)
            nbt.set("effects", effects.name().toLowerCase(Locale.ENGLISH));
        if (deathMessageType != null)
            nbt.set("death_message_type", deathMessageType.name().toLowerCase(Locale.ENGLISH));
        return nbt;
    }

    public enum Scaling {
        NEVER,
        WHEN_CAUSED_BY_LIVING_NON_PLAYER,
        ALWAYS,
    }

    public enum Effects {
        HURT,
        THORNS,
        DROWNING,
        BURNING,
        POKING,
        FREEZING,
    }

    public enum DeathMessageType {
        DEFAULT,
        FALL_VARIANTS,
        INTENTIONAL_GAME_DESIGN,
    }

}
