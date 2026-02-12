package me.tud.mc2d.generators;

import com.palantir.javapoet.*;
import me.tud.mc2d.generators.instruction.Instruction;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;

public class DamageTypesGenerator extends DataDrivenRegistryGenerator {

    private static final Structure STRUCTURE = Structure.lenient()
            .instruction("message_id", k -> "messageID", Instruction.STRING)
            .instruction("scaling", Instruction.enumInstruction(Imports.DAMAGE_TYPE.nestedClass("Scaling")))
            .instruction("exhaustion", Instruction.FLOAT)
            .instruction("effects", Instruction.enumInstruction(Imports.DAMAGE_TYPE.nestedClass("Effects")))
            .instruction("death_message_type", Instruction.enumInstruction(Imports.DAMAGE_TYPE.nestedClass("DeathMessageType")))
            .build();

    private static final String RESOURCE_LOCATION = "/damage_type";

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.damage", "DamageTypes");

    public static void main(String[] args) throws Exception {
        new DamageTypesGenerator().run(args);
    }

    protected DamageTypesGenerator() {
        super(CLASS_NAME, RESOURCE_LOCATION, Imports.DAMAGE_TYPE, STRUCTURE);
    }

}
