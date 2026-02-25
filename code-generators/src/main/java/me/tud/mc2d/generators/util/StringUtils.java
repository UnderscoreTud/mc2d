package me.tud.mc2d.generators.util;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringUtils {

    public static final Pattern CAMEL_CASE_PATTERN = Pattern.compile("([a-z])([A-Z])");

    public static String capitalize(String input) {
        if (input == null || input.isBlank())
            return input;
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }
    
    public static String uncapitalize(String input) {
        if (input == null || input.isBlank())
            return input;
        return Character.toLowerCase(input.charAt(0)) + input.substring(1);
    }
    
    public static String snakeToCamel(String snake) {
        return uncapitalize(snakeToPascal(snake));
    }

    public static String snakeToPascal(String snake) {
        return Arrays.stream(snake.split("_")).map(StringUtils::capitalize).collect(Collectors.joining());
    }

    public static String camelToScreamingSnake(String camel) {
        return CAMEL_CASE_PATTERN.matcher(camel).replaceAll("$1_$2").toUpperCase(Locale.ENGLISH);
    }

    /**
     * Strips the namespace part of the namespaced key and replaces invalid Java identifier characters with '_'.
     * 
     * @param namespacedKey the namespaced key
     * @return the cleaned key
     * @see #stripNamespace(String) 
     */
    public static String cleanNamespacedKey(String namespacedKey) {
        String stripped = stripNamespace(namespacedKey).replaceAll("[^A-Za-z0-9_]", "_");
        return defendIdentifier(stripped);
    }

    /**
     * Strips the namespace part of the namespaced key.
     *
     * @param namespacedKey the namespaced key
     * @return the key
     * @see #cleanNamespacedKey(String) 
     */
    public static String stripNamespace(String namespacedKey) {
        int index = namespacedKey.indexOf(':');
        return index != -1 ? namespacedKey.substring(index + 1) : namespacedKey;
    }

    public static String defendIdentifier(String identifier) {
        if (identifier == null)
            return null;

        if (identifier.isBlank())
            return "_".repeat(Math.max(1, identifier.length()));

        if (Character.isDigit(identifier.charAt(0)) || SourceVersion.isKeyword(identifier))
            return "_" + identifier;

        return identifier;
    }

}
