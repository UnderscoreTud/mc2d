package me.tud.mc2d.network.packets.clientbound.status;

import lombok.With;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ClientboundStatusPongResponse(long timestamp) implements Packet {

    private static final Packet.Info INFO = Packets.Status.Clientbound.PONG_RESPONSE;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ClientboundStatusPongResponse.class, ClientboundStatusPongResponse::new);
    }

    public ClientboundStatusPongResponse(FriendlyByteBuf buf) {
        this(buf.readLong());
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeLong(timestamp);
    }

}
