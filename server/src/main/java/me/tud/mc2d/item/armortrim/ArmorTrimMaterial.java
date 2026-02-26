package me.tud.mc2d.item.armortrim;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.serialization.NBTPropertiesSerializer;

import java.util.Map;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false)
public final class ArmorTrimMaterial extends ArmorTrimMaterials implements NBTSerializable {

    private final String assetName;
    private final Map<NamespacedKey, String> overrideArmorAssets;
    private final Component description;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("asset_name", assetName);
        if (overrideArmorAssets != null)
            overrideArmorAssets.forEach((id, suffix) -> nbt.set(id.toString(), suffix));
        nbt.set("description", NBTPropertiesSerializer.get().serialize(description.getProperties()));
        return nbt;
    }

}
