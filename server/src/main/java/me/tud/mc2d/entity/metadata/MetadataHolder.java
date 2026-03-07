package me.tud.mc2d.entity.metadata;

import java.util.function.Consumer;

public interface MetadataHolder {

    <T> T getMetadata(MetadataEntry<T> entry);

    <T> void setMetadata(MetadataEntry<T> entry, T value);

    void editMetadata(Consumer<MetadataHolder> consumer);

}
