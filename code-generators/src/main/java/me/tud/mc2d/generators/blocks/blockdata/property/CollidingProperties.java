package me.tud.mc2d.generators.blocks.blockdata.property;

import com.palantir.javapoet.AnnotationSpec;
import com.palantir.javapoet.CodeBlock;
import com.palantir.javapoet.TypeName;
import com.palantir.javapoet.TypeSpec;
import lombok.Getter;
import me.tud.mc2d.generators.GeneratedType;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

@Getter
public class CollidingProperties extends Property {

    private final Property fallback;
    private final Map<String, Property> properties = new HashMap<>();
    private boolean shared = true;

    public CollidingProperties(String name, Property fallback) {
        super(name);
        this.fallback = fallback;
        insert(null, fallback);
    }

    public Property property(String source) {
        return properties.getOrDefault(source, fallback);
    }

    @Override
    public String @Nullable [] possibleValues(String source) {
        return property(source).possibleValues(source);
    }

    @Override
    public Property resolveCollision(String source, Property other) {
        if (other instanceof CollidingProperties)
            throw new IllegalArgumentException("Attempted to resolve two colliding properties: " + this + " | " + other);
        for (Property property : properties.values()) {
            if (shared && !property.canMerge(other))
                shared = false;
        }
        insert(source, other);
        return this;
    }

    private void insert(String source, Property property) {
        property.parent = this;
        properties.put(source, property);
    }

    @Override
    public TypeName type(String source) {
        return property(source).type(source);
    }

    @Override
    public boolean canMerge(Property other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AnnotationSpec[] typeAnnotations(String source) {
        return property(source).typeAnnotations(source);
    }

    @Override
    public GeneratedType[] generateShared() {
        if (!shared())
            return new GeneratedType[0];
        return property(null).generateShared();
    }

    @Override
    public void visit(String source, TypeSpec.Builder builder, @Nullable String defaultValue) {
        property(source).visit(source, builder, defaultValue);
    }

    @Override
    protected void visitField(String source, CodeBlock.Builder builder, String defaultValue) {
        property(source).visitField(source, builder, defaultValue);
    }

    @Override
    protected void visitGetter(String source, CodeBlock.Builder builder) {
        property(source).visitGetter(source, builder);
    }

    @Override
    protected void visitSetter(String source, CodeBlock.Builder builder) {
        property(source).visitSetter(source, builder);
    }

    @Override
    protected void visitToIndex(String source, CodeBlock.Builder builder) {
        property(source).visitToIndex(source, builder);
    }

    @Override
    protected void visitFromIndex(String source, CodeBlock.Builder builder) {
        property(source).visitFromIndex(source, builder);
    }

    @Override
    protected void visitFromString(String source, CodeBlock.Builder builder) {
        property(source).visitFromString(source, builder);
    }

}
