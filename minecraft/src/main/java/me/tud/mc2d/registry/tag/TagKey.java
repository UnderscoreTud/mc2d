package me.tud.mc2d.registry.tag;

import com.google.common.base.Preconditions;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.NotNull;

@Data
@RequiredArgsConstructor(staticName = "of")
public class TagKey<T, R extends Registry<T>> {

    private final @NotNull RegistryKey<T, R> registryKey;
    private final @NotNull NamespacedKey key;

    public String toString() {
        return "#" + key;
    }

    public static <T, R extends Registry<T>> TagKey<T, R> of(@NotNull RegistryKey<T, R> registryKey, @NamespacedKey.Pattern @NotNull String key) {
        Preconditions.checkNotNull(key, "key");
        return new TagKey<>(registryKey, NamespacedKey.parse(key));
    }

}
