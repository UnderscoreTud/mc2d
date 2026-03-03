package me.tud.mc2d.world.blockdata;

import com.google.common.base.Preconditions;
import lombok.Getter;
import me.tud.mc2d.world.block.Block;
import org.jetbrains.annotations.ApiStatus;

import java.util.*;

public class BlockData {

    private static final int MAX_ID;

    static {
        BlockData last = Block.values().getLast().createBlockData();
        MAX_ID = last.startingID + last.maxOffset();
    }

    private final @Getter Block<?> blockType;
    private final int startingID;

    @ApiStatus.Internal
    public BlockData(Block<?> blockType, int startingID) {
        this.blockType = blockType;
        this.startingID = startingID;
    }

    int offsetID() {
        return 0;
    }

    public int maxOffset() {
        return 0;
    }

    public int id() {
        return startingID + offsetID();
    }

    public void load(int id) {
        int offset = id - startingID;
        Preconditions.checkArgument(0 <= offset && offset <= maxOffset(), "ID must be in range [0, " + maxOffset() + "], got " + offset);
        loadFromOffset(offset);
    }

    void loadFromOffset(int offset) {}

    public void load(Map<String, String> properties) {}

    @Override
    public String toString() {
        return blockType.key() + "[]";
    }

    public static <T extends BlockData> T fromID(int id, Class<T> type) {
        return type.cast(fromID(id));
    }

    public static BlockData fromID(int id) {
        Preconditions.checkArgument(id >= 0 && id <= MAX_ID, "ID must be in range [0, " + MAX_ID + "], got " + id);

        List<Block<?>> values = Block.values();
        int index = floorIndex(values, id);

        BlockData base = values.get(index).createBlockData();

        base.load(id);
        return base;
    }

    private static int floorIndex(List<Block<?>> blocks, int id) {
        int low = 0, high = blocks.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midId = blocks.get(mid).blockDataID();

            if (midId <= id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

}
