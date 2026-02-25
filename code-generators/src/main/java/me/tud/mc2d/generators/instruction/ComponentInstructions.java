package me.tud.mc2d.generators.instruction;

import com.palantir.javapoet.ClassName;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.components.KeybindComponent;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.components.TranslationComponent;
import org.machinemc.scriptive.events.ClickEvent;
import org.machinemc.scriptive.events.HoverEvent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import static me.tud.mc2d.generators.instruction.Instructions.*;

final class ComponentInstructions {

    public static final Structure CLICK_EVENT = Structure.constructor(ClickEvent.class)
            .instruction("action", _enum(ClassName.get(ClickEvent.Action.class)))
            .instruction("value", STRING)
            .build();

    public static final DynamicInstruction HOVER_EVENT = DynamicInstruction.builder()
            .basedOn(node -> node.get("action").asText())
            .path("show_text", Structure.constructor(HoverEvent.class)
                    .instruction("action", (_, _, out) -> out.add("$T.SHOW_TEXT", HoverEvent.Action.class))
                    .instruction("value", (ctx, node, out) -> {
                        out.add("new $T(", HoverEvent.Text.class);
                        Instructions.COMPONENT.apply(ctx, node, out);
                        out.add(")");
                    })
                    .build())
            .path("show_item", Structure.constructor(HoverEvent.class)
                    .allowMissingKeys()
                    .instruction("action", (_, _, out) -> out.add("$T.SHOW_ITEM", HoverEvent.Action.class))
                    .instruction("id", (ctx, node, out) -> {
                        out.add("new $T(", HoverEvent.Item.class);
                        Instructions.STRING.apply(ctx, node, out);
                    })
                    .instruction("count", INTEGER)
                    .instruction("components", (ctx, node, out) -> {
                        Instructions.COMPONENT.apply(ctx, node, out);
                        out.add(".toString())");
                    })
                    .build())
            .path("show_entity", Structure.constructor(HoverEvent.class)
                    .allowMissingKeys()
                    .instruction("action", (_, _, out) -> out.add("$T.SHOW_ENTITY", HoverEvent.Action.class))
                    .instruction("id", (ctx, node, out) -> {
                        out.add("new $T($T.fromString(", HoverEvent.Entity.class, UUID.class);
                        Instructions.STRING.apply(ctx, node, out);
                        out.add(")");
                    })
                    .instruction("type", STRING)
                    .instruction("name", (ctx, node, out) -> {
                        Instructions.COMPONENT.apply(ctx, node, out);
                        out.add(")");
                    })
                    .build())
            .build();

    public static final Structure BASE_COMPONENT = Structure.builder(Component.class)
            .trimmed()
            .allowMissingKeys()
            .ignoreUnknownKeys()
            .instruction("color", COLOR)
            .instruction("bold", BOOLEAN)
            .instruction("italic", BOOLEAN)
            .instruction("strikethrough", BOOLEAN)
            .instruction("obfuscated", BOOLEAN)
            .instruction("insertion", STRING)
            .instruction("clickEvent", CLICK_EVENT)
            .instruction("hoverEvent", HOVER_EVENT)
            .instruction("font", STRING)
            .namelessInstruction("extra", () -> iterate((ctx, node, out) -> {
                out.add(".append(");
                Instructions.COMPONENT.apply(ctx, node, out);
                out.add(")\n");
            }))
            .build();

    private static final Map<String, String> KEY_TO_COMPONENT = new HashMap<>();

    static {
        TextComponent.empty().getUniqueKeys().forEach(key -> KEY_TO_COMPONENT.put(key, "text"));
        TranslationComponent.of("").getUniqueKeys().forEach(key -> KEY_TO_COMPONENT.put(key, "translatable"));
        KeybindComponent.of("").getUniqueKeys().forEach(key -> KEY_TO_COMPONENT.put(key, "keybind"));
    }

    public static final DynamicInstruction COMPONENT = DynamicInstruction.builder()
            .basedOn(node -> {
                if (node.has("type"))
                    return node.get("type").asText();
                Iterator<String> iterator = node.fieldNames();
                while (iterator.hasNext()) {
                    String type = KEY_TO_COMPONENT.get(iterator.next());
                    if (type != null)
                        return type;
                }
                return null;
            })
            .path("text", (ctx, node, out) -> {
                out.add("$T.of($S).modify()\n", TextComponent.class, node.get("text").asText()).indent().indent();
                BASE_COMPONENT.apply(ctx, node, out);
                out.add(".finish()").unindent().unindent();
            })
            .path("translatable", (ctx, node, out) -> {
                out.add("$T.of($S).modify()\n", TranslationComponent.class, node.get("translate").asText()).indent().indent();
                if (node.has("with")) {
                    out.add(".arguments(");
                    list(Instructions.COMPONENT).apply(ctx, node.get("with"), out);
                    out.add(")\n");
                }
                if (node.has("fallback"))
                    out.add(".fallback($S)\n", node.get("fallback").asText());
                BASE_COMPONENT.apply(ctx, node, out);
                out.add(".finish()").unindent().unindent();
            })
            .path("keybind", (ctx, node, out) -> {
                out.add("$T.of($S).modify()\n", KeybindComponent.class, node.get("keybind").asText()).indent().indent();
                BASE_COMPONENT.apply(ctx, node, out);
                out.add(".finish()").unindent().unindent();
            })
            .build();

    private ComponentInstructions() {}

}
