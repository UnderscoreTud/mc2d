package me.tud.mc2d.network.packets.serverbound.status;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

public class ServerboundStatusPingRequest implements ServerboundPacket {

    private static final int ID = 0x01;

    @RegisterHandler(ConnectionState.STATUS)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundStatusPingRequest.class, ServerboundStatusPingRequest::new);
    }

    private long timestamp;

    public ServerboundStatusPingRequest() {}

    public ServerboundStatusPingRequest(long timestamp) {
        this.timestamp = timestamp;
    }

    public long timestamp() {
        return timestamp;
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

    @Override
    public void deserialize(FriendlyByteBuf buf) {
        timestamp = buf.readLong();
    }

}
