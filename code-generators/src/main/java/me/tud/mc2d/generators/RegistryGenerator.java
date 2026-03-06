package me.tud.mc2d.generators;

import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.*;
import lombok.Getter;
import me.tud.mc2d.generators.instruction.DynamicInstruction;
import me.tud.mc2d.generators.instruction.InstructionContext;
import me.tud.mc2d.generators.instruction.Instructions;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public abstract class RegistryGenerator<E extends RegistryGenerator.Entry> extends Generator {

    private final String id;
    private final String resource;
    private final ClassName registryType;
    private final ClassName registrySource;
    private final TypeName exactRegistrySource;
    private final ClassName className;
    private final ClassName tagClassName;
    private final Structure tagStructure;

    protected RegistryGenerator(String id, String resource, ClassName registryType, ClassName registrySource) {
        this(id, resource, registryType, registrySource, registrySource);
    }

    protected RegistryGenerator(String id, String resource, ClassName registryType, ClassName registrySource, TypeName exactRegistrySource) {
        this.id = id;
        this.resource = resource;
        this.registryType = registryType;
        this.registrySource = registrySource;
        this.exactRegistrySource = exactRegistrySource;
        this.className = registrySource.peerClass(registrySource.simpleName() + "s");
        this.tagClassName = className.nestedClass("Tags");
        this.tagStructure = Structure.builder(Imports.TAG)
                .initializer("$T.$N", Imports.REGISTRY_KEY, id.toUpperCase(Locale.ENGLISH))
                .namelessInstruction("values",Instructions.iterate(DynamicInstruction.builder()
                        .basedOn(node -> {
                            if (node.isTextual())
                                return node.asText().charAt(0) == '#' ? "required_tag" : "required_resource";
                            if (!node.isObject())
                                return null;
                            boolean required = node.path("required").asBoolean();
                            return (required ? "required_" : "") + node.path("id");
                        })
                        .path("required_tag", Instructions.text(".tag(").append(Instructions.TAG_NAMESPACED_KEY).append(")\n"))
                        .path("required_resource", Instructions.text(".resource(").append(Instructions.NAMESPACED_KEY).append(")\n"))
                        .path("optional_tag", Instructions.text(".optionalTag(").append(Instructions.TAG_NAMESPACED_KEY).append(")\n"))
                        .path("optional_resource", Instructions.text(".optionalResource(").append(Instructions.NAMESPACED_KEY).append(")\n"))
                        .build()))
                .build();
    }

    public void run(String[] args) throws Exception {
        run(resource, args);
    }

    protected abstract List<E> entries(String resource) throws IOException;

    @Override
    public GeneratedType[] generate(String resource) throws IOException {
        TypeSpec.Builder type = TypeSpec.classBuilder(className)
                .addModifiers(Modifier.SEALED)
                .addPermittedSubclass(registrySource)
                .addMethod(PROTECTED_CONSTRUCTOR);

        CodeBlock.Builder valuesArray = CodeBlock.builder()
                .add("{\n").indent().indent();

        CodeBlock.Builder createDefaultMethodBlock = CodeBlock.builder()
                .add(
                        "return new $T<>(server, $T.$N).modify(registry -> {\n",
                        registryType,
                        Imports.REGISTRY_KEY,
                        StringUtils.camelToScreamingSnake(registrySource.simpleName())
                )
                .indent();

        List<E> entries = entries(resource);
        for (Entry entry : entries) {
            String fieldName = entry.fieldName();
            TypeName fieldType = entry.fieldType();
            FieldSpec.Builder field = FieldSpec.builder(fieldType != null ? fieldType : registrySource, fieldName)
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
            CodeBlock.Builder builder = CodeBlock.builder();
            entry.writeField(builder);
            field.initializer(builder.build());
            type.addField(field.build());

            valuesArray.add("$N,\n", entry.fieldName());

            createDefaultMethodBlock.add("registry.register(");
            entry.writeKey(registrySource, createDefaultMethodBlock);
            createDefaultMethodBlock.addStatement(", $T.$L)", registrySource, fieldName);
        }

        TypeSpec tags = generateTags(createDefaultMethodBlock);
        if (tags != null)
            type.addType(tags);

        valuesArray.unindent().unindent().add("}");
        createDefaultMethodBlock.unindent().add("});");

        TypeName arrayType = ArrayTypeName.of(exactRegistrySource);
        TypeName listType = ParameterizedTypeName.get(ClassName.get(List.class), exactRegistrySource);

        type
                .addField(FieldSpec.builder(arrayType, "VALUES")
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer(valuesArray.build())
                        .build())
                .addField(FieldSpec.builder(listType, "VALUES_LIST")
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                        .initializer("$T.unmodifiableList($T.asList(VALUES))", Collections.class, Arrays.class)
                        .build())
                .addMethod(MethodSpec.methodBuilder("values")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(listType)
                        .addCode("return VALUES_LIST;")
                        .build())
                .addMethod(MethodSpec.methodBuilder("createDefaultRegistry")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .returns(ParameterizedTypeName.get(registryType, exactRegistrySource))
                        .addParameter(Imports.SERVER, "server")
                        .addCode(createDefaultMethodBlock.build())
                        .build());


        return ArrayUtils.addAll(
                new GeneratedType[]{new GeneratedType(getClass(), className().packageName(), type.build())},
                generateExtra(entries, resource)
        );
    }

    protected GeneratedType[] generateExtra(List<E> entries, String resource) throws IOException {
        return new GeneratedType[0];
    }

    protected @Nullable TypeSpec generateTags(CodeBlock.Builder register) throws IOException {
        Map<String, JsonNode> tags = new TreeMap<>(tags());
        if (tags.isEmpty())
            return null;

        TypeSpec.Builder builder = TypeSpec.classBuilder(tagClassName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                .addMethod(PRIVATE_CONSTRUCTOR);

        tags.forEach((key, node) -> {
            CodeBlock.Builder out = CodeBlock.builder();
            tagStructure.apply(new InstructionContext(), node, out);
            String constant = StringUtils.defendIdentifier(key.toUpperCase(Locale.ENGLISH));
            builder.addField(FieldSpec.builder(ParameterizedTypeName.get(Imports.TAG, exactRegistrySource), constant)
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                    .initializer(out.build())
                    .build());
            register.addStatement("registry.registerTag($T.minecraft($S), $T.$N)", Imports.NAMESPACED_KEY, key, tagClassName, constant);
        });
        return builder.build();
    }

    private Map<String, JsonNode> tags() throws IOException {
        File tagsDirectory = fileOrNull("/tags/" + id);
        if (tagsDirectory == null)
            return Collections.emptyMap();
        Path tagsPath = tagsDirectory.toPath();
        try (Stream<Path> stream = Files.walk(tagsPath)) {
            return stream
                    .filter(path -> path.toString().endsWith(".json"))
                    .map(tagsPath::relativize)
                    .map(path -> {
                        try {
                            File file = tagsPath.resolve(path).toFile();
                            return Map.entry(
                                    path.toString().replace('\\', '/').replace(".json", ""),
                                    MAPPER.readTree(file)
                            );
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        }
    }

    public interface Entry {
        String name();
        String fieldName();
        default @Nullable TypeName fieldType() { return null; }
        void writeField(CodeBlock.Builder out);
        void writeKey(ClassName source, CodeBlock.Builder out);
    }

}
