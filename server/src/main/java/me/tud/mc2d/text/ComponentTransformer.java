package me.tud.mc2d.text;

import org.machinemc.scriptive.components.ClientComponent;
import org.machinemc.scriptive.components.Component;

/**
 * Transformer of components supported by server to components
 * supported by the client.
 * <p>
 * This is used during component serialization when sending components
 * to the client.
 * <p>
 * Components supported by the client are
 * {@link org.machinemc.scriptive.components.KeybindComponent},
 * {@link org.machinemc.scriptive.components.TextComponent},
 * {@link org.machinemc.scriptive.components.TranslationComponent}.
 *
 * @param <T> component type
 */
@FunctionalInterface
public interface ComponentTransformer<T extends Component> {

    /**
     * Transforms custom component to a component that is supported
     * and can be displayed by the client.
     * <p>
     * The transformer is not expected to transform any siblings,
     * the component provided will always be without siblings.
     *
     * @param component component to transform (without siblings)
     * @return component supported by the client
     */
    ClientComponent transform(T component);

}
