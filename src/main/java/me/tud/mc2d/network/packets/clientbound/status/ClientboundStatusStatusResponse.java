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
public class ClientboundStatusStatusResponse implements ClientboundPacket {

    private static final int ID = 0x00;

    @RegisterHandler(ConnectionState.STATUS)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundStatusStatusResponse.class, ClientboundStatusStatusResponse::new);
    }

    private final String jsonResponse;

    public ClientboundStatusStatusResponse(FriendlyByteBuf buf) {
        this(buf.readString());
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
        buf.writeString(jsonResponse);
    }

}
