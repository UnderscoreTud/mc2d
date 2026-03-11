package me.tud.mc2d.chunk;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import me.tud.mc2d.chunk.palette.PalettedContainer;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;
import me.tud.mc2d.world.Biome;
import me.tud.mc2d.world.blockdata.BlockData;

@Data
@RequiredArgsConstructor
public class ChunkSection implements Writable {

    private final @ToString.Exclude Chunk source;

    private final PalettedContainer<BlockData> blockStates;
    private final PalettedContainer<Biome> biomes;

    public ChunkSection(Chunk source) {
        this.source = source;
        this.blockStates = PalettedContainer.blocks();
        this.biomes = PalettedContainer.biomes(source.biomeIDProvider());
    }

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeShort(blockStates.nonZeroElements())
                .write(blockStates)
                .write(biomes);
    }

}
