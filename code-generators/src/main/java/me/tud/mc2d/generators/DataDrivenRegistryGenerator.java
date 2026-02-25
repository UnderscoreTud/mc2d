package me.tud.mc2d.generators;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.*;
import me.tud.mc2d.generators.instruction.InstructionContext;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class DataDrivenRegistryGenerator extends Generator {

    private final ClassName className;
    private final Structure structure;

    protected DataDrivenRegistryGenerator(ClassName className, Structure structure) {
        this.className = className;
        this.structure = structure;
    }

    @Override
    public GeneratedType[] generate(String resource) throws IOException {
        File directory = file(resource);

        TypeSpec.Builder type = TypeSpec.classBuilder(className)
                .addModifiers(Modifier.SEALED)
                .addPermittedSubclass(structure.source())
                .addMethod(PROTECTED_CONSTRUCTOR);

        CodeBlock.Builder createDefaultMethodBlock = CodeBlock.builder()
                .add(
                        "return new $T<>(server, $T.$N).modify(registry -> {\n",
                        Imports.DATA_DRIVEN_REGISTRY,
                        Imports.REGISTRY_KEY,
                        StringUtils.camelToScreamingSnake(structure.source().simpleName())
                )
                .indent();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory.toPath(), "*.json")) {
            stream.forEach(path -> {
                String entryName = path.getFileName().toString();
                entryName = entryName.substring(0, entryName.lastIndexOf('.'));
                try (InputStream in = Files.newInputStream(path)) {
                    type.addField(generateEntry(
                            entryName,
                            MAPPER.readTree(in)
                    ));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                createDefaultMethodBlock.addStatement("registry.register($T.minecraft($S), $T.$L)",
                        Imports.NAMESPACED_KEY, entryName,
                        structure.source(), entryName.toUpperCase(Locale.ENGLISH));
            });
        }

        createDefaultMethodBlock.unindent().add("});");
        type.addMethod(MethodSpec.methodBuilder("createDefaultRegistry")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(ParameterizedTypeName.get(Imports.DATA_DRIVEN_REGISTRY, structure.source()))
                .addParameter(Imports.SERVER, "server")
                .addCode(createDefaultMethodBlock.build())
                .build());
        return new GeneratedType[]{new GeneratedType(getClass(), className.packageName(), type.build())};
    }

    private FieldSpec generateEntry(String name, JsonNode node) throws JsonParseException {
        FieldSpec.Builder entry = FieldSpec.builder(structure.source(), name.toUpperCase(Locale.ENGLISH))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
        CodeBlock.Builder builder = CodeBlock.builder();
        structure.pushAndApply(new InstructionContext(), name, node, builder);
        entry.initializer(builder.build());
        return entry.build();
    }

}
