package me.tud.mc2d.generators.paintingvariants;

import com.palantir.javapoet.ClassName;
import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class PaintingVariantsGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.builder(Imports.PAINTING_VARIANT)
            .allowMissingKeys()
            .instruction("asset_id", _ -> "assetID", NAMESPACED_KEY)
            .instruction("author", COMPONENT)
            .instruction("title", COMPONENT)
            .instruction("width", INTEGER)
            .instruction("height", INTEGER)
            .build();

    private static final String RESOURCE_LOCATION = "/painting_variant";

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.painting", "PaintingVariants");

    static void main(String[] args) throws Exception {
        new PaintingVariantsGenerator().run(RESOURCE_LOCATION, args);
    }

    protected PaintingVariantsGenerator() {
        super(CLASS_NAME, STRUCTURE);
    }

}
