package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.With;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.entity.player.ClientInformation;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ServerboundConfigurationClientInformation(ClientInformation clientInformation)
        implements Packet {

    private static final Packet.Info INFO = Packets.Configuration.Serverbound.CLIENT_INFORMATION;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ServerboundConfigurationClientInformation.class, ServerboundConfigurationClientInformation::new);
    }

    public ServerboundConfigurationClientInformation(FriendlyByteBuf buf) {
        this(ClientInformation.read(buf));
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.write(clientInformation);
    }

}
