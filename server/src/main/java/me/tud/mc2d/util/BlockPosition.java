package me.tud.mc2d.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;
import org.jetbrains.annotations.Contract;

/**
 * Represents position of a block in the world.
 */
@Data
@With
@AllArgsConstructor
public final class BlockPosition implements Writable, Cloneable {

    public static final long PACKED_X_MASK = 0x3FFFFFF; // max x-coordinate value
    public static final long PACKED_Y_MASK = 0xFFF; // max y-coordinate value
    public static final long PACKED_Z_MASK = 0x3FFFFFF; // max z-coordinate value

    private final int x;
    private final int y;
    private final int z;

    /**
     * @param x x-coordinate
     * @param y y-coordinate
     * @param z z-coordinate
     * @return block position from given coordinates
     */
    @Contract("_, _, _ -> new")
    public static BlockPosition of(int x, int y, int z) {
        return new BlockPosition(x, y, z);
    }

    /**
     * Position of a block in the world.
     * @param position position of the block
     */
    public BlockPosition(EntityPosition position) {
        this(position.getBlockX(), position.getBlockY(), position.getBlockZ());
    }

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeBlockPosition(this);
    }

    @Override
    @SuppressWarnings("MethodDoesntCallSuperMethod")
    public BlockPosition clone() {
        return new BlockPosition(x, y, z);
    }

}
