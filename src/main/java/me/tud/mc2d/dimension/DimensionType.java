package me.tud.mc2d.dimension;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;

@Builder(builderClassName = "Builder", toBuilder = true)
public class DimensionType implements NBTSerializable {
    
    public static final DimensionType OVERWORLD = DimensionType.builder()
            .fixedTime(null)
            .hasSkylight(true)
            .hasCeiling(false)
            .ultrawarm(false)
            .natural(true)
            .coordinateScale(1.0)
            .bedWorks(true)
            .respawnAnchorWorks(false)
            .minY(0)
            .height(256)
            .logicalHeight(256)
            .infiniburn(NamespacedKey.minecraft("infiniburn_overworld"))
            .effects(NamespacedKey.minecraft("overworld"))
            .ambientLight(0.0f)
            .piglinSafe(false)
            .hasRaids(true)
            .monsterSpawnLightLevel(7)
            .monsterSpawnBlockLightLimit(0)
            .build();
    
    private final @Nullable Long fixedTime;
    private final boolean hasSkylight, hasCeiling, ultrawarm, natural;
    private final double coordinateScale;
    private final boolean bedWorks, respawnAnchorWorks;
    private final int minY, height, logicalHeight;
    private final NamespacedKey infiniburn, effects;
    private final float ambientLight;
    private boolean piglinSafe, hasRaids;
    private final int monsterSpawnLightLevel, monsterSpawnBlockLightLimit;

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
        compound.set("infiniburn", "#" + infiniburn);
        compound.set("effects", effects.toString());
        compound.set("ambient_light", ambientLight);
        compound.set("piglin_safe", piglinSafe);
        compound.set("has_raids", hasRaids);
        compound.set("monster_spawn_light_level", monsterSpawnLightLevel);
        compound.set("monster_spawn_block_light_limit", monsterSpawnBlockLightLimit);
        return compound;
    }

}
