package me.tud.mc2d.network.packets.clientbound.login;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

public class ClientboundLoginLoginSuccess implements ClientboundPacket {

    private static final int ID = 0x02;

    @RegisterHandler(ConnectionState.LOGIN)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundLoginLoginSuccess.class, ClientboundLoginLoginSuccess::new);
    }

    public ClientboundLoginLoginSuccess() {}

    public ClientboundLoginLoginSuccess(UUID uuid, String username) {
        this.uuid = uuid;
        this.username = username;
    }

    private UUID uuid;
    private String username;

    public UUID uuid() {
        return uuid;
    }

    public String username() {
        return username;
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

    @Override
    public void deserialize(FriendlyByteBuf buf) {
        uuid = buf.readUUID();
        username = buf.readString();
        buf.readVarInt();
    }

}
