package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;

@Data
@With
@RequiredArgsConstructor
public class ServerboundConfigurationPluginMessage implements ServerboundPacket {

    private static final int ID = 0x02;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundConfigurationPluginMessage.class, ServerboundConfigurationPluginMessage::new);
    }

    private final NamespacedKey channel;
    private final byte[] data;

    public ServerboundConfigurationPluginMessage(FriendlyByteBuf buf) {
        this(buf.readNamespacedKey(), buf.finish());
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

}
