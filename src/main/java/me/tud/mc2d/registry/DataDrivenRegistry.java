package me.tud.mc2d.registry;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

import java.util.function.Consumer;

public non-sealed class DataDrivenRegistry<T extends NBTSerializable> extends Registry<T> {

    public DataDrivenRegistry(Server server, NamespacedKey key) {
        super(server, key);
    }

    @Override
    public void modify(Consumer<Modifiable> consumer) {
        super.modify(consumer);
    }

    @Override
    public void forceModify(Consumer<Modifiable> consumer) {
        super.forceModify(consumer);
    }

}
