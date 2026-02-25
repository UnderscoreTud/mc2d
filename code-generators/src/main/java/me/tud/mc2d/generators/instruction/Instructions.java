package me.tud.mc2d.generators.instruction;

import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.TypeName;
import me.tud.mc2d.generators.util.Imports;

import java.util.Locale;
import java.util.function.Function;

public final class Instructions {

    public static final Instruction
            INTEGER = (_, node, out) -> out.add("$L", node.asInt()),
            LONG = (_, node, out) -> out.add("$LL", node.asLong()),
            FLOAT = (_, node, out) -> out.add("$Lf", (float) node.asDouble()),
            DOUBLE = (_, node, out) -> out.add("$L", node.asDouble()),
            BOOLEAN = (_, node, out) -> out.add("$L", node.asBoolean()),
            STRING = (_, node, out) -> out.add("$S", node.asText()),
            NAMESPACED_KEY = (_, node, out) -> out.add("$T.parse($S)", Imports.NAMESPACED_KEY, node.asText()),
            HASHED_NAMESPACED_KEY = (_, node, out) -> out.add("$T.parse($S)", Imports.NAMESPACED_KEY, node.asText().substring(1));

    public static final Instruction INT_PROVIDER = IntProviderInstructions.INT_PROVIDER;

    public static Instruction _enum(TypeName type) {
        return _enum(type, node -> node.asText().toUpperCase(Locale.ENGLISH));
    }

    public static Instruction _enum(TypeName type, Function<JsonNode, String> function) {
        return (_, node, out) -> out.add("$T.$N", type, function.apply(node));
    }

    public static Instruction list(Instruction instruction) {
        return (ctx, node, out) -> {
            if (!node.isArray())
                throw ctx.expected("a list", node);

            boolean first = true;
            int i = 0;
            for (JsonNode element : node) {
                if (!first)
                    out.add(", ");
                try {
                    ctx.pushCtx("list");
                    ctx.pushIndex(i);
                    instruction.apply(ctx, element, out);
                } finally {
                    ctx.popCtx();
                    ctx.pop();
                }
                first = false;
            }
        };
    }

}
