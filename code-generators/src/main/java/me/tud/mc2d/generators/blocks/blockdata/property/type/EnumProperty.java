package me.tud.mc2d.generators.blocks.blockdata.property.type;

import com.google.common.base.Preconditions;
import com.palantir.javapoet.*;
import lombok.Getter;
import me.tud.mc2d.generators.blocks.blockdata.property.Property;
import me.tud.mc2d.generators.util.StringUtils;
import org.jetbrains.annotations.Nullable;

import javax.lang.model.element.Modifier;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

@Getter
public class EnumProperty extends TypeProperty {

    private final String[] possibleValues;
    private final String maskField;
    private final String indexMethod;

    protected EnumProperty(String name, ClassName type, String[] possibleValues) {
        super(name, type);
        this.possibleValues = possibleValues;
        this.maskField = StringUtils.camelToScreamingSnake(name) + "_ALLOWED_MASK";
        this.indexMethod = StringUtils.snakeToCamel(name) + "Index";
    }

    @Override
    public String[] possibleValues(String source) {
        return possibleValues;
    }

    @Override
    public AnnotationSpec[] typeAnnotations(String source) {
        ClassName name = (ClassName) type();
        return new AnnotationSpec[]{AnnotationSpec.builder(name.nestedClass("Values"))
                .addMember("value", "{$L}", Arrays.stream(possibleValues)
                        .map(value -> name.simpleName() + "." + value.toUpperCase(Locale.ENGLISH))
                        .collect(Collectors.joining(", ")))
                .build()};
    }

    @Override
    public void visit(String source, TypeSpec.Builder builder, @Nullable String defaultValue) {
        CodeBlock.Builder initializer = CodeBlock.builder();
        for (int i = 0; i < possibleValues.length; i++) {
            if (i != 0)
                initializer.indent().indent().add("\n| ");
            initializer.add("(1L << $T.$N.ordinal())", type(), possibleValues[i].toUpperCase(Locale.ENGLISH));
            if (i != 0)
                initializer.unindent().unindent();
        }
        builder.addField(FieldSpec.builder(long.class, maskField)
                .addModifiers(Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                .initializer(initializer.build())
                .build());
        super.visit(source, builder, defaultValue);
    }

    @Override
    protected void visitField(String source, CodeBlock.Builder builder, String defaultValue) {
        builder.add("$T.$N", type(), defaultValue.toUpperCase(Locale.ENGLISH));
    }

    @Override
    protected void visitSetter(String source, CodeBlock.Builder builder) {
        super.visitSetter(source, builder);
        builder.addStatement("$1T.checkArgument(($2N & (1L << $3N.ordinal())) != 0L, \"Invalid $4L: \" + $3N)", Preconditions.class, maskField, fieldName(), name());
    }

    @Override
    protected void visitToIndex(String source, CodeBlock.Builder builder) {
        builder.add("return switch (this.$N) {\n", fieldName()).indent();
        String[] values = possibleValues();
        for (int i = 0, valuesLength = values.length; i < valuesLength; i++)
            builder.addStatement("case $N -> $L", values[i].toUpperCase(Locale.ENGLISH), i);
        builder.addStatement("default -> throw new $T(\"Invalid $L: \" + $N)", IllegalArgumentException.class, name(), fieldName());
        builder.unindent().add("};");
    }

    @Override
    protected void visitFromIndex(String source, CodeBlock.Builder builder) {
        builder.add("this.$N(switch (index) {\n", fieldName()).indent();
        String[] values = possibleValues();
        for (int i = 0, valuesLength = values.length; i < valuesLength; i++)
            builder.addStatement("case $L -> $T.$N", i, type(), values[i].toUpperCase(Locale.ENGLISH));
        builder.addStatement("default -> throw new $T(\"Index must be between [0, $L], got \" + index)", IllegalArgumentException.class, values.length - 1);
        builder.unindent().add("});");
    }

    @Override
    protected void visitFromString(String source, CodeBlock.Builder builder) {
        builder.addStatement("this.$N($T.parse(value))", fieldName(), type(source));
    }

    @Override
    public boolean canMerge(Property other) {
        return other instanceof EnumProperty enumProperty && type().equals(enumProperty.type());
    }

}
