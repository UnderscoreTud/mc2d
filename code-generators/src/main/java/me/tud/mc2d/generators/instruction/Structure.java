package me.tud.mc2d.generators.instruction;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.CodeBlock;
import lombok.experimental.Delegate;
import me.tud.mc2d.generators.util.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.Map.entry;

public class Structure implements Instruction {

    private final Strictness strictness;
    private final Map<String, InstructionInfo> instructions;

    private Structure(Strictness strictness, Map<String, InstructionInfo> instructions) {
        this.strictness = strictness;
        this.instructions = instructions;
    }

    @Override
    public boolean apply(String key, CodeBlock.Builder builder, JsonReader reader) throws IOException {
        InstructionInfo instruction = instructions.get(key);
        if (instruction == null) {
            if (strictness == Strictness.STRICT)
                throw new IllegalStateException("Unrecognized key: " + key);
            reader.skipValue();
            return false;
        }
        String name = instruction.keyTransformer().apply(key);
        builder.add(".$N(", name);
        instruction.apply(name, builder, reader);
        builder.add(")\n");
        return true;
    }

    public static Structure.Builder lenient() {
        return new Builder(Strictness.LENIENT);
    }

    public static Structure.Builder strict() {
        return new Builder(Strictness.STRICT);
    }

    public static class Builder {

        private final Strictness strictness;
        private final Map<String, InstructionInfo> instructions = new HashMap<>();

        private Builder(Strictness strictness) {
            this.strictness = strictness;
        }

        public Builder instruction(String key, Instruction instruction) {
            return instruction(key, StringUtils::snakeToCamel, instruction);
        }

        public Builder instruction(String key, Function<String, String> keyTransformer, Instruction instruction) {
            instructions.put(key, new InstructionInfo(instruction, keyTransformer));
            return this;
        }

        public Structure build() {
            return new Structure(strictness, instructions);
        }

    }

    public enum Strictness {
        LENIENT,
        STRICT
    }

    private record InstructionInfo(@Delegate Instruction instruction, Function<String, String> keyTransformer) {}

}
