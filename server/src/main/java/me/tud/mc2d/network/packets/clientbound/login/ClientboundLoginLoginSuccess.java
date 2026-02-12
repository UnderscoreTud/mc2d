package me.tud.mc2d.network.packets.clientbound.login;

import lombok.With;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

@With
public record ClientboundLoginLoginSuccess(UUID uuid, String username) implements Packet {

    private static final Packet.Info INFO = Packets.Login.Clientbound.LOGIN_FINISHED;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ClientboundLoginLoginSuccess.class, ClientboundLoginLoginSuccess::new);
    }

    public ClientboundLoginLoginSuccess(FriendlyByteBuf buf) {
        this(buf.readUUID(), buf.readString());
        buf.readVarInt();
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeUUID(uuid);
        buf.writeString(username);
        buf.writeVarInt(0);
    }

}
