/*
 * This file is part of Main.
 *
 * Main is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Main is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Main.
 * If not, see https://www.gnu.org/licenses/.
 */
package me.tud.mc2d.util;

import me.tud.mc2d.Main;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Consumer;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * Utility class for operations related to classes.
 * <p>
 * <a href="https://github.com/MachineMC/Main/blob/master/server/src/main/java/org/machinemc/server/utils/ClassUtils.java">Source</a>
 */
public final class ClassUtils {

    private ClassUtils() {
        throw new UnsupportedOperationException();
    }

    /**
     * Loads a class.
     * @param classObject class to load
     */
    public static void loadClass(final Class<?> classObject) {
        Objects.requireNonNull(classObject);
        try {
            Class.forName(classObject.getName(), true, Main.CLASS_LOADER);
        } catch (ClassNotFoundException ignored) { }
    }

    /**
     * Loads multiple classes from given package.
     * @param basePackage base package of the classes
     * @throws IOException if jar is invalid
     */
    public static void loadClasses(final String basePackage) throws IOException {
        loadClasses(basePackage, c -> {});
    }

    /**
     * Loads multiple classes from given package.
     * @param basePackage base package of the classes
     * @throws IOException if jar is invalid
     */
    public static void loadClasses(final String basePackage, Consumer<Class<?>> consumer) throws IOException {
        Objects.requireNonNull(basePackage);
        final List<String> classNames = getClassNames(basePackage);
        for (final String className : classNames) {
            try {
                consumer.accept(Class.forName(className, true, Main.CLASS_LOADER));
            } catch (ClassNotFoundException | ExceptionInInitializerError ignored) { }
        }
    }

    /**
     * Returns list of class names inside of a package.
     * @param basePackage base package of the classes
     * @return list of the class inside
     * @throws IOException if jar is invalid
     */
    public static List<String> getClassNames(final String basePackage) throws IOException {
        Objects.requireNonNull(basePackage);
        if (FileUtils.getSourceLocation().getName().endsWith(".jar"))
            return getJarClasses(basePackage);
        return getDirClasses(basePackage);
    }

    private static List<String> getJarClasses(final String basePackage) throws IOException {
        Objects.requireNonNull(basePackage);
        try (final JarFile jar = new JarFile(FileUtils.getSourceLocation())) {
            final String packagePath = basePackage.replace('.', '/') + "/";
            final List<String> classNames = new ArrayList<>();
            for (final Iterator<JarEntry> entries = jar.entries().asIterator(); entries.hasNext();) {
                final JarEntry entry = entries.next();
                if (entry.getName().startsWith(packagePath) && entry.getName().endsWith(".class"))
                    classNames.add(entry.getName()
                            .replace('/', '.')
                            .substring(0, entry.getName().length() - ".class".length())
                    );
            }
            return classNames;
        }
    }

    private static List<String> getDirClasses(final String basePackage) {
        Objects.requireNonNull(basePackage);
        final List<String> classNames = new ArrayList<>();
        final File parentDirectory = new File(FileUtils.getSourceLocation(), basePackage.replace('.', '/'));
        final String[] children = parentDirectory.list();
        if (children == null)
            return Collections.emptyList();
        for (final String child : children) {
            if (child.endsWith(".class")) {
                classNames.add(basePackage + '.' + child.substring(0, child.length() - ".class".length()));
            } else {
                classNames.addAll(getDirClasses(basePackage + '.' + child));
            }
        }
        return classNames;
    }

    public static <T> Class<T> asClass(Type type) {
        //noinspection unchecked
        return (Class<T>) switch (type) {
            case Class<?> cls -> cls;
            case ParameterizedType parameterized -> parameterized.getRawType();
            case GenericArrayType arrayType -> {
                List<Integer> dimensions = new LinkedList<>();
                Type currentType = arrayType;
                do {
                    currentType = ((GenericArrayType) currentType).getGenericComponentType();
                    dimensions.add(0);
                } while (!(currentType instanceof ParameterizedType));
                int[] dimensionsArray = new int[dimensions.size()];
                for (int i = 0; i < dimensionsArray.length; i++)
                    dimensionsArray[i] = dimensions.get(i);
                yield Array.newInstance(asClass(currentType), dimensionsArray).getClass();
            }
            default -> throw new IllegalStateException("Unexpected type: " + type);
        };
    }
}