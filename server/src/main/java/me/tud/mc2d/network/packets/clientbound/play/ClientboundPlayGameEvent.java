package me.tud.mc2d.network.packets.clientbound.play;

import lombok.With;
import me.tud.mc2d.gameevent.GameEvent;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ClientboundPlayGameEvent(GameEvent<?> gameEvent) implements Packet {

    public static final Packet.Info INFO = Packets.Play.Clientbound.GAME_EVENT;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ClientboundPlayGameEvent.class, ClientboundPlayGameEvent::new);
    }
    
    public ClientboundPlayGameEvent(FriendlyByteBuf buf) {
        this(GameEvent.deserialize(buf));
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeByte(gameEvent.type().id())
                .writeFloat(gameEvent.asFloat());
    }

}
