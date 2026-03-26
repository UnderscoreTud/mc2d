package me.tud.mc2d.world;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.nbt.NBTList;
import org.machinemc.scriptive.style.Colour;

@Getter
@ToString
@Builder(toBuilder = true)
public final class Biome extends Biomes implements NBTSerializable {

    public static final NamespacedKey DEFAULT_KEY = NamespacedKey.mc2d("canvas");

    private final boolean hasPrecipitation;
    private final float temperature;
    private final @Nullable TemperatureModifier temperatureModifier;
    private final float downfall;
    private final Effects effects;
    private final NBTCompound attributes;
    private final float creatureSpawnProbability;

    @Override
    public NBTCompound toNBT() {
        NBTCompound compound = new NBTCompound();
        compound.set("has_precipitation", hasPrecipitation);
        compound.set("temperature", temperature);
        if (temperatureModifier != null)
            compound.set("temperature_modifier", temperatureModifier.name().toLowerCase());
        compound.set("downfall", downfall);
        compound.set("effects", effects.toNBT());
        compound.set("carvers", new NBTList());
        compound.set("features", new NBTList());
        compound.set("creature_spawn_probability", creatureSpawnProbability);
        compound.set("spawners", new NBTCompound());
        compound.set("spawner_costs", new NBTCompound());
        return compound;
    }

    public enum TemperatureModifier {
        NONE,
        FROZEN
    }

    @Builder(toBuilder = true)
    public record Effects(
            Colour waterColor,
            @Nullable Colour foliageColor,
            @Nullable Colour dryFoliageColor,
            @Nullable Colour grassColor,
            @Nullable GrassColorModifier grassColorModifier
    ) implements NBTSerializable {

        @Override
        public NBTCompound toNBT() {
            NBTCompound compound = new NBTCompound();
            compound.set("water_color", waterColor.getRGB());
            if (foliageColor != null)
                compound.set("foliage_color", foliageColor.getRGB());
            if (dryFoliageColor != null)
                compound.set("dry_foliage_color", dryFoliageColor.getRGB());
            if (grassColor != null)
                compound.set("grass_color", grassColor.getRGB());
            if (grassColorModifier != null)
                compound.set("grass_color_modifier", grassColorModifier.name().toLowerCase());
            return compound;
        }

    }
    
    public enum GrassColorModifier {
        NONE,
        DARK_FOREST,
        SWAMP
    }

}
