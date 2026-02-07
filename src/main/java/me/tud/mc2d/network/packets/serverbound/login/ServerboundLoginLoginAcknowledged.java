package me.tud.mc2d.network.packets.serverbound.login;

import lombok.Data;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ServerboundLoginLoginAcknowledged implements ServerboundPacket {

    private static final int ID = 0x03;

    @RegisterHandler(ConnectionState.LOGIN)
    public static void register(PacketRegistry.Group group) {
        group.registerSimplePacket(ID, ServerboundLoginLoginAcknowledged.class, ServerboundLoginLoginAcknowledged::new);
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.HANDSHAKING;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
