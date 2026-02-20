package me.tud.mc2d.network.packets.serializers;

import com.google.common.base.Preconditions;
import lombok.SneakyThrows;
import org.machinemc.nbt.NBT;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

/**
 * Network serializer for {@link NBTCompound}.
 */
@Supports(NBTCompound.class)
public class NBTCompoundSerializer implements Serializer<NBTCompound> {

    private static final byte COMPOUND_ID = (byte) NBT.Tag.COMPOUND.getID();

    @Override
    @SneakyThrows
    public void serialize(SerializerContext context, DataVisitor visitor, NBTCompound compound) {
        visitor.writeByte(COMPOUND_ID);
        compound.write(visitor.asOutputStream());
    }

    @Override
    @SneakyThrows
    public NBTCompound deserialize(SerializerContext context, DataVisitor visitor) {
        Preconditions.checkState(visitor.readByte() == COMPOUND_ID, "Malformed NBT format");
        return NBTCompound.readCompound(visitor.asInputStream());
    }

}
