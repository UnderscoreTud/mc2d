package me.tud.mc2d.network.packets.serverbound.status;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

public class ServerboundStatusStatusRequest implements ServerboundPacket {

    public static final int ID = 0x00;

    @RegisterHandler(ConnectionState.STATUS)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundStatusStatusRequest.class, ServerboundStatusStatusRequest::new);
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.STATUS;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

    @Override
    public void deserialize(FriendlyByteBuf buf) {}

}
