package me.tud.mc2d.generators.blocks.blockdata;

import com.palantir.javapoet.*;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.Generator;
import me.tud.mc2d.generators.blocks.Blocks;
import me.tud.mc2d.generators.blocks.BlocksGenerator;
import me.tud.mc2d.generators.blocks.blockdata.property.Property;
import me.tud.mc2d.generators.util.Imports;
import me.tud.mc2d.generators.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.ApiStatus;

import javax.lang.model.element.Modifier;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static me.tud.mc2d.generators.Generator.PRIVATE_CONSTRUCTOR;

public record BlockData(String name, ClassName className, String[] properties, Map<String, String> defaultValues) {

    private static final Map<String, BlockData> BLOCK_DATA = new HashMap<>();

    public static final String PACKAGE = "me.tud.mc2d.world.blockdata";

    public BlockData(String name, String[] properties, Map<String, String> defaultValues) {
        this(
                name,
                ClassName.get(PACKAGE, StringUtils.snakeToPascal(StringUtils.cleanNamespacedKey(name) + "Data")),
                properties,
                defaultValues
        );
    }

    public GeneratedType generate() {
        Property[] properties = Arrays.stream(this.properties).map(Property::get).toArray(Property[]::new);

        TypeSpec.Builder builder = TypeSpec.classBuilder(className)
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .superclass(Imports.BLOCK_DATA)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addAnnotation(ApiStatus.Internal.class)
                        .addParameter(int.class, "startingID")
                        .addStatement("super(startingID)")
                        .build());

        CodeBlock.Builder offsetIDCode = CodeBlock.builder();
        offsetIDCode.addStatement("int id = 0");

        CodeBlock.Builder loadFromStringCode = CodeBlock.builder();

        CodeBlock.Builder toStringCode = CodeBlock.builder();
        toStringCode.add("return \"$N[", className.simpleName());

        for (int i = 0, propertiesLength = properties.length; i < propertiesLength; i++) {
            Property property = properties[i];
            boolean last = i == propertiesLength - 1;
            property.visit(name, builder, defaultValues.get(property.name()));

            offsetIDCode.addStatement("id = id * $N + $N()", property.radixField(), property.toIndexMethod());

            loadFromStringCode.beginControlFlow("if (properties.containsKey($S))", property.name())
                    .addStatement("$N(properties.get($S))", property.fromStringMethod(), property.name())
                    .endControlFlow();

            toStringCode.add("$N=\" + $T.valueOf($N).toLowerCase($T.ENGLISH) + \"" + (last ? "" : ";"),
                    property.name(), String.class, property.fieldName(), Locale.class);
        }
        offsetIDCode.addStatement("return id");
        toStringCode.add("]\";");

        CodeBlock.Builder loadFromOffsetCode = CodeBlock.builder();
        for (int i = properties.length - 1; i >= 0; i--) {
            Property property = properties[i];
            loadFromOffsetCode.addStatement("$1N(id % $2N); id /= $2N", property.fromIndexMethod(), property.radixField());
        }

        builder.addField(FieldSpec.builder(int.class, "MAX_OFFSET", Modifier.STATIC, Modifier.FINAL)
                .initializer(Arrays.stream(properties)
                        .map(Property::radixField)
                        .collect(Collectors.joining(" * ")) + " - 1")
                .build());

        builder.addMethod(MethodSpec.methodBuilder("maxOffset")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(Override.class)
                .returns(int.class)
                .addStatement("return MAX_OFFSET")
                .build());

        builder.addMethod(MethodSpec.methodBuilder("offsetID")
                .addAnnotation(Override.class)
                .returns(int.class)
                .addCode(offsetIDCode.build())
                .build());

        builder.addMethod(MethodSpec.methodBuilder("loadFromOffset")
                .addAnnotation(Override.class)
                .addParameter(int.class, "id")
                .addCode(loadFromOffsetCode.build())
                .build());

        builder.addMethod(MethodSpec.methodBuilder("load")
                .addAnnotation(Override.class)
                .addModifiers(Modifier.PUBLIC)
                .addParameter(ParameterizedTypeName.get(Map.class, String.class, String.class), "properties")
                .addCode(loadFromStringCode.build())
                .build());

        builder.addMethod(MethodSpec.methodBuilder("toString")
                .addModifiers(Modifier.PUBLIC)
                .addAnnotation(Override.class)
                .returns(String.class)
                .addCode(toStringCode.build())
                .build());

        return new GeneratedType(BlocksGenerator.class, className.packageName(), builder.build());
    }

    public static void handle(String name, Map<String, String[]> properties, Map<String, String> defaultValues) {
        if (properties == null || properties.isEmpty() || BLOCK_DATA.containsKey(name))
            return;
        properties.forEach((property, values) -> Property.handle(name, property, values));
        BLOCK_DATA.put(name, new BlockData(name, properties.keySet().toArray(new String[0]), defaultValues));
    }

    public static BlockData of(String name) {
        return BLOCK_DATA.getOrDefault(name, new BlockData("minecraft:block", new String[0], Collections.emptyMap()));
    }
    
    public static GeneratedType[] generateBlockData(List<Blocks.Entry> entries) {
        return ArrayUtils.add(
                BLOCK_DATA.values().parallelStream().map(BlockData::generate).toArray(GeneratedType[]::new),
                generateBlockDataLookup(entries)
        );
    }

    private static GeneratedType generateBlockDataLookup(List<Blocks.Entry> entries) {
        String lookupTableName = "LOOKUP_TABLE";
        ClassName lookupClass = ClassName.get(PACKAGE, "BlockDataLookup");
        ClassName infoClass = lookupClass.nestedClass("Info");
        ParameterizedTypeName blockDataSupplierType = ParameterizedTypeName.get(
                ClassName.get(Supplier.class),
                Imports.BLOCK_DATA
        );

        TypeSpec.Builder builder = TypeSpec.classBuilder(lookupClass)
                .addModifiers(Modifier.FINAL)
                .addMethod(PRIVATE_CONSTRUCTOR)
                .addMethod(MethodSpec.methodBuilder("lookup")
                        .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                        .addParameter(int.class, "id")
                        .returns(Imports.BLOCK_DATA)
                        .addCode(CodeBlock.builder()
                                .addStatement("int index = $T.binarySearch($N, new $T(id, null))", Arrays.class, lookupTableName, infoClass)
                                .addStatement("index = index < 0 ? (-index - 2) : index")
                                .beginControlFlow("if (index < 0)")
                                .addStatement("throw new $T($S + $N)", IllegalArgumentException.class, "id smaller than first entry: ", "id")
                                .endControlFlow()
                                .addStatement("$T base = $N[index].factory.get()", Imports.BLOCK_DATA, lookupTableName)
                                .addStatement("base.load(id)")
                                .addStatement("return base")
                                .build())
                        .build())
                .addType(TypeSpec.classBuilder(infoClass)
                        .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
                        .addSuperinterface(ParameterizedTypeName.get(ClassName.get(Comparable.class), infoClass))
                        .addField(int.class, "id", Modifier.PRIVATE, Modifier.FINAL)
                        .addField(blockDataSupplierType, "factory", Modifier.PRIVATE, Modifier.FINAL)
                        .addMethod(MethodSpec.constructorBuilder()
                                .addModifiers(Modifier.PRIVATE)
                                .addParameter(int.class, "id")
                                .addParameter(blockDataSupplierType, "factory")
                                .addCode(CodeBlock.builder()
                                        .addStatement("this.$1N = $1N", "id")
                                        .addStatement("this.$1N = $1N", "factory")
                                        .build())
                                .build())
                        .addMethod(MethodSpec.methodBuilder("compareTo")
                                .addAnnotation(Override.class)
                                .addModifiers(Modifier.PUBLIC)
                                .returns(int.class)
                                .addParameter(infoClass, "other")
                                .addCode("return $T.compare(id, other.id);", Integer.class)
                                .build())
                        .build());

        CodeBlock.Builder lookupArray = CodeBlock.builder()
                .add("{\n").indent().indent();
        entries.forEach(entry -> lookupArray.add("new $1T($3L, () -> new $2T($3L)),\n",
                infoClass, entry.blockData().className(), entry.block().states()[0].id()));
        lookupArray.unindent().unindent().add("}");
        builder.addField(FieldSpec.builder(ArrayTypeName.of(infoClass), lookupTableName, Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL)
                .initializer(lookupArray.build())
                .build());
        return new GeneratedType(BlocksGenerator.class, lookupClass.packageName(), builder.build());
    }

}
