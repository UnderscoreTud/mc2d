package me.tud.mc2d.network.packets.serializers;

import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.server.ServerContext;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.catalogue.DynamicCatalogue;

import java.util.Collection;
import java.util.List;

/**
 * Catalogue for network serializers.
 */
@RequiredArgsConstructor
public final class MC2DNetworkSerializers implements DynamicCatalogue.Serializers {

    private final ServerContext context;

    @Override
    public Collection<Serializer<?>> provideSerializers() {
        return List.of(
                new BlockPositionSerializer(),
                new ComponentSerializer(context.componentProcessor()),
                new ClientInformationSerializer(),
                new DataPackSerializer(),
                new JSONComponent.Serializer(context.componentProcessor()),
                new NamespacedKeySerializer(),
                new NBTCompoundSerializer(),
                new ClientInformationSerializer(),
                new Vector3dSerializer(),
                new Vector3fSerializer()
        );
    }

}
