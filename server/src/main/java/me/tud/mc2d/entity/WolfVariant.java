package me.tud.mc2d.entity;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.nbt.NBTList;

import java.util.Map;

@Builder(toBuilder = true)
public class WolfVariant implements NBTSerializable {
    
    public static final WolfVariant ASHEN = WolfVariant.builder()
            .assets(Assets.of(NamespacedKey.minecraft("entity/wolf/wolf_ashen")))
            .build();

    private final Assets assets;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("assets", assets.toNBT());
        nbt.set("spawn_conditions", new NBTList());
        return nbt;
    }

    public record Assets(NamespacedKey angry, NamespacedKey tame, NamespacedKey wild) implements NBTSerializable {
        
        public static Assets of(NamespacedKey key) {
            return new Assets(
                    NamespacedKey.of(key.namespace(), key.key() + "_angry"),
                    NamespacedKey.of(key.namespace(), key.key() + "_tame"),
                    key
            );
        }

        @Override
        public NBTCompound toNBT() {
            return new NBTCompound(Map.of(
                    "angry", angry.toString(),
                    "tame", tame.toString(),
                    "wild", wild.toString()
            ));
        }

    }

}
