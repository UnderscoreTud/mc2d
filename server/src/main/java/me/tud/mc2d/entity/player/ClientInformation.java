package me.tud.mc2d.entity.player;

import lombok.AccessLevel;
import lombok.With;
import me.tud.mc2d.chat.ChatMode;
import me.tud.mc2d.particle.ParticleStatus;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Packable;
import me.tud.mc2d.util.Writable;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

@With
public record ClientInformation(
        String locale,
        byte viewDistance,
        ChatMode chatMode,
        boolean chatColors,
        @With(AccessLevel.NONE) Set<SkinPart> skinParts,
        MainHand mainHand,
        boolean enableTextFiltering,
        boolean enableServerListing,
        ParticleStatus particleStatus
) implements Writable {

    @Override
    public void write(FriendlyByteBuf buf) {
        buf
                .writeString(locale)
                .writeByte(viewDistance)
                .writeEnum(chatMode)
                .writeBoolean(chatColors)
                .writeByte((byte) Packable.pack(skinParts))
                .writeEnum(mainHand)
                .writeBoolean(enableTextFiltering)
                .writeBoolean(enableServerListing)
                .writeEnum(particleStatus);
    }

    public ClientInformation withSkinParts(SkinPart... skinParts) {
        Set<SkinPart> set = EnumSet.copyOf(Arrays.asList(skinParts));
        return this.skinParts.equals(set) ? this : new ClientInformation(
                locale,
                viewDistance,
                chatMode,
                chatColors,
                set,
                mainHand,
                enableTextFiltering,
                enableServerListing,
                particleStatus
        );
    }

    public static ClientInformation read(FriendlyByteBuf buf) {
        String locale = buf.readString();
        byte viewDistance = buf.readByte();
        ChatMode chatMode = buf.readEnum(ChatMode.class);
        boolean chatColors = buf.readBoolean();
        Set<SkinPart> skinParts = SkinPart.unpack(buf.readByte());
        MainHand mainHand = buf.readEnum(MainHand.class);
        boolean enableTextFiltering = buf.readBoolean();
        boolean enableServerListing = buf.readBoolean();
        ParticleStatus particleStatus = buf.readEnum(ParticleStatus.class);

        return new ClientInformation(
                locale,
                viewDistance,
                chatMode,
                chatColors,
                skinParts,
                mainHand,
                enableTextFiltering,
                enableServerListing,
                particleStatus
        );
    }

}
