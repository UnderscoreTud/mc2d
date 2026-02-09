package me.tud.mc2d.world;

import lombok.Builder;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.scriptive.style.Colour;
import org.machinemc.scriptive.style.HexColor;

@Builder(toBuilder = true)
public class Biome implements NBTSerializable {

    public static final Biome PLAINS = Biome.builder()
            .hasPrecipitation(true)
            .temperature(0.8f)
            .downfall(0.4f)
            .effects(Effects.builder()
                    .fogColor(new HexColor(0xc0d8ff))
                    .waterColor(new HexColor(0x3f76e4))
                    .waterFogColor(new HexColor(0x50533))
                    .skyColor(new HexColor(0x78a7ff))
                    .build())
            .build();

    private final boolean hasPrecipitation;
    private final float temperature;
    private final @Nullable TemperatureModifier temperatureModifier;
    private final float downfall;
    private final Effects effects;

    @Override
    public NBTCompound toNBT() {
        NBTCompound compound = new NBTCompound();
        compound.set("has_precipitation", hasPrecipitation);
        compound.set("temperature", temperature);
        if (temperatureModifier != null)
            compound.set("temperature_modifier", temperatureModifier.name().toLowerCase());
        compound.set("downfall", downfall);
        compound.set("effects", effects.toNBT());
        return compound;
    }

    public enum TemperatureModifier {
        NONE,
        FROZEN
    }
    
    @Builder(toBuilder = true)
    public record Effects(
            Colour fogColor,
            Colour waterColor,
            Colour waterFogColor,
            Colour skyColor,
            @Nullable Colour foliageColor,
            @Nullable Colour grassColor,
            @Nullable GrassColorModifier grassColorModifier,
            @Nullable NBTCompound particle,
            @Nullable NamespacedKey ambientSound,
            @Nullable NBTCompound moodSound,
            @Nullable NBTCompound additionsSound,
            @Nullable NBTCompound music
    ) implements NBTSerializable {

        @Override
        public NBTCompound toNBT() {
            NBTCompound compound = new NBTCompound();
            compound.set("fog_color", fogColor.getRGB());
            compound.set("water_color", waterColor.getRGB());
            compound.set("water_fog_color", waterFogColor.getRGB());
            compound.set("sky_color", skyColor.getRGB());
            if (foliageColor != null)
                compound.set("foliage_color", foliageColor.getRGB());
            if (grassColor != null)
                compound.set("grass_color", grassColor.getRGB());
            if (grassColorModifier != null)
                compound.set("grass_color_modifier", grassColorModifier.name().toLowerCase());
            if (particle != null)
                compound.set("particle", particle);
            if (ambientSound != null)
                compound.set("ambient_sound", ambientSound.toString());
            if (moodSound != null)
                compound.set("mood_sound", moodSound);
            if (additionsSound != null)
                compound.set("additions_sound", additionsSound);
            if (music != null)
                compound.set("music", music);
            return compound;
        }

    }
    
    public enum GrassColorModifier {
        NONE,
        DARK_FOREST,
        SWAMP
    }

}
