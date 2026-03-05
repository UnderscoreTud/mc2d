package me.tud.mc2d.generators.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.POJONode;
import org.jetbrains.annotations.Contract;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class JsonUtils {

    private JsonUtils() {}

    @Contract(value = "null -> null", pure = true)
    public Object unwrap(JsonNode node) {
        if (node == null)
            return null;

        return switch (node.getNodeType()) {
            case STRING -> node.textValue();
            case BOOLEAN -> node.booleanValue();
            case NUMBER -> node.numberValue();
            case BINARY -> {
                try {
                    yield node.binaryValue();
                } catch (IOException e) {
                    throw new IllegalArgumentException("Invalid binary node", e);
                }
            }
            case ARRAY -> {
                List<Object> list = new ArrayList<>(node.size());
                node.forEach(value -> list.add(unwrap(value)));
                yield  list;
            }
            case OBJECT -> {
                Map<String, Object> map = LinkedHashMap.newLinkedHashMap(node.size());
                node.forEachEntry((key, value) -> map.put(key, unwrap(value)));
                yield  map;
            }
            case POJO -> ((POJONode) node).getPojo();
            case MISSING, NULL -> null;
        };
    }

}
