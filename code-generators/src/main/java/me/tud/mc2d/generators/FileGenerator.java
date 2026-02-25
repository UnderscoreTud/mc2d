package me.tud.mc2d.generators;

import com.palantir.javapoet.ClassName;

import java.io.File;
import java.net.URL;

public abstract class FileGenerator extends Generator<File> {

    @Override
    protected File input(String location) {
        URL resource = JsonFileGenerator.class.getResource(location);
        if (resource == null)
            return null;
        return new File(resource.getFile());
    }

}
