package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.With;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ClientboundConfigurationKnownPacks(DataPack... knownPacks) implements ClientboundPacket {

    private static final int ID = 0x0E;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundConfigurationKnownPacks.class, ClientboundConfigurationKnownPacks::new);
    }

    public ClientboundConfigurationKnownPacks(FriendlyByteBuf buf) {
        this(buf.readArray(DataPack[]::new, DataPack::read));
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
        buf.writeArray(knownPacks, FriendlyByteBuf::write);
    }

}
