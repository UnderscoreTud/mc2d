package me.tud.mc2d.generators.blocks.blockdata.property;

import com.google.common.base.Preconditions;
import com.palantir.javapoet.*;
import lombok.Getter;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.blocks.BlocksGenerator;
import me.tud.mc2d.generators.blocks.blockdata.BlockData;
import me.tud.mc2d.generators.blocks.blockdata.property.type.TypeProperty;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;
import org.jetbrains.annotations.Nullable;

import javax.lang.model.element.Modifier;
import java.util.*;
import java.util.stream.Collectors;

@Getter
public abstract class Property {

    public static final String PACKAGE = BlockData.PACKAGE + ".properties";
    private static final Map<String, Property> PROPERTIES = new HashMap<>();

    private final String name;
    private final String fieldName;
    private final String radixField;
    private final String toIndexMethod;
    private final String fromIndexMethod;
    private final String fromStringMethod;

    protected @Nullable CollidingProperties parent;

    protected Property(String name) {
        this.name = name;
        this.fieldName = StringUtils.defendIdentifier(StringUtils.snakeToCamel(name));
        this.radixField = StringUtils.camelToScreamingSnake(fieldName) + "_RADIX";
        this.toIndexMethod = fieldName + "ToIndex";
        this.fromIndexMethod = fieldName + "FromIndex";
        this.fromStringMethod = fieldName + "FromString";
    }

    public abstract String[] possibleValues(String source);

    public Property resolveCollision(String source, Property other) {
        CollidingProperties resolution = new CollidingProperties(name, this);
        resolution.properties().put(source, other);
        return resolution;
    }

    public abstract TypeName type(String source);

    public abstract boolean canMerge(Property other);

    public boolean shared() {
        return parent != null && parent.shared();
    }

    public AnnotationSpec[] typeAnnotations(String source) {
        return new AnnotationSpec[]{AnnotationSpec.builder(Imports.PROPERTY_VALUES) 
                .addMember("value", "{$L}", Arrays.stream(possibleValues(source))
                        .map(value -> "\"" + value + "\"")
                        .collect(Collectors.joining(", ")))
                .build()};
    }

    public ClassName interfaceName() {
        return ClassName.get(PACKAGE, "Has" + StringUtils.snakeToPascal(name));
    }

    private MethodSpec.Builder getter(TypeName type) {
        return MethodSpec.methodBuilder(StringUtils.defendIdentifier(StringUtils.snakeToCamel(name)))
                .addModifiers(Modifier.PUBLIC)
                .returns(type.annotated());
    }

    private MethodSpec.Builder setter(TypeName type) {
        String name = StringUtils.defendIdentifier(StringUtils.snakeToCamel(this.name));
        return MethodSpec.methodBuilder(name)
                .addModifiers(Modifier.PUBLIC)
                .returns(void.class)
                .addParameter(ParameterSpec.builder(type, name).build());
    }

    public GeneratedType[] generateShared() {
        ClassName interfaceName = interfaceName();
        TypeName type = type(null);
        return new GeneratedType[]{new GeneratedType(BlocksGenerator.class, PACKAGE, TypeSpec.interfaceBuilder(interfaceName)
                .addModifiers(Modifier.PUBLIC)
                .addMethod(getter(type).addModifiers(Modifier.ABSTRACT).build())
                .addMethod(setter(type).addModifiers(Modifier.ABSTRACT).build())
                .build())};
    }

    public void visit(String source, TypeSpec.Builder builder, @Nullable String defaultValue) {
        TypeName type = type(source).annotated(typeAnnotations(source));

        CodeBlock.Builder fieldInitializer = CodeBlock.builder();
        if (defaultValue != null)
            visitField(source, fieldInitializer, defaultValue); 
        builder.addField(FieldSpec.builder(type, fieldName, Modifier.PRIVATE).initializer(fieldInitializer.build()).build());

        builder.addField(FieldSpec.builder(int.class, radixField, Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                .initializer(String.valueOf(possibleValues(source).length))
                .build());

        CodeBlock.Builder getterCode = CodeBlock.builder();
        visitGetter(source, getterCode);
        MethodSpec.Builder getter = getter(type).addCode(getterCode.addStatement("return this.$N", fieldName).build());

        CodeBlock.Builder setterCode = CodeBlock.builder();
        visitSetter(source, setterCode);
        MethodSpec.Builder setter = setter(type).addCode(setterCode.addStatement("this.$1N = $1N", fieldName).build());

        if (shared()) {
            builder
                    .addSuperinterface(interfaceName())
                    .addMethod(getter.addAnnotation(Override.class).build())
                    .addMethod(setter.addAnnotation(Override.class).build());
        } else {
            builder.addMethod(getter.build()).addMethod(setter.build());
        }

        CodeBlock.Builder toIndexCode = CodeBlock.builder();
        visitToIndex(source, toIndexCode);
        builder.addMethod(MethodSpec.methodBuilder(toIndexMethod)
                .addModifiers(Modifier.PRIVATE)
                .returns(int.class)
                .addCode(toIndexCode.build())
                .build());

        CodeBlock.Builder fromIndexCode = CodeBlock.builder();
        visitFromIndex(source, fromIndexCode);
        builder.addMethod(MethodSpec.methodBuilder(fromIndexMethod)
                .addModifiers(Modifier.PRIVATE)
                .addParameter(int.class, "index")
                .addCode(fromIndexCode.build())
                .build());

        CodeBlock.Builder fromStringCode = CodeBlock.builder();
        visitFromString(source, fromStringCode);
        builder.addMethod(MethodSpec.methodBuilder(fromStringMethod)
                .addModifiers(Modifier.PRIVATE)
                .addParameter(String.class, "value")
                .addCode(fromStringCode.build())
                .build());
    }

    protected abstract void visitField(String source, CodeBlock.Builder builder, String defaultValue);

    protected void visitGetter(String source, CodeBlock.Builder builder) {}

    protected void visitSetter(String source, CodeBlock.Builder builder) {
        builder.addStatement("$1T.checkNotNull($2N, $2S)", Preconditions.class, fieldName);
    }

    protected abstract void visitToIndex(String source, CodeBlock.Builder builder);

    protected abstract void visitFromIndex(String source, CodeBlock.Builder builder);

    protected abstract void visitFromString(String source, CodeBlock.Builder builder);

    public static Property get(String name) {
        return PROPERTIES.get(name);
    }

    public static void handle(String source, String name, String[] possibleValues) {
        Property property = Property.of(name, possibleValues);

        Property colliding = PROPERTIES.putIfAbsent(name, property);
        if (colliding == null)
            return;

        Property resolution = colliding.resolveCollision(source, property);
        if (!colliding.equals(resolution))
            PROPERTIES.put(name, resolution);
    }

    public static GeneratedType[] generateSharedProperties() {
        List<GeneratedType> generated = new ArrayList<>();
        for (Property property : PROPERTIES.values()) {
            if (property instanceof CollidingProperties properties)
                generated.addAll(Arrays.asList(properties.generateShared()));
        }
        return generated.toArray(new GeneratedType[0]);
    }

    private static Property of(String name, String[] possibleValues) {
        Property property = TypeProperty.of(name, possibleValues);
        if (property != null)
            return property;

        property = TypeProperty.of(name, possibleValues);
        if (property != null)
            return property;

        return CustomProperty.of(name, possibleValues);
    }

}
