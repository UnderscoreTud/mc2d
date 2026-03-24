package me.tud.mc2d.canvas.world;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import me.tud.mc2d.canvas.Canvas;
import me.tud.mc2d.canvas.CanvasRegion;
import me.tud.mc2d.canvas.view.*;
import me.tud.mc2d.chunk.Chunk;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.util.ChunkUtils;
import me.tud.mc2d.world.Biome;
import org.jetbrains.annotations.UnmodifiableView;
import org.joml.Vector3d;
import org.joml.Vector3i;

import java.util.Collection;

@Getter
@ToString
public abstract class AbstractWorldCanvas extends AbstractViewableCanvas implements WorldCanvas {

    private final int width, height, size;
    private final int worldWidth, worldHeight, worldSize;
    private final Direction direction;
    private final DimensionType dimensionType;
    private final Biome biome;

    private final @Getter(AccessLevel.PROTECTED) int chunkWidth, chunkHeight;
    private final @Getter(AccessLevel.PROTECTED) Chunk[] chunks;

    protected AbstractWorldCanvas(Builder<?, ?> builder) {
        this.width = builder.width();
        this.height = builder.height();
        this.size = width * height;

        this.worldWidth = builder.worldWidth();
        this.worldHeight = builder.worldHeight();
        this.worldSize = worldWidth * worldHeight;

        this.direction = builder.direction();

        int worldHeight = ceilMultiple(worldHeight(), 16);
        this.dimensionType = builder.dimensionType().toBuilder()
                .minY(0)
                .height(worldHeight)
                .logicalHeight(worldHeight)
                .build();
        this.biome = builder.biome();

        this.chunkWidth = Math.ceilDiv(worldWidth, Chunk.SECTION_DIMENSION);
        this.chunkHeight = Math.ceilDiv(worldHeight, Chunk.SECTION_DIMENSION);

        this.chunks = new Chunk[chunkWidth * chunkHeight];

        for (int i = 0; i < chunks.length; i++) {
            int chunkX = i % chunkWidth;
            int chunkZ = i / chunkWidth;
            chunks[i] = new Chunk(dimensionType, biome, chunkX, chunkZ);
        }
    }

    @Override
    public @UnmodifiableView Collection<? extends WorldCanvasSession> sessions() {
        //noinspection unchecked
        return (Collection<? extends WorldCanvasSession>) super.sessions();
    }

    @Override
    protected CanvasSession createSession(CanvasViewer viewer) {
        if (!(viewer instanceof ClientConnection clientViewer))
            throw new IllegalArgumentException("Expected a client canvas viewer, but got: " + viewer);
        return new WorldCanvasSession(this, clientViewer);
    }

    @Override
    public boolean similarTo(ViewableCanvas other) {
        if (!(other instanceof WorldCanvas worldCanvas))
            return false;
        return dimensionType().toNBT().equals(worldCanvas.dimensionType().toNBT())
                && biome().equals(worldCanvas.biome());
    }

    @Override
    public abstract boolean isDirty();

    @Override
    public abstract @UnmodifiableView Collection<CanvasRegion> dirtyRegions();

    @Override
    public abstract void clearDirty();

    @Override
    public void dispose() {
        for (CanvasSession session : sessions.values()) {
            if (session.active())
                session.close();
        }
    }

    protected void sendPackets(Packet... packets) {
        for (WorldCanvasSession session : sessions()) {
            if (!session.active()) {
                detach(session.viewer());
                continue;
            }

            if (!session.initialized() && !session.initialize())
                continue;
            if (!session.loaded() && !session.load())
                continue;

            session.viewer().sendPackets(packets);
        }
    }

    protected Vector3i global(int x, int y) {
        return global(x, y, 0);
    }

    protected Vector3i global(int x, int y, int z) {
        return switch (direction) {
            case HORIZONTAL -> new Vector3i(x, y, z);
            case UP -> new Vector3i(width - x - 1, z, height - y - 1);
            case DOWN -> new Vector3i(width - x - 1, z, y);
        };
    }

    protected Vector3d global(double x, double y) {
        return global(x, y, 0);
    }

    protected Vector3d global(double x, double y, double z) {
        return switch (direction) {
            case HORIZONTAL -> new Vector3d(x, y , z);
            case UP -> new Vector3d(x, -z , y);
            case DOWN -> new Vector3d(x, z , y);
        };
    }

    protected Chunk chunk(Vector3i position) {
        int cx = ChunkUtils.chunkCoord(position.x);
        int cz = ChunkUtils.chunkCoord(position.z);
        return chunks[cx + cz * chunkWidth];
    }

    private int ceilMultiple(int n, int x) {
        return ((n + x - 1) / x) * x;
    }

    @Getter
    @RequiredArgsConstructor
    public static abstract class Builder<T, B extends Builder<T, B>> extends Canvas.Builder<T, B> {

        protected int worldWidth, worldHeight;
        protected Direction direction = Direction.HORIZONTAL;
        protected DimensionType dimensionType = DimensionType.OVERWORLD;
        protected Biome biome = Biome.PLAINS;

        protected B worldWidth(int worldWidth) {
            this.worldWidth = worldWidth;
            return self();
        }

        protected B worldHeight(int worldHeight) {
            this.worldHeight = worldHeight;
            return self();
        }

        protected B worldSize(int worldWidth, int worldHeight) {
            return worldWidth(worldWidth).worldHeight(worldHeight);
        }

        protected B direction(Direction direction) {
            this.direction = direction;
            return self();
        }

        protected B dimensionType(DimensionType dimensionType) {
            this.dimensionType = dimensionType;
            return self();
        }

        protected B biome(Biome biome) {
            this.biome = biome;
            return self();
        }

    }

}
