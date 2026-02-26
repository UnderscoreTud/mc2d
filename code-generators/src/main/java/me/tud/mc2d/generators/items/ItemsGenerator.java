package me.tud.mc2d.generators.items;

import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.Generator;

import java.io.IOException;

public class ItemsGenerator extends Generator {

    private static final String RESOURCE_LOCATION = "/items.json";
    private static final String REGISTRIES_RESOURCE_LOCATION = "/registries.json";

    static void main(String[] args) throws Exception {
        new ItemsGenerator().run(RESOURCE_LOCATION, args);
    }

    @Override
    public GeneratedType[] generate(String resource) throws IOException {
        Items items = MAPPER.readValue(stream(resource), Items.class);
        return new GeneratedType[]{items.generate(MAPPER.readTree(stream(REGISTRIES_RESOURCE_LOCATION)))};
    }

}
