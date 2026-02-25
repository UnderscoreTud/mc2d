package me.tud.mc2d.generators.packets;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonDeserializeAs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.FieldSpec;
import com.palantir.javapoet.TypeName;
import com.palantir.javapoet.TypeSpec;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.util.StringUtils;

import javax.lang.model.element.Modifier;
import java.util.*;

import static me.tud.mc2d.generators.Generator.PRIVATE_CONSTRUCTOR;

public record Packets(@JsonAnySetter Map<String, State> states) {

    public Packets {
        states = new TreeMap<>(states);
    }

    private static final ClassName CLASS_NAME = ClassName.get("me.tud.mc2d.network.packets", "Packets");

    public GeneratedType generate() {
        TypeSpec.Builder builder = TypeSpec.classBuilder(CLASS_NAME)
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addMethod(PRIVATE_CONSTRUCTOR);
        states.forEach((key, state) -> builder.addType(state.generate(key)));
        return new GeneratedType(PacketsGenerator.class, CLASS_NAME.packageName(), builder.build());
    }

    public record State(@JsonAnySetter Map<String, Direction> directions) {

        public State {
            directions = new TreeMap<>(directions);
        }

        public TypeSpec generate(String name) {
            String className = StringUtils.snakeToPascal(name);
            TypeSpec.Builder builder = TypeSpec.classBuilder(className)
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                    .addMethod(PRIVATE_CONSTRUCTOR);
            directions.forEach((key, direction) -> builder.addType(direction.generate(className, key)));
            return builder.build();
        }

    }

    public record Direction(@JsonAnySetter Map<String, Packet> packets) {

        public TypeSpec generate(String state, String name) {
            String className = StringUtils.snakeToPascal(name);
            TypeSpec.Builder builder = TypeSpec.classBuilder(className)
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                    .addField(FieldSpec.builder(TypeName.get(String.class), "NAME")
                            .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                            .initializer("$S", state + StringUtils.capitalize(className))
                            .build())
                    .addMethod(PRIVATE_CONSTRUCTOR);
            packets.entrySet().stream()
                    .sorted(Comparator.comparingInt(entry -> entry.getValue().id()))
                    .map(entry -> entry.getValue().generate(entry.getKey()))
                    .forEach(builder::addField);
            return builder.build();
        }

    }

    public record Packet(@JsonProperty("protocol_id") int id) {

        public FieldSpec generate(String name) {
            String field = StringUtils.cleanNamespacedKey(name).toUpperCase(Locale.ENGLISH);
            return FieldSpec.builder(int.class, field)
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                    .initializer("$L", String.format("0x%02X", id))
                    .build();
        }

    }

}
