package me.tud.mc2d.network.packets.clientbound.configuration;

import lombok.With;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ClientboundConfigurationKnownPacks(DataPack... knownPacks) implements Packet {

    private static final Packet.Info INFO = Packets.Configuration.Clientbound.SELECT_KNOWN_PACKS;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ClientboundConfigurationKnownPacks.class, ClientboundConfigurationKnownPacks::new);
    }

    public ClientboundConfigurationKnownPacks(FriendlyByteBuf buf) {
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
