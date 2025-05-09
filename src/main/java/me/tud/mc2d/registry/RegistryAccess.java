package me.tud.mc2d.registry;

import lombok.Getter;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

import java.util.HashMap;
import java.util.Map;

public class RegistryAccess {

    private final @Getter Server server;
    private final Map<RegistryKey<?, ?>, Registry<?>> registries = new HashMap<>();

    {
        // Register default registries
    }

    public RegistryAccess(Server server) {
        this.server = server;
        // TODO properly register default registries
        for (RegistryKey value : RegistryKey.values())
            register(value, new DataDrivenRegistry<>(server, value.key()));
    }

    public <T extends NBTSerializable, R extends Registry<T>> void register(RegistryKey<T, R> key, R registry) {
        if (registries.containsKey(key))
            throw new IllegalArgumentException("Registry already registered: " + key);
        registries.put(key, registry);
    }

    public <T extends NBTSerializable, R extends Registry<T>> R get(RegistryKey<T, R> key) {
        //noinspection unchecked
        return (R) registries.get(key);
    }

    public <T extends NBTSerializable, R extends Registry<T>> R get(NamespacedKey key) {
        return get(RegistryKey.<T, R>of(key));
    }

}
