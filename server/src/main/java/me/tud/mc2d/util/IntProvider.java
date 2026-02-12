package me.tud.mc2d.util;

import org.machinemc.nbt.NBTCompound;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface IntProvider extends NBTSerializable {

    record Constant(int value) implements IntProvider {

        @Override
        public NBTCompound toNBT() {
            return new NBTCompound(Map.of(
                    "type", "minecraft:constant",
                    "value", value
            ));
        }

    }

    record Uniform(int min, int max) implements IntProvider {

        @Override
        public NBTCompound toNBT() {
            return new NBTCompound(Map.of(
                    "type", "minecraft:uniform",
                    "min_inclusive", min,
                    "max_inclusive", max
            ));
        }

    }

    record BiasedToBottom(int min, int max) implements IntProvider {

        @Override
        public NBTCompound toNBT() {
            return new NBTCompound(Map.of(
                    "type", "minecraft:biased_to_bottom",
                    "min_inclusive", min,
                    "max_inclusive", max
            ));
        }

    }

    record Clamped(int min, int max, IntProvider source) implements IntProvider {

        @Override
        public NBTCompound toNBT() {
            return new NBTCompound(Map.of(
                    "type", "minecraft:clamped",
                    "min_inclusive", min,
                    "max_inclusive", max,
                    "source", source.toNBT()
            ));
        }

    }

    record ClampedNormal(float mean, float deviation, int min, int max) implements IntProvider {

        @Override
        public NBTCompound toNBT() {
            return new NBTCompound(Map.of(
                    "type", "minecraft:clamped_normal",
                    "mean", mean,
                    "deviation", deviation,
                    "min_inclusive", min,
                    "max_inclusive", max
            ));
        }

    }

    record WeightedList(List<Entry> distribution) implements IntProvider {

        @Override
        public NBTCompound toNBT() {
            return new NBTCompound(Map.of(
                    "type", "minecraft:weighted_list",
                    "distribution", distribution
            ));
        }

        public record Entry(IntProvider data, int weight) {

            public Entry(int data, int weight) {
                this(new Constant(data), weight);
            }

        }

    }

}
