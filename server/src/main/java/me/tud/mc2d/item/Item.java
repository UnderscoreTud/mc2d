package me.tud.mc2d.item;

import lombok.*;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

@Data
@EqualsAndHashCode(callSuper = true)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class Item extends Items {

    private final int id;
    private final NamespacedKey key;
    private final @Getter(AccessLevel.NONE) @Nullable Supplier<Block<?>> blockRepresentationSupplier;

    private transient @ToString.Exclude @EqualsAndHashCode.Exclude Block<?> blockRepresentation;

    public Block<?> blockRepresentation() {
        if (blockRepresentation == null)
            blockRepresentation = blockRepresentationSupplier != null ? blockRepresentationSupplier.get() : null;
        return blockRepresentation;
    }

}
