package me.tud.mc2d.generators.items;

import me.tud.mc2d.generators.BuiltInRegistry;
import me.tud.mc2d.generators.util.Imports;

import java.io.IOException;
import java.util.List;

public class ItemsGenerator extends BuiltInRegistry<Items.Entry> {

    protected ItemsGenerator() {
        super("item", "items.json", Imports.ITEM);
    }

    static void main(String[] args) throws Exception {
        new ItemsGenerator().run(args);
    }

    @Override
    protected List<Items.Entry> entries(String resource) throws IOException {
        Items items = MAPPER.readValue(stream(resource), Items.class);
        return items.entries(MAPPER.readTree(stream(REGISTRIES_RESOURCE_LOCATION)));
    }

}