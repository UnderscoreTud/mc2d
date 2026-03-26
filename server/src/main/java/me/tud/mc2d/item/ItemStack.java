package me.tud.mc2d.item;

import lombok.With;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

@With
public record ItemStack(int count, Item item) implements Writable {

    public static final ItemStack AIR = new ItemStack(Items.AIR);

    public ItemStack(Item item) {
        this(1, item);
    }

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeVarInt(count)
                .writeVarInt(item.id())
                .writeVarInt(0)  // Components to add
                .writeVarInt(0); // Components to remove
    }

    public static ItemStack read(FriendlyByteBuf buf) {
        int count = buf.readVarInt();
        int id = buf.readVarInt();
        buf.finish();
        return new ItemStack(count, Item.values().get(id));
    }

}
