package me.tud.mc2d.util;

import me.tud.mc2d.chunk.Chunk;
import org.joml.*;

import java.lang.Math;

public final class ChunkUtils {

    private ChunkUtils() {}

    public static int chunkCoord(int n) {
        return Math.floorDiv(n, Chunk.SECTION_DIMENSION);
    }

    public static int chunkCoord(long n) {
        return (int) Math.floorDiv(n, Chunk.SECTION_DIMENSION);
    }

    public static int chunkCoord(float n) {
        return (int) Math.floor(n / Chunk.SECTION_DIMENSION);
    }

    public static int chunkCoord(double n) {
        return (int) Math.floor(n / Chunk.SECTION_DIMENSION);
    }

    public static Vector2i chunkPos(Vector3ic pos) {
        return new Vector2i(chunkCoord(pos.x()), chunkCoord(pos.z()));
    }

    public static Vector2i chunkPos(Vector3Lc pos) {
        return new Vector2i(chunkCoord(pos.x()), chunkCoord(pos.z()));
    }

    public static Vector2i chunkPos(Vector3fc pos) {
        return new Vector2i(chunkCoord(pos.x()), chunkCoord(pos.z()));
    }

    public static Vector2i chunkPos(Vector3dc pos) {
        return new Vector2i(chunkCoord(pos.x()), chunkCoord(pos.z()));
    }
    
    public static int sectionRelativeCoord(int n) {
        return (n % Chunk.SECTION_DIMENSION + Chunk.SECTION_DIMENSION) % Chunk.SECTION_DIMENSION;
    }

    public static Vector3i chunkRelative(Vector3i global) {
        return new Vector3i(sectionRelativeCoord(global.x), global.y, sectionRelativeCoord(global.z));
    }

}
