package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.With;
import me.tud.mc2d.generated.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;

@With
public record ServerboundConfigurationPluginMessage(NamespacedKey channel, byte[] data) implements Packet {

    private static final Packet.Info INFO = Packets.Configuration.Serverbound.CUSTOM_PAYLOAD;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ServerboundConfigurationPluginMessage.class, ServerboundConfigurationPluginMessage::new);
    }

    public ServerboundConfigurationPluginMessage(FriendlyByteBuf buf) {
        this(buf.readNamespacedKey(), buf.finish());
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeNamespacedKey(channel);
        buf.writeBytes(data);
    }

}
