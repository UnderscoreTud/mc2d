package me.tud.mc2d.network.packets.serializers;

import lombok.RequiredArgsConstructor;
import me.tud.mc2d.text.ComponentProcessor;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.aliases.SerializerAlias;
import org.machinemc.scriptive.components.ClientComponent;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.serialization.JSONPropertiesSerializer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Serializer for Minecraft text components in JSON string format.
 */
@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@SerializerAlias(JSONComponent.Serializer.class)
public @interface JSONComponent {

    /**
     * Implementation of the serializer.
     */
    @RequiredArgsConstructor
    class Serializer implements org.machinemc.paklet.serialization.Serializer<Component> {

        private final ComponentProcessor componentProcessor;
        private final JSONPropertiesSerializer propertiesSerializer = new JSONPropertiesSerializer();

        @Override
        public void serialize(SerializerContext context, DataVisitor visitor, Component component) {
            ClientComponent transformed = componentProcessor.transform(component);
            String json = componentProcessor.getSerializer().serialize(transformed, propertiesSerializer);
            context.serializerProvider().getFor(String.class).serialize(context, visitor, json);
        }

        @Override
        public Component deserialize(SerializerContext context, DataVisitor visitor) {
            String json = context.serializerProvider().getFor(String.class).deserialize(context, visitor);
            return componentProcessor.getSerializer().deserialize(json, propertiesSerializer);
        }

    }

}
