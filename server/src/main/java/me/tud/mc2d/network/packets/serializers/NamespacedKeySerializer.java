package me.tud.mc2d.network.packets.serializers;

import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

/**
 * Network serializer for {@link NamespacedKey}.
 */
@Supports(NamespacedKey.class)
public class NamespacedKeySerializer implements Serializer<NamespacedKey> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, NamespacedKey namespacedKey) {
        Serializer<String> serializer = context.serializerProvider().getFor(String.class);
        visitor.write(context, serializer, namespacedKey.toString());
    }

    @Override
    public NamespacedKey deserialize(SerializerContext context, DataVisitor visitor) {
        Serializer<String> serializer = context.serializerProvider().getFor(String.class);
        return NamespacedKey.parse(visitor.read(context, serializer));
    }

}
