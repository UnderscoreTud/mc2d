package me.tud.mc2d.util;

import org.joml.Vector3d;

public final class LpVec3 {

    private LpVec3() {}

    public static void write(FriendlyByteBuf buf, Vector3d vector) {
        double x = sanitize(vector.x);
        double y = sanitize(vector.y);
        double z = sanitize(vector.z);

        double absX = Math.abs(x);
        double absY = Math.abs(y);
        double absZ = Math.abs(z);
        double chessboardLength = Math.max(absX, Math.max(absY, absZ));
        if (chessboardLength < 3.051944088384301E-5) {
            buf.writeByte((byte) 0);
            return;
        }

        long scale = (long) Math.ceil(chessboardLength);
        boolean partial = (scale & 3) != scale;
        long markers = partial ? scale & 3L | 4L : scale;
        long xn = pack(x / scale) << 3;
        long yn = pack(y / scale) << 18;
        long zn = pack(z / scale) << 33;
        long buffer = markers | xn | yn | zn;
        buf.writeByte((byte) buffer);
        buf.writeByte((byte) (buffer >> 8));
        buf.writeInt((int) (buffer >> 16));
        if (partial) {
            buf.writeVarInt((int) (scale >> 2));
        }
    }

    public static Vector3d read(FriendlyByteBuf buf) {
        int lowest = buf.readByte();
        if (lowest == 0)
            return new Vector3d();

        int middle = buf.readByte();
        long highest = buf.readInt();
        long buffer = highest << 16 | middle << 8 | lowest;
        long scale = lowest & 3;
        if (hasContinuationBit(lowest))
            scale |= (buf.readVarInt() & 4294967295L) << 2;

        return new Vector3d(unpack(buffer >> 3) * scale, unpack(buffer >> 18) * scale, unpack(buffer >> 33) * scale);
    }

    private static double sanitize(final double value) {
        return Double.isNaN(value) ? 0.0 : Math.clamp(value, -1.7179869183E10, 1.7179869183E10);
    }

    private static long pack(final double value) {
        return Math.round((value * 0.5 + 0.5) * 32766.0);
    }

    private static double unpack(final long value) {
        return Math.min(value & 32767L, 32766.0) * 2.0 / 32766.0 - 1.0;
    }

    public static boolean hasContinuationBit(final int in) {
        return (in & 4) == 4;
    }

}
