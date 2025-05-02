package me.tud.mc2d.network.packets;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import me.tud.mc2d.network.ConnectionState;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PacketRegistry {

    private final Map<Key, Group> registries = new HashMap<>();

    public Group group(Packet.Direction direction, ConnectionState state) {
        return group(new Key(direction, state));
    }

    public Group group(Key key) {
        return registries.computeIfAbsent(key, Group::new);
    }

    public PacketFactory dynamicFactory(Packet.Direction direction, Supplier<ConnectionState> stateSupplier) {
        return new DynamicPacketFactory(() -> new Key(direction, stateSupplier.get()));
    }

    public PacketFactory dynamicFactory(Supplier<Packet.Direction> directionSupplier, ConnectionState state) {
        return new DynamicPacketFactory(() -> new Key(directionSupplier.get(), state));
    }

    public PacketFactory dynamicFactory(Supplier<Packet.Direction> directionSupplier, Supplier<ConnectionState> stateSupplier) {
        return new DynamicPacketFactory(() -> new Key(directionSupplier.get(), stateSupplier.get()));
    }

    public PacketFactory dynamicFactory(Supplier<Key> keySupplier) {
        return new DynamicPacketFactory(keySupplier);
    }

    public record Key(Packet.Direction direction, ConnectionState state) {

        public Key {
            if (direction == null)
                throw new IllegalArgumentException("Packet direction is null");
            if (state == null)
                throw new IllegalArgumentException("Connection state is null");
        }

        public Key withDirection(Packet.Direction direction) {
            return new Key(direction, this.state);
        }

        public Key withState(ConnectionState state) {
            return new Key(this.direction, state);
        }

    }

    public static class Group implements PacketFactory {

        private final Key key;
        private final BiMap<Class<? extends Packet>, Integer> classToIDMap = HashBiMap.create();
        private final Map<Class<? extends Packet>, Supplier<? extends Packet>> packetSuppliers = new HashMap<>();

        private Group(Key key) {
            this.key = key;
        }

        public Key key() {
            return key;
        }

        public <T extends Packet> void registerPacket(int packetID, Class<T> packetClass, Supplier<T> packetSupplier) {
            if (classToIDMap.containsKey(packetClass))
                throw new IllegalArgumentException("Packet class " + packetClass.getName() + " is already registered");
            if (classToIDMap.containsValue(packetID))
                throw new IllegalArgumentException("Packet ID " + packetID + " is already registered");
            System.out.println("Registering packet " + packetClass.getName() + " with ID " + packetID + " in group " + key);
            classToIDMap.put(packetClass, packetID);
            packetSuppliers.put(packetClass, packetSupplier);
        }

        @Override
        public Packet createPacket(int packetID, byte[] data) {
            Class<? extends Packet> packetClass = classToIDMap.inverse().get(packetID);
            if (packetClass == null)
                throw new IllegalArgumentException("Packet ID " + packetID + " is not registered");
            return createPacket(packetClass, data);
        }

        @Override
        public <T extends Packet> T createPacket(Class<T> packetClass, byte[] data) {
            if (!classToIDMap.containsKey(packetClass))
                throw new IllegalArgumentException("Packet class " + packetClass.getName() + " is not registered");
            //noinspection unchecked
            Supplier<T> supplier = (Supplier<T>) packetSuppliers.get(packetClass);
            if (supplier == null)
                throw new IllegalArgumentException("Packet supplier for class " + packetClass.getName() + " is not registered");
            T packet = packetClass.cast(supplier.get());
            try {
                packet.deserialize(data);
            } catch (Exception e) {
                throw new RuntimeException("Failed to deserialize packet " + packetClass.getName(), e);
            }
            return packet;
        }

    }

    private class DynamicPacketFactory implements PacketFactory {

        private final Supplier<Key> keySupplier;
        private transient Key currentKey;
        private transient Group group;

        private DynamicPacketFactory(Supplier<Key> keySupplier) {
            this.keySupplier = keySupplier;
        }

        @Override
        public Packet createPacket(int packetID, byte[] data) {
            return getGroup().createPacket(packetID, data);
        }

        @Override
        public <T extends Packet> T createPacket(Class<T> packetType, byte[] data) {
            return getGroup().createPacket(packetType, data);
        }

        private Group getGroup() {
            Key key = keySupplier.get();
            if (currentKey == null || !currentKey.equals(key)) {
                currentKey = key;
                group = PacketRegistry.this.group(key);
            }
            return group;
        }

    }

}
