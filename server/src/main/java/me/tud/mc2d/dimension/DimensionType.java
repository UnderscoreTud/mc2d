package me.tud.mc2d.dimension;

import lombok.Builder;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.tag.TagKey;
import me.tud.mc2d.util.IntProvider;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.block.Block;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;

@Builder(toBuilder = true)
public final class DimensionType extends DimensionTypes implements NBTSerializable {

    private final @Nullable Long fixedTime;
    private final boolean hasSkylight, hasCeiling, ultrawarm, natural;
    private final double coordinateScale;
    private final boolean bedWorks, respawnAnchorWorks;
    private final int minY, height, logicalHeight;
    private final TagKey<Block<?>, ? extends Registry<Block<?>>> infiniburn;
    private final NamespacedKey effects;
    private final float ambientLight;
    private boolean piglinSafe, hasRaids;
    private final IntProvider monsterSpawnLightLevel;
    private final float monsterSpawnBlockLightLimit;

    @Override
    public NBTCompound toNBT() {
        NBTCompound compound = new NBTCompound();
        if (fixedTime != null)
            compound.set("fixed_time", fixedTime);
        compound.set("has_skylight", hasSkylight);
        compound.set("has_ceiling", hasCeiling);
        compound.set("ultrawarm", ultrawarm);
        compound.set("natural", natural);
        compound.set("coordinate_scale", coordinateScale);
        compound.set("bed_works", bedWorks);
        compound.set("respawn_anchor_works", respawnAnchorWorks);
        compound.set("min_y", minY);
        compound.set("height", height);
        compound.set("logical_height", logicalHeight);
        compound.set("infiniburn", infiniburn.toString());
        compound.set("effects", effects.toString());
        compound.set("ambient_light", ambientLight);
        compound.set("piglin_safe", piglinSafe);
        compound.set("has_raids", hasRaids);
        compound.set("monster_spawn_light_level", monsterSpawnLightLevel.toNBT());
        compound.set("monster_spawn_block_light_limit", monsterSpawnBlockLightLimit);
        return compound;
    }

}
