package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@Data
@With
public class ServerboundConfigurationKnownPacks implements ServerboundPacket {

    private static final int ID = 0x07;

    @RegisterHandler(ConnectionState.CONFIGURATION)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ServerboundConfigurationKnownPacks.class, ServerboundConfigurationKnownPacks::new);
    }

    private final DataPack[] knownPacks;

    public ServerboundConfigurationKnownPacks(FriendlyByteBuf buf) {
        this(buf.readArray(DataPack[]::new, DataPack::read));
    }

    public ServerboundConfigurationKnownPacks(DataPack... knownPacks) {
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
