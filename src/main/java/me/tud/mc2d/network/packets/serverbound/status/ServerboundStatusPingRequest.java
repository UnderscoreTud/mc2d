package me.tud.mc2d.network.packets.serverbound.status;

import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ServerboundStatusPingRequest(long timestamp) implements ServerboundPacket {

    private static final int ID = 0x01;

    @RegisterHandler(ConnectionState.STATUS)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundStatusPingRequest.class, ServerboundStatusPingRequest::new);
    }

    public ServerboundStatusPingRequest(FriendlyByteBuf buf) {
        this(buf.readLong());
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
    public void serialize(FriendlyByteBuf buf) {
        buf.writeLong(timestamp);
    }

}
