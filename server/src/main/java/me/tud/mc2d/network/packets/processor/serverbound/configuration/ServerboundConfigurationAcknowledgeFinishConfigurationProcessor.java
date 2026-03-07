package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.chunk.Chunk;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.Entity;
import me.tud.mc2d.entity.EntityType;
import me.tud.mc2d.entity.TextDisplay;
import me.tud.mc2d.entity.metadata.Metadata;
import me.tud.mc2d.entity.player.GameMode;
import me.tud.mc2d.gameevent.GameEventType;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.*;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationAcknowledgeFinishConfiguration;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.block.Block;
import org.joml.Vector3d;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.style.ChatColor;
import org.machinemc.scriptive.style.ChatStyle;
import org.machinemc.scriptive.style.TextFormat;

import java.awt.*;
import java.util.Collections;
import java.util.UUID;

public class ServerboundConfigurationAcknowledgeFinishConfigurationProcessor
        implements PacketProcessor<ServerboundConfigurationAcknowledgeFinishConfiguration> {

    @Override
    public void process(ServerboundConfigurationAcknowledgeFinishConfiguration packet, ClientConnection connection) {
        connection.state(ConnectionState.PLAY);
        RegistryAccess registryAccess = connection.server().context().registryAccess();
        // TODO create and spawn player
        connection.sendPacket(new ClientboundPlayLogin(
                Entity.nextID(),
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
                GameMode.SPECTATOR,
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
        connection.sendPacket(new ClientboundPlaySynchronizePosition(0, new Vector3d(0.5, 32, 0.5), new Vector3d(), 0, 0, Collections.emptySet()));
        connection.sendPacket(new ClientboundPlayGameEvent(GameEventType.START_WAITING_FOR_CHUNKS.create(null)));

        int radius = 10;
        int offsetX = 0, offsetZ = 0;

        int base = 8;
        double a = 4.5;
        double b = 3.5;
        double fx = 7.0;
        double fz = 9.0;

        for (int chunkX = -radius + offsetX; chunkX <= radius + offsetX; chunkX++) {
            for (int chunkZ = -radius + offsetZ; chunkZ <= radius + offsetZ; chunkZ++) {
                Chunk chunk = new Chunk(connection.server(), DimensionType.OVERWORLD, chunkX, chunkZ);

                for (int x = 0; x < 16; x++) {
                    for (int z = 0; z < 16; z++) {

                        int gx = chunkX * 16 + x;
                        int gz = chunkZ * 16 + z;

                        int h = (int) Math.floor(base + a * Math.sin(gx / fx) + b * Math.cos(gz / fz));

                        for (int y = 0; y < 16; y++) {
                            if (y <= h) {
                                int band = (y / 3) % 3;

                                Block<?> block;
                                if (band == 0) block = Block.STONE;
                                else if (band == 1) block = Block.DEEPSLATE;
                                else block = Block.TUFF;

                                chunk.setBlock(x, y + 16, z, block);
                            }
                        }
                    }
                }

                ClientboundPlayChunkDataAndUpdateLight chunkPacket = chunk.createChunkPacket();
                connection.sendPacket(chunkPacket);
            }
        }

        Entity entity = new Entity(UUID.randomUUID(), EntityType.TEXT_DISPLAY);
        entity.setMetadata(Metadata.TextDisplay.TEXT, TextComponent.of("_tud", new TextFormat(ChatColor.RED, ChatStyle.BOLD)).getProperties());
        entity.setMetadata(Metadata.TextDisplay.HAS_SHADOW, true);

        entity.position(new Vector3d(0, 32, 0));
        connection.sendPacket(new ClientboundPlaySpawnEntity(entity));
//        connection.sendPacket(new ClientboundPlaySetCamera(entity.entityID()));
        connection.sendPacket(new ClientboundPlaySetEntityMetadata(entity.entityID(), entity.metadataContainer()));
    }

}
