package me.tud.mc2d.entity;

import lombok.*;
import me.tud.mc2d.registry.BuiltInRegistry;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NamespacedKey;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class EntityType extends EntityTypes {

    public static final RegistryKey<EntityType, BuiltInRegistry<EntityType>> KEY = RegistryKey.minecraft("entity_type");

    private final int id, internalID;
    private final NamespacedKey key;
    private final String displayName;
    private final double width, height, length, offset;

}
