package me.tud.mc2d.registry;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NamespacedKey;

import java.util.function.Consumer;

public non-sealed class BuiltInRegistry<T> extends Registry<T> {

    private boolean frozen;

    public BuiltInRegistry(Server server, NamespacedKey key) {
        super(server, key);
    }

    @Override
    protected void modify(Consumer<Modifiable> consumer) {
        freeze();
        super.modify(consumer);
    }

    @Override
    protected void forceModify(Consumer<Modifiable> consumer) {
        freeze();
        super.forceModify(consumer);
    }

    private void freeze() {
        if (frozen)
            throw new IllegalStateException("Registry is frozen");
        frozen = true;
    }

}
