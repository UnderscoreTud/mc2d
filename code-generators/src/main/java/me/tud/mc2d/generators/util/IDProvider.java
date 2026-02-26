package me.tud.mc2d.generators.util;

import com.fasterxml.jackson.databind.JsonNode;

@FunctionalInterface
public interface IDProvider {

    int get(String key);

    static IDProvider of(JsonNode node, String registry) {
        JsonNode entries = node.path(registry).path("entries");
        return key -> entries.path(key).path("protocol_id").asInt();
    }

}
