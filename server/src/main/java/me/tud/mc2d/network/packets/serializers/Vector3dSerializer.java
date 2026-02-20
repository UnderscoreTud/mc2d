package me.tud.mc2d.network.packets.serializers;

import org.joml.Vector3d;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

@Supports(Vector3d.class)
public class Vector3dSerializer implements Serializer<Vector3d> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, Vector3d vector) {
        Serializer<Double> serializer = context.serializerProvider().getFor(Double.class);
        visitor.write(context, serializer, vector.x());
        visitor.write(context, serializer, vector.y());
        visitor.write(context, serializer, vector.z());
    }

    @Override
    public Vector3d deserialize(SerializerContext context, DataVisitor visitor) {
        Serializer<Double> serializer = context.serializerProvider().getFor(Double.class);
        return new Vector3d(
                visitor.read(context, serializer),
                visitor.read(context, serializer),
                visitor.read(context, serializer)
        );
    }

}
