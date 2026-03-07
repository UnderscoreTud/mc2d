package me.tud.mc2d.network.packets.serializers;

import io.netty.buffer.Unpooled;
import me.tud.mc2d.util.FriendlyByteBuf;
import org.joml.Vector3d;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.aliases.SerializerAlias;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@SerializerAlias(Angle.Serializer.class)
public @interface Angle {

    /**
     * Implementation of the serializer.
     */
    class Serializer implements org.machinemc.paklet.serialization.Serializer<Float> {

        @Override
        public void serialize(SerializerContext context, DataVisitor visitor, Float angle) {
            FriendlyByteBuf buf = new FriendlyByteBuf();
            buf.writeAngle(angle);
            visitor.writeBytes(buf.bytes());
        }

        @Override
        public Float deserialize(SerializerContext context, DataVisitor visitor) {
            FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.wrappedBuffer(visitor.finish()));
            return buf.readAngle();
        }

    }

}
