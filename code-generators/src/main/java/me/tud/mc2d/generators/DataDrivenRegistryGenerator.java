package me.tud.mc2d.generators;

import com.fasterxml.jackson.databind.JsonNode;
import com.palantir.javapoet.*;
import me.tud.mc2d.generators.instruction.*;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class DataDrivenRegistryGenerator extends RegistryGenerator<DataDrivenRegistryGenerator.Entry> {

    private final Structure structure;

    protected DataDrivenRegistryGenerator(String id, Structure structure) {
        this(id, id, structure);
    }

    protected DataDrivenRegistryGenerator(String id, String resource, Structure structure) {
        super(id, "/" + resource, Imports.DATA_DRIVEN_REGISTRY, structure.source());
        this.structure = structure;
    }

    @Override
    protected List<Entry> entries(String resource) throws IOException {
        File directory = file(resource);

        List<Entry> entries = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory.toPath(), "*.json")) {
            stream.forEach(path -> {
                String entryName = path.getFileName().toString();
                entryName = entryName.substring(0, entryName.lastIndexOf('.'));
                try (InputStream in = Files.newInputStream(path)) {
                    entries.add(new Entry(entryName, structure, MAPPER.readTree(in)));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        return entries;
    }

    public record Entry(String name, Instruction instruction, JsonNode node) implements RegistryGenerator.Entry {

        @Override
        public String fieldName() {
            return StringUtils.defendIdentifier(name.toUpperCase(Locale.ENGLISH));
        }

        @Override
        public void writeField(CodeBlock.Builder out) {
            instruction.pushAndApply(new InstructionContext(), name, node, out);
        }

        @Override
        public void writeKey(CodeBlock.Builder out) {
            out.add("$T.minecraft($S)", Imports.NAMESPACED_KEY, name);
        }

    }
}
