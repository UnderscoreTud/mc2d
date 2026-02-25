package me.tud.mc2d.generators.instruction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Preconditions;
import com.palantir.javapoet.CodeBlock;
import me.tud.mc2d.generators.instruction.exception.InstructionException;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class DynamicInstruction implements Instruction {

    private final Map<String, Supplier<Instruction>> instructions;
    private final @Nullable Instruction fallback;
    private final Function<ObjectNode, String> keyExtractor;

    private DynamicInstruction(Builder builder) {
        this.instructions = builder.instructions;
        this.fallback = builder.fallback;
        this.keyExtractor = builder.keyExtractor;
    }

    @Override
    public void apply(InstructionContext ctx, JsonNode node, CodeBlock.Builder out) throws InstructionException {
        if (!node.isObject()) {
            if (fallback == null)
                throw ctx.expected("an object", node);
            fallback.apply(ctx, node, out);
            return;
        }

        String key = keyExtractor.apply((ObjectNode) node);
        Supplier<Instruction> instruction = instructions.get(key);

        if (instruction == null) {
            if (fallback == null)
                throw ctx.exception("Unexpected key " + key);
            fallback.apply(ctx, node, out);
            return;
        }

        try {
            ctx.pushCtx("type=" + key);
            instruction.get().apply(ctx, node, out);
        } finally {
            ctx.popCtx();
        }
    }

    public static DynamicInstruction.Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private final Map<String, Supplier<Instruction>> instructions = new HashMap<>();
        private Instruction fallback;
        private Function<ObjectNode, String> keyExtractor;

        private Builder() {}

        public Builder basedOn(String key) {
            Preconditions.checkNotNull(key, "key");
            return basedOn(node -> node.remove(key).asText());
        }

        public Builder basedOn(Function<ObjectNode, String> keyExtractor) {
            Preconditions.checkNotNull(keyExtractor, "keyExtractor");
            this.keyExtractor = keyExtractor;
            return this;
        }

        public Builder instruction(String key, Instruction instruction) {
            Preconditions.checkNotNull(key, "key");
            Preconditions.checkNotNull(instruction, "instruction");
            instructions.put(key, () -> instruction);
            return this;
        }

        public Builder instruction(String key, Supplier<Instruction> instruction) {
            Preconditions.checkNotNull(key, "key");
            Preconditions.checkNotNull(instruction, "instruction");
            instructions.put(key, instruction);
            return this;
        }

        public Builder orElse(Instruction fallback) {
            Preconditions.checkNotNull(fallback, "fallback");
            this.fallback = (ctx, node, out) -> {
                try {
                    ctx.pushCtx("Fallback");
                    fallback.apply(ctx, node, out);
                } finally {
                    ctx.popCtx();
                }
            };
            return this;
        }

        public DynamicInstruction build() {
            return new DynamicInstruction(this);
        }

    }

}
