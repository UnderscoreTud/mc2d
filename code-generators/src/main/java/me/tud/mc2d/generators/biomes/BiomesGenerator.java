package me.tud.mc2d.generators.biomes;

import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;
import static me.tud.mc2d.generators.instruction.NBTInstructions.COMPOUND_TAG;
import static me.tud.mc2d.generators.instruction.NBTInstructions.NBT;

public class BiomesGenerator extends DataDrivenRegistryGenerator {

    private static final Structure EFFECTS = Structure.builder(Imports.BIOME.nestedClass("Effects"))
            .instruction("water_color", COLOR)
            .instruction("foliage_color", COLOR.omittable())
            .instruction("dry_foliage_color", COLOR.omittable())
            .instruction("grass_color", COLOR.omittable())
            .instruction("grass_color_modifier", _enum(Imports.BIOME.nestedClass("GrassColorModifier")).omittable())
            .build();

    private static final Structure STRUCTURE = Structure.builder(Imports.BIOME)
            .instruction("has_precipitation", BOOLEAN)
            .instruction("temperature", FLOAT)
            .instruction("temperature_modifier", _enum(Imports.BIOME.nestedClass("TemperatureModifier")).omittable())
            .instruction("downfall", FLOAT)
            .instruction("effects", EFFECTS)
            .instruction("attributes", NBT.omittable())
            .instruction("creature_spawn_probability", FLOAT.omittable())

            .ignore("carvers")
            .ignore("features")
            .ignore("spawners")
            .ignore("spawn_costs")

            .build();

    private static final String ID = "biome";

    static void main(String[] args) throws Exception {
        new BiomesGenerator().run(args);
    }

    protected BiomesGenerator() {
        super(ID, "worldgen/" + ID, STRUCTURE);
    }

}
