package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
public class ClientboundConfigurationFinishConfiguration implements ClientboundPacket {

    private static final int ID = 0x03;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerSimplePacket(
                ID,
                ClientboundConfigurationFinishConfiguration.class,
                ClientboundConfigurationFinishConfiguration::new
        );
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
    public void serialize(FriendlyByteBuf buf) {}

}
