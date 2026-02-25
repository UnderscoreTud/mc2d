package me.tud.mc2d.registry;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

@RequiredArgsConstructor
public sealed abstract class Registry<T> implements Iterable<T>
        permits BuiltInRegistry, DataDrivenRegistry {

    protected final @Getter Server server;
    protected final @Getter NamespacedKey key;
    protected final Map<NamespacedKey, T> entries = Collections.synchronizedMap(new LinkedHashMap<>());

    public T get(NamespacedKey key) {
        return entries.get(key);
    }

    public T getByID(int id) {
        return getEntryByID(id).getValue();
    }

    public NamespacedKey getKey(T value) {
        for (Map.Entry<NamespacedKey, T> entry : entries.entrySet()) {
            if (entry.getValue().equals(value))
                return entry.getKey();
        }
        throw new NoSuchElementException("value '" + value + "' not found in registry");
    }

    public NamespacedKey getKeyByID(int id) {
        return getEntryByID(id).getKey();
    }

    private Map.Entry<NamespacedKey, T> getEntryByID(int id) {
        if (id < 0 || id >= entries.size())
            throw new IndexOutOfBoundsException("ID out of bounds: " + id);
        int currentID = 0;
        for (Map.Entry<NamespacedKey, T> entry : entries.entrySet()) {
            if (currentID++ == id)
                return entry;
        }
        // This should never happen
        throw new NoSuchElementException("No element found for ID: " + id);
    }

    public int getID(T value) {
        int currentID = 0;
        for (Map.Entry<NamespacedKey, T> entry : entries.entrySet()) {
            if (entry.getValue().equals(value))
                return currentID;
            currentID++;
        }
        throw new NoSuchElementException("value '" + value + "' not found in registry");
    }

    public int getID(NamespacedKey key) {
        int currentID = 0;
        for (Map.Entry<NamespacedKey, T> entry : entries.entrySet()) {
            if (entry.getKey().equals(key))
                return currentID;
            currentID++;
        }
        throw new NoSuchElementException("key '" + key + "' not found in registry");
    }

    public boolean contains(NamespacedKey key) {
        return entries.containsKey(key);
    }

    public boolean contains(T value) {
        return entries.containsValue(value);
    }

    public int size() {
        return entries.size();
    }

    public @Unmodifiable Collection<Entry> entries() {
        List<Entry> entries = new ArrayList<>(this.entries.size());
        for (Map.Entry<NamespacedKey, T> entry : this.entries.entrySet())
            entries.add(new Entry(entry.getKey(), entry.getValue()));
        return Collections.unmodifiableCollection(entries);
    }

    public @UnmodifiableView Set<NamespacedKey> keys() {
        return Collections.unmodifiableSet(entries.keySet());
    }

    public @UnmodifiableView Collection<T> values() {
        return Collections.unmodifiableCollection(entries.values());
    }

    public Iterator<NamespacedKey> keyIterator() {
        return entries.keySet().iterator();
    }

    @Override
    public @NotNull Iterator<T> iterator() {
        return entries.values().iterator();
    }

    public Stream<NamespacedKey> keyStream() {
        return entries.keySet().stream();
    }

    public Stream<T> stream() {
        return entries.values().stream();
    }

    protected Registry<T> modify(Consumer<Modifiable> consumer) {
        // TODO check if server is in a state where modification is allowed
        Modifiable modifiable = new Modifiable();
        consumer.accept(modifiable);
        return this;
    }

    protected Registry<T> forceModify(Consumer<Modifiable> consumer) {
        // TODO check if server is in a state where modification is allowed
        Modifiable modifiable = new Modifiable();
        consumer.accept(modifiable);
        return this;
    }

    @Getter
    @RequiredArgsConstructor
    public class Entry {

        private final NamespacedKey key;
        private final T value;

    }

    public class Modifiable {

        public void register(NamespacedKey key, T value) {
            if (entries.containsKey(key))
                throw new IllegalArgumentException("Key already registered: " + key);
            if (entries.containsValue(value))
                throw new IllegalArgumentException("Value already registered: " + value);
            entries.put(key, value);
        }

        public void unregister(NamespacedKey key) {
            entries.remove(key);
        }

        public void unregister(T value) {
            entries.values().remove(value);
        }

        public void unregisterByID(int id) {
            entries.remove(Registry.this.getKeyByID(id));
        }

    }

}
