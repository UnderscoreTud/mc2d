package me.tud.mc2d.generators.packets;

import com.palantir.javapoet.*;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.Generator;

import java.io.IOException;
import java.util.*;

public class PacketsGenerator extends Generator {

    private static final String RESOURCE_LOCATION = "/packets.json";

    static void main(String[] args) throws Exception {
        new PacketsGenerator().run(RESOURCE_LOCATION, args);
    }

    @Override
    public GeneratedType[] generate(String resource) throws IOException {
        Packets packets = MAPPER.readValue(stream(resource), Packets.class);
        return new GeneratedType[]{packets.generate()};
    }

}
