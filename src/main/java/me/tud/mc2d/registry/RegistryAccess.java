package me.tud.mc2d.registry;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NamespacedKey;

import java.util.HashMap;
import java.util.Map;

public class RegistryAccess {

    private final Server server;
    private final Map<RegistryKey<?>, Registry<?>> registries = new HashMap<>();

    {
        // Register default registries
    }

    public RegistryAccess(Server server) {
        this.server = server;
    }

    public <T> void register(RegistryKey<T> key, Registry<T> registry) {
        registries.put(key, registry);
    }

    public <T> Registry<T> get(RegistryKey<T> key) {
        //noinspection unchecked
        return (Registry<T>) registries.get(key);
    }

    public <T> Registry<T> get(NamespacedKey key) {
        return get(RegistryKey.of(key));
    }

    public Server server() {
        return server;
    }

}
