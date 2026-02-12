package me.tud.mc2d.generators.instruction;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.CodeBlock;

import java.io.IOException;

@FunctionalInterface
public interface SimpleInstruction extends Instruction {

    void apply(CodeBlock.Builder builder, JsonReader reader) throws IOException;

    @Override
    default boolean apply(String name, CodeBlock.Builder builder, JsonReader reader) throws IOException {
        apply(builder, reader);
        return true;
    }

}
