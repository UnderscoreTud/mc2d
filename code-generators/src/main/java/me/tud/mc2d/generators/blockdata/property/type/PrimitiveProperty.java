package me.tud.mc2d.generators.blockdata.property.type;

import com.palantir.javapoet.AnnotationSpec;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeName;

public abstract class PrimitiveProperty extends TypeProperty {

    protected PrimitiveProperty(String name, TypeName type) {
        super(name, type);
    }

    protected abstract Object parse(String value);

    @Override
    public AnnotationSpec[] typeAnnotations(String source) {
        return new AnnotationSpec[0];
    }

    @Override
    protected void visitField(String source, CodeBlock.Builder builder, String defaultValue) {
        builder.add("$L", parse(defaultValue));
    }

    @Override
    protected void visitSetter(String source, CodeBlock.Builder builder) {}

}
