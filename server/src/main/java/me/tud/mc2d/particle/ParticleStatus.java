package me.tud.mc2d.particle;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ParticleStatus {

    ALL(0),
    DECREASED(1),
    MINIMAL(2);

    private final @Getter int id;

    public static ParticleStatus fromID(int id) {
        for (ParticleStatus status : values()) {
            if (status.id == id)
                return status;
        }
        throw new IllegalArgumentException("Invalid particle status ID: " + id);
    }

}
