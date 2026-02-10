package me.tud.mc2d.network.packets;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import io.netty.buffer.Unpooled;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.With;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.util.FriendlyByteBuf;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class PacketRegistry {

    private final Map<Key, Group> registries = new HashMap<>();

    public <T extends Packet> void registerSimplePacket(Packet.Info info, Class<T> packetClass, Supplier<T> packetSupplier) {
        group(info.direction(), info.state()).registerSimplePacket(info.id(), packetClass, packetSupplier);
    }

    public <T extends Packet> void registerPacket(Packet.Info info, Class<T> packetClass, Function<FriendlyByteBuf, T> packetSupplier) {
        group(info.direction(), info.state()).registerPacket(info.id(), packetClass, packetSupplier);
    }


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

    @With
    public record Key(Packet.Direction direction, ConnectionState state) {

        public Key {
            if (direction == null)
                throw new IllegalArgumentException("Packet direction is null");
            if (state == null)
                throw new IllegalArgumentException("Connection state is null");
        }

    }

    @RequiredArgsConstructor
    public static class Group implements PacketFactory {

        private final @Getter Key key;
        private final BiMap<Class<? extends Packet>, Integer> classToIDMap = HashBiMap.create();
        private final Map<Class<? extends Packet>, Function<FriendlyByteBuf, ? extends Packet>> packetFactories = new HashMap<>();

        public <T extends Packet> void registerSimplePacket(int packetID, Class<T> packetClass, Supplier<T> packetSupplier) {
            registerPacket(packetID, packetClass, buf -> packetSupplier.get());
        }

        public <T extends Packet> void registerPacket(int packetID, Class<T> packetClass, Function<FriendlyByteBuf, T> packetSupplier) {
            if (classToIDMap.containsKey(packetClass))
                throw new IllegalArgumentException("Packet class " + packetClass.getName() + " is already registered");
            if (classToIDMap.containsValue(packetID))
                throw new IllegalArgumentException("Packet ID " + packetID + " is already registered");
            System.out.println("Registering packet " + packetClass.getName() + " with ID " + packetID(packetID)
                    + " in group " + key);
            classToIDMap.put(packetClass, packetID);
            packetFactories.put(packetClass, packetSupplier);
        }

        @Override
        public Packet createPacket(int packetID, byte[] data) {
            Class<? extends Packet> packetClass = classToIDMap.inverse().get(packetID);
            if (packetClass == null)
                throw new IllegalArgumentException("Packet ID " + packetID(packetID) + " in " + key + " is not registered");
            return createPacket(packetClass, data);
        }

        @Override
        public <T extends Packet> T createPacket(Class<T> packetClass, byte[] data) {
            if (!classToIDMap.containsKey(packetClass))
                throw new IllegalArgumentException("Packet class " + packetClass.getName() + " is not registered");
            //noinspection unchecked
            Function<FriendlyByteBuf, T> factory = (Function<FriendlyByteBuf, T>) packetFactories.get(packetClass);
            if (factory == null)
                throw new IllegalArgumentException("Packet supplier for class " + packetClass.getName() + " is not registered");
            FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.wrappedBuffer(data));
            try {
                return packetClass.cast(factory.apply(buf));
            } catch (Exception e) {
                throw new RuntimeException("Failed to deserialize packet " + packetClass.getName(), e);
            }
        }

        private static String packetID(int id) {
            return id + String.format(" (0x%02X)", id);
        }

    }

    @RequiredArgsConstructor
    private class DynamicPacketFactory implements PacketFactory {

        private final Supplier<Key> keySupplier;
        private transient Key currentKey;
        private transient Group group;

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
