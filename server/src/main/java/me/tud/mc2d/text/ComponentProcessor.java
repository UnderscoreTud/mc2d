package me.tud.mc2d.text;

import com.google.common.base.Preconditions;
import org.machinemc.scriptive.components.*;
import org.machinemc.scriptive.serialization.ComponentProperties;
import org.machinemc.scriptive.serialization.ComponentSerializer;
import org.machinemc.scriptive.serialization.PropertiesSerializer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ComponentProcessor {

    private final ComponentSerializer serializer;
    private final Map<Class<? extends Component>, ComponentTransformer<Component>> transformers = new HashMap<>();

    public ComponentProcessor(ComponentSerializer serializer) {
        this.serializer = Preconditions.checkNotNull(serializer, "Component serializer can not be null");

        // registers transformers for client components
        transformers.put(KeybindComponent.class, component -> (ClientComponent) component);
        transformers.put(TextComponent.class, component -> (ClientComponent) component);
        transformers.put(TranslationComponent.class, component -> (ClientComponent) component);
    }

    @SuppressWarnings("unchecked")
    public <C extends Component> void registerComponentType(
            Class<C> type,
            Supplier<C> emptySupplier,
            ComponentTransformer<C> transformer
    ) {
        if (ClientComponent.class.isAssignableFrom(type))
            return;
        Preconditions.checkNotNull(type, "Component type can not be null");
        Preconditions.checkNotNull(emptySupplier, "Empty supplier can not be null");
        Preconditions.checkNotNull(transformer, "Transformer can not be null");
        Preconditions.checkState(!transformers.containsKey(type), "Component type '" + type.getName() + "' is already registered");
        serializer.register(type, emptySupplier);
        transformers.put(type, (ComponentTransformer<Component>) transformer);
    }

    public ClientComponent transform(Component component) {
        return ComponentUtils.transformComponentRecursively(transformers::get, component);
    }

    public ComponentSerializer getSerializer() {
        return new ComponentSerializer() {

            @Override
            public <C extends Component> void register(Class<C> type, Supplier<C> emptySupplier) {
                // during initialization the client component types are automatically registered
                if (!ClientComponent.class.isAssignableFrom(type)) throw new UnsupportedOperationException();
            }

            @Override
            public <T> T serialize(Component component, PropertiesSerializer<T> propertiesSerializer) {
                return serializer.serialize(component, propertiesSerializer);
            }

            @Override
            public ComponentProperties serialize(Component component) {
                return serializer.serialize(component);
            }

            @Override
            public <T> Component deserialize(T value, PropertiesSerializer<T> propertiesSerializer) {
                return serializer.deserialize(value, propertiesSerializer);
            }

            @Override
            public Component deserialize(ComponentProperties properties) {
                return serializer.deserialize(properties);
            }

        };
    }

}
