package me.tud.mc2d.chunk.data;

import me.tud.mc2d.chunk.ChunkSection;
import me.tud.mc2d.chunk.Heightmap;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

public record ChunkData(Heightmap[] heightmaps, ChunkSection[] sections, Object[] blockEntities) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeArray(heightmaps, FriendlyByteBuf::write);

        buf.writeByteArray(data());

        buf.writeVarInt(0); // TODO block entities
    }

    private byte[] data() {
        FriendlyByteBuf data = new FriendlyByteBuf();
        for (ChunkSection section : sections)
            data.write(section);
        return data.bytes();
    }

}
