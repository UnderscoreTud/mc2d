package me.tud.mc2d.generators.dimensiontypes;

import com.palantir.javapoet.*;
import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Instructions;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.instruction.Structure;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class DimensionTypesGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.builder(Imports.DIMENSION_TYPE)
            .allowMissingKeys()
            .instruction("ambient_light", FLOAT)
            .instruction("bed_works", BOOLEAN)
            .instruction("coordinate_scale", DOUBLE)
            .instruction("effects", NAMESPACED_KEY)
            .instruction("fixed_time", LONG)
            .instruction("has_ceiling", BOOLEAN)
            .instruction("has_raids", BOOLEAN)
            .instruction("has_skylight", BOOLEAN)
            .instruction("height", INTEGER)
            .instruction("infiniburn", Instructions.tag("blocks"))
            .instruction("logical_height", INTEGER)
            .instruction("min_y", INTEGER)
            .instruction("monster_spawn_block_light_limit", INTEGER)
            .instruction("monster_spawn_light_level", INT_PROVIDER)
            .instruction("natural", BOOLEAN)
            .instruction("piglin_safe", BOOLEAN)
            .instruction("respawn_anchor_works", BOOLEAN)
            .instruction("ultrawarm", BOOLEAN)
            .build();

    private static final String RESOURCE_LOCATION = "/dimension_type";

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.dimension", "DimensionTypes");

    static void main(String[] args) throws Exception {
        new DimensionTypesGenerator().run(RESOURCE_LOCATION, args);
    }

    protected DimensionTypesGenerator() {
        super(CLASS_NAME, STRUCTURE);
    }

}
