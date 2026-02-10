package me.tud.mc2d.network.packets.serverbound.play;

import lombok.Data;
import me.tud.mc2d.generated.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ServerboundPlayClientTickEnd implements Packet {

    private static final Packet.Info INFO = Packets.Play.Serverbound.CLIENT_TICK_END;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerSimplePacket(INFO, ServerboundPlayClientTickEnd.class, ServerboundPlayClientTickEnd::new);
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
