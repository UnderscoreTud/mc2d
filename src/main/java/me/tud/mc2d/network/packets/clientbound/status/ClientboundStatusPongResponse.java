package me.tud.mc2d.network.packets.clientbound.status;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
@With
@RequiredArgsConstructor
public class ClientboundStatusPongResponse implements ClientboundPacket {

    private static final int ID = 0x01;

    @RegisterHandler(ConnectionState.STATUS)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundStatusPongResponse.class, ClientboundStatusPongResponse::new);
    }

    private final long timestamp;

    public ClientboundStatusPongResponse(FriendlyByteBuf buf) {
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
