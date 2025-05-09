package me.tud.mc2d.network.packets.serverbound.login;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

@Data
@With
@RequiredArgsConstructor
public class ServerboundLoginLoginStart implements ServerboundPacket {

    private static final int ID = 0x00;

    @RegisterHandler(ConnectionState.LOGIN)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundLoginLoginStart.class, ServerboundLoginLoginStart::new);
    }

    private final String name;
    private final UUID uuid;

    public ServerboundLoginLoginStart(FriendlyByteBuf buf) {
        this(buf.readString(), buf.readUUID());
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
    public void serialize(FriendlyByteBuf buf) {
        buf.writeString(name);
        buf.writeUUID(uuid);
    }

}
