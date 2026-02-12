package me.tud.mc2d.generators.util;

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
        return uncapitalize(Arrays.stream(snake.split("_")).map(StringUtils::capitalize).collect(Collectors.joining()));
    }

    public static String camelToScreamingSnake(String camel) {
        return CAMEL_CASE_PATTERN.matcher(camel).replaceAll("$1_$2").toUpperCase(Locale.ENGLISH);
    }

}
