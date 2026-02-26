package me.tud.mc2d.generators.bannerpatterns;

import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class BannerPatternsGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.builder(Imports.BANNER_PATTERN)
            .instruction("asset_id", _ -> "assetID", NAMESPACED_KEY)
            .instruction("translation_key", STRING)
            .build();

    private static final String RESOURCE_LOCATION = "/banner_pattern";

    static void main(String[] args) throws Exception {
        new BannerPatternsGenerator().run(RESOURCE_LOCATION, args);
    }

    protected BannerPatternsGenerator() {
        super(STRUCTURE);
    }

}
