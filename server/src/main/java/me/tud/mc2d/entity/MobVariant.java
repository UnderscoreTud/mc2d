package me.tud.mc2d.entity;

import lombok.Builder;
import me.tud.mc2d.registry.DataDrivenRegistry;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.nbt.NBTList;

@Builder(toBuilder = true)
public class MobVariant implements NBTSerializable {

    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> CAT_VARIANT_KEY = RegistryKey.minecraft("cat_variant");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> CHICKEN_VARIANT_KEY = RegistryKey.minecraft("chicken_variant");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> COW_VARIANT_KEY = RegistryKey.minecraft("cow_variant");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> FROG_VARIANT_KEY = RegistryKey.minecraft("frog_variant");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> PIG_VARIANT_KEY = RegistryKey.minecraft("pig_variant");
    public static final RegistryKey<MobVariant, DataDrivenRegistry<MobVariant>> ZOMBIE_NAUTILUS_VARIANT_KEY = RegistryKey.minecraft("zombie_nautilus_variant");

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

    public static final MobVariant ZOMBIE_NAUTILUS_TEMPERATE = MobVariant.builder()
            .assetID(NamespacedKey.minecraft("entity/nautilus/zombie_nautilus"))
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
