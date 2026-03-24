package me.tud.mc2d.canvas.world;

import lombok.experimental.Delegate;
import me.tud.mc2d.canvas.CanvasRegion;
import me.tud.mc2d.canvas.event.CanvasEvent;
import me.tud.mc2d.canvas.event.CanvasObserver;
import me.tud.mc2d.chunk.Chunk;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.network.packets.Packet;
import me.tud.mc2d.util.ChunkUtils;
import me.tud.mc2d.world.Biome;
import me.tud.mc2d.world.blockdata.BlockData;
import org.jetbrains.annotations.UnmodifiableView;
import org.joml.Vector3i;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PhysicalBlockWorldCanvas extends AbstractWorldCanvas implements BlockWorldCanvas {

    protected final @Delegate MemoryBlockCanvas base;

    public PhysicalBlockWorldCanvas(Builder builder) {
        super(builder);
        this.base = new MemoryBlockCanvas(builder);
        this.base.addObserver(new CanvasObserver<>() {
            @Override
            public void onPixelChange(CanvasEvent.PixelChange<BlockData> event) {
                Vector3i pos = global(event.x(), event.y());
                Chunk chunk = chunk(pos);
                pos = ChunkUtils.chunkRelative(pos);
                chunk.setBlock(pos.x, pos.y, pos.z, event.newPixel());
            }
        });
    }

    @Override
    public boolean isDirty() {
        return base.isDirty();
    }

    @Override
    public @UnmodifiableView Collection<CanvasRegion> dirtyRegions() {
        return base.dirtyRegions();
    }

    @Override
    public void clearDirty() {
        base.clearDirty();
    }

    @Override
    public void present() {
        if (!isDirty())
            return;

        Set<Chunk> dirtyChunks = new HashSet<>();
        for (CanvasRegion region : dirtyRegions()) {
            for (int x = region.x(); x < region.maxX(); x++) {
                for (int y = region.y(); y < region.maxY(); y++)
                    dirtyChunks.add(chunk(global(x, y)));
            }
        }

        Packet[] packets = new Packet[dirtyChunks.size()];
        int i = 0;
        for (Chunk chunk : dirtyChunks)
            packets[i++] = chunk.createChunkPacket();

        sendPackets(packets);
        clearDirty();
    }
    

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends AbstractWorldCanvas.Builder<PhysicalBlockWorldCanvas, Builder> {

        @Override
        public Builder direction(Direction direction) {
            return super.direction(direction);
        }

        @Override
        public Builder dimensionType(DimensionType dimensionType) {
            return super.dimensionType(dimensionType);
        }

        @Override
        public Builder biome(Biome biome) {
            return super.biome(biome);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public PhysicalBlockWorldCanvas build() {
            this.worldWidth = width;
            this.worldHeight = direction == Direction.HORIZONTAL ? 1 : height;
            return new PhysicalBlockWorldCanvas(this);
        }

    }
}
