package me.tud.mc2d.chunk.data;

import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

import java.util.BitSet;
import java.util.List;

public record LightData(
        BitSet skyLightMask,
        BitSet blockLightMask,
        BitSet emptySkyLightMask,
        BitSet emptyBlockLightMask,
        List<byte[]> skyLight,
        List<byte[]> blockLight
) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeBitSet(skyLightMask)
                .writeBitSet(blockLightMask)
                .writeBitSet(emptySkyLightMask)
                .writeBitSet(emptyBlockLightMask)
                .writeCollection(skyLight, FriendlyByteBuf::writeByteArray)
                .writeCollection(blockLight, FriendlyByteBuf::writeByteArray);
    }

}
