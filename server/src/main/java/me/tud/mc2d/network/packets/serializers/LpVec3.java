package me.tud.mc2d.network.packets.serializers;

import io.netty.buffer.Unpooled;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.text.ComponentProcessor;
import me.tud.mc2d.util.FriendlyByteBuf;
import org.joml.Vector3d;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.aliases.SerializerAlias;
import org.machinemc.scriptive.components.ClientComponent;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.serialization.JSONPropertiesSerializer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@SerializerAlias(LpVec3.Serializer.class)
public @interface LpVec3 {

    /**
     * Implementation of the serializer.
     */
    class Serializer implements org.machinemc.paklet.serialization.Serializer<Vector3d> {

        @Override
        public void serialize(SerializerContext context, DataVisitor visitor, Vector3d vector) {
            FriendlyByteBuf buf = new FriendlyByteBuf();
            buf.writeLpVec3(vector);
            visitor.writeBytes(buf.bytes());
        }

        @Override
        public Vector3d deserialize(SerializerContext context, DataVisitor visitor) {
            FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.wrappedBuffer(visitor.finish()));
            return buf.readLpVec3();
        }

    }

}
