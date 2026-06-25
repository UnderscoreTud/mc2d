package me.tud.mc2d.registry;

import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RegistryAccess {

    private final Map<RegistryKey<?, ?>, Registry<?>> registries = new HashMap<>();

    private RegistryAccess() {}

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

    public @UnmodifiableView Map<RegistryKey<?, ?>, Registry<?>> registries() {
        return Collections.unmodifiableMap(registries);
    }

    public static RegistryAccess empty() {
        return new RegistryAccess();
    }

}
