package me.tud.mc2d.registry;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

import java.util.function.Consumer;

public non-sealed class BuiltInRegistry<T> extends Registry<T> {

    private boolean frozen;

    public BuiltInRegistry(Server server, NamespacedKey key) {
        super(server, key);
    }

    public <R extends BuiltInRegistry<T>> BuiltInRegistry(Server server, RegistryKey<T, R> key) {
        super(server, key.key());
    }

    @Override
    public BuiltInRegistry<T> modify(Consumer<Modifiable> consumer) {
        freeze();
        return (BuiltInRegistry<T>) super.modify(consumer);
    }

    @Override
    public BuiltInRegistry<T> forceModify(Consumer<Modifiable> consumer) {
        freeze();
        return (BuiltInRegistry<T>) super.forceModify(consumer);
    }

    private void freeze() {
        if (frozen)
            throw new IllegalStateException("Registry is frozen");
        frozen = true;
    }

}
