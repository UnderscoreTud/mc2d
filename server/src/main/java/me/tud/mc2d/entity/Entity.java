package me.tud.mc2d.entity;

import lombok.Data;
import me.tud.mc2d.entity.metadata.MetadataContainer;
import me.tud.mc2d.entity.metadata.MetadataEntry;
import me.tud.mc2d.entity.metadata.MetadataHolder;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3d;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

@Data
public class Entity implements MetadataHolder {

    private static final AtomicInteger ID_TRACKER = new AtomicInteger();

    private final int entityID;
    private final UUID uuid;
    private final MetadataContainer metadataContainer = new MetadataContainer();
    private EntityType type;

    private @NotNull Vector3d position = new Vector3d(), velocity = new Vector3d();
    private float pitch, yaw, headYaw;

    public Entity() {
        this(UUID.randomUUID());
    }

    public Entity(UUID uuid) {
        this(uuid, EntityTypes.PIG);
    }

    public Entity(UUID uuid, EntityType type) {
        this.entityID = nextID();
        this.uuid = uuid;
        this.type = type;
    }

    @Override
    public <T> T getMetadata(MetadataEntry<T> entry) {
        return metadataContainer.getMetadata(entry);
    }

    @Override
    public <T> void setMetadata(MetadataEntry<T> entry, T value) {
        metadataContainer.setMetadata(entry, value);
        // TODO send packet to viewers
    }

    @Override
    public void editMetadata(Consumer<MetadataHolder> consumer) {
        consumer.accept(metadataContainer);
        // TODO send packet to viewers
    }

    public static int nextID() {
        return ID_TRACKER.getAndIncrement();
    }

}
