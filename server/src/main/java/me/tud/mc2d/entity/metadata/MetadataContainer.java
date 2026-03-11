package me.tud.mc2d.entity.metadata;

import io.netty.buffer.Unpooled;
import it.unimi.dsi.fastutil.shorts.Short2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

import java.util.function.Consumer;

public class MetadataContainer implements MetadataHolder, Writable, Cloneable {

    private static final byte END = (byte) 0xFF;

    private final Short2ObjectMap<byte[]> metadata = new Short2ObjectArrayMap<>();

    @Override
    public <T> T getMetadata(MetadataEntry<T> entry) {
        byte[] bytes = metadata.get(entry.index());
        if (bytes == null)
            return null;
        FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.wrappedBuffer(bytes));
        buf.readVarInt(); // skip type
        return entry.reader().apply(buf);
    }

    @Override
    public <T> void setMetadata(MetadataEntry<T> entry, T value) {
        FriendlyByteBuf buf = new FriendlyByteBuf();
        buf.writeVarInt(entry.type());
        if (entry.bitmask()) {
            byte[] previous = metadata.getOrDefault(entry.index(), new byte[]{0});
            buf.writeByte(previous[previous.length - 1]);
        }
        entry.writer().accept(buf, value);
        metadata.put(entry.index(), buf.bytes());
    }

    @Override
    public void editMetadata(Consumer<MetadataHolder> consumer) {
        consumer.accept(this);
    }

    public void clear() {
        metadata.clear();
    }

    public void copyAll(MetadataContainer container) {
        metadata.putAll(container.metadata);
    }

    @Override
    public void write(FriendlyByteBuf buf) {
        metadata.forEach((index, bytes) -> {
            buf.writeByte((byte) index);
            buf.writeBytes(bytes);
        });
        buf.writeByte(END);
    }

    @Override
    public MetadataContainer clone() {
        try {
            return (MetadataContainer) super.clone();
        } catch (CloneNotSupportedException _) {
            throw new AssertionError();
        }
    }

}
