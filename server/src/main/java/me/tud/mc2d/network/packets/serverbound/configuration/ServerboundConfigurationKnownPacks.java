package me.tud.mc2d.network.packets.serverbound.configuration;

import lombok.With;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.generated.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ServerboundConfigurationKnownPacks(DataPack... knownPacks) implements Packet {

    private static final Packet.Info INFO = Packets.Configuration.Serverbound.SELECT_KNOWN_PACKS;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ServerboundConfigurationKnownPacks.class, ServerboundConfigurationKnownPacks::new);
    }

    public ServerboundConfigurationKnownPacks(FriendlyByteBuf buf) {
        this(buf.readArray(DataPack[]::new, DataPack::read));
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeArray(knownPacks, FriendlyByteBuf::write);
    }

}
