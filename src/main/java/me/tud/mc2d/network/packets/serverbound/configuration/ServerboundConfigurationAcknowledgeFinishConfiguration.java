package me.tud.mc2d.network.packets.serverbound.configuration;

import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

public class ServerboundConfigurationAcknowledgeFinishConfiguration implements ServerboundPacket {

    private static final int ID = 0x03;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundConfigurationAcknowledgeFinishConfiguration.class, ServerboundConfigurationAcknowledgeFinishConfiguration::new);
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

    @Override
    public void deserialize(FriendlyByteBuf buf) {}

}
