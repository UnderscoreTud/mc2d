package me.tud.mc2d.network.packets.serializers;

import org.joml.Vector3f;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

@Supports(Vector3f.class)
public class Vector3fSerializer implements Serializer<Vector3f> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, Vector3f vector) {
        Serializer<Float> serializer = context.serializerProvider().getFor(Float.class);
        visitor.write(context, serializer, vector.x());
        visitor.write(context, serializer, vector.y());
        visitor.write(context, serializer, vector.z());
    }

    @Override
    public Vector3f deserialize(SerializerContext context, DataVisitor visitor) {
        Serializer<Float> serializer = context.serializerProvider().getFor(Float.class);
        return new Vector3f(
                visitor.read(context, serializer),
                visitor.read(context, serializer),
                visitor.read(context, serializer)
        );
    }

}
