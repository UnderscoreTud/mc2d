package me.tud.mc2d.generators.instruction;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.base.Preconditions;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeName;
import lombok.Getter;
import me.tud.mc2d.generators.instruction.exception.InstructionException;
import me.tud.mc2d.generators.util.StringUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
public class Structure implements Instruction {

    private final ClassName source;
    private final Map<String, InstructionInfo> instructions;
    private final Type type;
    private final boolean allowMissingKeys;
    private final boolean ignoreUnknownKeys;

    private Structure(Builder builder) {
        this.source = builder.source;
        this.instructions = builder.instructions;
        this.type = builder.type;
        this.allowMissingKeys = builder.allowMissingKeys;
        this.ignoreUnknownKeys = builder.ignoreUnknownKeys;
    }

    @Override
    public void apply(InstructionContext ctx, JsonNode node, CodeBlock.Builder out) throws InstructionException {
        if (!node.isObject())
            throw ctx.expected("an object", node);

        Set<String> unhandled = node.propertyStream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        type.begin(out, source);
        Iterator<Map.Entry<String, InstructionInfo>> iterator = instructions.entrySet().iterator();
        boolean first = true;
        while (iterator.hasNext()) {
            Map.Entry<String, InstructionInfo> entry = iterator.next();
            String key = entry.getKey();
            unhandled.remove(key);
            JsonNode child = node.get(key);
            if (child == null) {
                if (!allowMissingKeys)
                    throw ctx.exception("Missing required key: " + key);
                continue;
            }

            InstructionInfo info = entry.getValue();
            type.apply(ctx, info.keyTransformer.apply(key), child, out, info.instruction, first);
            first = false;
        }
        type.end(out);

        if (!unhandled.isEmpty() && !ignoreUnknownKeys)
            throw ctx.exception("Unrecognized key" + (unhandled.size() != 1 ? "s" : "") + ": " + unhandled);
    }

    @Override
    public void pushAndApply(InstructionContext ctx, String key, JsonNode node, CodeBlock.Builder out) throws InstructionException {
        try {
            ctx.pushCtx("Structure " + source.simpleName() + " (" + type + ")");
            Instruction.super.pushAndApply(ctx, key, node, out);
        } finally {
            ctx.popCtx();
        }
    }

    public static Structure.Builder builder(ClassName source) {
        return new Builder(source);
    }

    public static Structure.Builder constructor(ClassName source) {
        return new Builder(source).constructor();
    }

    public static class Builder {

        private final ClassName source;
        private final Map<String, InstructionInfo> instructions = new LinkedHashMap<>();
        private Type type = Type.BUILDER;
        private boolean allowMissingKeys, ignoreUnknownKeys;

        private Builder(ClassName source) {
            this.source = source;
        }

        public Builder instruction(String key, Instruction instruction) {
            return instruction(key, StringUtils::snakeToCamel, instruction);
        }

        public Builder instruction(String key, Function<String, String> keyTransformer, Instruction instruction) {
            Preconditions.checkNotNull(key, "key");
            Preconditions.checkNotNull(keyTransformer, "keyTransformer");
            Preconditions.checkNotNull(instruction, "instruction");
            instructions.put(key, new InstructionInfo(instruction, keyTransformer));
            return this;
        }

        public Builder constructor() {
            type = Type.CONSTRUCTOR;
            return this;
        }

        public Builder allowMissingKeys() {
            allowMissingKeys = true;
            return this;
        }

        public Builder ignoreUnknownKeys() {
            ignoreUnknownKeys = true;
            return this;
        }

        public Structure build() {
            return new Structure(this);
        }

    }

    public enum Type {
        BUILDER {
            @Override
            public void begin(CodeBlock.Builder builder, TypeName type) {
                builder.add("$T.builder()\n", type).indent().indent();
            }

            @Override
            public void end(CodeBlock.Builder builder) {
                builder.add(".build()").unindent().unindent();
            }

            @Override
            public void apply(InstructionContext ctx, String key, JsonNode node, CodeBlock.Builder builder, Instruction instruction, boolean first) {
                builder.add(".$N(", key);
                instruction.pushAndApply(ctx, key, node, builder);
                builder.add(")\n");
            }
        },
        CONSTRUCTOR {
            @Override
            public void begin(CodeBlock.Builder builder, TypeName type) {
                builder.add("new $T(", type);
            }

            @Override
            public void end(CodeBlock.Builder builder) {
                builder.add(")");
            }

            @Override
            public void apply(InstructionContext ctx, String key, JsonNode node, CodeBlock.Builder builder, Instruction instruction, boolean first) {
                if (!first)
                    builder.add(", ");
                instruction.pushAndApply(ctx, key, node, builder);
            }
        };

        public abstract void begin(CodeBlock.Builder builder, TypeName type); 

        public abstract void end(CodeBlock.Builder builder); 

        public abstract void apply(InstructionContext ctx, String key, JsonNode node, CodeBlock.Builder builder, Instruction instruction, boolean first);

    }

    private record InstructionInfo(Instruction instruction, Function<String, String> keyTransformer) {}

}
