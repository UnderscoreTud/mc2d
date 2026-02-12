package me.tud.mc2d.generators;

import com.palantir.javapoet.ClassName;

import java.io.File;
import java.net.URL;

public abstract class FileGenerator extends Generator<File> {

    protected FileGenerator(ClassName className, String resourceLocation) {
        super(className, resourceLocation);
    }

    @Override
    protected File input() {
        URL resource = JsonFileGenerator.class.getResource(resourceLocation);
        if (resource == null)
            return null;
        return new File(resource.getFile());
    }

}
