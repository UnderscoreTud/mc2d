package me.tud.mc2d.damage;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;

import java.util.Locale;

@Builder(toBuilder = true)
public final class DamageType extends DamageTypes implements NBTSerializable {

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
