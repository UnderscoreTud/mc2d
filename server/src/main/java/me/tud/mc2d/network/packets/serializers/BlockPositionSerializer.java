package me.tud.mc2d.network.packets.serializers;

import me.tud.mc2d.util.BlockPosition;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

/**
 * Network serializer for {@link BlockPosition}.
 */
@Supports(BlockPosition.class)
public class BlockPositionSerializer implements Serializer<BlockPosition> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, BlockPosition position) {
        Serializer<Long> serializer = context.serializerProvider().getFor(Long.class);
        visitor.write(context, serializer, position.pack());
    }

    @Override
    public BlockPosition deserialize(SerializerContext context, DataVisitor visitor) {
        Serializer<Long> serializer = context.serializerProvider().getFor(Long.class);
        return BlockPosition.unpack(visitor.read(context, serializer));
    }

}
