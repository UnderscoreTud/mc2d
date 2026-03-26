package me.tud.mc2d.entity;

import com.google.common.base.Preconditions;
import lombok.*;
import me.tud.mc2d.entity.metadata.MetadataContainer;
import me.tud.mc2d.entity.metadata.MetadataEntry;
import me.tud.mc2d.entity.metadata.MetadataHolder;
import me.tud.mc2d.entity.player.Player;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlayRemoveEntities;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySetEntityMetadata;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySpawnEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;
import org.joml.Vector3d;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

@Data
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Entity implements MetadataHolder {

    private static final AtomicInteger ID_TRACKER = new AtomicInteger();

    private final @EqualsAndHashCode.Include @ToString.Include int entityID;
    private final @EqualsAndHashCode.Include @ToString.Include UUID uuid;
    private final @EqualsAndHashCode.Include @ToString.Include EntityType type;
    private final MetadataContainer metadataContainer = new MetadataContainer();

    private final Set<Player> viewers = new HashSet<>();

    private @NotNull Vector3d position = new Vector3d(), velocity = new Vector3d();
    private float pitch, yaw, headYaw;
    private @Setter(AccessLevel.NONE) boolean spawned = false;

    public Entity() {
        this(UUID.randomUUID());
    }

    public Entity(UUID uuid) {
        this(uuid, EntityTypes.PIG);
    }

    public Entity(EntityType type) {
        this(UUID.randomUUID(), type);
    }

    public Entity(UUID uuid, EntityType type) {
        this.entityID = nextID();
        this.uuid = uuid;
        this.type = type;
    }

    public void spawn() {
        Preconditions.checkArgument(!spawned, this + " is already spawned");
        spawned = true;
        for (Player viewer : viewers)
            spawn(viewer);
    }

    public void remove() {
        Preconditions.checkArgument(spawned,  this + " is not spawned");
        spawned = false;
        for (Player viewer : viewers)
            despawn(viewer);
    }

    @Override
    public <T> T getMetadata(MetadataEntry<T> entry) {
        return metadataContainer.getMetadata(entry);
    }

    @Override
    public <T> void setMetadata(MetadataEntry<T> entry, T value) {
        if (value.equals(metadataContainer.getMetadata(entry)))
            return;
        metadataContainer.setMetadata(entry, value);
        flushMetadata();
    }

    @Override
    public void editMetadata(Consumer<MetadataHolder> consumer) {
        consumer.accept(metadataContainer);
        flushMetadata();
    }

    public @UnmodifiableView Set<Player> viewers() {
        return Collections.unmodifiableSet(viewers);
    }

    public boolean addViewer(Player viewer) {
        if (!viewers.add(viewer))
            return false;
        if (spawned)
            spawn(viewer);
        return true;
    }

    public boolean removeViewer(Player viewer) {
        if (!viewers.remove(viewer))
            return false;
        if (spawned)
            despawn(viewer);
        return true;
    }

    protected void spawn(Player viewer) {
        ClientboundPlaySpawnEntity spawnPacket = new ClientboundPlaySpawnEntity(this);
        ClientboundPlaySetEntityMetadata metadataPacket = new ClientboundPlaySetEntityMetadata(this);
        viewer.connection().sendPackets(spawnPacket, metadataPacket);
    }

    private void despawn(Player viewer) {
        viewer.connection().sendPacket(new ClientboundPlayRemoveEntities(this));
    }

    private void flushMetadata() {
        for (Player viewer : viewers)
            viewer.connection().sendPacket(new ClientboundPlaySetEntityMetadata(this));
    }

    public static int nextID() {
        return ID_TRACKER.getAndIncrement();
    }

}
