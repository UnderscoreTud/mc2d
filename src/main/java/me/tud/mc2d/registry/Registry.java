package me.tud.mc2d.registry;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.util.NamespacedKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public sealed abstract class Registry<T> implements Iterable<T> permits BuiltInRegistry, DataDrivenRegistry {

    protected final Server server;
    protected final NamespacedKey key;
    protected final Map<NamespacedKey, T> map = Collections.synchronizedMap(new LinkedHashMap<>());

    public Registry(Server server,  NamespacedKey key) {
        this.server = server;
        this.key = key;
    }

    public T get(NamespacedKey key) {
        return map.get(key);
    }

    public T getByID(int id) {
        return getEntryByID(id).getValue();
    }

    public NamespacedKey getKey(T value) {
        for (Map.Entry<NamespacedKey, T> entry : map.entrySet()) {
            if (entry.getValue().equals(value))
                return entry.getKey();
        }
        throw new NoSuchElementException("value '" + value + "' not found in registry");
    }

    public NamespacedKey getKeyByID(int id) {
        return getEntryByID(id).getKey();
    }

    private Map.Entry<NamespacedKey, T> getEntryByID(int id) {
        if (id < 0 || id >= map.size())
            throw new IndexOutOfBoundsException("ID out of bounds: " + id);
        int currentID = 0;
        for (Map.Entry<NamespacedKey, T> entry : map.entrySet()) {
            if (currentID++ == id)
                return entry;
        }
        // This should never happen
        throw new NoSuchElementException("No element found for ID: " + id);
    }

    public int getID(T value) {
        int currentID = 0;
        for (Map.Entry<NamespacedKey, T> entry : map.entrySet()) {
            if (entry.getValue().equals(value))
                return currentID;
            currentID++;
        }
        throw new NoSuchElementException("value '" + value + "' not found in registry");
    }

    public int getID(NamespacedKey key) {
        int currentID = 0;
        for (Map.Entry<NamespacedKey, T> entry : map.entrySet()) {
            if (entry.getKey().equals(key))
                return currentID;
            currentID++;
        }
        throw new NoSuchElementException("key '" + key + "' not found in registry");
    }

    public boolean contains(NamespacedKey key) {
        return map.containsKey(key);
    }

    public boolean contains(T value) {
        return map.containsValue(value);
    }

    public int size() {
        return map.size();
    }

    @UnmodifiableView
    public Set<NamespacedKey> keys() {
        return Collections.unmodifiableSet(map.keySet());
    }

    @UnmodifiableView
    public Collection<T> values() {
        return Collections.unmodifiableCollection(map.values());
    }

    public Server server() {
        return server;
    }

    public NamespacedKey key() {
        return key;
    }

    public Iterator<NamespacedKey> keyIterator() {
        return map.keySet().iterator();
    }

    @Override
    public @NotNull Iterator<T> iterator() {
        return map.values().iterator();
    }

    public Stream<NamespacedKey> keyStream() {
        return map.keySet().stream();
    }

    public Stream<T> stream() {
        return map.values().stream();
    }

    protected void modify(Consumer<Modifiable> consumer) {
        // TODO check if server is in a state where modification is allowed
        Modifiable modifiable = new Modifiable();
        consumer.accept(modifiable);
    }

    protected void forceModify(Consumer<Modifiable> consumer) {
        // TODO check if server is in a state where modification is allowed
        Modifiable modifiable = new Modifiable();
        consumer.accept(modifiable);
        // push changes
    }

    public class Modifiable {

        public void register(NamespacedKey key, T value) {
            if (map.containsKey(key))
                throw new IllegalArgumentException("Key already registered: " + key);
            if (map.containsValue(value))
                throw new IllegalArgumentException("Value already registered: " + value);
            map.put(key, value);
        }

        public void unregister(NamespacedKey key) {
            map.remove(key);
        }

        public void unregister(T value) {
            map.values().remove(value);
        }

        public void unregisterByID(int id) {
            map.remove(Registry.this.getKeyByID(id));
        }

    }

}
