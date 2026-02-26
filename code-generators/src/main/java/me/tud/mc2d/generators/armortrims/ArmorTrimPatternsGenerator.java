package me.tud.mc2d.generators.armortrims;

import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class ArmorTrimPatternsGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.builder(Imports.ARMOR_TRIM_PATTERN)
            .allowMissingKeys()
            .instruction("asset_id", _ -> "assetID", NAMESPACED_KEY)
            .instruction("decal", BOOLEAN)
            .instruction("description", COMPONENT)
            .build();

    private static final String RESOURCE_LOCATION = "/trim_pattern";

    static void main(String[] args) throws Exception {
        new ArmorTrimPatternsGenerator().run(RESOURCE_LOCATION, args);
    }

    protected ArmorTrimPatternsGenerator() {
        super(STRUCTURE);
    }

}
