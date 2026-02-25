package me.tud.mc2d.generators.instruction;

import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.CodeBlock;
import me.tud.mc2d.generators.instruction.exception.InstructionException;

public interface Instruction {

    void apply(InstructionContext ctx, JsonNode node, CodeBlock.Builder out) throws InstructionException;

    default void pushAndApply(InstructionContext ctx, String key, JsonNode node, CodeBlock.Builder out) throws InstructionException {
        try {
            ctx.pushKey(key);
            apply(ctx, node, out);
        } finally {
            ctx.pop();
        }
    }

}
