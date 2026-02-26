package me.tud.mc2d.generators.items;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.*;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.blocks.Blocks;
import me.tud.mc2d.generators.util.IDProvider;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import javax.lang.model.element.Modifier;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

public record Items(@JsonAnySetter Map<String, Object> items) {

    public static  final String REGISTRY_ID = "minecraft:item";

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.item", "Items");

    public GeneratedType generate(JsonNode registry) {
        IDProvider provider = IDProvider.of(registry, REGISTRY_ID);
        TypeSpec.Builder builder = TypeSpec.classBuilder(CLASS_NAME)
                .addModifiers(Modifier.SEALED)
                .addPermittedSubclass(Imports.ITEM);
        CodeBlock.Builder createRegistryCode = CodeBlock.builder();
        createRegistryCode.add("return new $T<>(server, $T.ITEMS).modify(modifiable -> {\n", Imports.BUILT_IN_REGISTRY, Imports.REGISTRY_KEY).indent();
        items.keySet().stream()
                .map(key -> new Object() {
                    final String name = key;
                    final int id = provider.get(name);
                })
                .sorted(Comparator.comparingInt(info -> info.id))
                .forEach(info -> {
                    String name = info.name;
                    int id = info.id;
                    String fieldName = StringUtils.cleanNamespacedKey(name).toUpperCase(Locale.ENGLISH);
                    CodeBlock.Builder initializer = CodeBlock.builder();
                    initializer.add("new $1T($3L, $2T.parse($4S), ", Imports.ITEM, Imports.NAMESPACED_KEY, id, name);
                    if (registry.path(Blocks.REGISTRY_ID).path("entries").has(name)) {
                        initializer.add("$T.$N", Imports.BLOCK, fieldName);
                    } else {
                        initializer.add("null");
                    }
                    initializer.add(")");
                    builder.addField(FieldSpec.builder(Imports.ITEM, fieldName)
                            .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                            .initializer(initializer.build())
                            .build());
                    createRegistryCode.addStatement("modifiable.register($1N.key(), $1N)", fieldName);
                });
        createRegistryCode.unindent().add("});");
        builder.addMethod(MethodSpec.methodBuilder("createDefaultRegistry")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(ParameterizedTypeName.get(Imports.BUILT_IN_REGISTRY, Imports.ITEM))
                .addParameter(Imports.SERVER, "server")
                .addCode(createRegistryCode.build())
                .build());
        return new GeneratedType(ItemsGenerator.class, CLASS_NAME.packageName(), builder.build());
    }

}
