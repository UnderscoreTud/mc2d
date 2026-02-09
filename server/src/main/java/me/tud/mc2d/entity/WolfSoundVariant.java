package me.tud.mc2d.entity;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;

@Builder(toBuilder = true)
public class WolfSoundVariant implements NBTSerializable {
    
    public static final WolfSoundVariant CLASSIC = variant(null);

    private final NamespacedKey ambientSound, deathSound, growlSound, hurtSound, pantSound, whineSound;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("ambient_sound", ambientSound.toString());
        nbt.set("death_sound", deathSound.toString());
        nbt.set("growl_sound", growlSound.toString());
        nbt.set("hurt_sound", hurtSound.toString());
        nbt.set("pant_sound", pantSound.toString());
        nbt.set("whine_sound", whineSound.toString());
        return nbt;
    }

    public static WolfSoundVariant variant(@NamespacedKey.KeyPattern @Nullable String soundVariant) {
        @NamespacedKey.KeyPattern String variant = soundVariant == null ? "wolf" : "wolf_" + soundVariant;
        return WolfSoundVariant.builder()
                .ambientSound(NamespacedKey.minecraft("entity." + variant + ".ambient"))
                .deathSound(NamespacedKey.minecraft("entity." + variant + ".death"))
                .growlSound(NamespacedKey.minecraft("entity." + variant + ".growl"))
                .hurtSound(NamespacedKey.minecraft("entity." + variant + ".hurt"))
                .pantSound(NamespacedKey.minecraft("entity." + variant + ".pant"))
                .whineSound(NamespacedKey.minecraft("entity." + variant + ".whine"))
                .build();
    }

}
