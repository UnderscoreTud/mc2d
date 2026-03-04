package me.tud.mc2d.chunk.palette;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import lombok.*;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;
import me.tud.mc2d.world.Biome;
import me.tud.mc2d.world.blockdata.BlockData;

import java.util.Arrays;

@Data
public class Palette implements Writable {

    public static int BLOCK_MIN_BITS_PER_ENTRY = 4, BLOCK_MAX_BITS_PER_ENTRY = 8;
    public static int BIOME_MIN_BITS_PER_ENTRY = 1, BIOME_MAX_BITS_PER_ENTRY = 3;

    private final Type type;
    private final IntList localToGlobal;
    private final Int2IntMap globalToLocal;

    private @Setter(AccessLevel.NONE) int bitsPerEntry;

    private Palette(Type type) {
        this(type, 0);
    }

    private Palette(Type type, int[] globalIDs) {
        this(type, globalIDs.length);
    }

    Palette(Type type, int initialSize) {
        this.type = type;
        this.localToGlobal = new IntArrayList(initialSize);
        this.globalToLocal = new Int2IntOpenHashMap(initialSize);
        this.bitsPerEntry = requiredBits(initialSize);
        localToGlobal.add(0);
        globalToLocal.put(0, 0);
    }

    public void add(int id) {
        if (requiredBits(id) > type.maxBPE)
            throw new IllegalArgumentException("Entries cannot exceed " + ((1 << type.maxBPE) - 1));

        if (globalToLocal.containsKey(id))
            return;
        localToGlobal.add(id);
        globalToLocal.put(id, localToGlobal.size() - 1);
        recomputeBPE();
    }

    public void remove(int id) {
        if (!globalToLocal.containsKey(id))
            return;
        int idx = globalToLocal.remove(id);
        localToGlobal.removeInt(idx);
        for (Int2IntMap.Entry entry : globalToLocal.int2IntEntrySet()) {
            if (entry.getIntValue() > idx)
                entry.setValue(entry.getIntValue() - 1);
        }
        recomputeBPE();
    }

    private void recomputeBPE() {
        int newBPE = requiredBits(localToGlobal.size());
        if (newBPE == bitsPerEntry)
            return;
        if (newBPE == 0) {
            bitsPerEntry = 0;
            return;
        }
        if (newBPE < type.maxBPE) {
            bitsPerEntry = Math.clamp(newBPE, type.minIndirectBPE, type.maxIndirectBPE);
            return; 
        }
        if (newBPE == type.maxBPE) {
            bitsPerEntry = type.maxBPE;
            return;
        }
        throw new IllegalStateException("Entries cannot exceed " + ((1 << type.maxBPE) - 1));
    }

    public long[] pack(int[] data, int length) {
        if (bitsPerEntry == 0)
            return new long[0];
        if (bitsPerEntry < type.maxBPE) {
            data = localize(data, length);
        } else {
            data = Arrays.copyOf(data, length);
        }
        return pack(bitsPerEntry(), data);
    }

    public int[] localize(int[] data, int length) {
        int[] localized = new int[length];
        int air = globalToLocal.get(0);
        Arrays.fill(localized, air);
        for (int i = 0; i < data.length; i++) {
            if (data[i] == air)
                continue;
            localized[i] = globalToLocal.get(data[i]);
        }
        return localized;
    }

    public void clear() {
        bitsPerEntry = 0;
        localToGlobal.clear();
        globalToLocal.clear();
    }

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeByte((byte) bitsPerEntry);
        if (bitsPerEntry == 0) {
            buf.writeVarInt(localToGlobal.isEmpty() ? 0 : localToGlobal.getInt(0));
        } else if (bitsPerEntry < type.maxBPE) {
            buf.writeVarIntArray(localToGlobal.toIntArray());
        }
    }

    public void write(FriendlyByteBuf buf, int[] data, int length) {
        write(buf);
        for (long value : pack(data, length))
            buf.writeLong(value);
    }

    private int requiredBits(int n) {
        if (n <= 1)
            return 0;
        return Integer.SIZE - Integer.numberOfLeadingZeros(n - 1);
    }

    // https://minecraft.wiki/w/Java_Edition_protocol/Chunk_format#Data_Array_format
    public static long[] pack(int bitsPerEntry, int[] values) {
        int entriesPerLong = Long.SIZE / bitsPerEntry;
        long[] data = new long[Math.ceilDiv(values.length, entriesPerLong)];
        long entryMask = (1L << bitsPerEntry) - 1;

        for (int i = 0; i < values.length; i++) {
            int longIndex = i / entriesPerLong;
            int bitIndex = i % entriesPerLong * bitsPerEntry;
            data[longIndex] &= ~(entryMask << bitIndex);
            data[longIndex] |= ((long) values[i] & entryMask) << bitIndex;
        }
        return data;
    }

    public static Palette blocks(BlockData... blocks) {
        int[] blockIDs = new int[blocks.length];
        for (int i = 0; i < blockIDs.length; i++)
            blockIDs[i] = blocks[i].id();
        return blocks(blockIDs);
    }

    public static Palette blocks(int[] blockIDs) {
        return new Palette(Type.BLOCK, blockIDs);
    }

    public static Palette biomes(Registry<Biome> registry, Biome... biomes) {
        int[] biomeIDs = new int[biomes.length];
        for (int i = 0; i < biomeIDs.length; i++)
            biomeIDs[i] = registry.getID(biomes[i]);
        return biomes(biomeIDs);
    }

    public static Palette biomes(int[] biomeIDs) {
        return new Palette(Type.BIOME, biomeIDs);
    }

    @Getter
    @RequiredArgsConstructor
    public enum Type {
        BLOCK(4, 8, 15),
        BIOME(1, 3, 7);

        private final int minIndirectBPE, maxIndirectBPE, maxBPE;
    }

}
