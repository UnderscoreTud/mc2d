package me.tud.mc2d.network.packets.serverbound.login;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.UUID;

public class ServerboundLoginLoginStart implements ServerboundPacket {

    private static final int ID = 0x00;

    @RegisterHandler(ConnectionState.LOGIN)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundLoginLoginStart.class, ServerboundLoginLoginStart::new);
    }

    private String name;
    private UUID uuid;

    public ServerboundLoginLoginStart() {}

    public ServerboundLoginLoginStart(String name, UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public String username() {
        return name;
    }

    public UUID uuid() {
        return uuid;
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

    @Override
    public void deserialize(FriendlyByteBuf buf) {
        name = buf.readString();
        uuid = buf.readUUID();
    }

}
