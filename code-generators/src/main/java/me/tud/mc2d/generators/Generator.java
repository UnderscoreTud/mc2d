package me.tud.mc2d.generators;

import com.palantir.javapoet.*;

import javax.annotation.processing.Generated;
import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;

public abstract class Generator<T> {

    protected static final MethodSpec PRIVATE_CONSTRUCTOR = MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PRIVATE)
            .build();
    
    protected static final MethodSpec PROTECTED_CONSTRUCTOR = MethodSpec.constructorBuilder()
            .addModifiers(Modifier.PROTECTED)
            .build();

    public final void run(String resourceLocation, String[] args) throws Exception {
        File outputDir = null;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--output") && i + 1 < args.length)
                outputDir = new File(args[++i]);
        }

        if (outputDir == null)
            throw new IllegalArgumentException("Missing --output <dir>");

        System.out.println("Running generator " + getClass().getName());
        run(resourceLocation, outputDir);
    }

    public void run(String resourceLocation, File outputDir) throws Exception {
        T input = input(resourceLocation);
        if (input == null)
            throw new IOException("Resource not found: " + resourceLocation);
        try {
            GeneratedType[] generated = generate(input);
            if (generated == null || generated.length == 0) {
                System.err.println("Generator " + getClass().getName()+ " didn't generate any classes");
                return;
            }

            for (GeneratedType generatedType : generated) {
                JavaFile.builder(generatedType.packageName(), generatedType.type())
                        .indent("    ")
                        .skipJavaLangImports(true)
                        .build().writeTo(outputDir);
            }
        } finally {
            if (input instanceof AutoCloseable closeable)
                closeable.close();
        }
    }

    protected abstract T input(String location);

    public abstract GeneratedType[] generate(T t) throws IOException;

}
