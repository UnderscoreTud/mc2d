package me.tud.mc2d.network.packets.clientbound.status;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

public class ClientboundStatusPongResponse implements ClientboundPacket {

    private static final int ID = 0x01;

    @RegisterHandler(ConnectionState.STATUS)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundStatusPongResponse.class, ClientboundStatusPongResponse::new);
    }

    private long timestamp;

    public ClientboundStatusPongResponse() {}

    public ClientboundStatusPongResponse(long timestamp) {
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
