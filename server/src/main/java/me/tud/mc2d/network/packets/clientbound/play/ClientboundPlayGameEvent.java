package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.gameevent.GameEvent;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import org.machinemc.paklet.CustomPacket;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.serialization.SerializerContext;

@Data
@Packet(
        id = Packets.Play.Clientbound.GAME_EVENT,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundPlayGameEvent implements ClientboundPacket, CustomPacket {

    private GameEvent<?> gameEvent;

    @Override
    public void construct(SerializerContext context, DataVisitor visitor) {
        gameEvent = GameEvent.of(
                visitor.read(context, context.serializerProvider().getFor(Byte.class)),
                visitor.read(context, context.serializerProvider().getFor(Float.class))
        );
    }

    @Override
    public void deconstruct(SerializerContext context, DataVisitor visitor) {
        visitor.write(context, context.serializerProvider().getFor(Byte.class), gameEvent.type().id());
        visitor.write(context, context.serializerProvider().getFor(Float.class), gameEvent.asFloat());
    }

}
