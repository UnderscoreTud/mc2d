package me.tud.mc2d.generators.blocks.blockdata.property.type;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.TypeName;
import lombok.Getter;
import me.tud.mc2d.generators.blocks.blockdata.property.Property;

@Getter
public abstract class TypeProperty extends Property {

    private final TypeName type;

    protected TypeProperty(String name, TypeName type) {
        super(name);
        this.type = type;
    }

    @Override
    public TypeName type(String source) {
        return type;
    }

    public static TypeProperty of(String name, String[] possibleValues) {
        TypeProperty property = BooleanProperty.of(name, possibleValues);
        if (property != null)
            return property;

        property = IntProperty.of(name, possibleValues);
        if (property != null)
            return property;

        if (name.equalsIgnoreCase("facing"))
            return new EnumProperty(name, ClassName.get("me.tud.mc2d.world.block", "BlockFace"), possibleValues);

        return null;
    }

}
