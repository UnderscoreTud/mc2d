package me.tud.mc2d.network.packets.serverbound.status;

import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

public record ServerboundStatusStatusRequest() implements Packet {

    private static final Packet.Info INFO = Packets.Status.Serverbound.STATUS_REQUEST;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerSimplePacket(INFO, ServerboundStatusStatusRequest.class, ServerboundStatusStatusRequest::new);
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
