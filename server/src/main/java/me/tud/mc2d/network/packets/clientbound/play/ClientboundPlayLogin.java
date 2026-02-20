package me.tud.mc2d.network.packets.clientbound.play;

import lombok.*;
import me.tud.mc2d.entity.player.GameMode;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.util.BlockPosition;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.Nullable;
import org.machinemc.paklet.CustomPacket;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Token;

@Data
@Packet(
        id = Packets.Play.Clientbound.LOGIN,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@NoArgsConstructor
@AllArgsConstructor
public class ClientboundPlayLogin implements ClientboundPacket, CustomPacket {

    private int entityID;
    private boolean hardcore;
    private NamespacedKey[] dimensionNames;
    private int maxPlayers; // ignored
    private int viewDistance, simulationDistance;
    private boolean reducedDebugInfo, enableRespawnScreen, doLimitedCrafting;
    private int dimensionType;
    private NamespacedKey dimensionName;
    private long hashedSeed;
    private GameMode gameMode;
    private @Nullable GameMode previousGameMode;
    private boolean debug, flat, hasDeathLocation;
    private @Nullable NamespacedKey deathDimensionName;
    private @Nullable BlockPosition deathLocation;
    private int portalCooldown, seaLevel;
    private boolean secureChat;

    @Override
    public void construct(SerializerContext context, DataVisitor visitor) {
        var varIntSerializer = context.serializerProvider().getFor(Integer.class);
        var byteSerializer = context.serializerProvider().getFor(Byte.class);
        var longSerializer = context.serializerProvider().getFor(Long.class);
        var booleanSerializer = context.serializerProvider().getFor(Boolean.class);
        var namespacedKeySerializer = context.serializerProvider().getFor(NamespacedKey.class);
        var namespacedKeyArraySerializer = context.serializerProvider().getFor(NamespacedKey[].class);
        var blockPositionSerializer = context.serializerProvider().getFor(BlockPosition.class);
        entityID = visitor.readInt();
        hardcore = visitor.read(context, booleanSerializer);
        dimensionNames = visitor.read(context.withType(new Token<NamespacedKey[]>() {}), namespacedKeyArraySerializer);
        maxPlayers = visitor.read(context, varIntSerializer); 
        viewDistance = visitor.read(context, varIntSerializer); 
        simulationDistance = visitor.read(context, varIntSerializer); 
        reducedDebugInfo = visitor.read(context, booleanSerializer); 
        enableRespawnScreen = visitor.read(context, booleanSerializer); 
        doLimitedCrafting = visitor.read(context, booleanSerializer); 
        dimensionType = visitor.read(context, varIntSerializer); 
        dimensionName = visitor.read(context, namespacedKeySerializer); 
        hashedSeed = visitor.read(context, longSerializer);
        gameMode = GameMode.fromID(visitor.read(context, byteSerializer));
        byte previousGameModeID = visitor.read(context, byteSerializer);
        this.previousGameMode = previousGameModeID != -1 ? GameMode.fromID(previousGameModeID) : null;
        debug = visitor.read(context, booleanSerializer); 
        flat = visitor.read(context, booleanSerializer); 
        if (visitor.read(context, booleanSerializer)) {
            deathDimensionName = visitor.read(context, namespacedKeySerializer); 
            deathLocation = visitor.read(context, blockPositionSerializer); 
        }
        portalCooldown = visitor.read(context, varIntSerializer); 
        seaLevel = visitor.read(context, varIntSerializer); 
        secureChat = visitor.read(context, booleanSerializer); 
    }

    @Override
    public void deconstruct(SerializerContext context, DataVisitor visitor) {
        var varIntSerializer = context.serializerProvider().getFor(Integer.class);
        var byteSerializer = context.serializerProvider().getFor(Byte.class);
        var longSerializer = context.serializerProvider().getFor(Long.class);
        var booleanSerializer = context.serializerProvider().getFor(Boolean.class);
        var namespacedKeySerializer = context.serializerProvider().getFor(NamespacedKey.class);
        var namespacedKeyArraySerializer = context.serializerProvider().getFor(NamespacedKey[].class);
        var blockPositionSerializer = context.serializerProvider().getFor(BlockPosition.class);
        visitor.writeInt(entityID);
        visitor.write(context, booleanSerializer, hardcore);
        visitor.write(context.withType(new Token<NamespacedKey[]>() {}), namespacedKeyArraySerializer, dimensionNames);
        visitor.write(context, varIntSerializer, maxPlayers);
        visitor.write(context, varIntSerializer, viewDistance);
        visitor.write(context, varIntSerializer, simulationDistance);
        visitor.write(context, booleanSerializer, reducedDebugInfo);
        visitor.write(context, booleanSerializer, enableRespawnScreen);
        visitor.write(context, booleanSerializer, doLimitedCrafting);
        visitor.write(context, varIntSerializer, dimensionType);
        visitor.write(context, namespacedKeySerializer, dimensionName);
        visitor.write(context, longSerializer, hashedSeed);
        visitor.write(context, byteSerializer, (byte) gameMode.id());
        visitor.write(context, byteSerializer, previousGameMode != null ? (byte) previousGameMode.id() : -1);
        visitor.write(context, booleanSerializer, debug);
        visitor.write(context, booleanSerializer, flat);
        visitor.write(context, booleanSerializer, hasDeathLocation);
        if (hasDeathLocation) {
            visitor.write(context, namespacedKeySerializer, deathDimensionName);
            visitor.write(context, blockPositionSerializer, deathLocation);
        }
        visitor.write(context, varIntSerializer, portalCooldown);
        visitor.write(context, varIntSerializer, seaLevel);
        visitor.write(context, booleanSerializer, secureChat);
    }

}
