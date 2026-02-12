package me.tud.mc2d.generators;

import com.palantir.javapoet.*;

import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.time.Instant;

public abstract class Generator<T> {

    protected static final MethodSpec PRIVATE_CONSTRUCTOR = MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PRIVATE)
            .build();
    
    protected static final MethodSpec PROTECTED_CONSTRUCTOR = MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PROTECTED)
            .build();
    
    protected final ClassName className;
    protected final String resourceLocation;

    protected Generator(ClassName className, String resourceLocation) {
        this.className = className;
        this.resourceLocation = resourceLocation;
    }

    public final void run(String[] args) throws Exception {
        File outputDir = null;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--output") && i + 1 < args.length)
                outputDir = new File(args[++i]);
        }

        if (outputDir == null)
            throw new IllegalArgumentException("Missing --output <dir>");

        run(outputDir);
    }

    public void run(File outputDir) throws Exception {
        T input = input();
        if (input == null)
            throw new IOException("Resource not found: " + resourceLocation);
        try {
            TypeSpec generated = generate(input);
            if (generated == null) {
                System.err.println(getClass() + " didn't produce a generated class");
                return;
            }
            JavaFile.builder(className.packageName(), generated)
                    .indent("    ")
                    .build().writeTo(outputDir);
        } finally {
            if (input instanceof AutoCloseable closeable)
                closeable.close();
        }
    }

    protected abstract T input();

    public abstract TypeSpec generate(T t) throws IOException;

    protected AnnotationSpec generatedAnnotation() {
        return AnnotationSpec.builder(Generated.class)
                .addMember("value", "$S", getClass().getName())
                .addMember("date", "$S", Instant.now().toString())
                .build();
    }

}
