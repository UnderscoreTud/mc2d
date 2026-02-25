package me.tud.mc2d.generators.blocks.blockdata.property;

import com.palantir.javapoet.*;
import lombok.Getter;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.blocks.blockdata.BlockData;
import me.tud.mc2d.generators.blocks.BlocksGenerator;
import me.tud.mc2d.generators.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

import javax.lang.model.element.Modifier;
import java.util.Arrays;
import java.util.Locale;

@Getter
public class CustomProperty extends Property {

    private final String[] possibleValues;

    public CustomProperty(String name, String[] possibleValues) {
        super(name);
        this.possibleValues = possibleValues;
    }

    @Override
    public String[] possibleValues(String source) {
        return possibleValues;
    }

    @Override
    public ClassName type(String source) {
        if (shared())
            return ClassName.get(PACKAGE, StringUtils.snakeToPascal(name() + "Property"));
        return ClassName.get(
                BlockData.PACKAGE,
                StringUtils.snakeToPascal(StringUtils.cleanNamespacedKey(source) + "Data"),
                StringUtils.snakeToPascal(name())
        );
    }

    @Override
    public AnnotationSpec[] typeAnnotations(String source) {
        return new AnnotationSpec[0];
    }

    @Override
    public GeneratedType[] generateShared() {
        return ArrayUtils.add(super.generateShared(), new GeneratedType(BlocksGenerator.class, PACKAGE, generateType(null)));
    }

    private TypeSpec generateType(String source) {
        ClassName type = type(source);
        TypeSpec.Builder builder = TypeSpec.enumBuilder(type).addModifiers(Modifier.PUBLIC);

        CodeBlock.Builder parseCode = CodeBlock.builder();
        parseCode.add("return switch (value.toLowerCase($T.ENGLISH)) {\n", Locale.class).indent();

        for (String value : possibleValues) {
            String constant = value.toUpperCase(Locale.ENGLISH);
            builder.addEnumConstant(constant);
            parseCode.addStatement("case $S -> $T.$N", value, type, constant);
        }
        parseCode.addStatement("default -> throw new IllegalArgumentException()");

        parseCode.unindent().add("};");
        builder.addMethod(MethodSpec.methodBuilder("parse")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(type)
                .addParameter(String.class, "value")
                .addCode(parseCode.build())
                .build());
        return builder.build();
    }

    @Override
    public void visit(String source, TypeSpec.Builder builder, @Nullable String defaultValue) {
        super.visit(source, builder, defaultValue);
        if (shared())
            return;
        builder.addType(generateType(source));
    }

    @Override
    protected void visitField(String source, CodeBlock.Builder builder, String defaultValue) {
        builder.add("$T.$N", type(source), defaultValue.toUpperCase(Locale.ENGLISH));
    }

    @Override
    protected void visitToIndex(String source, CodeBlock.Builder builder) {
        builder.addStatement("return this.$N.ordinal()", fieldName());
    }

    @Override
    protected void visitFromIndex(String source, CodeBlock.Builder builder) {
        builder.addStatement("this.$N($T.values()[index])", fieldName(), type(source));
    }

    @Override
    protected void visitFromString(String source, CodeBlock.Builder builder) {
        builder.addStatement("this.$N($T.parse(value))", fieldName(), type(source));
    }

    @Override
    public boolean canMerge(me.tud.mc2d.generators.blocks.blockdata.property.Property other) {
        return other instanceof CustomProperty customProperty && Arrays.equals(possibleValues, customProperty.possibleValues);
    }

    public static CustomProperty of(String name, String[] possibleValues) {
        return new CustomProperty(name, possibleValues);
    }

}
