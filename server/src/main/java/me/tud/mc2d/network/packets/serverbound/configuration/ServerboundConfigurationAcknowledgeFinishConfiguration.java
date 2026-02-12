package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.Data;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ServerboundConfigurationAcknowledgeFinishConfiguration implements Packet {

    private static final Packet.Info INFO = Packets.Configuration.Serverbound.FINISH_CONFIGURATION;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerSimplePacket(
                INFO,
                ServerboundConfigurationAcknowledgeFinishConfiguration.class,
                ServerboundConfigurationAcknowledgeFinishConfiguration::new
        );
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {}

}
