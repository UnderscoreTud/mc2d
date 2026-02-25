package me.tud.mc2d.generators;

import com.google.gson.stream.JsonReader;
import com.palantir.javapoet.ClassName;

import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class JsonFileGenerator extends Generator<JsonReader> {

    @Override
    protected JsonReader input(String location) {
        InputStream in = JsonFileGenerator.class.getResourceAsStream(location);
        if (in == null)
            return null;
        return new JsonReader(new InputStreamReader(in));
    }

}
