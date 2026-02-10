package me.tud.mc2d.network.packets.serverbound.login;

import lombok.Data;
import me.tud.mc2d.generated.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ServerboundLoginLoginAcknowledged implements Packet {

    private static final Packet.Info INFO = Packets.Login.Serverbound.LOGIN_ACKNOWLEDGED;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerSimplePacket(INFO, ServerboundLoginLoginAcknowledged.class, ServerboundLoginLoginAcknowledged::new);
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
