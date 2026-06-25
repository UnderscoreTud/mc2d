package me.tud.mc2d.util;

import org.machinemc.nbt.NBTCompound;

/**
 * Indicates that the object can be serialized to NBT compound.
 */
public interface NBTSerializable {

    /**
     * @return the NBT compound representation of this object
     */
    NBTCompound toNBT();

}
