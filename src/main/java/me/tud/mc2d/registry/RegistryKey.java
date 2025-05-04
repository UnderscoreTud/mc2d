package me.tud.mc2d.registry;

import me.tud.mc2d.util.NamespacedKey;

public class RegistryKey<T> {

    private final NamespacedKey key;

    private RegistryKey(NamespacedKey key) {
        this.key = key;
    }

    public NamespacedKey key() {
        return key;
    }

    public static <T> RegistryKey<T> of(NamespacedKey key) {
        return new RegistryKey<>(key);
    }

}
