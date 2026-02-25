package me.tud.mc2d.generators.blocks;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.palantir.javapoet.*;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.blocks.blockdata.BlockData;
import me.tud.mc2d.generators.blocks.blockdata.property.Property;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;

import javax.lang.model.element.Modifier;
import java.util.*;

public record Blocks(@JsonAnySetter Map<String, Block> blocks) {

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.world.block", "Blocks");

    public Blocks {
        blocks = new TreeMap<>(blocks);
    }

    public GeneratedType[] generate(BlockIDProvider idProvider) {
        GeneratedType[] generated = Property.generateSharedProperties();
        generated = ArrayUtils.addAll(generated, BlockData.generateBlockData());
        generated = ArrayUtils.add(generated, generateBlocks(idProvider));
        return generated;
    }

    private GeneratedType generateBlocks(BlockIDProvider idProvider) {
        TypeSpec.Builder builder = TypeSpec.classBuilder(CLASS_NAME)
                .addModifiers(Modifier.PUBLIC, Modifier.SEALED)
                .addPermittedSubclass(Imports.BLOCK);
        CodeBlock.Builder createRegistryCode = CodeBlock.builder();
        createRegistryCode.add("return new $T<>(server, $T.BLOCKS).modify(modifiable -> {\n", Imports.BUILT_IN_REGISTRY, Imports.REGISTRY_KEY).indent();
        blocks.entrySet().stream()
                .map(entry -> new Object() {
                    final String name = entry.getKey();
                    final int id = idProvider.get(name);
                    final Block block = entry.getValue();
                })
                .sorted(Comparator.comparingInt(info -> info.id))
                .forEach(info -> {
                    String name = info.name;
                    int id = info.id;
                    Block block = info.block;
                    String fieldName = StringUtils.cleanNamespacedKey(name).toUpperCase(Locale.ENGLISH);
                    BlockData blockData = BlockData.of(block.definition.type);
                    builder.addField(FieldSpec.builder(ParameterizedTypeName.get(Imports.BLOCK, blockData.className()), fieldName)
                            .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                            .initializer("new $1T<>($4L, $3T.parse($5S), () -> new $2T($6L))", Imports.BLOCK, blockData.className(), Imports.NAMESPACED_KEY, id, name, block.states[0].id())
                            .build());
                    createRegistryCode.addStatement("modifiable.register($1N.key(), $1N)", fieldName);
                });
        createRegistryCode.unindent().add("});");
        builder.addMethod(MethodSpec.methodBuilder("createDefaultRegistry")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(ParameterizedTypeName.get(Imports.BUILT_IN_REGISTRY, ParameterizedTypeName.get(Imports.BLOCK, WildcardTypeName.subtypeOf(Object.class))))
                .addParameter(Imports.SERVER, "server")
                .addCode(createRegistryCode.build())
                .build());
        return new GeneratedType(BlocksGenerator.class, CLASS_NAME.packageName(), builder.build());
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
