package me.tud.mc2d.generators.armortrims;

import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Instructions;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class ArmorTrimMaterialsGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.builder(Imports.ARMOR_TRIM_MATERIAL)
            .allowMissingKeys()
            .instruction("asset_name", STRING)
            .instruction("override_armor_assets", mapOf(NAMESPACED_KEY, Instructions.STRING))
            .instruction("description", COMPONENT)
            .build();

    private static final String RESOURCE_LOCATION = "/trim_material";

    static void main(String[] args) throws Exception {
        new ArmorTrimMaterialsGenerator().run(RESOURCE_LOCATION, args);
    }

    protected ArmorTrimMaterialsGenerator() {
        super(STRUCTURE);
    }

}
