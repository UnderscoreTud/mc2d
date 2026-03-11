package me.tud.mc2d.chunk.palette;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.IDProvider;
import me.tud.mc2d.util.Writable;
import me.tud.mc2d.world.Biome;
import me.tud.mc2d.world.blockdata.BlockData;

@Getter
@ToString
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class PalettedContainer<T> implements Writable {

    private final int length;
    private final int maxSize;
    private final int mask;
    private final int wordBits;

    private final Palette palette;
    private final IntList data = new IntArrayList();
    private short nonZeroElements = 0;

    protected PalettedContainer(int length, Palette palette) {
        this.length = length;
        this.maxSize = length * length * length;
        this.mask = length - 1;
        this.wordBits = Integer.numberOfTrailingZeros(length);
        this.palette = palette;
    }

    protected abstract int id(T value);

    protected abstract T fromID(int id);

    public void fill(T value) {
        fill(id(value));
    }

    public void fill(int id) {
        palette.clear();
        data.clear();
        palette.add(id);
        nonZeroElements = (short) (id != 0 ? maxSize : 0);
    }

    public void set(int x, int y, int z, T value) {
        set(x, y, z, id(value));
    }

    public void set(int x, int y, int z, int id) {
        set(packCoords(x, y, z), id);
    }

    public void set(int index, int id) {
        if (index < 0 || index >= maxSize)
            throw new IndexOutOfBoundsException(index);

        palette.add(id);
        if (index >= data.size())
            data.size(index + 1);

        int prev = data.set(index, id);
        if (prev == id)
            return;
        if (prev == 0) {
            nonZeroElements++;
        } else if (id == 0) {
            nonZeroElements--;
        }

        attemptRemove(prev);
    }

    private void attemptRemove(int id) {
        if (id == 0 && data.size() < maxSize)
            return;
        if (!data.contains(id))
            palette.remove(id);
    }

    public T get(int x, int y, int z) {
        return fromID(getID(x, y, z));
    }

    public int getID(int x, int y, int z) {
        validateCoords(x, y, z);
        return id(packCoords(x, y , z));
    }

    public int getID(int index) {
        Preconditions.checkArgument(index >= 0 && index < maxSize, "Index must be in [0, " + maxSize + ") got " + index);
        return id(index);
    }

    private int id(int index) {
        if (palette.bitsPerEntry() == 0)
            return palette.localToGlobal().getInt(0);
        if (index >= data.size())
            return 0;
        return data.getInt(index);
    }

    @Override
    public void write(FriendlyByteBuf buf) {
        palette().write(buf, data.toIntArray(), maxSize);
    }

    private int packCoords(int x, int y, int z) {
        validateCoords(x, y, z);
        return (x & mask) | ((z & mask) << wordBits) | ((y & mask) << wordBits * 2);
    }

    private void validateCoords(int x, int y, int z) {
        Preconditions.checkArgument(x >= 0 && x < length, "X must be in [0, " + length + "), got " + x);
        Preconditions.checkArgument(y >= 0 && y < length, "Y must be in [0, " + length + "), got " + y);
        Preconditions.checkArgument(z >= 0 && z < length, "Z must be in [0, " + length + "), got " + z);
    }

    public static PalettedContainer<BlockData> blocks() {
        return blocks(0);
    }

    public static PalettedContainer<BlockData> blocks(int initialSize) {
        return new BlockContainer(initialSize);
    }

    public static PalettedContainer<Biome> biomes(IDProvider<Biome> idProvider) {
        return biomes(idProvider, 0);
    }

    public static PalettedContainer<Biome> biomes(IDProvider<Biome> idProvider, int initialSize) {
        return new BiomeContainer(idProvider, initialSize);
    }

    private static class BlockContainer extends PalettedContainer<BlockData> {

        protected BlockContainer(int initialSize) {
            super(16, new Palette(Palette.Type.BLOCK, initialSize));
        }

        @Override
        protected int id(BlockData block) {
            return block.id();
        }

        @Override
        protected BlockData fromID(int id) {
            return BlockData.fromID(id);
        }

    }

    private static class BiomeContainer extends PalettedContainer<Biome> {

        private final IDProvider<Biome> idProvider;

        protected BiomeContainer(IDProvider<Biome> idProvider, int initialSize) {
            super(4, new Palette(Palette.Type.BIOME, initialSize));
            this.idProvider = idProvider;
        }

        @Override
        protected int id(Biome biome) {
            return idProvider.getID(biome);
        }

        @Override
        protected Biome fromID(int id) {
            return idProvider.getByID(id);
        }

    }

}
