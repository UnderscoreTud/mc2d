package me.tud.mc2d.network.packets.serverbound.login;

import lombok.With;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

@With
public record ServerboundLoginLoginStart(String name, UUID uuid) implements Packet {

    private static final Packet.Info INFO = Packets.Login.Serverbound.HELLO;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ServerboundLoginLoginStart.class, ServerboundLoginLoginStart::new);
    }

    public ServerboundLoginLoginStart(FriendlyByteBuf buf) {
        this(buf.readString(), buf.readUUID());
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeString(name);
        buf.writeUUID(uuid);
    }

}
