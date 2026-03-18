package me.tud.mc2d.network.packets.serverbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.tud.mc2d.entity.player.Hand;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.machinemc.paklet.CustomPacket;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Token;

@Data
@Packet(
        id = Packets.Play.Serverbound.INTERACT,
        group = Packets.Play.Serverbound.NAME,
        catalogue = Packets.Play.Serverbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ServerboundPlayInteract implements ServerboundPacket, CustomPacket {

    private int entityID;
    private Type type;
    /**
     * Present if {@code type} is {@link Type#INTERACT_AT}, else null
     */
    private @Nullable Vector3f targetLocation;
    /**
     * Present if {@code type} is {@link Type#INTERACT} or {@link Type#INTERACT_AT}, else null
     */
    private @Nullable Hand hand;
    private boolean sneakKeyPressed;

    @Override
    public void construct(SerializerContext context, DataVisitor visitor) {
        entityID = visitor.read(context, context.serializerProvider().getFor(Integer.class));
        type = visitor.read(context.withType(new Token<Type>() {}), context.serializerProvider().getFor(Type.class));
        if (type == Type.INTERACT_AT)
            targetLocation = visitor.read(context, context.serializerProvider().getFor(Vector3f.class));
        if (type == Type.INTERACT || type == Type.INTERACT_AT)
            hand = visitor.read(context.withType(new Token<Hand>() {}), context.serializerProvider().getFor(Hand.class));
        sneakKeyPressed = visitor.read(context, context.serializerProvider().getFor(boolean.class));
    }

    @Override
    public void deconstruct(SerializerContext context, DataVisitor visitor) {
        visitor.write(context, context.serializerProvider().getFor(Integer.class), entityID);
        visitor.write(context.withType(new Token<Type>() {}), context.serializerProvider().getFor(Type.class), type); 
        if (type == Type.INTERACT_AT)
            visitor.write(context, context.serializerProvider().getFor(Vector3f.class), targetLocation);
        if (type == Type.INTERACT || type == Type.INTERACT_AT)
            visitor.write(context.withType(new Token<Hand>() {}), context.serializerProvider().getFor(Hand.class), hand); 
        visitor.write(context, context.serializerProvider().getFor(boolean.class), sneakKeyPressed); 
    }

    public enum Type {
        INTERACT,
        ATTACK,
        INTERACT_AT
    }

}
