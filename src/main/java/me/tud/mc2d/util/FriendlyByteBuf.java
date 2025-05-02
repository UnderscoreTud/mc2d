package me.tud.mc2d.util;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufConvertible;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCounted;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.serialization.ComponentProperties;
import org.machinemc.scriptive.serialization.ComponentSerializer;
import org.machinemc.scriptive.serialization.JSONPropertiesSerializer;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * A byte buffer wrapping a Netty {@link ByteBuf} with additional utility methods for reading and writing various data types.
 */
public class FriendlyByteBuf implements ByteBufConvertible, ReferenceCounted {

    private static final int SEGMENT_BITS = 0x7F;
    private static final int CONTINUE_BIT = 0x80;

    private final ByteBuf buf;

    /**
     * Creates a new {@link FriendlyByteBuf} with the default initial capacity.
     */
    public FriendlyByteBuf() {
        this(Unpooled.buffer());
    }

    /**
     * Creates a new {@link FriendlyByteBuf} with the specified initial capacity.
     *
     * @param initialCapacity The initial capacity of the buffer.
     */
    public FriendlyByteBuf(int initialCapacity) {
        this(Unpooled.buffer(initialCapacity));
    }

    /**
     * Creates a new {@link FriendlyByteBuf} with the specified initial and maximum capacity.
     *
     * @param initialCapacity The initial capacity of the buffer.
     * @param maxCapacity The maximum capacity of the buffer.
     */
    public FriendlyByteBuf(int initialCapacity, int maxCapacity) {
        this(Unpooled.buffer(initialCapacity, maxCapacity));
    }

    /**
     * Creates a new {@link FriendlyByteBuf} wrapping the specified {@link ByteBuf}.
     *
     * @param buf The {@link ByteBuf} to wrap.
     */
    public FriendlyByteBuf(ByteBuf buf) {
        this.buf = buf;
    }

    /**
     * Writes a byte to the buffer.
     *
     * @param value The byte to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeByte(byte value) {
        buf.writeByte(value);
        return this;
    }

    /**
     * Reads a byte from the buffer.
     *
     * @return The byte read from the buffer.
     */
    public byte readByte() {
        return buf.readByte();
    }

    /**
     * Writes a <u>non-prefixed</u> byte array to the buffer.
     *
     * @param bytes The byte array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeBytes(byte[] bytes) {
        buf.writeBytes(bytes);
        return this;
    }

    /**
     * Reads a <u>non-prefixed</u> byte array from the buffer.
     *
     * @param length The length of the byte array to read.
     * @return The byte array read from the buffer.
     */
    public byte[] readBytes(int length) {
        byte[] bytes = new byte[length];
        buf.readBytes(bytes);
        return bytes;
    }

    /**
     * Writes a short to the buffer.
     *
     * @param value The short to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeShort(short value) {
        buf.writeShort(value);
        return this;
    }

    /**
     * Reads a short from the buffer.
     *
     * @return The short read from the buffer.
     */
    public short readShort() {
        return buf.readShort();
    }

    /**
     * Writes an int to the buffer.
     *
     * @param value The int to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeInt(int value) {
        buf.writeInt(value);
        return this;
    }

    /**
     * Reads an int from the buffer.
     *
     * @return The int read from the buffer.
     */
    public int readInt() {
        return buf.readInt();
    }

    /**
     * Writes a long to the buffer.
     *
     * @param value The long to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeLong(long value) {
        buf.writeLong(value);
        return this;
    }

    /**
     * Reads a long from the buffer.
     *
     * @return The long read from the buffer.
     */
    public long readLong() {
        return buf.readLong();
    }

    /**
     * Writes a float to the buffer.
     *
     * @param value The float to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeFloat(float value) {
        buf.writeFloat(value);
        return this;
    }

    /**
     * Reads a float from the buffer.
     *
     * @return The float read from the buffer.
     */
    public float readFloat() {
        return buf.readFloat();
    }

    /**
     * Writes a double to the buffer.
     *
     * @param value The double to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeDouble(double value) {
        buf.writeDouble(value);
        return this;
    }

    /**
     * Reads a double from the buffer.
     *
     * @return The double read from the buffer.
     */
    public double readDouble() {
        return buf.readDouble();
    }

    /**
     * Writes a string to the buffer.
     *
     * @param value The string to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeString(String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        writeVarInt(bytes.length);
        writeBytes(bytes);
        return this;
    }

    /**
     * Reads a string from the buffer.
     *
     * @return The string read from the buffer.
     */
    public String readString() {
        int length = readVarInt();
        byte[] bytes = readBytes(length);
        return new String(bytes, 0, length, StandardCharsets.UTF_8);
    }

    /**
     * Writes a boolean to the buffer.
     *
     * @param value The boolean to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeBoolean(boolean value) {
        buf.writeBoolean(value);
        return this;
    }

    /**
     * Reads a boolean from the buffer.
     *
     * @return The boolean read from the buffer.
     */
    public boolean readBoolean() {
        return buf.readBoolean();
    }

    /**
     * Writes a <u>prefixed</u> byte array to the buffer.
     *
     * @param array The byte array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeByteArray(byte[] array) {
        writeVarInt(array.length);
        writeBytes(array);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> byte array from the buffer.
     *
     * @return The byte array read from the buffer.
     */
    public byte[] readByteArray() {
        int length = readVarInt();
        return readBytes(length);
    }

    /**
     * Writes a <u>prefixed</u> short array to the buffer.
     *
     * @param array The short array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeShortArray(short[] array) {
        writeVarInt(array.length);
        for (short value : array)
            writeShort(value);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> short array from the buffer.
     *
     * @return The short array read from the buffer.
     */
    public short[] readShortArray() {
        int length = readVarInt();
        short[] array = new short[length];
        for (int i = 0; i < length; i++)
            array[i] = readShort();
        return array;
    }

    /**
     * Writes a <u>prefixed</u> int array to the buffer.
     *
     * @param array The int array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeIntArray(int[] array) {
        writeVarInt(array.length);
        for (int value : array)
            writeInt(value);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> int array from the buffer.
     *
     * @return The int array read from the buffer.
     */
    public int[] readIntArray() {
        int length = readVarInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
            array[i] = readInt();
        return array;
    }

    /**
     * Writes a <u>prefixed</u> long array to the buffer.
     *
     * @param array The long array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeLongArray(long[] array) {
        writeVarInt(array.length);
        for (long value : array)
            writeLong(value);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> long array from the buffer.
     *
     * @return The long array read from the buffer.
     */
    public long[] readLongArray() {
        int length = readVarInt();
        long[] array = new long[length];
        for (int i = 0; i < length; i++)
            array[i] = readLong();
        return array;
    }

    /**
     * Writes a <u>prefixed</u> float array to the buffer.
     *
     * @param array The float array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeFloatArray(float[] array) {
        writeVarInt(array.length);
        for (float value : array)
            writeFloat(value);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> float array from the buffer.
     *
     * @return The float array read from the buffer.
     */
    public float[] readFloatArray() {
        int length = readVarInt();
        float[] array = new float[length];
        for (int i = 0; i < length; i++)
            array[i] = readFloat();
        return array;
    }

    /**
     * Writes a <u>prefixed</u> double array to the buffer.
     *
     * @param array The double array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeDoubleArray(double[] array) {
        writeVarInt(array.length);
        for (double value : array)
            writeDouble(value);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> double array from the buffer.
     *
     * @return The double array read from the buffer.
     */
    public double[] readDoubleArray() {
        int length = readVarInt();
        double[] array = new double[length];
        for (int i = 0; i < length; i++)
            array[i] = readDouble();
        return array;
    }

    /**
     * Writes a <u>prefixed</u> boolean array to the buffer.
     *
     * @param array The boolean array to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeBooleanArray(boolean[] array) {
        writeVarInt(array.length);
        for (boolean value : array)
            writeBoolean(value);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> boolean array from the buffer.
     *
     * @return The boolean array read from the buffer.
     */
    public boolean[] readBooleanArray() {
        int length = readVarInt();
        boolean[] array = new boolean[length];
        for (int i = 0; i < length; i++)
            array[i] = readBoolean();
        return array;
    }

    /**
     * Writes a <a href="https://minecraft.wiki/w/Java_Edition_protocol/Data_types#Type:VarInt">var int</a> to the buffer.
     *
     * @param value The var int to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeVarInt(int value) {
        while (true) {
            if ((value & ~SEGMENT_BITS) == 0) {
                writeByte((byte) value);
                return this;
            }

            writeByte((byte) ((value & SEGMENT_BITS) | CONTINUE_BIT));

            value >>>= 7;
        }
    }

    /**
     * Reads a <a href="https://minecraft.wiki/w/Java_Edition_protocol/Data_types#Type:VarInt">var int</a> from the buffer.
     *
     * @return The var int read from the buffer.
     */
    public int readVarInt() {
        int value = 0;
        int position = 0;
        byte currentByte;

        while (true) {
            currentByte = readByte();
            value |= (currentByte & SEGMENT_BITS) << position;

            if ((currentByte & CONTINUE_BIT) == 0) break;

            position += 7;

            if (position >= 32) throw new RuntimeException("VarInt is too big");
        }

        return value;
    }

    /**
     * Writes a <a href="https://minecraft.wiki/w/Java_Edition_protocol/Data_types#Type:VarLong">var long</a> to the buffer.
     *
     * @param value The var long to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeVarLong(long value) {
        while (true) {
            if ((value & ~((long) SEGMENT_BITS)) == 0) {
                writeByte((byte) value);
                return this;
            }

            writeByte((byte) ((value & SEGMENT_BITS) | CONTINUE_BIT));

            value >>>= 7;
        }
    }

    /**
     * Reads a <a href="https://minecraft.wiki/w/Java_Edition_protocol/Data_types#Type:VarLong">var long</a> from the buffer.
     *
     * @return The var long read from the buffer.
     */
    public long readVarLong() {
        long value = 0;
        int position = 0;
        byte currentByte;

        while (true) {
            currentByte = readByte();
            value |= (long) (currentByte & SEGMENT_BITS) << position;

            if ((currentByte & CONTINUE_BIT) == 0) break;

            position += 7;

            if (position >= 64) throw new RuntimeException("VarLong is too big");
        }

        return value;
    }

    /**
     * Writes a namespaced key to the buffer.
     *
     * @param key The namespaced key to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeNamespacedKey(NamespacedKey key) {
        writeString(key.namespace());
        writeString(key.key());
        return this;
    }

    /**
     * Reads a namespaced key from the buffer.
     *
     * @return The namespaced key read from the buffer.
     */
    public NamespacedKey readNamespacedKey() {
        return NamespacedKey.parseSafe(readString()).orElse(null);
    }

    /**
     * Writes a UUID to the buffer.
     *
     * @param uuid The UUID to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeUUID(UUID uuid) {
        writeLong(uuid.getMostSignificantBits());
        writeLong(uuid.getLeastSignificantBits());
        return this;
    }

    /**
     * Reads a UUID from the buffer.
     *
     * @return The UUID read from the buffer.
     */
    public UUID readUUID() {
        long mostSigBits = readLong();
        long leastSigBits = readLong();
        return new UUID(mostSigBits, leastSigBits);
    }

    /**
     * Writes a component to the buffer.
     *
     * @param component The component to write.
     * @return This buffer.
     */
    public FriendlyByteBuf writeComponent(Component component) {
        JSONPropertiesSerializer serializer = new JSONPropertiesSerializer();
        String json = serializer.serialize(component.getProperties());
        writeString(json);
        return this;
    }

    /**
     * Reads a component from the buffer.
     *
     * @param serializer The component serializer to use.
     * @return The component read from the buffer.
     */
    public Component readComponent(ComponentSerializer serializer) {
        return serializer.deserialize(readComponent());
    }

    /**
     * Reads a serialized component from the buffer.
     *
     * @return The serialized component read from the buffer.
     */
    public ComponentProperties readComponent() {
        JSONPropertiesSerializer serializer = new JSONPropertiesSerializer();
        String json = readString();
        return serializer.deserialize(json);
    }

    /**
     * Writes a writable to the buffer.
     *
     * @param writable The writable to write.
     * @return This buffer.
     */
    public FriendlyByteBuf write(Writable writable) {
        writable.write(this);
        return this;
    }

    /**
     * Writes a <u>prefixed</u> array to the buffer.
     *
     * @param array The array to write.
     * @param writeFunction The function to write each element of the array.
     * @return This buffer.
     * @param <T> The type of the array elements.
     */
    public <T> FriendlyByteBuf writeArray(T[] array, BiConsumer<FriendlyByteBuf, T> writeFunction) {
        writeVarInt(array.length);
        for (T element : array)
            writeFunction.accept(this, element);
        return this;
    }

    /**
     * Reads a <u>prefixed</u> array from the buffer.
     *
     * @param arrayGenerator The function to generate the array.
     * @param readFunction The function to read each element of the array.
     * @return The array read from the buffer.
     * @param <T> The type of the array elements.
     */
    public <T> T[] readArray(IntFunction<T[]> arrayGenerator, Function<FriendlyByteBuf, T> readFunction) {
        int length = readVarInt();
        T[] array = arrayGenerator.apply(length);
        for (int i = 0; i < length; i++)
            array[i] = readFunction.apply(this);
        return array;
    }

    /**
     * Returns the number of readable bytes remaining in the buffer.
     * <br>
     * This method does <b>not</b> consume the bytes from the buffer.
     *
     * @return The number of readable bytes.
     */
    public int readableBytes() {
        return buf.readableBytes();
    }

    /**
     * Reads the remaining bytes from the buffer and returns them as a byte array.
     * <br>
     * This method <b>will</b> consume the bytes from the buffer.
     *
     * @return The byte array containing the remaining bytes.
     */
    public byte[] finish() {
        byte[] bytes = new byte[buf.readableBytes()];
        buf.readBytes(bytes);
        return bytes;
    }

    @Override
    public ByteBuf asByteBuf() {
        return buf;
    }

    @Override
    public int refCnt() {
        return buf.refCnt();
    }

    @Override
    public ReferenceCounted retain() {
        return buf.retain();
    }

    @Override
    public ReferenceCounted retain(int increment) {
        return buf.retain(increment);
    }

    @Override
    public ReferenceCounted touch() {
        return buf.touch();
    }

    @Override
    public ReferenceCounted touch(Object hint) {
        return buf.touch(hint);
    }

    @Override
    public boolean release() {
        return buf.release();
    }

    @Override
    public boolean release(int decrement) {
        return buf.release(decrement);
    }

}
