package me.tud.mc2d.text;

import com.google.common.base.Preconditions;
import org.jetbrains.annotations.Contract;
import org.machinemc.scriptive.components.ClientComponent;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.components.TranslationComponent;
import org.machinemc.scriptive.locale.LocaleLanguage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Utilities for manipulation with components.
 */
public class ComponentUtils {

    private ComponentUtils() {
        throw new UnsupportedOperationException();
    }

    /**
     * Applies locale language instance to a component and
     * all its siblings.
     *
     * @param locale locale language
     * @param component component
     * @return component with new locale language
     */
    @Contract(pure = true)
    public static Component withLocaleLanguageRecursively(LocaleLanguage locale, Component component) {
        Component withLocale = component.clone();
        if (withLocale instanceof TranslationComponent translation) {
            List<Component> arguments = Arrays.stream(translation.getArguments())
                    .map(c -> withLocaleLanguageRecursively(locale, c))
                    .toList();
            translation.setArguments(arguments.toArray(new Component[0]));
            withLocale = translation.withLocaleLanguage(locale);
        }
        List<Component> siblings = withLocale.getSiblings();
        withLocale.clearSiblings();
        for (Component sibling : siblings)
            withLocale.append(withLocaleLanguageRecursively(locale, sibling));
        return withLocale;
    }

    /**
     * Recursively transforms a component to client component.
     *
     * @param transformerGetter component type -> transformer function for getting component transformers
     *                          during the transformation process
     * @param component component to transform
     * @return transformed component that can be displayed by client
     */
    @Contract(pure = true)
    public static ClientComponent transformComponentRecursively(
            Function<Class<? extends Component>, ComponentTransformer<Component>> transformerGetter,
            Component component
    ) {
        Component transformed = component.clone();
        List<Component> siblings = transformed.getSiblings();
        transformed.clearSiblings();
        ComponentTransformer<Component> transformer = transformerGetter.apply(transformed.getType());
        Preconditions.checkNotNull(transformer, "Failed to find transformer for type '" + transformed.getType().getName() + "'");
        transformed = transformer.transform(transformed);
        for (Component sibling : siblings)
            transformed.append(transformComponentRecursively(transformerGetter, sibling));
        return (ClientComponent) transformed;
    }

}
