package me.tud.mc2d.generators;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.ClassName;

import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class JsonFileGenerator extends Generator<JsonReader> {

    protected JsonFileGenerator(ClassName className, String resourceLocation) {
        super(className, resourceLocation);
    }

    @Override
    protected JsonReader input() {
        InputStream in = JsonFileGenerator.class.getResourceAsStream(resourceLocation);
        if (in == null)
            return null;
        return new JsonReader(new InputStreamReader(in));
    }

}
