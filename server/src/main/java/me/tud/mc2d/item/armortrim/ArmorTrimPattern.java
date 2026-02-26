package me.tud.mc2d.item.armortrim;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.serialization.NBTPropertiesSerializer;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false)
public final class ArmorTrimPattern extends ArmorTrimPatterns implements NBTSerializable {

    private final NamespacedKey assetID;
    private final boolean decal;
    private final Component description;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("asset_id", assetID.toString());
        nbt.set("decal", decal);
        nbt.set("description", NBTPropertiesSerializer.get().serialize(description.getProperties()));
        return nbt;
    }

}
