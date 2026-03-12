package me.tud.mc2d.util;

import lombok.Data;

@Data
public final class LinearCalibration {

    private final double a, b;

    public LinearCalibration(double theoretical1, double actual1, double theoretical2, double actual2) {
        this.a = (actual1 - actual2) / (theoretical1 - theoretical2);
        this.b = actual1 - this.a * theoretical1;
    }

    public double apply(double theoretical) {
        return a * theoretical + b;
    }

}
