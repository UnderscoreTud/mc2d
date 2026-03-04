package me.tud.mc2d.chunk;

import lombok.Data;

import java.util.Arrays;

@Data
public class LightSection {

    private final static byte LIGHT_MASK = 0x0F;

    private final byte[] skyLight = new byte[2048], blockLight = new byte[2048];
    private boolean skyLightEmpty = true, blockLightEmpty = true;

    public byte getSkyLight(int x, int y, int z) {
        return get(skyLight, packCoords(x, y, z));
    }

    public byte setSkyLight(int x, int y, int z, byte level) {
        byte previous = set(skyLight, packCoords(x, y, z), level);
        if (level != 0) {
            skyLightEmpty = false;
        } else if (previous != 0) {
            skyLightEmpty = isEmpty(skyLight);
        }
        return previous;
    }

    public void fillSkyLight(byte level) {
        fill(skyLight, level);
        skyLightEmpty = (level == 0);
    }

    public byte getBlockLight(int x, int y, int z) {
        return get(blockLight, packCoords(x, y, z));
    }

    public byte setBlockLight(int x, int y, int z, byte level) {
        byte previous = set(blockLight, packCoords(x, y, z), level);
        if (level != 0) {
            blockLightEmpty = false;
        } else if (previous != 0) {
            blockLightEmpty = isEmpty(blockLight);
        }
        return previous;
    }

    public void fillBlockLight(byte level) {
        fill(blockLight, level);
        blockLightEmpty = (level == 0);
    }

    private static byte get(byte[] array, int index) {
        return (byte) (array[index >> 1] >> ((index & 1) << 2) & LIGHT_MASK);
    }

    private static byte set(byte[] array, int index, byte value) {
        int byteIndex = index >> 1;
        int shift = (index & 1) << 2;
        int mask = LIGHT_MASK << shift;

        int b = array[byteIndex] & 0xFF;
        array[byteIndex] = (byte) ((b & ~mask) | ((value & LIGHT_MASK) << shift));

        return (byte) ((b >> shift) & LIGHT_MASK);
    }

    private static void fill(byte[] array, byte value) {
        Arrays.fill(array, (byte) ((value & LIGHT_MASK) | ((value & LIGHT_MASK) << 4)));
    }

    private static boolean isEmpty(byte[] array) {
        for (byte b : array) {
            if (b != 0)
                return false;
        }
        return true;
    }

    private static int packCoords(int x, int y, int z) {
        return y << 8 | z << 4 | x;
    }

}
