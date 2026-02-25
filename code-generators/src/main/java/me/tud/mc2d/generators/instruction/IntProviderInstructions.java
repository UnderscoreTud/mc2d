package me.tud.mc2d.generators.instruction;

import me.tud.mc2d.generators.util.Imports;

import static me.tud.mc2d.generators.instruction.Instructions.*;

final class IntProviderInstructions {

    public static final Instruction INT_PROVIDER = DynamicInstruction.builder()
            .basedOn("type")
            .instruction("minecraft:constant", () -> IntProviderInstructions.CONSTANT)
            .instruction("minecraft:uniform", () -> IntProviderInstructions.UNIFORM)
            .instruction("minecraft:biased_to_bottom", () -> IntProviderInstructions.BIASED_TO_BOTTOM)
            .instruction("minecraft:clamped", () -> IntProviderInstructions.CLAMPED)
            .instruction("minecraft:clamped_normal", () -> IntProviderInstructions.CLAMPED_NORMAL)
            .instruction("minecraft:weighted_list", () -> IntProviderInstructions.WEIGHTED_LIST)
            .orElse((ctx, node, out) -> {
                if (!node.isInt())
                    throw ctx.exception("Unexpected value: " + ctx.describe(node));
                out.add("new $T($L)", Imports.INT_PROVIDER.nestedClass("Constant"), node.asInt());
            })
            .build();

    public static final Structure CONSTANT = Structure.constructor(Imports.INT_PROVIDER.nestedClass("Constant"))
            .instruction("value", INTEGER)
            .build();

    public static final Structure UNIFORM = Structure.constructor(Imports.INT_PROVIDER.nestedClass("Uniform"))
            .instruction("min_inclusive", INTEGER)
            .instruction("max_inclusive", INTEGER)
            .build();

    public static final Structure BIASED_TO_BOTTOM = Structure.constructor(Imports.INT_PROVIDER.nestedClass("BiasedToBottom"))
            .instruction("min_inclusive", INTEGER)
            .instruction("max_inclusive", INTEGER)
            .build();

    public static final Structure CLAMPED = Structure.constructor(Imports.INT_PROVIDER.nestedClass("Clamped"))
            .instruction("min_inclusive", INTEGER)
            .instruction("max_inclusive", INTEGER)
            .instruction("source", INT_PROVIDER)
            .build();

    public static final Structure CLAMPED_NORMAL = Structure.constructor(Imports.INT_PROVIDER.nestedClass("ClampedNormal"))
            .instruction("mean", FLOAT)
            .instruction("deviation", FLOAT)
            .instruction("min_inclusive", INTEGER)
            .instruction("max_inclusive", INTEGER)
            .build();

    private static final Structure WEIGHTED_LIST_ENTRY = Structure.constructor(Imports.INT_PROVIDER.nestedClass("WeightedList").nestedClass("Entry"))
            .instruction("data", INT_PROVIDER)
            .instruction("weight", INTEGER)
            .build();

    public static final Structure WEIGHTED_LIST = Structure.constructor(Imports.INT_PROVIDER.nestedClass("WeightedList"))
            .instruction("distribution", list(WEIGHTED_LIST_ENTRY))
            .build();

    private IntProviderInstructions() {}

}
