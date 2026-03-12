package me.tud.mc2d.entity;

import me.tud.mc2d.entity.metadata.Metadata;
import org.machinemc.scriptive.components.Component;
import org.machinemc.scriptive.serialization.ComponentProperties;
import org.machinemc.scriptive.serialization.ComponentSerializer;

import java.util.UUID;

public class TextDisplay extends Display {

    public TextDisplay() {
        this(UUID.randomUUID());
    }

    public TextDisplay(UUID uuid) {
        this(uuid, EntityType.TEXT_DISPLAY);
    }

    public TextDisplay(UUID uuid, EntityType type) {
        super(uuid, type);
    }

    public Component getText(ComponentSerializer serializer) {
        return serializer.deserialize(getText());
    }

    public ComponentProperties getText() {
        return getMetadata(Metadata.TextDisplay.TEXT);
    }

    public void setText(Component component) {
        setText(component.getProperties());
    }

    public void setText(ComponentProperties properties) {
        setMetadata(Metadata.TextDisplay.TEXT, properties);
    }

    public enum Alignment {
        CENTER,
        LEFT,
        RIGHT
    }

}
