package me.tud.mc2d.network.packets.serializers;

import lombok.RequiredArgsConstructor;
import me.tud.mc2d.text.ComponentProcessor;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;
import org.machinemc.scriptive.components.ClientComponent;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.serialization.NBTPropertiesSerializer;

/**
 * Network serializer for {@link Component}.
 */
@Supports(Component.class)
@RequiredArgsConstructor
public class ComponentSerializer implements Serializer<Component> {

    private final ComponentProcessor componentProcessor;
    private final NBTPropertiesSerializer propertiesSerializer = NBTPropertiesSerializer.get();

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, Component component) {
        ClientComponent transformed = componentProcessor.transform(component);
        NBTCompound compound = componentProcessor.getSerializer().serialize(transformed, propertiesSerializer);
        context.serializerProvider().getFor(NBTCompound.class).serialize(context, visitor, compound);
    }

    @Override
    public Component deserialize(SerializerContext context, DataVisitor visitor) {
        NBTCompound compound = context.serializerProvider().getFor(NBTCompound.class).deserialize(context, visitor);
        return componentProcessor.getSerializer().deserialize(compound, propertiesSerializer);
    }

}