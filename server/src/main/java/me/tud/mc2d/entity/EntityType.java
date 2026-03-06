package me.tud.mc2d.entity;

import lombok.*;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class EntityType extends EntityTypes {

    private final int id, internalID;
    private final NamespacedKey key;
    private final String displayName;
    private final double width, height, length, offset;

}
