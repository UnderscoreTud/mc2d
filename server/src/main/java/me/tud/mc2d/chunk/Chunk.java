package me.tud.mc2d.chunk;

import com.google.common.base.Preconditions;
import lombok.Getter;
import lombok.ToString;
import me.tud.mc2d.chunk.data.ChunkData;
import me.tud.mc2d.chunk.data.LightData;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayChunkDataAndUpdateLight;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.util.IDProvider;
import me.tud.mc2d.world.Biome;
import me.tud.mc2d.world.block.Block;
import me.tud.mc2d.world.blockdata.BlockData;
import org.jetbrains.annotations.Range;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@Getter
@ToString
public class Chunk {

    public static final int SECTION_DIMENSION = 16;

    private final int x, z;
    private final int minY, worldHeight;

    private final IDProvider<Biome> biomeIDProvider;

    private final ChunkSection[] sections;
    private final LightSection[] lightSections;

    public Chunk(DimensionType dimensionType, Biome biome, int x, int z) {
        this(dimensionType.minY(), dimensionType.height(), biome, x, z);
    }

    public Chunk(int minY, int worldHeight, Biome biome, int x, int z) {
        this(minY, worldHeight, IDProvider.singleton(biome), x, z);
    }

    public Chunk(int minY, int worldHeight, IDProvider<Biome> biomeIDProvider, int x, int z) {
        this.x = x;
        this.z = z;
        this.biomeIDProvider = biomeIDProvider;
        this.minY = minY;
        this.worldHeight = worldHeight;
        this.sections = new ChunkSection[Math.ceilDiv(worldHeight, SECTION_DIMENSION)];
        for (int i = 0; i < sections.length; i++)
            sections[i] = new ChunkSection(this);

        this.lightSections = new LightSection[sections.length + 2]; // 2 extra sections;
                                                                    // one section above the world
                                                                    // and one section below the world
        for (int i = 0; i < lightSections.length; i++) {
            lightSections[i] = new LightSection();
            lightSections[i].fillSkyLight((byte) 15);
            lightSections[i].fillBlockLight((byte) 15);
        }
    }

    public int maxY() {
        return minY + worldHeight - 1;
    }

    public ChunkData chunkData() {
        return new ChunkData(new Heightmap[0], sections, new Object[0]);
    }

    public LightData lightData() {
        BitSet skyLightMask = new BitSet(lightSections.length);
        BitSet blockLightMask = new BitSet(lightSections.length);
        BitSet emptySkyLightMask = new BitSet(lightSections.length);
        BitSet emptyBlockLightMask = new BitSet(lightSections.length);

        List<byte[]> skyLights = new ArrayList<>();
        List<byte[]> blockLights = new ArrayList<>();
        for (int i = 0; i < lightSections.length; i++) {
            LightSection section = lightSections[i];
            if (section.skyLightEmpty()) {
                emptySkyLightMask.set(i);
            } else {
                skyLightMask.set(i);
                skyLights.add(section.skyLight().clone());
            }

            if (section.blockLightEmpty()) {
                emptyBlockLightMask.set(i);
            } else {
                blockLightMask.set(i);
                blockLights.add(section.blockLight().clone());
            }
        }

        return new LightData(skyLightMask, blockLightMask, emptySkyLightMask, emptyBlockLightMask, skyLights, blockLights);
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

    public void fillBlocks(Block<?> block) {
        fillBlocks(block.createBlockData());
    }

    public void fillBlocks(BlockData blockData) {
        for (ChunkSection section : sections)
            section.blockStates().fill(blockData);
    }

    public byte getSkyLight(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z) {
        return lightSectionFromY(y).getSkyLight(x, localY(y + SECTION_DIMENSION), z);
    }

    public byte getBlockLight(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z) {
        return lightSectionFromY(y).getBlockLight(x, localY(y + SECTION_DIMENSION), z);
    }

    public byte setSkyLight(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z, byte level) {
        return lightSectionFromY(y).setSkyLight(x, localY(y + SECTION_DIMENSION), z, level);
    }

    public byte setBlockLight(@Range(from = 0, to = 15) int x, int y, @Range(from = 0, to = 15) int z, byte level) {
        return lightSectionFromY(y).setBlockLight(x, localY(y + SECTION_DIMENSION), z, level);
    }

    public void fillSkyLight(byte level) {
        for (LightSection section : lightSections)
            section.fillSkyLight(level);
    }

    public void fillBlockLight(byte level) {
        for (LightSection section : lightSections)
            section.fillBlockLight(level);
    }

    private int localY(int y) {
        return (y - minY) % SECTION_DIMENSION;
    }

    public ChunkSection sectionFromY(int y) {
        Preconditions.checkArgument(y >= minY && y <= maxY(), "Y must be in [" + minY + ", " + maxY() + "], got " + y);
        int index = (y - minY) / SECTION_DIMENSION;
        return sections[index];
    }

    public LightSection lightSectionFromY(int y) {
        Preconditions.checkArgument(y >= minY && y <= maxY(), "Y must be in [" + minY + ", " + maxY() + "], got " + y);
        int index = (y - minY) / SECTION_DIMENSION + 1;
        return lightSections[index];
    }

}
