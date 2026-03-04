package me.tud.mc2d.chunk.data;

import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

import java.util.BitSet;

public record LightData(
        BitSet skyLightMask,
        BitSet blockLightMask,
        BitSet emptySkyLightMask,
        BitSet emptyBlockLightMask,
        byte[][] skyLight,
        byte[][] blockLight
) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeBitSet(skyLightMask)
                .writeBitSet(blockLightMask)
                .writeBitSet(emptySkyLightMask)
                .writeBitSet(emptyBlockLightMask)
                .writeArray(skyLight, FriendlyByteBuf::writeByteArray)
                .writeArray(blockLight, FriendlyByteBuf::writeByteArray);
    }

}
