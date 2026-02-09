package me.tud.mc2d.network.packets.serverbound.play;

import lombok.Data;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ServerboundPlayPlayerLoaded implements ServerboundPacket {

    private final static int ID = 0x2A;

    @RegisterHandler(ConnectionState.PLAY)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundPlayPlayerLoaded.class, ServerboundPlayPlayerLoaded::new);
    }

    public ServerboundPlayPlayerLoaded(FriendlyByteBuf buf) {}

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.PLAY;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
