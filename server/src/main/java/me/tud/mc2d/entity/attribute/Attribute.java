package me.tud.mc2d.entity.attribute;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.registry.BuiltInRegistry;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NamespacedKey;

@Data
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class Attribute extends Attributes {

    public static final RegistryKey<Attribute, BuiltInRegistry<Attribute>> KEY = RegistryKey.minecraft("attribute");

    private final int id;
    private final NamespacedKey key;
    private final double min, max, defaultValue;

    public double sanitize(double value) {
        return Math.clamp(value, min, max);
    }

}
