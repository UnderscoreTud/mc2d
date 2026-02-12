package me.tud.mc2d.generators;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.FieldSpec;
import com.palantir.javapoet.TypeSpec;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.instruction.Instruction;
import me.tud.mc2d.generators.instruction.Structure;

import javax.lang.model.element.Modifier;
import java.io.*;
import java.nio.file.*;
import java.util.Locale;

public class DimensionTypesGenerator extends FileGenerator {

    private static final Structure STRUCTURE = Structure.lenient()
            .instruction("ambient_light", Instruction.FLOAT)
            .instruction("bed_works", Instruction.BOOLEAN)
            .instruction("coordinate_scale", Instruction.DOUBLE)
            .instruction("effects", Instruction.NAMESPACED_KEY)
            .instruction("fixed_time", Instruction.LONG)
            .instruction("has_ceiling", Instruction.BOOLEAN)
            .instruction("has_raids", Instruction.BOOLEAN)
            .instruction("has_skylight", Instruction.BOOLEAN)
            .instruction("height", Instruction.INTEGER)
            .instruction("infiniburn", Instruction.HASHED_NAMESPACED_KEY)
            .instruction("logical_height", Instruction.INTEGER)
            .instruction("min_y", Instruction.INTEGER)
            .instruction("monster_spawn_block_light_limit", Instruction.INTEGER)
            .instruction("monster_spawn_light_level", Instruction.INT_PROVIDER)
            .instruction("natural", Instruction.BOOLEAN)
            .instruction("piglin_safe", Instruction.BOOLEAN)
            .instruction("respawn_anchor_works", Instruction.BOOLEAN)
            .instruction("ultrawarm", Instruction.BOOLEAN)
            .build();

    private static final String RESOURCE_LOCATION = "/dimension_type";

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.dimension", "DimensionTypes");

    public static void main(String[] args) throws Exception {
        new DimensionTypesGenerator().run(args);
    }

    protected DimensionTypesGenerator() {
        super(CLASS_NAME, RESOURCE_LOCATION);
    }

    @Override
    public TypeSpec generate(File directory) throws IOException {
        TypeSpec.Builder type = TypeSpec.classBuilder(CLASS_NAME)
                .addModifiers(Modifier.PUBLIC, Modifier.SEALED)
                .addPermittedSubclass(Imports.DIMENSION_TYPE)
                .addAnnotation(generatedAnnotation())
                .addMethod(PROTECTED_CONSTRUCTOR);
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
            });
        }
        return type.build();
    }

    private FieldSpec generateEntry(String name, JsonReader reader) throws IOException {
        FieldSpec.Builder entry = FieldSpec.builder(Imports.DIMENSION_TYPE, name.toUpperCase(Locale.ENGLISH))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
        reader.beginObject();
        CodeBlock.Builder builder = CodeBlock.builder()
                .add("$T.builder()\n", Imports.DIMENSION_TYPE)
                .indent()
                .indent();
        while (reader.hasNext()) {
            String key = reader.nextName();
            STRUCTURE.apply(key, builder, reader);
        }
        builder.add(".build()").unindent().unindent();
        entry.initializer(builder.build());
        reader.endObject();
        return entry.build();
    }

}
