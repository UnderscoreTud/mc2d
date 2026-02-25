package me.tud.mc2d.generators.util;

import com.google.gson.stream.JsonReader;
import org.jetbrains.annotations.UnknownNullability;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonUtils {

    public static @UnknownNullability Object nextObject(JsonReader reader) throws IOException {
        if (!reader.hasNext())
            return null;
        return switch (reader.peek()) {
            case NUMBER -> reader.nextLong();
            case STRING -> reader.nextString();
            case NAME -> reader.nextName();
            case NULL -> {
                reader.nextNull();
                yield null;
            }
            case BOOLEAN -> reader.nextBoolean();
            case BEGIN_OBJECT -> {
                Map<String, Object> object = new HashMap<>();
                reader.beginObject();
                while (reader.hasNext())
                    object.put(reader.nextName(), nextObject(reader));
                reader.endObject();
                yield object;
            }
            case BEGIN_ARRAY -> {
                List<Object> array = new ArrayList<>();
                reader.beginArray();
                while (reader.hasNext())
                    array.add(nextObject(reader));
                reader.endArray();
                yield array.toArray(new Object[0]);
            }
            case END_OBJECT, END_ARRAY, END_DOCUMENT -> throw new UnsupportedOperationException(); 
        };
    }

    public static void exhaust(JsonReader reader) throws IOException {
        while (reader.hasNext()) {
            reader.skipValue();
        }
    }

}
