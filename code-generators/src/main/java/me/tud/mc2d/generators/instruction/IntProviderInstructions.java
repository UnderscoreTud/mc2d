package me.tud.mc2d.generators.instruction;

import com.palantir.javapoet.CodeBlock;
import me.tud.mc2d.generators.util.Imports;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class IntProviderInstructions {

    private IntProviderInstructions() {}

    public static void intProvider(CodeBlock.Builder builder, Object object) {
        if (object instanceof Number number) {
            builder.add("new $T($L)", Imports.INT_PROVIDER.nestedClass("Constant"), number.intValue());
            return;
        }

        if (!(object instanceof Map<?, ?> map))
            return;

        if (!map.containsKey("type"))
            return;
        switch (String.valueOf(map.get("type")).toLowerCase(Locale.ENGLISH)) {
            case "minecraft:constant" -> constantInt(builder, map);
            case "minecraft:uniform" -> uniformInt(builder, map);
            case "minecraft:biased_to_bottom" -> biasedToBottom(builder, map);
            case "minecraft:clamped" -> clamped(builder, map);
            case "minecraft:clamped_normal" -> clampedNormal(builder, map);
            case "minecraft:weighted_list" -> weightedList(builder, map);
        }
    }

    public static void constantInt(CodeBlock.Builder builder, Map<?, ?> map) {
        builder.add("new $T($L)", Imports.INT_PROVIDER.nestedClass("Constant"), map.get("value"));
    }

    public static void uniformInt(CodeBlock.Builder builder, Map<?, ?> map) {
        builder.add("new $T($L, $L)", Imports.INT_PROVIDER.nestedClass("Uniform"), map.get("min_inclusive"), map.get("max_inclusive"));
    }

    public static void biasedToBottom(CodeBlock.Builder builder, Map<?, ?> map) {
        builder.add("new $T($L, $L)", Imports.INT_PROVIDER.nestedClass("BiasedToBottom"), map.get("min_inclusive"), map.get("max_inclusive"));
    }

    public static void clamped(CodeBlock.Builder builder, Map<?, ?> map) {
        builder.add("new $T($L, $L, ", Imports.INT_PROVIDER.nestedClass("Clamped"), map.get("min_inclusive"), map.get("max_inclusive"));
        intProvider(builder, map.get("source"));
        builder.add(")");
    }

    public static void clampedNormal(CodeBlock.Builder builder, Map<?, ?> map) {
        builder.add("new $T($L, $L, $L, $L)", Imports.INT_PROVIDER.nestedClass("ClampedNormal"), map.get("mean"), map.get("deviation"), map.get("min_inclusive"), map.get("max_inclusive"));
    }

    public static void weightedList(CodeBlock.Builder builder, Map<?, ?> map) {
        builder.add("new $T($T.of(", Imports.INT_PROVIDER.nestedClass("WeightedList"), List.class);
        Object[] distributions = (Object[]) map.get("distribution");
        for (int i = 0; i < distributions.length; i++) {
            if (i != 0)
                builder.add(", ");
            Map<?, ?> entry = (Map<?, ?>) distributions[i];
            builder.add("new $T(", Imports.INT_PROVIDER.nestedClass("WeightedList").nestedClass("Entry"));
            intProvider(builder, entry.get("data"));
            builder.add(", $L)", entry.get("weight"));
        }
        builder.add("))");
    }

}
