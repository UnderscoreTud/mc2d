package me.tud.mc2d.generators.instruction;

import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.TypeName;
import me.tud.mc2d.generators.util.Imports;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.components.KeybindComponent;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.components.TranslationComponent;
import org.machinemc.scriptive.events.ClickEvent;
import org.machinemc.scriptive.events.HoverEvent;
import org.machinemc.scriptive.style.ChatColor;
import org.machinemc.scriptive.style.HexColor;

import java.util.*;
import java.util.function.Function;

public final class Instructions {

    public static final Instruction
            INTEGER = (_, node, out) -> out.add("$L", node.asInt()),
            LONG = (_, node, out) -> out.add("$LL", node.asLong()),
            FLOAT = (_, node, out) -> out.add("$Lf", (float) node.asDouble()),
            DOUBLE = (_, node, out) -> out.add("$L", node.asDouble()),
            BOOLEAN = (_, node, out) -> out.add("$L", node.asBoolean()),
            STRING = (_, node, out) -> out.add("$S", node.asText()),
            NAMESPACED_KEY = (_, node, out) -> out.add("$T.parse($S)", Imports.NAMESPACED_KEY, node.asText());

    public static final Instruction COLOR = (ctx, node, out) -> {
        if (!node.isTextual())
            throw ctx.expected("text", node);
        String value = node.asText();
        if (value.charAt(0) == '#') {
            out.add("new $T($S)", HexColor.class, value);
            return;
        }
        out.add("$T.byName($S).get()", ChatColor.class, value);
    };

    public static final Instruction INT_PROVIDER = IntProviderInstructions.INT_PROVIDER;

    public static final Instruction COMPONENT = ComponentInstructions.COMPONENT;

    public static Instruction tag(String registry) {
        return (ctx, node, out) -> out.add(
                "$T.of($T.$N, $T.parse($S))",
                Imports.TAG_KEY,
                Imports.REGISTRY_KEY,
                registry.toUpperCase(Locale.ENGLISH),
                Imports.NAMESPACED_KEY,
                validateTag(ctx, node.asText())
        );
    }

    private static String validateTag(InstructionContext ctx, String tag) {
        if (tag.charAt(0) != '#')
            throw ctx.exception("Could not parse " + tag + " as a tag");
        return tag.substring(1);
    }

    public static Instruction _enum(TypeName type) {
        return _enum(type, node -> node.asText().toUpperCase(Locale.ENGLISH));
    }

    public static Instruction _enum(TypeName type, Function<JsonNode, String> function) {
        return (_, node, out) -> out.add("$T.$N", type, function.apply(node));
    }

    public static Instruction list(Instruction instruction) {
        return iterate(instruction, ", ");
    }

    public static Instruction iterate(Instruction instruction) {
        return iterate(instruction, "");
    }

    public static Instruction iterate(Instruction instruction, String delimiter) {
        return (ctx, node, out) -> {
            if (!node.isArray())
                throw ctx.expected("a list", node);

            int i = 0;
            for (JsonNode element : node) {
                if (i != 0)
                    out.add(delimiter);
                try {
                    ctx.pushCtx("list");
                    ctx.pushIndex(i++);
                    instruction.apply(ctx, element, out);
                } finally {
                    ctx.popCtx();
                    ctx.pop();
                }
            }
        };
    }
    private Instructions() {}

}
