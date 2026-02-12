package me.tud.mc2d.network.packets.serverbound.status;

import lombok.With;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ServerboundStatusPingRequest(long timestamp) implements Packet {

    private static final Packet.Info INFO = Packets.Status.Serverbound.PING_REQUEST;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ServerboundStatusPingRequest.class, ServerboundStatusPingRequest::new);
    }

    public ServerboundStatusPingRequest(FriendlyByteBuf buf) {
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
