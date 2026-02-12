package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ClientboundConfigurationFinishConfiguration implements Packet {

    private static final Packet.Info INFO = Packets.Configuration.Clientbound.FINISH_CONFIGURATION;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerSimplePacket(
                INFO,
                ClientboundConfigurationFinishConfiguration.class,
                ClientboundConfigurationFinishConfiguration::new
        );
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
