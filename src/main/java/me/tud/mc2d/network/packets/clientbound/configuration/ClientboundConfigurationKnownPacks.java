package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
@With
public class ClientboundConfigurationKnownPacks implements ClientboundPacket {

    private static final int ID = 0x0E;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundConfigurationKnownPacks.class, ClientboundConfigurationKnownPacks::new);
    }

    private final DataPack[] knownPacks;

    public ClientboundConfigurationKnownPacks(FriendlyByteBuf buf) {
        this(buf.readArray(DataPack[]::new, DataPack::read));
    }

    public ClientboundConfigurationKnownPacks(DataPack... knownPacks) {
        this.knownPacks = knownPacks;
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
