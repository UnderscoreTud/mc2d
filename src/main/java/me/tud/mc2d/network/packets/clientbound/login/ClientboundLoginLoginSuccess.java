package me.tud.mc2d.network.packets.clientbound.login;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

@Data
@With
@RequiredArgsConstructor
public class ClientboundLoginLoginSuccess implements ClientboundPacket {

    private static final int ID = 0x02;

    @RegisterHandler(ConnectionState.LOGIN)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundLoginLoginSuccess.class, ClientboundLoginLoginSuccess::new);
    }

    private final UUID uuid;
    private final String username;

    public ClientboundLoginLoginSuccess(FriendlyByteBuf buf) {
        this(buf.readUUID(), buf.readString());
        buf.readVarInt();
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.LOGIN;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeUUID(uuid);
        buf.writeString(username);
        buf.writeVarInt(0);
    }

}
