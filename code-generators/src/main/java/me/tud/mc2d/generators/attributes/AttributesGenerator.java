package me.tud.mc2d.generators.attributes;

import me.tud.mc2d.generators.BuiltInRegistry;
import me.tud.mc2d.generators.util.Imports;

import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

public class AttributesGenerator extends BuiltInRegistry<Attribute> {

    protected AttributesGenerator() {
        super("attribute", "minecraft-data/attributes.json", Imports.ATTRIBUTE);
    }

    static void main(String[] args) throws Exception {
        new AttributesGenerator().run(args);
    }

    @Override
    protected List<Attribute> entries(String resource) throws IOException {
        Attribute[] attributes = MAPPER.readValue(stream(resource), Attribute[].class);
        return IntStream.range(0, attributes.length)
                .mapToObj(i -> attributes[i].withId(i))
                .toList();
    }

}
