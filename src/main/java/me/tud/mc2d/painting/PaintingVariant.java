package me.tud.mc2d.painting;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.nbt.NBTList;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.components.TranslationComponent;
import org.machinemc.scriptive.serialization.NBTPropertiesSerializer;
import org.machinemc.scriptive.style.ChatColor;

@Builder
public class PaintingVariant implements NBTSerializable {
    
    public static final PaintingVariant ALBAN = PaintingVariant.builder()
            .assetID(NamespacedKey.minecraft("alban"))
            .author(TranslationComponent.of("painting.minecraft.alban.author").modify().color(ChatColor.GRAY).finish())
            .title(TranslationComponent.of("painting.minecraft.alban.title").modify().color(ChatColor.YELLOW).finish())
            .width(1)
            .height(1)
            .build();

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
