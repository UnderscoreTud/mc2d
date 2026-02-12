package me.tud.mc2d.generators;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.*;
import me.tud.mc2d.generators.instruction.Structure;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class DataDrivenRegistryGenerator extends FileGenerator {

    private final ClassName registryClass;
    private final Structure structure;

    protected DataDrivenRegistryGenerator(
            ClassName className,
            String resourceLocation,
            ClassName registryClass,
            Structure structure
    ) {
        super(className, resourceLocation);
        this.registryClass = registryClass;
        this.structure = structure;
    }

    @Override
    public TypeSpec generate(File directory) throws IOException {
        TypeSpec.Builder type = TypeSpec.classBuilder(className)
                .addModifiers(Modifier.PUBLIC, Modifier.SEALED)
                .addPermittedSubclass(registryClass)
                .addAnnotation(generatedAnnotation())
                .addMethod(PROTECTED_CONSTRUCTOR);

        CodeBlock.Builder createDefaultMethodBlock = CodeBlock.builder()
                .add(
                        "return new $T<>(server, $T.$N).modify(registry -> {\n",
                        Imports.DATA_DRIVEN_REGISTRY,
                        Imports.REGISTRY_KEY,
                        StringUtils.camelToScreamingSnake(registryClass.simpleName())
                )
                .indent();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory.toPath(), "*.json")) {
            stream.forEach(path -> {
                String entryName = path.getFileName().toString();
                entryName = entryName.substring(0, entryName.lastIndexOf('.'));
                try (InputStream in = Files.newInputStream(path)) {
                    type.addField(generateEntry(
                            entryName,
                            new JsonReader(new InputStreamReader(in))
                    ));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                createDefaultMethodBlock.addStatement("registry.register($T.minecraft($S), $T.$L)",
                        Imports.NAMESPACED_KEY, entryName,
                        registryClass, entryName.toUpperCase(Locale.ENGLISH));
            });
        }

        createDefaultMethodBlock.unindent().add("});");
        type.addMethod(MethodSpec.methodBuilder("createDefaultRegistry")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(ParameterizedTypeName.get(Imports.DATA_DRIVEN_REGISTRY, registryClass))
                .addParameter(Imports.SERVER, "server")
                .addCode(createDefaultMethodBlock.build())
                .build());
        return type.build();
    }

    private FieldSpec generateEntry(String name, JsonReader reader) throws IOException {
        FieldSpec.Builder entry = FieldSpec.builder(registryClass, name.toUpperCase(Locale.ENGLISH))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
        reader.beginObject();
        CodeBlock.Builder builder = CodeBlock.builder()
                .add("$T.builder()\n", registryClass)
                .indent()
                .indent();
        while (reader.hasNext()) {
            String key = reader.nextName();
            structure.apply(key, builder, reader);
        }
        builder.add(".build()").unindent().unindent();
        entry.initializer(builder.build());
        reader.endObject();
        return entry.build();
    }

}
