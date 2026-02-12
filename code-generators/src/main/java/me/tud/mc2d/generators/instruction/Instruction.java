package me.tud.mc2d.generators.instruction;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.CodeBlock;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.JsonUtils;

import java.io.IOException;

public interface Instruction {

    SimpleInstruction INTEGER = (builder, reader) -> builder.add("$L", reader.nextInt());
    SimpleInstruction LONG = (builder, reader) -> builder.add("$LL", reader.nextLong());
    SimpleInstruction FLOAT = (builder, reader) -> builder.add("$Lf", reader.nextDouble());
    SimpleInstruction DOUBLE = (builder, reader) -> builder.add("$L", reader.nextDouble());
    SimpleInstruction BOOLEAN = (builder, reader) -> builder.add("$L", reader.nextBoolean());
    SimpleInstruction NAMESPACED_KEY = (builder, reader) -> builder.add("$T.parse($S)", Imports.NAMESPACED_KEY, reader.nextString());
    SimpleInstruction HASHED_NAMESPACED_KEY = (builder, reader) -> builder.add("$T.parse($S)", Imports.NAMESPACED_KEY, reader.nextString().substring(1));

    SimpleInstruction INT_PROVIDER = (builder, reader) -> IntProviderInstructions.intProvider(builder, JsonUtils.nextObject(reader));

    boolean apply(String name, CodeBlock.Builder builder, JsonReader reader) throws IOException;

}
