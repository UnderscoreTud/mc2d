package me.tud.mc2d.generators.instruction;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeName;
import lombok.SneakyThrows;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.JsonUtils;
import me.tud.mc2d.generators.util.ValueExtractor;

import java.io.IOException;
import java.util.Locale;
import java.util.function.Function;

public interface Instruction {

    SimpleInstruction INTEGER = (builder, reader) -> builder.add("$L", reader.nextInt());
    SimpleInstruction LONG = (builder, reader) -> builder.add("$LL", reader.nextLong());
    SimpleInstruction FLOAT = (builder, reader) -> builder.add("$Lf", reader.nextDouble());
    SimpleInstruction DOUBLE = (builder, reader) -> builder.add("$L", reader.nextDouble());
    SimpleInstruction BOOLEAN = (builder, reader) -> builder.add("$L", reader.nextBoolean());
    SimpleInstruction STRING = (builder, reader) -> builder.add("$S", reader.nextString());
    SimpleInstruction NAMESPACED_KEY = (builder, reader) -> builder.add("$T.parse($S)", Imports.NAMESPACED_KEY, reader.nextString());
    SimpleInstruction HASHED_NAMESPACED_KEY = (builder, reader) -> builder.add("$T.parse($S)", Imports.NAMESPACED_KEY, reader.nextString().substring(1));

    SimpleInstruction INT_PROVIDER = (builder, reader) -> IntProviderInstructions.intProvider(builder, JsonUtils.nextObject(reader));

    static SimpleInstruction enumInstruction(TypeName type) {
        return enumInstruction(type, reader -> reader.nextString().toUpperCase(Locale.ENGLISH));
    }

    static SimpleInstruction enumInstruction(TypeName type, ValueExtractor<String> function) {
        return (builder, reader) -> builder.add("$T.$N", type, function.extract(reader));
    }

    boolean apply(String name, CodeBlock.Builder builder, JsonReader reader) throws IOException;

}
