package me.tud.mc2d.canvas.world;

import lombok.*;
import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.chunk.Chunk;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.Entity;
import me.tud.mc2d.entity.EntityType;
import me.tud.mc2d.entity.attribute.Attribute;
import me.tud.mc2d.entity.attribute.AttributeProperty;
import me.tud.mc2d.entity.metadata.Metadata;
import me.tud.mc2d.entity.player.GameMode;
import me.tud.mc2d.gameevent.GameEventType;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationRegistryData;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationRegistryData.Entry;
import me.tud.mc2d.network.packets.clientbound.play.*;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.ChunkUtils;
import me.tud.mc2d.util.LinearCalibration;
import me.tud.mc2d.util.NamespacedKey;
import me.tud.mc2d.world.Biome;
import org.apache.commons.lang3.ArrayUtils;
import org.joml.Vector3d;
import org.machinemc.scriptive.components.TextComponent;

import java.util.Collections;
import java.util.UUID;

@Data
public class WorldCanvasSession implements CanvasSession {

    private static final LinearCalibration CALIBRATION = new LinearCalibration(
            calculateTheoreticalZ(128, 72, 70, 16.0 / 9.0), 52.425,
            calculateTheoreticalZ(32, 18, 70, 16.0 / 9.0), 13.875
    );

    private final @ToString.Exclude AbstractWorldCanvas canvas;
    private final ClientConnection viewer;
    private final @Getter Vector3d cameraPosition;
    private @Setter(AccessLevel.NONE) volatile boolean initialized, spawnPlayer, loaded, active = true;
    private int cameraID = -1, vehicleID = -1;

    public WorldCanvasSession(AbstractWorldCanvas canvas, ClientConnection viewer) {
        this.canvas = canvas;
        this.viewer = viewer;
        this.cameraPosition = calculateCameraPosition();
        if (canvas().direction() == WorldCanvas.Direction.UP)
            this.cameraPosition.add(0, 1, 0);
    }

    @Override
    public boolean initialized() {
        return initialized && active;
    }

    @Override
    public boolean loaded() {
        return initialized && loaded && active;
    }

    @Override
    public boolean initialize() {
        if (initialized)
            throw new IllegalStateException("Session '" + this + "' has already been initialized");

        if (viewer.outgoingState() == ConnectionState.PLAY) {
            spawnPlayer = false;
            return initialized = true;
        }

        if (viewer.outgoingState() != ConnectionState.CONFIGURATION)
            return false;

        viewer.sendPacket(new ClientboundConfigurationRegistryData(
                RegistryKey.DIMENSION_TYPE.key(),
                new Entry[]{new Entry(WorldCanvas.DIMENSION_KEY, canvas.dimensionType().toNBT())}
        ));
        viewer.sendPacket(new ClientboundConfigurationRegistryData(
                RegistryKey.BIOME.key(),
                new Entry[]{
                        new Entry(WorldCanvas.BIOME_KEY, canvas.biome().toNBT()),
                        new Entry(NamespacedKey.minecraft("plains"), Biome.PLAINS.toNBT()) // apparently it's required?
                }
        ));

        spawnPlayer = true;
        return initialized = true;
    }

    private Entity spawnPlayer() {
        Entity player = new Entity(viewer.uuid(), EntityType.PLAYER);
        viewer.sendPacket(new ClientboundPlayLogin(
                player.entityID(),
                false,
                new NamespacedKey[]{WorldCanvas.DIMENSION_KEY},
                10,
                32,
                32,
                false,
                true,
                false,
                0,
                WorldCanvas.DIMENSION_KEY,
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

        player.setMetadata(Metadata.Player.IS_INVISIBLE, true);
        viewer.sendPacket(new ClientboundPlaySetEntityMetadata(player));
        viewer.sendPacket(new ClientboundPlayUpdateAttributes(
                player,
                new AttributeProperty(Attribute.ENTITY_INTERACTION_RANGE, Attribute.ENTITY_INTERACTION_RANGE.max())
        ));

        viewer.sendPacket(new ClientboundPlayGameEvent(GameEventType.START_WAITING_FOR_CHUNKS.create(null)));
        return player;
    }

    @Override
    public boolean load() {
        if (loaded)
            throw new IllegalStateException("Session '" + this + "' has already been loaded");

        if (viewer.outgoingState() != ConnectionState.PLAY)
            return false;

        loaded = true;

        Entity player = null;
        if (spawnPlayer)
            player = spawnPlayer();

        Vector3d position = cameraPosition();
        viewer.sendPacket(new ClientboundPlaySynchronizePosition(
                0,
                position,
                new Vector3d(),
                0,
                0,
                Collections.emptySet()
        ));

        int centerX = ChunkUtils.chunkCoord(position.x);
        int centerZ = ChunkUtils.chunkCoord(position.z);

        viewer.sendPacket(new ClientboundPlaySetChunkCenter(centerX, centerZ));

        Entity camera = new Entity(UUID.randomUUID(), EntityType.MARKER);
        cameraID = camera.entityID();
        camera.position(position);
        camera.yaw(canvas.direction().yaw());
        camera.pitch(canvas.direction().pitch());
        viewer.sendPacket(new ClientboundPlaySpawnEntity(camera));
        viewer.sendPacket(new ClientboundPlaySetCamera(camera.entityID()));

        Entity vehicle = new Entity(EntityType.DONKEY);
        vehicleID = vehicle.entityID();
        vehicle.position(position);
        vehicle.setMetadata(Metadata.Donkey.IS_INVISIBLE, true);
        vehicle.setMetadata(Metadata.Donkey.HAS_NO_GRAVITY, true);
        vehicle.setMetadata(Metadata.Donkey.HAS_CHEST, true);
        vehicle.spawn(viewer);

        if (player != null) {
            viewer.sendPacket(new ClientboundPlaySetPassengers(vehicle, player));
            viewer.sendActionBar(TextComponent.empty());
        }

        Chunk[] chunks = canvas.chunks();
        Chunk maxChunk = chunks.length != 0 ? chunks[chunks.length - 1] : null;

        int minX = -1;
        int minZ = -1;
        int maxX = (maxChunk != null ? maxChunk.x() : 0) + 1;
        int maxZ = Math.max((maxChunk != null ? maxChunk.z() : 0), centerZ + 1) + 1;

        ClientboundPlayChunkDataAndUpdateLight emptyChunkPacket = new Chunk(
                canvas().dimensionType(),
                canvas().biome(),
                0, 0
        ).createChunkPacket();

        for (int x = minX; x <= maxX; x++) {
            for (int z = minZ; z <= maxZ; z++)
                viewer.sendPacket(emptyChunkPacket.withX(x).withZ(z));
        }

        for (Chunk chunk : chunks)
            viewer.sendPacket(chunk.createChunkPacket());
        return true;
    }

    @Override
    public void close() {
        if (!active)
            throw new IllegalStateException("Session '" + this + "' has already been closed");
        if (loaded) {
            for (Chunk chunk : canvas.chunks())
                viewer.sendPacket(new ClientboundPlayUnloadChunk(chunk.x(), chunk.z()));
        }
        int[] entities = new int[0];
        if (cameraID != -1)
            entities = ArrayUtils.add(entities, cameraID);
        if (vehicleID != -1)
            entities = ArrayUtils.add(entities, vehicleID);
        if (entities.length != 0)
            viewer.sendPacket(new ClientboundPlayRemoveEntities(entities));
        active = false;
    }

    protected Vector3d calculateCameraPosition() {
        return new Vector3d((double) canvas.worldWidth() / 2, (double) canvas.worldHeight() / 2, calculateZ(CALIBRATION));
    }

    protected double calculateZ(LinearCalibration calibration) {
        return calibration.apply(calculateTheoreticalZ(
                canvas().width(),
                canvas().height(),
                viewer().assumedFOV(),
                viewer().assumedAspectRatio()
        ));
    }

    protected static double calculateTheoreticalZ(double width, double height, double fov, double aspectRatio) {
        double verticalFOV = Math.toRadians(fov);
        double tanHalf = Math.tan(verticalFOV / 2.0);

        double widthZ = (width / 2.0) / (tanHalf * aspectRatio);
        double heightZ = (height / 2.0) / tanHalf;

        return Math.max(widthZ, heightZ);
    }

}
