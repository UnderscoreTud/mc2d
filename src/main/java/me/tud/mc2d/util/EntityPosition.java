package me.tud.mc2d.util;

import lombok.Data;
import lombok.With;
import org.jetbrains.annotations.Contract;

/**
 * Represent a position of an entity.
 */
@Data
@With
public class EntityPosition implements Cloneable, Writable {

    private double x, y, z;
    private float yaw, pitch;

    /**
     * Creates new position.
     * @param x x-coordinate of the position
     * @param y y-coordinate of the position
     * @param z z-coordinate of the position
     * @param yaw yaw of the position
     * @param pitch pitch of the position
     * @return new position
     */
    @Contract("_, _, _, _, _ -> new")
    public static EntityPosition of(double x,
                                    double y,
                                    double z,
                                    float yaw,
                                    float pitch) {
        return new EntityPosition(x, y, z, yaw, pitch);
    }

    /**
     * Creates new position.
     * @param x x-coordinate of the position
     * @param y y-coordinate of the position
     * @param z z-coordinate of the position
     * @return new position
     */
    @Contract("_, _, _ -> new")
    public static EntityPosition of(double x, double y, double z) {
        return new EntityPosition(x, y, z, 0, 0);
    }

    /**
     * Creates new entity position from block position.
     * @param blockPosition block positioncation
     * @return new position
     */
    @Contract("_ -> new")
    public static EntityPosition of(BlockPosition blockPosition) {
        return new EntityPosition(blockPosition);
    }

    /**
     * Creates new position from a friendly byte buffer.
     * @param buf buffer with encoded position
     * @return entity position
     */
    @Contract("_ -> new")
    public static EntityPosition read(FriendlyByteBuf buf) {
        return new EntityPosition(
                buf.readDouble(),
                buf.readDouble(),
                buf.readDouble(),
                buf.readAngle(),
                buf.readAngle()
        );
    }

    /**
     * Entity Position in a world.
     * @param x x-coordinate of the position
     * @param y y-coordinate of the position
     * @param z z-coordinate of the position
     * @param yaw yaw of the position
     * @param pitch pitch of the position
     */
    public EntityPosition(double x, double y, double z, float yaw, float pitch) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = fixYaw(yaw);
        this.pitch = pitch;
    }

    /**
     * Entity Position in a world.
     * @param x x-coordinate of the position
     * @param y y-coordinate of the position
     * @param z z-coordinate of the position
     */
    public EntityPosition(double x, double y, double z) {
        this(x, y, z, 0, 0);
    }

    /**
     * Position in the world from a block position.
     * @param blockPosition block position of the entity position
     */
    public EntityPosition(BlockPosition blockPosition) {
        this(blockPosition.x(), blockPosition.y(), blockPosition.z());
    }

    /**
     * @return x-coordinate of the position as whole number
     */
    public int getBlockX() {
        return (int) Math.floor(x);
    }

    /**
     * @return y-coordinate of the position as whole number
     */
    public int getBlockY() {
        return (int) Math.floor(y);
    }

    /**
     * @return z-coordinate of the position as whole number
     */
    public int getBlockZ() {
        return (int) Math.floor(z);
    }

    /**
     * Converts the entity position to a block position.
     * @return block position of this entity position
     */
    @Contract(pure = true)
    public BlockPosition toBlockPosition() {
        return new BlockPosition(getBlockX(), getBlockY(), getBlockZ());
    }

    /**
     * Writes the coordinates of the position to the buffer.
     * @param buf buffer to write into
     */
    public void writePos(FriendlyByteBuf buf) {
        buf.writeDouble(x).writeDouble(y).writeDouble(z);
    }

    /**
     * Writes the rotation of the position to the buffer.
     * @param buf buffer to write into
     */
    public void writeRot(FriendlyByteBuf buf) {
        buf.writeAngle(yaw).writeAngle(pitch);
    }

    /**
     * Writes the position to the buffer.
     * @param buf buffer to write into
     */
    @Override
    public void write(FriendlyByteBuf buf) {
        writePos(buf);
        writeRot(buf);
    }

    /**
     * Fixes the yaw between -180 and 180 degrees.
     * @param yaw yaw
     * @return same yaw but between -180 and 180 degrees
     */
    private static float fixYaw(float yaw) {
        float fixedYaw = yaw % 360;
        if (fixedYaw < -180.0F) {
            fixedYaw += 360.0F;
        } else if (fixedYaw > 180.0F) {
            fixedYaw -= 360.0F;
        }
        return fixedYaw;
    }

    /**
     * Checks whether the position is valid or not.
     * @param position position
     * @return if the position is valid
     */
    public static boolean isInvalid(EntityPosition position) {
        double x = position.x(), y = position.y(), z = position.z();
        if (!(Double.isFinite(x) && Double.isFinite(y) && Double.isFinite(z)))
            return true;
        return Math.max(Math.abs(x), Math.abs(z)) > 3.2e+7;
    }

    @Override
    @SuppressWarnings("MethodDoesntCallSuperMethod")
    public EntityPosition clone() {
        return new EntityPosition(x, y, z, yaw, pitch);
    }

}
