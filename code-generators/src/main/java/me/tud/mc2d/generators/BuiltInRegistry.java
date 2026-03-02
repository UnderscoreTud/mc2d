package me.tud.mc2d.generators;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.TypeName;
import me.tud.mc2d.generators.util.Imports;

public abstract class BuiltInRegistry<E extends RegistryGenerator.Entry> extends RegistryGenerator<E> {

    protected static final String REGISTRIES_RESOURCE_LOCATION = "/registries.json";

    protected BuiltInRegistry(String id, ClassName registrySource) {
        this(id, registrySource, registrySource);
    }

    protected BuiltInRegistry(String id, String resource, ClassName registrySource) {
        this(id, resource, registrySource, registrySource);
    }

    protected BuiltInRegistry(String id, ClassName registrySource, TypeName exactRegistrySource) {
        this(id, id + ".json", registrySource, exactRegistrySource);
    }

    protected BuiltInRegistry(String id, String resource, ClassName registrySource, TypeName exactRegistrySource) {
        super(id, "/" + resource, Imports.BUILT_IN_REGISTRY, registrySource, exactRegistrySource);
    }

}
