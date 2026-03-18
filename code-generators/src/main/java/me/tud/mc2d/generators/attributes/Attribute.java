package me.tud.mc2d.generators.attributes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.CodeBlock;
import lombok.With;
import me.tud.mc2d.generators.RegistryGenerator;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;

import java.util.Locale;

@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record Attribute(
        @With @JsonIgnore int id,
        String resource,
        String name,
        double min,
        double max,
        @JsonProperty("default") double defaultValue
) implements RegistryGenerator.Entry {

    @Override
    public String fieldName() {
        return StringUtils.cleanNamespacedKey(resource.toUpperCase(Locale.ENGLISH));
    }

    @Override
    public void writeField(CodeBlock.Builder out) {
        out.add(
                "new $T($L, $T.parse($S), $L, $L, $L)",
                Imports.ATTRIBUTE, id, Imports.NAMESPACED_KEY, resource, min, max, defaultValue
        );
    }

    @Override
    public void writeKey(ClassName source, CodeBlock.Builder out) {
        out.add("$T.$N.key()", source, fieldName());
    }

}
