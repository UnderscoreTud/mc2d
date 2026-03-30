package me.tud.mc2d.item.map;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.util.color.LabColor;
import org.machinemc.scriptive.style.HexColor;

import java.awt.*;
import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum MapColor {
    NONE(0, 0, 0, 0),
    GRASS(127, 178, 56),
    SAND(247, 233, 163),
    WOOL(199, 199, 199),
    FIRE(255, 0, 0),
    ICE(160, 160, 255),
    METAL(167, 167, 167),
    PLANT(0, 124, 0),
    SNOW(255, 255, 255),
    CLAY(164, 168, 184),
    DIRT(151, 109, 77),
    STONE(112, 112, 112),
    WATER(64, 64, 255),
    WOOD(143, 119, 72),
    QUARTZ(255, 252, 245),
    COLOR_ORANGE(216, 127, 51),
    COLOR_MAGENTA(178, 76, 216),
    COLOR_LIGHT_BLUE(102, 153, 216),
    COLOR_YELLOW(229, 229, 51),
    COLOR_LIGHT_GREEN(127, 204, 25),
    COLOR_PINK(242, 127, 165),
    COLOR_GRAY(76, 76, 76),
    COLOR_LIGHT_GRAY(153, 153, 153),
    COLOR_CYAN(76, 127, 153),
    COLOR_PURPLE(127, 63, 178),
    COLOR_BLUE(51, 76, 178),
    COLOR_BROWN(102, 76, 51),
    COLOR_GREEN(102, 127, 51),
    COLOR_RED(153, 51, 51),
    COLOR_BLACK(25, 25, 25),
    GOLD(250, 238, 77),
    DIAMOND(92, 219, 213),
    LAPIS(74, 128, 255),
    EMERALD(0, 217, 58),
    PODZOL(129, 86, 49),
    NETHER(112, 2, 0),
    TERRACOTTA_WHITE(209, 177, 161),
    TERRACOTTA_ORANGE(159, 82, 36),
    TERRACOTTA_MAGENTA(149, 87, 108),
    TERRACOTTA_LIGHT_BLUE(112, 108, 138),
    TERRACOTTA_YELLOW(186, 133, 36),
    TERRACOTTA_LIGHT_GREEN(103, 117, 53),
    TERRACOTTA_PINK(160, 77, 78),
    TERRACOTTA_GRAY(57, 41, 35),
    TERRACOTTA_LIGHT_GRAY(135, 107, 98),
    TERRACOTTA_CYAN(87, 92, 92),
    TERRACOTTA_PURPLE(122, 73, 88),
    TERRACOTTA_BLUE(76, 62, 92),
    TERRACOTTA_BROWN(76, 50, 35),
    TERRACOTTA_GREEN(76, 82, 42),
    TERRACOTTA_RED(142, 60, 46),
    TERRACOTTA_BLACK(37, 22, 16),
    CRIMSON_NYLIUM(189, 48, 49),
    CRIMSON_STEM(148, 63, 97),
    CRIMSON_HYPHAE(92, 25, 29),
    WARPED_NYLIUM(22, 126, 134),
    WARPED_STEM(58, 142, 140),
    WARPED_HYPHAE(86, 44, 62),
    WARPED_WART_BLOCK(20, 180, 133),
    DEEPSLATE(100, 100, 100),
    RAW_IRON(216, 175, 147),
    GLOW_LICHEN(127, 167, 15);

    private static SearchMode DEFAULT_SEARCH_MODE = SearchMode.APPROXIMATE;
    private static int APPROXIMATE_CANDIDATES = 5;

    private static final ColorInfo[] COLORS = new ColorInfo[(values().length << 2) - 4]; // Exclude NONE and all its "shades"
    private static final Int2ObjectMap<PreciseMapColor> BEST_COLOR_CACHE = new Int2ObjectOpenHashMap<>();

    static {
        populateColors();
    }

    private final int argb;

    MapColor(int r, int g, int b) {
        this(0xFF, r, g, b);
    }

    MapColor(int a, int r, int g, int b) {
        this(
                ((a & 0xFF) << 24) |
                ((r & 0xFF) << 16) |
                ((g & 0xFF) << 8) |
                ((b & 0xFF))
        );
    }

    public int id() {
        return new PreciseMapColor(this, Multiplier.x1).id();
    }

    public int alpha() {
        return (argb() >> 24) & 0xFF;
    }

    public int rgb() {
        return argb() & 0x00FFFFFF;
    }

    public int red() {
        return (argb() >> 16) & 0xFF;
    }

    public int green() {
        return (argb() >> 8) & 0xFF;
    }

    public int blue() {
        return argb() & 0xFF;
    }

    public Color asAWTColor() {
        return new Color(argb, true);
    }

    public HexColor asScriptiveColor() {
        return new HexColor(rgb());
    }

    public PreciseMapColor precise() {
        return precise(Multiplier.x1);
    }

    public PreciseMapColor precise(Multiplier multiplier) {
        return new PreciseMapColor(this, multiplier);
    }

    public static PreciseMapColor closestColor(int rgb) {
        return closestColor(rgb, defaultSearchMode());
    }

    public static PreciseMapColor closestColor(int rgb, SearchMode searchMode) {
        rgb &= 0xFFFFFF;
        return BEST_COLOR_CACHE.computeIfAbsent(rgb, value -> switch (searchMode) {
            case BEST -> closestColorCIEDE2000(value);
            case APPROXIMATE -> closestColorApproximate(value);
            case FAST -> closestColorEuclidean(value);
        });
    }

    private static PreciseMapColor closestColorEuclidean(int rgb) {
        LabColor base = LabColor.fromRGB(rgb);
        double best = Double.MAX_VALUE;
        PreciseMapColor bestColor = null;
        for (ColorInfo colorInfo : COLORS) {
            if (colorInfo.color().rgb() == rgb)
                return colorInfo.color();

            double diff = base.euclideanDistanceSquared(colorInfo.lab());
            if (diff < best) {
                best = diff;
                bestColor = colorInfo.color();
            }
        }
        return bestColor;
    }

    private static PreciseMapColor closestColorApproximate(int rgb) {
        return closestColorApproximate(rgb, approximateCandidates());
    }

    private static PreciseMapColor closestColorApproximate(int rgb, int k) {
        if (k == 1) {
            return closestColorEuclidean(rgb);
        } else if (k >= COLORS.length) {
            return closestColorCIEDE2000(rgb);
        }

        LabColor base = LabColor.fromRGB(rgb);
        double[] topDist = new double[k];
        int[] topIdx = new int[k];
        Arrays.fill(topDist, Double.MAX_VALUE);
        Arrays.fill(topIdx, -1);

        for (int i = 0, length = COLORS.length; i < length; i++) {
            ColorInfo colorInfo = COLORS[i];
            if (colorInfo.color().rgb() == rgb)
                return colorInfo.color();

            double diff = base.euclideanDistanceSquared(colorInfo.lab());
            if (diff < topDist[k - 1]) {
                int j = k - 1;
                while (j > 0 && diff < topDist[j - 1]) {
                    topDist[j] = topDist[j - 1];
                    topIdx[j] = topIdx[j - 1];
                    j--;
                }
                topDist[j] = diff;
                topIdx[j] = i;
            }
        }

        int bestIdx = topIdx[0];
        double bestDiff = base.differenceSquared(COLORS[bestIdx].lab());
        for (int i = 1; i < k; i++) {
            int idx = topIdx[i];
            double diff = base.differenceSquared(COLORS[idx].lab());
            if (diff < bestDiff) {
                bestDiff = diff;
                bestIdx = idx;
            }
        }

        return COLORS[bestIdx].color();
    }

    private static PreciseMapColor closestColorCIEDE2000(int rgb) {
        LabColor base = LabColor.fromRGB(rgb);
        double best = Double.MAX_VALUE;
        PreciseMapColor bestColor = null;
        for (ColorInfo colorInfo : COLORS) {
            if (colorInfo.color().rgb() == rgb)
                return colorInfo.color();

            double diff = base.difference(colorInfo.lab());
            if (diff < best) {
                best = diff;
                bestColor = colorInfo.color();
            }
        }
        return bestColor;
    }

    private static void populateColors() {
        MapColor[] colors = values();
        Multiplier[] multipliers = Multiplier.values();
        for (int x = 1; x < colors.length; x++) {
            for (int y = 0; y < multipliers.length; y++) {
                int index = (x * multipliers.length) + y - 4;
                COLORS[index] = new ColorInfo(colors[x].precise(multipliers[y]));
            }
        }
    }

    public static SearchMode defaultSearchMode() {
        return DEFAULT_SEARCH_MODE;
    }

    public static void defaultSearchMode(SearchMode defaultSearchMode) {
        DEFAULT_SEARCH_MODE = defaultSearchMode;
    }

    public static int approximateCandidates() {
        return APPROXIMATE_CANDIDATES;
    }

    public static void approximateCandidates(int approximateCandidates) {
        APPROXIMATE_CANDIDATES = approximateCandidates;
    }

    @Getter
    @RequiredArgsConstructor
    public enum Multiplier {
        x0_71(0.71),
        x0_86(0.86),
        x1(1.00),
        x0_53(0.53);
        
        private final double value;

    }

    public enum SearchMode {
        BEST,
        APPROXIMATE,
        FAST,
    }

    private record ColorInfo(PreciseMapColor color, LabColor lab) {

        public ColorInfo(PreciseMapColor color) {
            this(color, LabColor.fromRGB(color.rgb()));
        }

    }

}
