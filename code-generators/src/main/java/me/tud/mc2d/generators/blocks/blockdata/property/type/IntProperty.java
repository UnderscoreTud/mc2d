package me.tud.mc2d.generators.blocks.blockdata.property.type;

import com.google.common.base.Preconditions;
import com.palantir.javapoet.AnnotationSpec;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeName;
import me.tud.mc2d.generators.blocks.blockdata.property.Property;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class IntProperty extends PrimitiveProperty {

    private final int min, max;

    protected IntProperty(String name, int min, int max) {
        super(name, TypeName.INT);
        this.min = min;
        this.max = max;
    }

    @Override
    protected Integer parse(String value) {
        return Integer.parseInt(value);
    }

    @Override
    public String[] possibleValues(String source) {
        return IntStream.rangeClosed(min, max).mapToObj(String::valueOf).toArray(String[]::new);
    }

    @Override
    public AnnotationSpec[] typeAnnotations(String source) {
        return ArrayUtils.add(super.typeAnnotations(source), AnnotationSpec.builder(Range.class)
                .addMember("from", "$L", min)
                .addMember("to", "$L", max)
                .build());
    }

    @Override
    public boolean canMerge(Property other) {
        return other instanceof IntProperty;
    }

    @Override
    protected void visitSetter(String source, CodeBlock.Builder builder) {
        builder.addStatement("$1T.checkArgument($2L <= $3N && $3N <= $4L, \"Value must be in [$2L, $4L], got \" + $3N)", Preconditions.class, min, fieldName(), max);
    }

    @Override
    protected void visitToIndex(String source, CodeBlock.Builder builder) {
        builder.addStatement("return this.$N", fieldName());
    }

    @Override
    protected void visitFromIndex(String source, CodeBlock.Builder builder) {
        builder.addStatement("this.$N(index)", fieldName());
    }

    @Override
    protected void visitFromString(String source, CodeBlock.Builder builder) {
        builder.addStatement("this.$N($T.parseInt(value))", fieldName(), Integer.class);
    }

    public static @Nullable IntProperty of(String name, String[] values) {
        int[] ints = Arrays.stream(values)
                .map(IntProperty::parseInt)
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
        if (ints.length != values.length)
            return null;
        return new IntProperty(name, ints[0], ints[ints.length - 1]);
    }

    private static Integer parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException _) {
            return null;
        }
    }

}
