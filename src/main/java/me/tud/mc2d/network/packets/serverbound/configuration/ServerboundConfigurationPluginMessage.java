package me.tud.mc2d.network.packets.serverbound.configuration;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;

public class ServerboundConfigurationPluginMessage implements ServerboundPacket {

    private static final int ID = 0x02;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundConfigurationPluginMessage.class, ServerboundConfigurationPluginMessage::new);
    }

    private NamespacedKey channel;
    private byte[] data;

    public ServerboundConfigurationPluginMessage() {}

    public ServerboundConfigurationPluginMessage(NamespacedKey channel, byte[] data) {
        this.channel = channel;
        this.data = data;
    }

    public NamespacedKey channel() {
        return channel;
    }

    public byte[] data() {
        return data;
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.CONFIGURATION;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeNamespacedKey(channel);
        buf.writeBytes(data);
    }

    @Override
    public void deserialize(FriendlyByteBuf buf) {
        channel = buf.readNamespacedKey();
        data = buf.finish();
    }

}
