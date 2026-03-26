package me.tud.mc2d.entity.player;

import com.google.common.base.Preconditions;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.Entity;
import me.tud.mc2d.entity.EntityType;
import me.tud.mc2d.gameevent.GameEventType;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayGameEvent;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayLogin;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySetEntityMetadata;
import me.tud.mc2d.util.NamespacedKey;

@Data
@EqualsAndHashCode(callSuper = true)
public class Player extends Entity {

    public static final GameMode DEFAULT_GAME_MODE = GameMode.SPECTATOR;

    private final ClientConnection connection;
    private GameMode gameMode = DEFAULT_GAME_MODE;
    private NamespacedKey dimensionType = DimensionType.DEFAULT_KEY;
    private boolean reducedDebugInfo = false;

    public Player(ClientConnection connection) {
        Preconditions.checkArgument(connection.player() == null, "Connection " + connection + " is already assigned to a player");
        super(connection.uuid(), EntityType.PLAYER);
        this.connection = connection;
        addViewer(this);
    }

    @Override
    protected void spawn(Player viewer) {
        if (viewer == this) {
            spawnSelf();
            return;
        }
        super.spawn(viewer);
    }

    private void spawnSelf() {
        connection.sendPackets(
                new ClientboundPlayLogin(
                    entityID(),
                    false,
                    new NamespacedKey[]{dimensionType},
                    10,
                    32,
                    32,
                    reducedDebugInfo,
                    true,
                    false,
                    0,
                    dimensionType,
                    0,
                    gameMode,
                    null,
                    false,
                    false,
                    false,
                    null,
                    null,
                    0,
                    0,
                    false
                ),
            new ClientboundPlaySetEntityMetadata(this),
            new ClientboundPlayGameEvent(GameEventType.START_WAITING_FOR_CHUNKS.create(null))
        );
    }

}
