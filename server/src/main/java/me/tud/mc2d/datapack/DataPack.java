package me.tud.mc2d.datapack;

import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.util.Writable;

public record DataPack(NamespacedKey id, String version) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf.writeString(id.namespace()).writeString(id.key()).writeString(version);
    }

    public static DataPack read(FriendlyByteBuf buf) {
        NamespacedKey id = NamespacedKey.of(buf.readString(), buf.readString());
        return new DataPack(id, buf.readString());
    }

}
