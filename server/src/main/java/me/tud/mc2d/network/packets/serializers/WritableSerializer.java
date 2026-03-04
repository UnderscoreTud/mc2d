package me.tud.mc2d.network.packets.serializers;

import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.util.Writable;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

/**
 * Network serializer for {@link Writable}.
 */
@Supports(Writable.class)
public class WritableSerializer implements Serializer<Writable> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, Writable writable) {
        FriendlyByteBuf buf = new FriendlyByteBuf();
        writable.write(buf);
        visitor.writeBytes(buf.bytes());
    }

    @Override
    public Writable deserialize(SerializerContext context, DataVisitor visitor) {
        throw new UnsupportedOperationException();
    }

}
