package me.tud.mc2d.generators;

import com.palantir.javapoet.*;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.instruction.Instruction;
import me.tud.mc2d.generators.instruction.Structure;

public class DimensionTypesGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.lenient()
            .instruction("ambient_light", Instruction.FLOAT)
            .instruction("bed_works", Instruction.BOOLEAN)
            .instruction("coordinate_scale", Instruction.DOUBLE)
            .instruction("effects", Instruction.NAMESPACED_KEY)
            .instruction("fixed_time", Instruction.LONG)
            .instruction("has_ceiling", Instruction.BOOLEAN)
            .instruction("has_raids", Instruction.BOOLEAN)
            .instruction("has_skylight", Instruction.BOOLEAN)
            .instruction("height", Instruction.INTEGER)
            .instruction("infiniburn", Instruction.HASHED_NAMESPACED_KEY)
            .instruction("logical_height", Instruction.INTEGER)
            .instruction("min_y", Instruction.INTEGER)
            .instruction("monster_spawn_block_light_limit", Instruction.INTEGER)
            .instruction("monster_spawn_light_level", Instruction.INT_PROVIDER)
            .instruction("natural", Instruction.BOOLEAN)
            .instruction("piglin_safe", Instruction.BOOLEAN)
            .instruction("respawn_anchor_works", Instruction.BOOLEAN)
            .instruction("ultrawarm", Instruction.BOOLEAN)
            .build();

    private static final String RESOURCE_LOCATION = "/dimension_type";

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.dimension", "DimensionTypes");

    static void main(String[] args) throws Exception {
        new DimensionTypesGenerator().run(RESOURCE_LOCATION, args);
    }

    protected DimensionTypesGenerator() {
        super(CLASS_NAME, Imports.DIMENSION_TYPE, STRUCTURE);
    }

}
