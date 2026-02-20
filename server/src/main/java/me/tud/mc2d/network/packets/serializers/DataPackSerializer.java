package me.tud.mc2d.network.packets.serializers;

import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

/**
 * Network serializer for {@link DataPack}.
 */
@Supports(DataPack.class)
public class DataPackSerializer implements Serializer<DataPack> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, DataPack dataPack) {
        Serializer<String> serializer = context.serializerProvider().getFor(String.class);
        visitor.write(context, serializer, dataPack.id().namespace());
        visitor.write(context, serializer, dataPack.id().key());
        visitor.write(context, serializer, dataPack.version());
    }

    @Override
    public DataPack deserialize(SerializerContext context, DataVisitor visitor) {
        Serializer<String> serializer = context.serializerProvider().getFor(String.class);
        return new DataPack(
                NamespacedKey.of(visitor.read(context, serializer), visitor.read(context, serializer)),
                visitor.read(context, serializer)
        );
    }

}
