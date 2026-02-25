package me.tud.mc2d.generators.damagetypes;

import com.palantir.javapoet.*;
import me.tud.mc2d.generators.DataDrivenRegistryGenerator;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public class DamageTypesGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.builder(Imports.DAMAGE_TYPE)
            .allowMissingKeys()
            .instruction("message_id", _ -> "messageID", STRING)
            .instruction("scaling", _enum(Imports.DAMAGE_TYPE.nestedClass("Scaling")))
            .instruction("exhaustion", FLOAT)
            .instruction("effects", _enum(Imports.DAMAGE_TYPE.nestedClass("Effects")))
            .instruction("death_message_type", _enum(Imports.DAMAGE_TYPE.nestedClass("DeathMessageType")))
            .build();

    private static final String RESOURCE_LOCATION = "/damage_type";

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.damage", "DamageTypes");

    static void main(String[] args) throws Exception {
        new DamageTypesGenerator().run(RESOURCE_LOCATION, args);
    }

    protected DamageTypesGenerator() {
        super(CLASS_NAME, STRUCTURE);
    }

}
