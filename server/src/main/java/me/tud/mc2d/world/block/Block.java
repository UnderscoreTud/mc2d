package me.tud.mc2d.world.block;

import lombok.*;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.blockdata.BlockData;

import java.util.function.Supplier;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
public final class Block<T extends BlockData> extends Blocks {

    private final int id;
    private final NamespacedKey key;
    private final @Getter(AccessLevel.NONE) Supplier<T> blockDataSupplier;

    public T createBlockData() {
        return blockDataSupplier.get();
    }

}
