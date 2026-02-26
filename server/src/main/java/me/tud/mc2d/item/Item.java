package me.tud.mc2d.item;

import lombok.*;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.block.Block;

@Data
@EqualsAndHashCode(callSuper = false)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class Item extends Items {

    private final int id;
    private final NamespacedKey key;
    private final Block<?> blockRepresentation;

}
