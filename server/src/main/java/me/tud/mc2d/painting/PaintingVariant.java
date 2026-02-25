package me.tud.mc2d.painting;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.components.TranslationComponent;
import org.machinemc.scriptive.serialization.NBTPropertiesSerializer;
import org.machinemc.scriptive.style.ChatColor;

@Builder(toBuilder = true)
public final class PaintingVariant extends PaintingVariants implements NBTSerializable {

    private final NamespacedKey assetID;
    private final Component author, title;
    private final int width, height;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("asset_id", assetID + "");
        nbt.set("author", NBTPropertiesSerializer.get().serialize(author.getProperties()));
        nbt.set("title", NBTPropertiesSerializer.get().serialize(title.getProperties()));
        nbt.set("width", width);
        nbt.set("height", height);
        return nbt;
    }

}
