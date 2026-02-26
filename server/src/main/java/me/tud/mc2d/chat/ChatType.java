package me.tud.mc2d.chat;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.tud.mc2d.util.NBTSerializable;
import org.jetbrains.annotations.Nullable;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.scriptive.serialization.NBTPropertiesSerializer;
import org.machinemc.scriptive.style.TextFormat;

import java.util.List;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false)
public final class ChatType extends ChatTypes implements NBTSerializable {

    private final Element chat, narration;

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("chat", chat.toNBT());
        nbt.set("narration", narration.toNBT());
        return nbt;
    }

    public record Element(String translationKey, List<Parameter> parameters, @Nullable TextFormat style) implements NBTSerializable {

        @Override
        public NBTCompound toNBT() {
            NBTCompound nbt = new NBTCompound();
            nbt.set("translation_key", translationKey);
            nbt.set("parameters", parameters.stream().map(Parameter::name).map(String::toLowerCase).toList());
            if (style != null)
                nbt.set("style", NBTPropertiesSerializer.get().serialize(style.getProperties()));
            return nbt;
        }

    }

    public enum Parameter {
        SENDER,
        TARGET,
        CONTENT
    }

}
