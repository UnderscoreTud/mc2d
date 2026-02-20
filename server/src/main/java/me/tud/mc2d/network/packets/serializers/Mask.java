package me.tud.mc2d.network.packets.serializers;

import me.tud.mc2d.util.ClassUtils;
import me.tud.mc2d.util.Packable;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;
import org.machinemc.paklet.serialization.aliases.SerializerAlias;

import java.beans.Visibility;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;

public final class Mask {
    
    @Target(ElementType.TYPE_USE)
    @Retention(RetentionPolicy.RUNTIME)
    @SerializerAlias(ByteMaskSerializer.class)
    public @interface Byte {}

    @Target(ElementType.TYPE_USE)
    @Retention(RetentionPolicy.RUNTIME)
    @SerializerAlias(IntMaskSerializer.class)
    public @interface Int {}

    @Target(ElementType.TYPE_USE)
    @Retention(RetentionPolicy.RUNTIME)
    @SerializerAlias(VarIntMaskSerializer.class)
    public @interface VarInt {}

    @Supports({})
    public static class ByteMaskSerializer extends MaskSerializer {

        @Override
        protected void write(SerializerContext context, DataVisitor visitor, int packed) {
            var serializer = context.serializerProvider().getFor(java.lang.Byte.class);
            visitor.write(context, serializer, (byte) packed);
        }

        @Override
        protected int read(SerializerContext context, DataVisitor visitor) {
            var serializer = context.serializerProvider().getFor(java.lang.Byte.class);
            return visitor.read(context, serializer);
        }
    
    }

    @Supports({})
    public static class IntMaskSerializer extends MaskSerializer {

        @Override
        protected void write(SerializerContext context, DataVisitor visitor, int packed) {
            visitor.writeInt(packed);
        }

        @Override
        protected int read(SerializerContext context, DataVisitor visitor) {
            return visitor.readInt();
        }
    
    }

    @Supports({})
    public static class VarIntMaskSerializer extends MaskSerializer {

        @Override
        protected void write(SerializerContext context, DataVisitor visitor, int packed) {
            var serializer = context.serializerProvider().getFor(Integer.class);
            visitor.write(context, serializer, packed);
        }

        @Override
        protected int read(SerializerContext context, DataVisitor visitor) {
            var serializer = context.serializerProvider().getFor(Integer.class);
            return visitor.read(context, serializer);
        }

    }

    private static abstract class MaskSerializer implements Serializer<Collection<? extends Packable>> {

        protected abstract void write(SerializerContext context, DataVisitor visitor, int packed);

        protected abstract int read(SerializerContext context, DataVisitor visitor);

        @Override
        public void serialize(SerializerContext context, DataVisitor visitor, Collection<? extends Packable> collection) {
            write(context, visitor, Packable.pack(collection));
        }

        @Override
        public Collection<? extends Packable> deserialize(SerializerContext context, DataVisitor visitor) {
            //noinspection unchecked,rawtypes
            return Packable.unpack((Class) ClassUtils.asClass(context.annotatedType().getType()), read(context, visitor));
        }

    }

}
