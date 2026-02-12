package me.tud.mc2d.network.packets.serverbound.play;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ServerboundPlayPlayerLoaded implements Packet {

    private static final Packet.Info INFO = Packets.Play.Serverbound.PLAYER_LOADED;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerSimplePacket(INFO, ServerboundPlayPlayerLoaded.class, ServerboundPlayPlayerLoaded::new);
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
