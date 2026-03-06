package me.tud.mc2d.generators.instruction;

import com.fasterxml.jackson.databind.node.JsonNodeType;
import org.machinemc.nbt.*;

import static me.tud.mc2d.generators.instruction.Instructions.*;

public final class NBTInstructions {

    public static final Instruction NBT = (ctx, node, out) -> {
        switch (node.getNodeType()) {
            case STRING -> NBTInstructions.STRING_TAG.apply(ctx, node, out);
            case BOOLEAN -> NBTInstructions.BOOLEAN_TAG.apply(ctx, node, out);
            case NUMBER -> NBTInstructions.NUMBER_TAG.apply(ctx, node, out);
            case ARRAY -> NBTInstructions.LIST_TAG.apply(ctx, node, out);
            case OBJECT -> NBTInstructions.COMPOUND_TAG.apply(ctx, node, out);
            default -> {}
        }
    };

    public static final Instruction STRING_TAG = tag(NBTString.class, STRING);

    public static final Instruction BOOLEAN_TAG = tag(NBTByte.class, BOOLEAN);
    
    public static final Instruction NUMBER_TAG = (ctx, node, out) -> {
        ctx.expect(node, JsonNodeType.NUMBER);
        (node.isInt() ? tag(NBTInt.class, INTEGER) : tag(NBTDouble.class, DOUBLE)).apply(ctx, node, out);
    };

    public static final Instruction LIST_TAG = tag(NBTList.class, listOf(NBT));

    public static final Instruction COMPOUND_TAG = tag(NBTCompound.class, mapOf(STRING, NBT));

    private static Instruction tag(Class<? extends NBT<?>> type, Instruction instruction) {
        return text("new $T(", type).append(instruction).append(")");
    }

    private NBTInstructions() {}

}
