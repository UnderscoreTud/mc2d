package me.tud.mc2d.item.banner;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;

import java.util.Map;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false)
public final class BannerPattern extends BannerPatterns implements NBTSerializable {

    private final NamespacedKey assetID;
    private final String translationKey;

    @Override
    public NBTCompound toNBT() {
        return new NBTCompound(Map.of(
                "asset_id", assetID.toString(),
                "translation_key", translationKey
        ));
    }

}
