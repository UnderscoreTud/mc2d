package me.tud.mc2d.registry;

import me.tud.mc2d.util.NamespacedKey;

public record TypedKey<T>(RegistryKey<T, ?> registryKey, NamespacedKey key) {
}
