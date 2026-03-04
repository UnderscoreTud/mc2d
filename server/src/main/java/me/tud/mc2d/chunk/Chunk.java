package me.tud.mc2d.chunk;

import com.google.common.base.Preconditions;
import lombok.Getter;
import lombok.ToString;
import me.tud.mc2d.chunk.data.ChunkData;
import me.tud.mc2d.chunk.data.LightData;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayChunkDataAndUpdateLight;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.world.block.Block;
import me.tud.mc2d.world.blockdata.BlockData;
import org.jetbrains.annotations.Range;

import java.util.BitSet;

@Getter
@ToString
public class Chunk {

    public static final int SECTION_DIMENSION = 16;

    private final @ToString.Exclude Server server;

    private final int x, z;
    private final int minY, worldHeight;

    private final ChunkSection[] sections;

    public Chunk(Server server, DimensionType dimensionType, int x, int z) {
        this.server = server;
        this.x = x;
        this.z = z;
        this.minY = dimensionType.minY();
        this.worldHeight = dimensionType.height();
        this.sections = new ChunkSection[Math.ceilDiv(worldHeight, SECTION_DIMENSION)];
        for (int i = 0; i < sections.length; i++)
            sections[i] = new ChunkSection(this);
    }

    public int maxY() {
        return minY + worldHeight - 1;
    }

    public ChunkData chunkData() {
        return new ChunkData(new Heightmap[0], sections, new Object[0]);
    }

    public LightData lightData() {
        // TODO proper implementation
        return new LightData(
                new BitSet(),
                new BitSet(),
                new BitSet(),
                new BitSet(),
                new byte[0][2048],
                new byte[0][2048]
        );
    }

    public ClientboundPlayChunkDataAndUpdateLight createChunkPacket() {
        return new ClientboundPlayChunkDataAndUpdateLight(x, z, chunkData(), lightData());
    }

    public BlockData getBlock(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z) {
        return sectionFromY(y).blockStates().get(x, localY(y), z);
    }

    public Block<?> getBlockType(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z) {
        return getBlock(x, y, z).blockType();
    }

    public void setBlock(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z, Block<?> block) {
        setBlock(x, y, z, block.createBlockData());
    }

    public void setBlock(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z, BlockData blockData) {
        sectionFromY(y).blockStates().set(x, localY(y), z, blockData);
    }

    private int localY(int y) {
        return (y - minY) % SECTION_DIMENSION;
    }

    public ChunkSection sectionFromY(int y) {
        Preconditions.checkArgument(y >= minY && y <= maxY(), "Y must be in [" + minY + ", " + maxY() + "], got " + y);
        int index = (y - minY) / SECTION_DIMENSION;
        return sections[index];
    }

}
