package me.tud.mc2d.registry;

import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;

public record TypedKey<T extends NBTSerializable>(RegistryKey<T, ?> registryKey, NamespacedKey key) {
}
