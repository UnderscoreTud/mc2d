package me.tud.mc2d.generators.entitytypes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import me.tud.mc2d.generators.RegistryGenerator;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import java.util.Locale;

@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record EntityType(
        int id,
        @JsonProperty("internalId") int internalID,
        String name,
        String displayName,
        String type,
        double width,
        double height,
        double length,
        double offset,
        String category,
        String[] metadataKeys
) implements RegistryGenerator.Entry {

    @Override
    public String fieldName() {
        return StringUtils.cleanNamespacedKey(name.toUpperCase(Locale.ENGLISH));
    }

    @Override
    public void writeField(CodeBlock.Builder out) {
        out.add(
                "new $T($L, $L, $T.minecraft($S), $S, $L, $L, $L, $L)",
                Imports.ENTITY_TYPE, id, internalID, Imports.NAMESPACED_KEY, name, displayName, width, height, length, offset
        );
    }

    @Override
    public void writeKey(ClassName source, CodeBlock.Builder out) {
        out.add("$T.$N.key()", source, fieldName());
    }

}
