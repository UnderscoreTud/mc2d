package me.tud.mc2d.registry.tag;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NBTSerializable;
import me.tud.mc2d.util.NamespacedKey;
import org.machinemc.nbt.NBTCompound;
import org.machinemc.nbt.NBTList;

import java.util.*;

@Data
public class Tag<T> implements NBTSerializable {

    private final NamespacedKey registryKey;
    private final boolean replace;
    private final List<Value<T>> values;

    private Tag(Builder<T> builder) {
        this.registryKey = builder.key.key();
        this.replace = builder.replace;
        this.values = builder.values;
    }

    public Collection<T> resolve(Server server) {
        return resolve(server.registryAccess());
    }

    public Collection<T> resolve(RegistryAccess access) {
        return resolve(access.get(registryKey));
    }

    public Collection<T> resolve(Registry<T> registry) {
        List<T> resolved = new ArrayList<>();
        for (Value<T> value : values)
            value.append(registry, resolved);
        return resolved;
    }

    @Override
    public NBTCompound toNBT() {
        NBTCompound nbt = new NBTCompound();
        nbt.set("replace", replace);
        NBTList list = new NBTList();
        for (Value<T> value : values) {
            if (value.required()) {
                list.addValue(value.id());
                continue; 
            }
            list.addValue(Map.of(
                    "id", value.id(),
                    "required", false
            ));
        }
        nbt.set("values", list);
        return nbt;
    }

    public static <T> Builder<T> builder(RegistryKey<T, ? extends Registry<T>> key) {
        return new Builder<>(key);
    }

    private interface Value<T> {
        NamespacedKey key();
        String id();
        boolean required();
        void append(Registry<T> registry, List<T> resolved);
    }

    private record Resource<T>(NamespacedKey key, boolean required) implements Value<T> {

        @Override
        public String id() {
            return key.toString();
        }

        @Override
        public void append(Registry<T> registry, List<T> resolved) {
            resolved.add(registry.get(key));
        }

    }

    private record TagRef<T>(NamespacedKey key, boolean required) implements Value<T> {

        @Override
        public String id() {
            return "#" + key.toString();
        }

        @Override
        public void append(Registry<T> registry, List<T> resolved) {
            resolved.addAll(registry.getTag(key).resolve(registry));
        }

    }

    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Builder<T> {

        private final RegistryKey<T, ? extends Registry<T>> key;
        private final List<Value<T>> values = new ArrayList<>();
        private boolean replace;

        public Builder<T> resource(NamespacedKey key) {
            values.add(new Resource<>(key, true));
            return this;
        }

        public Builder<T> optionalResource(NamespacedKey key) {
            values.add(new Resource<>(key, false));
            return this;
        }

        public Builder<T> tag(NamespacedKey key) {
            values.add(new TagRef<>(key, true));
            return this;
        }

        public Builder<T> optionalTag(NamespacedKey key) {
            values.add(new TagRef<>(key, false));
            return this;
        }

        /**
         * Whether the contents of this tag should completely replace tag contents from different lower priority data packs with the same resource location.
         * When false the tag's content is appended to the contents of the higher priority data packs, instead.
         * 
         * @return this
         */
        public Builder<T> replace() {
            replace = true;
            return this;
        }

        public Tag<T> build() {
            return new Tag<>(this);
        }

    }

}
