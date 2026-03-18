package me.tud.mc2d.entity.attribute;

import lombok.With;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

@With
public record AttributeProperty(Attribute attribute, double value, AttributeModifier... modifiers) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeVarInt(attribute().id())
                .writeDouble(value)
                .writeArray(modifiers, FriendlyByteBuf::write);
    }

}
