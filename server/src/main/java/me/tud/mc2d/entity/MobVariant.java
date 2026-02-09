package me.tud.mc2d.entity;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.nbt.NBTList;

@Builder(toBuilder = true)
public class MobVariant implements NBTSerializable {
    
    public static final MobVariant CAT_TABBY = MobVariant.builder()
            .assetID(NamespacedKey.minecraft("entity/cat/tabby"))
            .build();
    
    public static final MobVariant CHICKEN_TEMPERATE = MobVariant.builder()
            .assetID(NamespacedKey.minecraft("entity/chicken/temperate_chicken"))
            .build();

    public static final MobVariant COW_TEMPERATE = MobVariant.builder()
            .assetID(NamespacedKey.minecraft("entity/cow/temperate_cow"))
            .build();

    public static final MobVariant FROG_TEMPERATE = MobVariant.builder()
            .assetID(NamespacedKey.minecraft("entity/frog/temperate_frog"))
            .build();

    public static final MobVariant PIG_TEMPERATE = MobVariant.builder()
            .assetID(NamespacedKey.minecraft("entity/pig/temperate_pig"))
            .build();

    private final NamespacedKey assetID;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("asset_id", assetID + "");
        nbt.set("spawn_conditions", new NBTList());
        return nbt;
    }

}
