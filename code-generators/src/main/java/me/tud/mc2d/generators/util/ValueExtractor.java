package me.tud.mc2d.generators.util;

import com.google.gson.stream.JsonReader;

import java.io.IOException;

@FunctionalInterface
public interface ValueExtractor<T> {

    T extract(JsonReader reader) throws IOException;

}
