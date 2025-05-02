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

public class FriendlyByteBuf implements ByteBufConvertible, ReferenceCounted {

    private static final int SEGMENT_BITS = 0x7F;
    private static final int CONTINUE_BIT = 0x80;

    private final ByteBuf buf;

    public FriendlyByteBuf() {
        this(Unpooled.buffer());
    }

    public FriendlyByteBuf(int initialCapacity) {
        this(Unpooled.buffer(initialCapacity));
    }

    public FriendlyByteBuf(int initialCapacity, int maxCapacity) {
        this(Unpooled.buffer(initialCapacity, maxCapacity));
    }

    public FriendlyByteBuf(ByteBuf buf) {
        this.buf = buf;
    }

    @Override
    public ByteBuf asByteBuf() {
        return buf;
    }

    public FriendlyByteBuf writeByte(byte value) {
        buf.writeByte(value);
        return this;
    }

    public byte readByte() {
        return buf.readByte();
    }

    public FriendlyByteBuf writeBytes(byte[] bytes) {
        buf.writeBytes(bytes);
        return this;
    }

    public byte[] readBytes(int length) {
        byte[] bytes = new byte[length];
        buf.readBytes(bytes);
        return bytes;
    }

    public FriendlyByteBuf writeShort(short value) {
        buf.writeShort(value);
        return this;
    }

    public short readShort() {
        return buf.readShort();
    }

    public FriendlyByteBuf writeInt(int value) {
        buf.writeInt(value);
        return this;
    }

    public int readInt() {
        return buf.readInt();
    }

    public FriendlyByteBuf writeLong(long value) {
        buf.writeLong(value);
        return this;
    }

    public long readLong() {
        return buf.readLong();
    }

    public FriendlyByteBuf writeFloat(float value) {
        buf.writeFloat(value);
        return this;
    }

    public float readFloat() {
        return buf.readFloat();
    }

    public FriendlyByteBuf writeDouble(double value) {
        buf.writeDouble(value);
        return this;
    }

    public double readDouble() {
        return buf.readDouble();
    }

    public FriendlyByteBuf writeString(String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        writeVarInt(bytes.length);
        writeBytes(bytes);
        return this;
    }

    public String readString() {
        int length = readVarInt();
        byte[] bytes = readBytes(length);
        return new String(bytes, 0, length, StandardCharsets.UTF_8);
    }

    public FriendlyByteBuf writeBoolean(boolean value) {
        buf.writeBoolean(value);
        return this;
    }

    public boolean readBoolean() {
        return buf.readBoolean();
    }

    public FriendlyByteBuf writeByteArray(byte[] array) {
        writeVarInt(array.length);
        writeBytes(array);
        return this;
    }

    public byte[] readByteArray() {
        int length = readVarInt();
        return readBytes(length);
    }

    public FriendlyByteBuf writeShortArray(short[] array) {
        writeVarInt(array.length);
        for (short value : array)
            writeShort(value);
        return this;
    }

    public short[] readShortArray() {
        int length = readVarInt();
        short[] array = new short[length];
        for (int i = 0; i < length; i++)
            array[i] = readShort();
        return array;
    }

    public FriendlyByteBuf writeIntArray(int[] array) {
        writeVarInt(array.length);
        for (int value : array)
            writeInt(value);
        return this;
    }

    public int[] readIntArray() {
        int length = readVarInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
            array[i] = readInt();
        return array;
    }

    public FriendlyByteBuf writeLongArray(long[] array) {
        writeVarInt(array.length);
        for (long value : array)
            writeLong(value);
        return this;
    }

    public long[] readLongArray() {
        int length = readVarInt();
        long[] array = new long[length];
        for (int i = 0; i < length; i++)
            array[i] = readLong();
        return array;
    }

    public FriendlyByteBuf writeFloatArray(float[] array) {
        writeVarInt(array.length);
        for (float value : array)
            writeFloat(value);
        return this;
    }

    public float[] readFloatArray() {
        int length = readVarInt();
        float[] array = new float[length];
        for (int i = 0; i < length; i++)
            array[i] = readFloat();
        return array;
    }

    public FriendlyByteBuf writeDoubleArray(double[] array) {
        writeVarInt(array.length);
        for (double value : array)
            writeDouble(value);
        return this;
    }

    public double[] readDoubleArray() {
        int length = readVarInt();
        double[] array = new double[length];
        for (int i = 0; i < length; i++)
            array[i] = readDouble();
        return array;
    }

    public FriendlyByteBuf writeBooleanArray(boolean[] array) {
        writeVarInt(array.length);
        for (boolean value : array)
            writeBoolean(value);
        return this;
    }

    public boolean[] readBooleanArray() {
        int length = readVarInt();
        boolean[] array = new boolean[length];
        for (int i = 0; i < length; i++)
            array[i] = readBoolean();
        return array;
    }

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

    public FriendlyByteBuf writeNamespacedKey(NamespacedKey key) {
        writeString(key.namespace());
        writeString(key.key());
        return this;
    }

    public NamespacedKey readNamespacedKey() {
        return NamespacedKey.parseSafe(readString()).orElse(null);
    }

    public FriendlyByteBuf writeUUID(UUID uuid) {
        writeLong(uuid.getMostSignificantBits());
        writeLong(uuid.getLeastSignificantBits());
        return this;
    }

    public UUID readUUID() {
        long mostSigBits = readLong();
        long leastSigBits = readLong();
        return new UUID(mostSigBits, leastSigBits);
    }

    public FriendlyByteBuf writeComponent(Component component) {
        JSONPropertiesSerializer serializer = new JSONPropertiesSerializer();
        String json = serializer.serialize(component.getProperties());
        writeString(json);
        return this;
    }

    public Component readComponent(ComponentSerializer serializer) {
        return serializer.deserialize(readComponent());
    }

    public ComponentProperties readComponent() {
        JSONPropertiesSerializer serializer = new JSONPropertiesSerializer();
        String json = readString();
        return serializer.deserialize(json);
    }

    public FriendlyByteBuf write(Writable writable) {
        writable.write(this);
        return this;
    }

    public <T> FriendlyByteBuf writeArray(T[] array, BiConsumer<FriendlyByteBuf, T> writeFunction) {
        writeVarInt(array.length);
        for (T element : array)
            writeFunction.accept(this, element);
        return this;
    }

    public <T> T[] readArray(IntFunction<T[]> arrayGenerator, Function<FriendlyByteBuf, T> readFunction) {
        int length = readVarInt();
        T[] array = arrayGenerator.apply(length);
        for (int i = 0; i < length; i++)
            array[i] = readFunction.apply(this);
        return array;
    }

    public int readableBytes() {
        return buf.readableBytes();
    }

    public byte[] finish() {
        byte[] bytes = new byte[buf.readableBytes()];
        buf.readBytes(bytes);
        return bytes;
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
