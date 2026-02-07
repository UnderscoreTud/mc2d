package me.tud.mc2d.network.packets.clientbound.play;

import lombok.With;
import me.tud.mc2d.gameevent.GameEvent;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.FriendlyByteBuf;

@With
public record ClientboundPlayGameEvent(GameEvent<?> gameEvent) implements ClientboundPacket {

    public static int ID = 0x22;

    @RegisterHandler(ConnectionState.PLAY)
    public static void register(PacketRegistry.Group group) {
        group.registerPacket(ID, ClientboundPlayGameEvent.class, ClientboundPlayGameEvent::new);
    }
    
    public ClientboundPlayGameEvent(FriendlyByteBuf buf) {
        this(GameEvent.deserialize(buf));
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.PLAY;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeByte(gameEvent.type().id())
                .writeFloat(gameEvent.asFloat());
    }

}
