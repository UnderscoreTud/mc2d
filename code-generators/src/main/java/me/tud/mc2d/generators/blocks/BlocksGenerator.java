package me.tud.mc2d.generators.blocks;

import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.Generator;

import java.io.IOException;

public class BlocksGenerator extends Generator {

    private static final String RESOURCE_LOCATION = "/blocks.json";
    private static final String REGISTRIES_RESOURCE_LOCATION = "/registries.json";

    static void main(String[] args) throws Exception {
        new BlocksGenerator().run(RESOURCE_LOCATION, args);
    }

    @Override
    public GeneratedType[] generate(String resource) throws IOException {
        Blocks blocks = MAPPER.readValue(stream(resource), Blocks.class);
        return blocks.generate(MAPPER.readTree(stream(REGISTRIES_RESOURCE_LOCATION)));
    }

}
