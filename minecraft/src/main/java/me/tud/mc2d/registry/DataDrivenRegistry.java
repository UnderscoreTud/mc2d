package me.tud.mc2d.registry;

import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

import java.util.function.Consumer;

public non-sealed class DataDrivenRegistry<T extends NBTSerializable> extends Registry<T> {

    public DataDrivenRegistry(NamespacedKey key) {
        super(key);
    }

    public <R extends DataDrivenRegistry<T>> DataDrivenRegistry(RegistryKey<T, R> key) {
        super(key.key());
    }

    @Override
    public DataDrivenRegistry<T> modify(Consumer<Modifiable> consumer) {
        return (DataDrivenRegistry<T>) super.modify(consumer);
    }

    @Override
    public DataDrivenRegistry<T> forceModify(Consumer<Modifiable> consumer) {
        return (DataDrivenRegistry<T>) super.forceModify(consumer);
    }

}
