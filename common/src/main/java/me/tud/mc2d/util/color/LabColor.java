package me.tud.mc2d.util.color;

import org.joml.Matrix3d;
import org.joml.Matrix3dc;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public record LabColor(
        double L,
        double a,
        double b
) {

    // http://brucelindbloom.com/index.html?Eqn_RGB_XYZ_Matrix.html
    // sRGB Working Space, D65 2° Reference White Point
    private static final Matrix3dc XYZ_TRANSFORMATION = new Matrix3d(
            0.4124564, 0.3575761, 0.1804375,
            0.2126729, 0.7151522, 0.0721750,
            0.0193339, 0.1191920, 0.9503041
    ).transpose();

    private static final Matrix3dc INVERSE_XYZ_TRANSFORMATION = new Matrix3d(
            3.2404542, -1.5371385, -0.4985314, 
            -0.9692660, 1.8760108,  0.0415560, 
            0.0556434, -0.2040259,  1.0572252
    ).transpose();

    // https://en.wikipedia.org/wiki/Standard_illuminant#D65_values
    private static final Vector3dc D65 = new Vector3d(0.95047, 1, 1.08883);

    // http://brucelindbloom.com/index.html?LContinuity.html
    private static final double EPSILON = 0.008856;
    private static final double K_0 = 903.3;
    private static final double K_1 = 7.787;

    private static final double POW25_7 = 6103515625.0;

    public int toRGB() {
        double fy = (L + 16) / 116;
        double fx = a / 500 + fy;
        double fz = fy - b / 200;

        double xr = fInverse(fx);
        double yr = L > K_0 * EPSILON ? fy * fy * fy : L / K_0;
        double zr = fInverse(fz);

        Vector3d rgb = new Vector3d(xr * D65.x(), yr * D65.y(), zr * D65.z());
        rgb.mul(INVERSE_XYZ_TRANSFORMATION);

        double r = inverseGammaCorrection(rgb.x());
        double g = inverseGammaCorrection(rgb.y());
        double b = inverseGammaCorrection(rgb.z());

        int ri = (int) Math.round(Math.clamp(r, 0, 1) * 255);
        int gi = (int) Math.round(Math.clamp(g, 0, 1) * 255);
        int bi = (int) Math.round(Math.clamp(b, 0, 1) * 255);

        return ri << 16 | gi << 8 | bi;
    }

    public double euclideanDistanceSquared(LabColor other) {
        double L = other.L() - L();
        double a = other.a() - a();
        double b = other.b() - b();
        return L * L + a * a + b * b;
    }

    public double euclideanDistance(LabColor other) {
        return Math.sqrt(euclideanDistanceSquared(other));
    }

    public double differenceSquared(LabColor other) {
        return differenceSquared(other, 1, 1, 1);
    }

    // https://hajim.rochester.edu/ece/sites/gsharma/papers/CIEDE2000CRNAFeb05.pdf
    public double differenceSquared(LabColor other, double k_L, double k_C, double k_H) {
        double L_1 = L(), a_1 = a(), b_1 = b(), L_2 = other.L(), a_2 = other.a(), b_2 = other.b();

        double C_1 = c(), C_2 = other.c();
        double CBar = (C_1 + C_2) / 2;

        double C2 = CBar * CBar;
        double C4 = C2 * C2;
        double C7 = C4 * C2 * CBar;
        double G = (1 - Math.sqrt(C7 / (C7 + POW25_7))) / 2;

        double ap_1 = (1 + G) * a_1;
        double ap_2 = (1 + G) * a_2;

        double Cp_1 = Math.sqrt(ap_1 * ap_1 + b_1 * b_1);
        double Cp_2 = Math.sqrt(ap_2 * ap_2 + b_2 * b_2);

        double hp_1 = h(ap_1, b_1), hp_2 = h(ap_2, b_2);

        double dLp = L_2 - L_1;
        double dCp = Cp_2 - Cp_1;

        double dhp = Cp_1 == 0 || Cp_2 == 0 ? 0 : hp_2 - hp_1;
        if (dhp > 180) {
            dhp -= 360;
        } else if (dhp < -180) {
            dhp += 360;
        }
        double dHp = 2 * Math.sqrt(Cp_1 * Cp_2) * Math.sin(Math.toRadians(dhp / 2));

        double Lp = (L_1 + L_2) / 2;
        double Cp = (Cp_1 + Cp_2) / 2;

        double hp;
        if (Cp_1 == 0 || Cp_2 == 0) {
            hp = hp_1 + hp_2;
        } else if (Math.abs(hp_1 - hp_2) <= 180) {
            hp = (hp_1 + hp_2) / 2;
        } else if (hp_1 + hp_2 < 360) {
            hp = (hp_1 + hp_2 + 360) / 2;
        } else {
            hp = (hp_1 + hp_2 - 360) / 2;
        }

        double T = 1 
                - 0.17 * Math.cos(Math.toRadians(hp - 30)) 
                + 0.24 * Math.cos(Math.toRadians(2 * hp)) 
                + 0.32 * Math.cos(Math.toRadians(3 * hp + 6)) 
                - 0.20 * Math.cos(Math.toRadians(4 * hp - 63));

        double hpTerm = (hp - 275) / 25;
        double dTheta = 30 * Math.exp(-(hpTerm * hpTerm));
        double Cp2 = Cp * Cp;
        double Cp4 = Cp2 * Cp2;
        double Cp7 = Cp4 * Cp2 * Cp;
        double R_C = 2 * Math.sqrt(Cp7 / (Cp7 + POW25_7));

        double LpTerm = Lp - 50;
        double LpTerm2 = LpTerm * LpTerm;
        double S_L = 1 + (0.015 * LpTerm2 / Math.sqrt(20 + LpTerm2));
        double S_C = 1 + 0.045 * Cp;
        double S_H = 1 + 0.015 * Cp * T;
        double R_T = -Math.sin(Math.toRadians(2 * dTheta)) * R_C;

        double lTerm = dLp / (k_L * S_L);
        double cTerm = dCp / (k_C * S_C);
        double hTerm = dHp / (k_H * S_H);
        return lTerm * lTerm + cTerm * cTerm + hTerm * hTerm + R_T * cTerm * hTerm;
    }

    public double difference(LabColor other) {
        return Math.sqrt(differenceSquared(other));
    }

    public double difference(LabColor other, double k_L, double k_C, double k_H) {
        return Math.sqrt(differenceSquared(other, k_L, k_C, k_H));
    }

    private double c() {
        return Math.sqrt(a * a + b * b);
    }

    public static LabColor fromRGB(int rgb) {
        return fromRGB(
                rgb >> 16 & 0xFF,
                rgb >> 8 & 0xFF,
                rgb & 0xFF
        );
    }

    public static LabColor fromRGB(int r, int g, int b) {
        return fromRGB(r / 255.0, g / 255.0, b / 255.0);
    }

    public static LabColor fromRGB(double r, double g, double b) {
        double rLinear = gammaCorrection(r);
        double gLinear = gammaCorrection(g);
        double bLinear = gammaCorrection(b);
        Vector3d xyz = new Vector3d(rLinear, gLinear, bLinear);
        xyz.mul(XYZ_TRANSFORMATION);
        double Y = f(xyz.y() / D65.y());
        double LStar = 116 * Y - 16;
        double aStar = 500 * (f(xyz.x() / D65.x()) - Y);
        double bStar = 200 * (Y - f(xyz.z() / D65.z()));
        return new LabColor(LStar, aStar, bStar);
    }

    private static double gammaCorrection(double value) {
        if (value > 0.04045)
            return Math.pow((value + 0.055) / 1.055, 2.4);
        return value / 12.92;
    }

    private static double inverseGammaCorrection(double value) {
        if (value > 0.0031308)
            return 1.055 * Math.pow(value, 1.0 / 2.4) - 0.055;
        return 12.92 * value;
    }

    private static double f(double t) {
        return t > EPSILON ? Math.cbrt(t) : (K_1 * t) + 16.0 / 116.0;
    }

    private static double fInverse(double t) {
        double n3 = t * t * t;
        return n3 > EPSILON ? n3 : (t - (16 / 116.0)) / K_1;
    }

    private static double h(double a, double b) {
        if (a == 0 && b == 0)
            return 0;
        double h = Math.toDegrees(atan2(b, a));
        return h >= 0 ? h : h + 360;
    }

    // https://math.stackexchange.com/questions/1098487/atan2-faster-approximation
    private static double atan2(double y, double x) {
        double absX = Math.abs(x);
        double absY = Math.abs(y);
        double a = Math.min(absX, absY) / Math.max(absX, absY);
        double s = a * a;
        double r = ((-0.0464964749 * s + 0.15931422) * s - 0.327622764) * s * a + a;
        if (absY > absX)
            r = 1.57079637 - r;
        if (x < 0)
            r = 3.14159274 - r;
        if (y < 0)
            r = -r;
        return r;
    }

}
