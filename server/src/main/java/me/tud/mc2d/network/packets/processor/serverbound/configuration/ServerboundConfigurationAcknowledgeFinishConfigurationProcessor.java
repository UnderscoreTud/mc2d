package me.tud.mc2d.network.packets.processor.serverbound.configuration;

import me.tud.mc2d.chunk.Chunk;
import me.tud.mc2d.chunk.ChunkSection;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.player.GameMode;
import me.tud.mc2d.gameevent.GameEventType;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayChunkDataAndUpdateLight;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayGameEvent;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayLogin;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySynchronizePosition;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.configuration.ServerboundConfigurationAcknowledgeFinishConfiguration;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.block.Block;
import me.tud.mc2d.world.blockdata.GrassData;
import org.joml.Vector3d;

import java.util.Collections;

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
                GameMode.CREATIVE,
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
    }

}
