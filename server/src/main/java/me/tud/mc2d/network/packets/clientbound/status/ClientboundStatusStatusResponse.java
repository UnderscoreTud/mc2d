package me.tud.mc2d.network.packets.clientbound.status;

import lombok.With;
import me.tud.mc2d.generated.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ClientboundStatusStatusResponse(String jsonResponse) implements Packet {

    private static final Packet.Info INFO = Packets.Status.Clientbound.STATUS_RESPONSE;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ClientboundStatusStatusResponse.class, ClientboundStatusStatusResponse::new);
    }

    public ClientboundStatusStatusResponse(FriendlyByteBuf buf) {
        this(buf.readString());
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeString(jsonResponse);
    }

}
