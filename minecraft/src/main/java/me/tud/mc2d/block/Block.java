package me.tud.mc2d.block;

import lombok.*;
import me.tud.mc2d.block.blockdata.BlockData;
import me.tud.mc2d.registry.BuiltInRegistry;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NamespacedKey;

import java.util.function.Supplier;

@Data
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class Block<T extends BlockData> extends Blocks {

    public static final RegistryKey<Block<?>, BuiltInRegistry<Block<?>>> KEY = RegistryKey.minecraft("block");

    private final int id;
    private final int blockDataID;
    private final NamespacedKey key;
    private final @Getter(AccessLevel.NONE) Supplier<T> blockDataSupplier;

    public T createBlockData() {
        return blockDataSupplier.get();
    }

}
