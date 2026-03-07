package me.tud.mc2d.entity.metadata;

import me.tud.mc2d.network.server.Server;

@FunctionalInterface
public interface ServerAwareMetadataEntry<T> {

    MetadataEntry<T> using(Server server);

}
