package me.tud.mc2d.generators.blockdata;

import com.google.gson.stream.JsonReader;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.JsonFileGenerator;
import me.tud.mc2d.generators.blockdata.property.Property;
import me.tud.mc2d.generators.util.JsonUtils;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.*;

public class BlockDataGenerator extends JsonFileGenerator {

    private static final String RESOURCE_LOCATION = "/blocks.json";

    static void main(String[] args) throws Exception {
        new BlockDataGenerator().run(RESOURCE_LOCATION, args);
    }

    private final Map<String, BlockData> blockData = new HashMap<>();

    @Override
    public GeneratedType[] generate(JsonReader reader) throws IOException {
        reader.beginObject();
        while (reader.hasNext()) {
            String key = reader.nextName();

            readBlock(key, reader);
        }
        reader.endObject();

        List<GeneratedType> generated = new ArrayList<>(List.of(Property.generateSharedProperties()));
        blockData.values().forEach(data -> generated.add(data.generate()));
        return generated.toArray(new GeneratedType[0]);
    }

    private void readBlock(String key, JsonReader reader) throws IOException {
        String name = null;
        String[] properties = null;
        Map<String, String> defaultValues = new HashMap<>();

        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.nextName().toLowerCase(Locale.ENGLISH)) {
                case "definition" -> {
                    name = readDefinition(reader);
                    if (name == null) {
                        JsonUtils.exhaust(reader);
                        reader.endObject();
                        return;
                    }
                }
                case "properties" -> {
                    properties = readProperties(name, reader);
                    if (properties.length == 0) {
                        JsonUtils.exhaust(reader);
                        reader.endObject();
                        return;
                    }
                }
                case "states" -> {
                    for (State state : readStates(reader)) {
                        if (state.isDefault) {
                            defaultValues = state.values;
                            break;
                        }
                    }
                }
                default -> throw new UnsupportedOperationException("Unexpected key: " + reader.getPath());
            }
        }
        reader.endObject();

        if (name == null || properties == null)
            return;

        blockData.put(name, new BlockData(name, properties, defaultValues));
    }

    private @Nullable String readDefinition(JsonReader reader) throws IOException {
        String name = null;
        reader.beginObject();
        while (reader.hasNext()) {
            if (name != null || !reader.nextName().toLowerCase(Locale.ENGLISH).equals("type")) {
                reader.skipValue();
                continue;
            }
            name = reader.nextString();
        }
        reader.endObject();

        if (name == null || blockData.containsKey(name))
            return null;

        return name;
    }

    private String[] readProperties(String source, JsonReader reader) throws IOException {
        List<String> properties = new ArrayList<>();
        reader.beginObject();
        while (reader.hasNext()) {
            String property = reader.nextName();

            List<String> possibleValues = new ArrayList<>();
            reader.beginArray();
            while (reader.hasNext())
                possibleValues.add(reader.nextString());
            reader.endArray();

            Property.handle(source, property, possibleValues.toArray(new String[0]));
            properties.add(property);
        }
        reader.endObject();

        return properties.toArray(new String[0]);
    }

    private State[] readStates(JsonReader reader) throws IOException {
        List<State> states = new ArrayList<>();
        reader.beginArray();
        while (reader.hasNext())
            states.add(readState(reader));
        reader.endArray();
        return states.toArray(new State[0]);
    }

    private State readState(JsonReader reader) throws IOException {
        boolean isDefault = false;
        int id = -1;
        Map<String, String> values = new HashMap<>();
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.nextName().toLowerCase(Locale.ENGLISH)) {
                case "default" -> isDefault = reader.nextBoolean();
                case "id" -> id = reader.nextInt();
                case "properties" -> {
                    reader.beginObject();
                    while (reader.hasNext())
                        values.put(reader.nextName(), reader.nextString());
                    reader.endObject();
                }
            }
        }
        reader.endObject();
        return new State(isDefault, id, values);
    }

    private record State(boolean isDefault, int id, Map<String, String> values) {}

}
