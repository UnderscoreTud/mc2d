package me.tud.mc2d.player;

import me.tud.mc2d.chat.ChatMode;
import me.tud.mc2d.particle.ParticleStatus;
import me.tud.mc2d.util.FriendlyByteBuf;
import me.tud.mc2d.util.Writable;

public record ClientInformation(
        String locale,
        byte viewDistance,
        ChatMode chatMode,
        boolean chatColors,
        SkinPart[] skinParts,
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
                .writeByte(SkinPart.toBitmask(skinParts))
                .writeEnum(mainHand)
                .writeBoolean(enableTextFiltering)
                .writeBoolean(enableServerListing)
                .writeEnum(particleStatus);
    }

    public ClientInformation withLocale(String locale) {
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

    public ClientInformation withViewDistance(byte viewDistance) {
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

    public ClientInformation withChatMode(ChatMode chatMode) {
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

    public ClientInformation withChatColors(boolean chatColors) {
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

    public ClientInformation withSkinParts(SkinPart... skinParts) {
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

    public ClientInformation withMainHand(MainHand mainHand) {
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

    public ClientInformation withEnableTextFiltering(boolean enableTextFiltering) {
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

    public ClientInformation withEnableServerListing(boolean enableServerListing) {
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

    public ClientInformation withParticleStatus(ParticleStatus particleStatus) {
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

    public static ClientInformation read(FriendlyByteBuf buf) {
        String locale = buf.readString();
        byte viewDistance = buf.readByte();
        ChatMode chatMode = buf.readEnum(ChatMode.class);
        boolean chatColors = buf.readBoolean();
        SkinPart[] skinParts = SkinPart.fromBitmask(buf.readByte());
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
