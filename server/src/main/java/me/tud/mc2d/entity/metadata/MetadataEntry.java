package me.tud.mc2d.entity.metadata;

import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.entity.EntityPose;
import me.tud.mc2d.entity.MobVariant;
import me.tud.mc2d.entity.WolfSoundVariant;
import me.tud.mc2d.entity.WolfVariant;
import me.tud.mc2d.entity.player.MainHand;
import me.tud.mc2d.painting.PaintingVariant;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Packable;
import me.tud.mc2d.world.block.BlockFace;
import me.tud.mc2d.world.blockdata.BlockData;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionf;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.machinemc.scriptive.serialization.ComponentProperties;

import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

@Data
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MetadataEntry<T> {

    private final short index;
    private final int type;
    private final Function<FriendlyByteBuf, T> reader;
    private final BiConsumer<FriendlyByteBuf, T> writer;
    private final boolean bitmask;

    public static MetadataEntry<Byte> _byte(int index) {
        return entry(index, 0, FriendlyByteBuf::readByte, FriendlyByteBuf::writeByte);
    }

    public static MetadataEntry<Byte> _byte(int index, int mask) {
        return bitmask(index, b -> (byte) (b & mask), (b, value) -> (byte) ((b & ~mask) | value));
    }
    
    public static <E extends Enum<E>> MetadataEntry<E> byteEnum(int index, Class<E> type) {
        return entry(index, 0, buf -> type.getEnumConstants()[buf.readByte()], (buf, e) -> buf.writeByte((byte) e.ordinal()));
    }

    public static MetadataEntry<Boolean> bitmask(int index, int mask) {
        return bitmask(index, b -> (b & mask) != 0, (b, flag) -> (byte) ((b & ~mask) | (flag ? mask : 0)));
    }

    public static <E extends Enum<E>> MetadataEntry<E> bitmask(int index, int mask, Class<E> type) {
        int shift = Integer.numberOfTrailingZeros(mask);
        E[] constants = type.getEnumConstants();

        if (constants.length < 1)
            throw new IllegalArgumentException("Enum must have at least one constant");
        if (constants.length > Byte.SIZE)
            throw new IllegalArgumentException("Too many enum constants for byte bitmask");

        int actualMask = ((1 << (constants.length - 1)) - 1) << shift;

        return MetadataEntry.bitmask(
                index,
                b -> {
                    int bits = (b & actualMask) >>> shift;

                    if (bits == 0)
                        return constants[0];

                    int ordinal = Integer.numberOfTrailingZeros(bits) + 1;

                    return constants[ordinal];
                },
                (b, flag) -> {
                    int bits = (flag.ordinal() == 0) ? 0 : (1 << (flag.ordinal() - 1));
                    return (byte) ((b & ~actualMask) | (bits << shift));
                }
        );
    }

    public static <P extends Enum<P> & Packable> MetadataEntry<Set<P>> bitmask(int index, Class<P> type) {
        return entry(
                index, 0,
                buf -> Packable.unpack(type, buf.readByte()),
                (buf, packed) -> buf.writeByte((byte) Packable.pack(packed))
        );
    }

    public static MetadataEntry<Integer> varInt(int index) {
        return entry(index, 1, FriendlyByteBuf::readVarInt, FriendlyByteBuf::writeVarInt);
    }

    public static MetadataEntry<Long> varLong(int index) {
        return entry(index, 2, FriendlyByteBuf::readVarLong, FriendlyByteBuf::writeVarLong);
    }

    public static MetadataEntry<Float> _float(int index) {
        return entry(index, 3, FriendlyByteBuf::readFloat, FriendlyByteBuf::writeFloat);
    }

    public static MetadataEntry<String> string(int index) {
        return entry(index, 4, FriendlyByteBuf::readString, FriendlyByteBuf::writeString);
    }

    public static MetadataEntry<ComponentProperties> component(int index) {
        return entry(index, 5, FriendlyByteBuf::readComponent, FriendlyByteBuf::writeComponent);
    }

    public static MetadataEntry<@Nullable ComponentProperties> optComponent(int index) {
        return optional(index, 6, FriendlyByteBuf::readComponent, FriendlyByteBuf::writeComponent);
    }

    public static MetadataEntry<Object> slot(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Slot
        return entry(index, 7, null, null);
    }

    public static MetadataEntry<Boolean> _boolean(int index) {
        return entry(index, 8, FriendlyByteBuf::readBoolean, FriendlyByteBuf::writeBoolean);
    }

    public static MetadataEntry<Vector3f> rotations(int index) {
        return entry(index, 9, FriendlyByteBuf::readVector3f, FriendlyByteBuf::writeVector3f);
    }

    public static MetadataEntry<Vector3d> position(int index) {
        return entry(index, 10, FriendlyByteBuf::readPosition, FriendlyByteBuf::writePosition);
    }

    public static MetadataEntry<@Nullable Vector3d> optPosition(int index) {
        return optional(index, 11, FriendlyByteBuf::readPosition, FriendlyByteBuf::writePosition);
    }

    public static MetadataEntry<BlockFace> direction(int index) {
        return _enum(index, 12, BlockFace.class);
    }

    public static MetadataEntry<@Nullable UUID> optLivingEntity(int index) {
        return optional(index, 13, FriendlyByteBuf::readUUID, FriendlyByteBuf::writeUUID);
    }

    public static MetadataEntry<BlockData> blockState(int index) {
        return entry(index, 14, FriendlyByteBuf::readBlockState, FriendlyByteBuf::writeBlockState);
    }

    public static MetadataEntry<@Nullable BlockData> optBlockState(int index) {
        return optional(index, 15, FriendlyByteBuf::readBlockState, FriendlyByteBuf::writeBlockState);
    }

    public static MetadataEntry<Object> particle(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Particle
        return entry(index, 16, null, null);
    }

    public static MetadataEntry<Object[]> particles(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Particles
        return entry(index, 17, null, null);
    }

    public static MetadataEntry<Object> villagerData(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Villager_Data
        return entry(index, 18, null, null);
    }

    public static MetadataEntry<@Nullable Integer> optVarInt(int index) {
        return entry(index, 19, buf -> {
            int i = buf.readVarInt();
            return i != 0 ? i - 1 : null;
        }, (buf, integer) -> buf.writeVarInt(integer != null ? integer + 1 : 0));
    }

    public static MetadataEntry<EntityPose> pose(int index) {
        return _enum(index, 20, EntityPose.class);
    }

    public static ServerAwareMetadataEntry<MobVariant> catVariant(int index) {
        return registry(index, 21, RegistryKey.CAT_VARIANT);
    }

    public static ServerAwareMetadataEntry<MobVariant> cowVariant(int index) {
        return registry(index, 22, RegistryKey.COW_VARIANT);
    }

    public static ServerAwareMetadataEntry<WolfVariant> wolfVariant(int index) {
        return registry(index, 23, RegistryKey.WOLF_VARIANT);
    }

    public static ServerAwareMetadataEntry<WolfSoundVariant> wolfSoundVariant(int index) {
        return registry(index, 24, RegistryKey.WOLF_SOUND_VARIANT);
    }

    public static ServerAwareMetadataEntry<MobVariant> frogVariant(int index) {
        return registry(index, 25, RegistryKey.FROG_VARIANT);
    }

    public static ServerAwareMetadataEntry<MobVariant> pigVariant(int index) {
        return registry(index, 26, RegistryKey.PIG_VARIANT);
    }

    public static ServerAwareMetadataEntry<MobVariant> chickenVariant(int index) {
        return registry(index, 27, RegistryKey.CHICKEN_VARIANT);
    }

    public static ServerAwareMetadataEntry<MobVariant> zombieNautilusVariant(int index) {
        return registry(index, 28, RegistryKey.ZOMBIE_NAUTILUS_VARIANT);
    }

    public static MetadataEntry<Object> optGlobalPosition(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Optional_Global_Position
        return entry(index, 29, null, null);
    }

    public static ServerAwareMetadataEntry<PaintingVariant> paintingVariant(int index) {
        return registry(index, 30, RegistryKey.PAINTING_VARIANT);
    }

    public static MetadataEntry<Object> snifferState(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Sniffer_State
        return entry(index, 31, null, null);
    }

    public static MetadataEntry<Object> armadilloState(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Armadillo_State
        return entry(index, 32, null, null);
    }

    public static MetadataEntry<Object> copperGolemState(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Copper_Golem_State
        return entry(index, 33, null, null);
    }

    public static MetadataEntry<Object> weatheringCopperState(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Weathering_Copper_State
        return entry(index, 34, null, null);
    }

    public static MetadataEntry<Vector3f> vector3(int index) {
        return entry(index, 35, FriendlyByteBuf::readVector3f, FriendlyByteBuf::writeVector3f);
    }

    public static MetadataEntry<Quaternionf> quaternion(int index) {
        return entry(index, 36, FriendlyByteBuf::readQuaternionf, FriendlyByteBuf::writeQuaternionf);
    }

    public static MetadataEntry<Object> resolvableProfile(int index) { // TODO https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Metadata_type:Resolvable_Profile
        return entry(index, 37, null, null);
    }

    public static MetadataEntry<MainHand> humanoidArm(int index) {
        return _enum(index, 38, MainHand.class);
    }

    private static <T> MetadataEntry<T> entry(int index, int type, Function<FriendlyByteBuf, T> reader, BiConsumer<FriendlyByteBuf, T> writer) {
        return new MetadataEntry<>((short) index, type, reader, writer, false);
    }

    private static <E extends Enum<E>> MetadataEntry<E> _enum(int index, int type, Class<E> enumType) {
        return entry(index, type, buf -> buf.readEnum(enumType), FriendlyByteBuf::writeEnum);
    }

    private static <T> ServerAwareMetadataEntry<T> registry(int index, int type, RegistryKey<T, ? extends Registry<T>> key) {
        return server -> {
            Registry<T> registry = server.registryAccess().get(key);
            Function<FriendlyByteBuf, T> reader = buf -> registry.getByID(buf.readVarInt());
            BiConsumer<FriendlyByteBuf, T> writer = (buf, value) -> buf.writeVarInt(registry.getID(value));
            return entry(index, type, reader, writer);
        };
    }

    private static <T> MetadataEntry<T> bitmask(int index, Function<Byte, T> reader, BiFunction<Byte, T, Byte> writer) {
        return new MetadataEntry<>((short) index, 0, buf -> reader.apply(buf.asByteBuf().duplicate().readByte()), (buf, flag) -> {
            ByteBuf byteBuf = buf.asByteBuf();
            int byteIndex = byteBuf.writerIndex() - 1;
            byteBuf.setByte(byteIndex, writer.apply(byteBuf.getByte(byteIndex), flag));
        }, true);
    }

    private static <T> MetadataEntry<@Nullable T> optional(int index, int type, Function<FriendlyByteBuf, @Nullable T> reader, BiConsumer<FriendlyByteBuf, @NotNull T> writer) {
        return entry(index, type, buf -> buf.readOptional(reader).orElse(null), (buf, t) -> buf.writeOptional(t, writer));
    }

}
