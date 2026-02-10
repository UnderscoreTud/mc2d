package me.tud.mc2d.network.packets;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.util.Writable;

public interface Packet extends Writable {

    default int id() {
        return info().id();
    }

    default ConnectionState state() {
        return info().state();
    }

    default Direction direction() {
        return info().direction();
    }

    Info info();

    void serialize(FriendlyByteBuf buf);

    @Override
    default void write(FriendlyByteBuf buf) {
        FriendlyByteBuf temp = new FriendlyByteBuf();
        temp.writeVarInt(id());
        serialize(temp);
        byte[] data = temp.finish();
        buf.writeVarInt(data.length);
        buf.writeBytes(data);
    }

    enum Direction {
        CLIENTBOUND,
        SERVERBOUND
    }

    record Info(NamespacedKey resource, int id, ConnectionState state, Direction direction) {}

}
