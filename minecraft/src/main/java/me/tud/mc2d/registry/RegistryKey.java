package me.tud.mc2d.registry;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.util.NamespacedKey;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RegistryKey<T, R extends Registry<T>> {

    private final NamespacedKey key;

    public static <T, R extends Registry<T>> RegistryKey<T, R> of(NamespacedKey key) {
        return new RegistryKey<>(key);
    }

    public static <T, R extends Registry<T>> RegistryKey<T, R> minecraft(@NamespacedKey.KeyPattern String key) {
        return of(NamespacedKey.minecraft(key));
    }

}
