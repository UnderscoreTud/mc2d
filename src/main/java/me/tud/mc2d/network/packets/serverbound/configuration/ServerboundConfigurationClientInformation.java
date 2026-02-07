package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.entity.player.ClientInformation;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
@With
@RequiredArgsConstructor
public class ServerboundConfigurationClientInformation implements ServerboundPacket {

    private static final int ID = 0x00;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundConfigurationClientInformation.class, ServerboundConfigurationClientInformation::new);
    }

    private final ClientInformation clientInformation;

    public ServerboundConfigurationClientInformation(FriendlyByteBuf buf) {
        this(ClientInformation.read(buf));
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
        buf.write(clientInformation);
    }

}
