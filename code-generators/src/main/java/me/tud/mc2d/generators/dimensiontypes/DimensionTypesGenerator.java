package me.tud.mc2d.generators.dimensiontypes;

import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Instructions;
import me.tud.mc2d.generators.instruction.NBTInstructions;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.instruction.Structure;
import org.machinemc.nbt.NBTCompound;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class DimensionTypesGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.builder(Imports.DIMENSION_TYPE)
            .allowMissingKeys()
            .instruction("coordinate_scale", DOUBLE)
            .instruction("has_skylight", BOOLEAN)
            .instruction("has_ceiling", BOOLEAN)
            .instruction("ambient_light", FLOAT)
            .instruction("has_fixed_time", BOOLEAN)
            .instruction("monster_spawn_block_light_limit", INTEGER)
            .instruction("monster_spawn_light_level", INT_PROVIDER)
            .instruction("logical_height", INTEGER)
            .instruction("height", INTEGER)
            .instruction("min_y", INTEGER)
            .instruction("infiniburn", Instructions.tag("block"))
            .instruction("skybox", _enum(Imports.DIMENSION_TYPE.nestedClass("Skybox")))
            .instruction("cardinal_light", _enum(Imports.DIMENSION_TYPE.nestedClass("CardinalLight")))
            .instruction("attributes", NBTInstructions.COMPOUND_TAG)
            .ignore("timelines")
            .build();

    private static final String ID = "dimension_type";

    static void main(String[] args) throws Exception {
        new DimensionTypesGenerator().run(args);
    }

    protected DimensionTypesGenerator() {
        super(ID, STRUCTURE);
    }

}
