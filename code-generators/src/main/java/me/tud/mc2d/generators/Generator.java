package me.tud.mc2d.generators;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.palantir.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public abstract class Generator {

    protected static final JsonMapper MAPPER = JsonMapper.builder()
            .enable(JsonParser.Feature.ALLOW_COMMENTS)
            .enable(JsonReadFeature.ALLOW_TRAILING_COMMA)
            .enable(JsonReadFeature.ALLOW_SINGLE_QUOTES)

            .propertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)

            .enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)
            
            .disable(DeserializationFeature.ACCEPT_FLOAT_AS_INT)
            .enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)

            .defaultPropertyInclusion(JsonInclude.Value.ALL_NON_NULL)
            .build();

    public static final MethodSpec PRIVATE_CONSTRUCTOR = MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PRIVATE)
            .build();
    
    public static final MethodSpec PROTECTED_CONSTRUCTOR = MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PROTECTED)
            .build();

    public final void run(String resource, String[] args) throws Exception {
        File outputDir = null;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--output") && i + 1 < args.length)
                outputDir = new File(args[++i]);
        }

        if (outputDir == null)
            throw new IllegalArgumentException("Missing --output <dir>");

        System.out.println("Running generator " + getClass().getName());
        run(resource, outputDir);
    }

    public void run(String resource, File outputDir) throws Exception {
        GeneratedType[] generated = generate(resource);
        if (generated == null || generated.length == 0) {
            System.err.println("Generator " + getClass().getName() + " didn't generate any classes");
            return;
        }

        for (GeneratedType generatedType : generated) {
            JavaFile.builder(generatedType.packageName(), generatedType.type())
                    .indent("    ")
                    .skipJavaLangImports(true)
                    .build().writeTo(outputDir);
        }
    }

    public abstract GeneratedType[] generate(String resource) throws IOException;

    protected static InputStream stream(String resource) throws IOException {
        InputStream stream = Generator.class.getResourceAsStream(resource);
        if (stream == null)
            throw new IOException("Resource not found: " + resource);
        return stream;
    }

    protected static File file(String resource) throws IOException {
        URL url = Generator.class.getResource(resource);
        if (url == null)
            throw new IOException("Resource not found: " + resource);
        return new File(url.getFile());
    }

}
