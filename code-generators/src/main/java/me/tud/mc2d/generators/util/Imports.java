package me.tud.mc2d.generators.util;

import com.palantir.javapoet.ClassName;

public class Imports {
 
    public static final ClassName DIMENSION_TYPE = ClassName.get("me.tud.mc2d.dimension", "DimensionType");
    public static final ClassName SERVER = ClassName.get("me.tud.mc2d.network.server", "Server");
    public static final ClassName BUILT_IN_REGISTRY = ClassName.get("me.tud.mc2d.registry", "BuiltInRegistry");
    public static final ClassName DATA_DRIVEN_REGISTRY = ClassName.get("me.tud.mc2d.registry", "DataDrivenRegistry");
    public static final ClassName REGISTRY_KEY = ClassName.get("me.tud.mc2d.registry", "RegistryKey");
    public static final ClassName INT_PROVIDER = ClassName.get("me.tud.mc2d.util", "IntProvider");
    public static final ClassName NAMESPACED_KEY = ClassName.get("me.tud.mc2d.util", "NamespacedKey");

}
