package me.tud.mc2d.registry;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NamespacedKey;

import java.util.HashMap;
import java.util.Map;

public class RegistryAccess {

    private final Server server;
    private final Map<RegistryKey<?, ?>, Registry<?>> registries = new HashMap<>();

    {
        // Register default registries
    }

    public RegistryAccess(Server server) {
        this.server = server;
    }

    public <T, R extends Registry<T>> void register(RegistryKey<T, R> key, R registry) {
        if (registries.containsKey(key))
            throw new IllegalArgumentException("Registry already registered: " + key);
        registries.put(key, registry);
    }

    public <T, R extends Registry<T>> R get(RegistryKey<T, R> key) {
        //noinspection unchecked
        return (R) registries.get(key);
    }

    public <T, R extends Registry<T>> R get(NamespacedKey key) {
        return get(RegistryKey.<T, R>of(key));
    }

    public Server server() {
        return server;
    }

}
