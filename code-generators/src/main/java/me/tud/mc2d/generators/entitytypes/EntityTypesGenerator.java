package me.tud.mc2d.generators.entitytypes;

import me.tud.mc2d.generators.BuiltInRegistry;
import me.tud.mc2d.generators.util.Imports;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class EntityTypesGenerator extends BuiltInRegistry<EntityType> {

    protected EntityTypesGenerator() {
        super("entity_type", "minecraft-data/entities.json", Imports.ENTITY_TYPE);
    }

    static void main(String[] args) throws Exception {
        new EntityTypesGenerator().run(args);
    }

    @Override
    protected List<EntityType> entries(String resource) throws IOException {
        EntityType[] entities = MAPPER.readValue(stream(resource), EntityType[].class);
        return Arrays.asList(entities);
    }

}
