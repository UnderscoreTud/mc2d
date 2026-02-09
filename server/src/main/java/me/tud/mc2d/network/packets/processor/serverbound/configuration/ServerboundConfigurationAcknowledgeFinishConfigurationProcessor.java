package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.entity.player.GameMode;
import me.tud.mc2d.gameevent.GameEventType;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayGameEvent;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayLogin;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationAcknowledgeFinishConfiguration;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NamespacedKey;

public class ServerboundConfigurationAcknowledgeFinishConfigurationProcessor
        implements PacketProcessor<ServerboundConfigurationAcknowledgeFinishConfiguration> {

    @Override
    public void process(ServerboundConfigurationAcknowledgeFinishConfiguration packet, ClientConnection connection) {
        connection.state(ConnectionState.PLAY);
        RegistryAccess registryAccess = connection.server().context().registryAccess();
        // TODO create and spawn player
        connection.sendPacket(new ClientboundPlayLogin(
                0,
                false,
                registryAccess.get(RegistryKey.DIMENSION_TYPE).keys().toArray(new NamespacedKey[0]),
                10,
                10,
                10,
                false,
                true,
                false,
                0,
                NamespacedKey.minecraft("overworld"),
                0,
                GameMode.SURVIVAL,
                null,
                false,
                false,
                false,
                null,
                null,
                0,
                0,
                false
        ));
//        connection.sendPacket(new ClientboundPlaySynchronizePosition(0, new Vector3d(), new Vector3d(), 0, 0, Collections.emptySet()));
        connection.sendPacket(new ClientboundPlayGameEvent(GameEventType.START_WAITING_FOR_CHUNKS.create(null)));
    }

}
