package me.tud.mc2d.generators.chattypes;

import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class ChatTypesGenerator extends DataDrivenRegistryGenerator {

    private static final Structure ELEMENT = Structure.constructor(Imports.CHAT_TYPE.nestedClass("Element"))
            .instruction("translation_key", STRING)
            .instruction("parameters", listOf(_enum(Imports.CHAT_TYPE.nestedClass("Parameter"))))
            .instruction("style", TEXT_FORMAT.orNull())
            .build();

    private static final Structure STRUCTURE = Structure.builder(Imports.CHAT_TYPE)
            .instruction("chat", ELEMENT)
            .instruction("narration", ELEMENT)
            .build();

    private static final String RESOURCE_LOCATION = "/chat_type";

    static void main(String[] args) throws Exception {
        new ChatTypesGenerator().run(RESOURCE_LOCATION, args);
    }

    protected ChatTypesGenerator() {
        super(STRUCTURE);
    }

}
