package me.tud.mc2d.generators.blocks;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.*;
import me.tud.mc2d.generators.RegistryGenerator;
import me.tud.mc2d.generators.blocks.blockdata.BlockData;
import me.tud.mc2d.generators.items.Items;
import me.tud.mc2d.generators.util.IDProvider;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import java.util.*;

public record Blocks(@JsonAnySetter Map<String, Block> blocks) {

    public static final String REGISTRY_ID = "minecraft:block";

    public List<Entry> entries(BlocksGenerator generator, JsonNode registry) {
        IDProvider provider = IDProvider.of(registry, REGISTRY_ID);
        return blocks.entrySet().stream()
                .map(entry -> new Entry(
                        generator,
                        entry.getKey(),
                        provider.get(entry.getKey()),
                        entry.getValue(),
                        BlockData.of(entry.getValue().definition.type),
                        registry
                ))
                .sorted(Comparator.comparingInt(entry -> entry.id))
                .toList();
    }
    
    public record Entry(
            BlocksGenerator generator, 
            String name, 
            int id, 
            Block block, 
            BlockData blockData,
            JsonNode registry
    ) implements RegistryGenerator.Entry {

        @Override
        public String fieldName() {
            return StringUtils.cleanNamespacedKey(name).toUpperCase(Locale.ENGLISH);
        }

        @Override
        public TypeName fieldType() {
            return ParameterizedTypeName.get(Imports.BLOCK, blockData.className());
        }

        @Override
        public void writeField(CodeBlock.Builder out) {
            out.add("new $1T<>($4L, $3T.parse($5S), () -> new $2T($6L), ", Imports.BLOCK, blockData.className(), Imports.NAMESPACED_KEY, id, name, block.states[0].id());
            if (registry.path(Items.REGISTRY_ID).path("entries").has(name)) {
                out.add("$T.$N", Imports.ITEM, fieldName());
            } else {
                out.add("null");
            }
            out.add(")");
        }

        @Override
        public void writeKey(CodeBlock.Builder out) {
            out.add("$T.$N.key()", generator.registrySource(), fieldName());
        }
    }

    public record Block(Definition definition, Map<String, String[]> properties, State[] states) {

        public Block {
            BlockData.handle(definition.type, properties, Arrays.stream(states)
                    .filter(State::isDefault)
                    .map(State::properties)
                    .filter(Objects::nonNull)
                    .findFirst().orElse(new HashMap<>()));
        }

    }

    public record Definition(String type, @JsonAnySetter Map<String, Object> extra) {}

    public record State(@JsonProperty("default") boolean isDefault, int id, Map<String, String> properties) {}

}
