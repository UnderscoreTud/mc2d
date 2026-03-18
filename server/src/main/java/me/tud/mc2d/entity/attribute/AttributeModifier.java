package me.tud.mc2d.entity.attribute;

import lombok.With;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.util.Writable;

@With
public record AttributeModifier(NamespacedKey id, double amount, Operation operation) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeNamespacedKey(id)
                .writeDouble(amount)
                .write(operation);
    }

    public enum Operation implements Writable {
        ADD,
        ADD_PERCENTAGE,
        MULTIPLY_BY_PERCENTAGE;

        @Override
        public void write(FriendlyByteBuf buf) {
            buf.writeByte((byte) ordinal());
        }
    }

}
