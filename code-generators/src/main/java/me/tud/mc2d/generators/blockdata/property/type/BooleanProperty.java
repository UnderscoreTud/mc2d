package me.tud.mc2d.generators.blockdata.property.type;

import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeName;
import me.tud.mc2d.generators.blockdata.property.Property;
import org.jetbrains.annotations.Nullable;

public class BooleanProperty extends PrimitiveProperty {

    protected BooleanProperty(String name) {
        super(name, TypeName.BOOLEAN);
    }

    @Override
    protected Boolean parse(String value) {
        return Boolean.parseBoolean(value);
    }

    @Override
    public String[] possibleValues(String source) {
        return new String[]{"true", "false"};
    }

    @Override
    public boolean canMerge(Property other) {
        return other instanceof BooleanProperty;
    }

    @Override
    protected void visitToIndex(String source, CodeBlock.Builder builder) {
        builder.addStatement("return this.$N ? 0 : 1", fieldName());
    }

    @Override
    protected void visitFromIndex(String source, CodeBlock.Builder builder) {
        builder.addStatement("this.$N(index == 0)", fieldName());
    }

    @Override
    protected void visitFromString(String source, CodeBlock.Builder builder) {
        builder.addStatement("this.$N($T.parseBoolean(value))", fieldName(), Boolean.class);
    }

    public static @Nullable BooleanProperty of(String name, String[] values) {
        if (values.length != 2)
            return null;
        for (String value : values) {
            if (!isBool(value))
                return null;
        }
        return new BooleanProperty(name);
    }

    private static boolean isBool(String value) {
        return value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false");
    }

}
