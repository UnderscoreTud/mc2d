package me.tud.mc2d.generators.items;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.*;
import me.tud.mc2d.generators.RegistryGenerator;
import me.tud.mc2d.generators.blocks.Blocks;
import me.tud.mc2d.generators.util.IDProvider;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public record Items(@JsonAnySetter Map<String, Object> items) {

    public static  final String REGISTRY_ID = "minecraft:item";

    public List<Entry> entries(JsonNode registry) {
        IDProvider provider = IDProvider.of(registry, REGISTRY_ID);
        return items.keySet().stream()
                .map(key -> new Entry(key, provider.get(key), registry))
                .sorted(Comparator.comparingInt(entry -> entry.id))
                .toList();
    }

    public record Entry(
            String name,
            int id,
            JsonNode registry
    ) implements RegistryGenerator.Entry {

        @Override
        public String fieldName() {
            return StringUtils.cleanNamespacedKey(name).toUpperCase(Locale.ENGLISH);
        }

        @Override
        public void writeField(CodeBlock.Builder out) {
            out.add("new $1T($3L, $2T.parse($4S), ", Imports.ITEM, Imports.NAMESPACED_KEY, id, name);
            if (registry.path(Blocks.REGISTRY_ID).path("entries").has(name)) {
                out.add("() -> $T.$N", Imports.BLOCK, fieldName());
            } else {
                out.add("null");
            }
            out.add(")");
        }

        @Override
        public void writeKey(ClassName source, CodeBlock.Builder out) {
            out.add("$T.$N.key()", source, fieldName());
        }
    }

}
