package me.tud.mc2d.registry;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

import java.util.function.Consumer;

public non-sealed class DataDrivenRegistry<T extends NBTSerializable> extends Registry<T> {

    public DataDrivenRegistry(Server server, NamespacedKey key) {
        super(server, key);
    }

    public <R extends DataDrivenRegistry<T>> DataDrivenRegistry(Server server, RegistryKey<T, R> key) {
        super(server, key.key());
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
