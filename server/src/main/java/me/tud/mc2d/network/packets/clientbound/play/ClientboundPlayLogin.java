package me.tud.mc2d.network.packets.clientbound.play;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.entity.player.GameMode;
import me.tud.mc2d.generated.Packets;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.network.packets.PacketRegistry;
import me.tud.mc2d.network.packets.RegisterHandler;
import me.tud.mc2d.util.BlockPosition;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.Nullable;

@Data
@With
@RequiredArgsConstructor
public class ClientboundPlayLogin implements Packet {

    private static final Packet.Info INFO = Packets.Play.Clientbound.LOGIN;

    @RegisterHandler
    public static void register(PacketRegistry registry) {
        registry.registerPacket(INFO, ClientboundPlayLogin.class, ClientboundPlayLogin::new);
    }

    private final int entityID;
    private final boolean hardcore;
    private final NamespacedKey[] dimensionNames;
    private final int maxPlayers; // ignored
    private final int viewDistance, simulationDistance;
    private final boolean reducedDebugInfo, enableRespawnScreen, doLimitedCrafting;
    private final int dimensionType;
    private final NamespacedKey dimensionName;
    private final long hashedSeed;
    private final GameMode gameMode;
    private final @Nullable GameMode previousGameMode;
    private final boolean debug, flat, hasDeathLocation;
    private final @Nullable NamespacedKey deathDimensionName;
    private final @Nullable BlockPosition deathLocation;
    private final int portalCooldown, seaLevel;
    private final boolean secureChat;

    public ClientboundPlayLogin(FriendlyByteBuf buf) {
        this.entityID = buf.readInt();
        this.hardcore = buf.readBoolean();
        this.dimensionNames = buf.readArray(NamespacedKey[]::new, FriendlyByteBuf::readNamespacedKey);
        this.maxPlayers = buf.readVarInt();
        this.viewDistance = buf.readVarInt();
        this.simulationDistance = buf.readVarInt();
        this.reducedDebugInfo = buf.readBoolean();
        this.enableRespawnScreen = buf.readBoolean();
        this.doLimitedCrafting = buf.readBoolean();
        this.dimensionType = buf.readVarInt();
        this.dimensionName = buf.readNamespacedKey();
        this.hashedSeed = buf.readLong();
        this.gameMode = GameMode.fromID(buf.readByte());
        byte previousGameModeID = buf.readByte();
        this.previousGameMode = previousGameModeID != -1 ? GameMode.fromID(previousGameModeID) : null;
        this.debug = buf.readBoolean();
        this.flat = buf.readBoolean();
        this.hasDeathLocation = buf.readBoolean();
        if (hasDeathLocation) {
            this.deathDimensionName = buf.readNamespacedKey();
            this.deathLocation = buf.readBlockPosition();
        } else {
            this.deathDimensionName = null;
            this.deathLocation = null;
        }
        this.portalCooldown = buf.readVarInt();
        this.seaLevel = buf.readVarInt();
        this.secureChat = buf.readBoolean();
    }

    @Override
    public Packet.Info info() {
        return INFO;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.writeInt(entityID);
        buf.writeBoolean(hardcore);
        buf.writeArray(dimensionNames, FriendlyByteBuf::writeNamespacedKey);
        buf.writeVarInt(maxPlayers);
        buf.writeVarInt(viewDistance);
        buf.writeVarInt(simulationDistance);
        buf.writeBoolean(reducedDebugInfo);
        buf.writeBoolean(enableRespawnScreen);
        buf.writeBoolean(doLimitedCrafting);
        buf.writeVarInt(dimensionType);
        buf.writeNamespacedKey(dimensionName);
        buf.writeLong(hashedSeed);
        buf.writeByte((byte) gameMode.id());
        buf.writeByte(previousGameMode != null ? (byte) previousGameMode.id() : -1);
        buf.writeBoolean(debug);
        buf.writeBoolean(flat);
        buf.writeBoolean(hasDeathLocation);
        if (hasDeathLocation) {
            assert deathDimensionName != null;
            assert deathLocation != null;
            buf.writeNamespacedKey(deathDimensionName);
            buf.writeBlockPosition(deathLocation);
        }
        buf.writeVarInt(portalCooldown);
        buf.writeVarInt(seaLevel);
        buf.writeBoolean(secureChat);
    }

}
