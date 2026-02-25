package me.tud.mc2d.generators.blocks;

@FunctionalInterface
public interface BlockIDProvider {

    int get(String key);

}
