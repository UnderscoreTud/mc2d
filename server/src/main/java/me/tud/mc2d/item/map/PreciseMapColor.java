package me.tud.mc2d.item.map;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.machinemc.scriptive.style.HexColor;

import java.awt.*;

@Data
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public final class PreciseMapColor {

    private final MapColor base;
    private final MapColor.Multiplier multiplier;
    private final int argb;

    PreciseMapColor(MapColor base, MapColor.Multiplier multiplier) {
        this.base = base;
        this.multiplier = multiplier;
        this.argb =
                (base.alpha() << 24) |
                ((int) (base.red() * multiplier.value()) << 16) | 
                ((int) (base.green() * multiplier.value()) << 8) | 
                ((int) (base.blue() * multiplier.value())); 
    }

    public byte id() {
        return (byte) (base.ordinal() << 2 + multiplier.ordinal());
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

}
