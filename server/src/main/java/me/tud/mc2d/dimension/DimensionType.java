package me.tud.mc2d.dimension;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.tag.TagKey;
import me.tud.mc2d.util.IntProvider;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.world.block.Block;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.nbt.NBTList;

import java.util.Locale;

@Getter
@ToString
@Builder(toBuilder = true)
public final class DimensionType extends DimensionTypes implements NBTSerializable {

    private final double coordinateScale;
    private final boolean hasSkylight, hasCeiling;
    private final float ambientLight;
    private final boolean hasFixedTime;
    private final int monsterSpawnBlockLightLimit;
    private final IntProvider monsterSpawnLightLevel;
    private final int logicalHeight, minY, height;
    private final TagKey<Block<?>, ? extends Registry<Block<?>>> infiniburn;
    private final @Builder.Default Skybox skybox = Skybox.OVERWORLD;
    private final @Builder.Default CardinalLight cardinalLight = CardinalLight.DEFAULT;
    private final @Builder.Default NBTCompound attributes = new NBTCompound(); // TODO maybe implement?

    public int maxY() {
        return height() + minY();
    }

    @Override
    public NBTCompound toNBT() {
        NBTCompound compound = new NBTCompound();
        compound.set("coordinate_scale", coordinateScale);
        compound.set("has_skylight", hasSkylight);
        compound.set("has_ceiling", hasCeiling);
        compound.set("ambient_light", ambientLight);
        compound.set("has_fixed_time", hasFixedTime);
        compound.set("monster_spawn_block_light_limit", monsterSpawnBlockLightLimit);
        compound.set("monster_spawn_light_level", monsterSpawnLightLevel.toNBT());
        compound.set("logical_height", logicalHeight);
        compound.set("min_y", minY);
        compound.set("height", height);
        compound.set("infiniburn", infiniburn.toString());
        compound.set("skybox", skybox.name().toLowerCase(Locale.ENGLISH));
        compound.set("cardinal_light", cardinalLight.name().toLowerCase(Locale.ENGLISH));

        compound.set("attributes", attributes);
        compound.set("timelines", new NBTList()); // TODO maybe implement?

        return compound;
    }

    public enum Skybox {
        NONE,
        OVERWORLD,
        END
    }

    public enum CardinalLight {
        DEFAULT,
        NETHER
    }

}
