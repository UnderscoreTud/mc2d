package me.tud.mc2d.network.packets.serializers;

import me.tud.mc2d.world.blockdata.BlockData;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

@Supports(BlockData.class)
public class BlockDataSerializer implements Serializer<BlockData> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, BlockData blockData) {
        Serializer<Integer> serializer = context.serializerProvider().getFor(Integer.class);
        visitor.write(context, serializer, blockData.id());
    }

    @Override
    public BlockData deserialize(SerializerContext context, DataVisitor visitor) {
        Serializer<Integer> serializer = context.serializerProvider().getFor(Integer.class);
        return BlockData.fromID(visitor.read(context, serializer));
    }

}
