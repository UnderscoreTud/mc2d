package me.tud.mc2d.network.packets.clientbound.status;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

public class ClientboundStatusStatusResponse implements ClientboundPacket {

    private static final int ID = 0x00;

    @RegisterHandler(ConnectionState.STATUS)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundStatusStatusResponse.class, ClientboundStatusStatusResponse::new);
    }

    private String jsonResponse;

    public ClientboundStatusStatusResponse() {}

    public ClientboundStatusStatusResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
        System.out.println("ClientboundStatusStatusResponse: " + jsonResponse);
    }

    public String jsonResponse() {
        return jsonResponse;
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

    @Override
    public void deserialize(FriendlyByteBuf buf) {
        jsonResponse = buf.readString();
    }

}
