package me.tud.mc2d.network.packets.serializers;

import me.tud.mc2d.chat.ChatMode;
import me.tud.mc2d.entity.player.ClientInformation;
import me.tud.mc2d.entity.player.MainHand;
import me.tud.mc2d.entity.player.SkinPart;
import me.tud.mc2d.particle.ParticleStatus;
import org.machinemc.paklet.DataVisitor;
import org.machinemc.paklet.serialization.Serializer;
import org.machinemc.paklet.serialization.SerializerContext;
import org.machinemc.paklet.serialization.Supports;

/**
 * Network serializer for {@link ClientInformation}.
 */
@Supports(ClientInformation.class)
public class ClientInformationSerializer implements Serializer<ClientInformation> {

    @Override
    public void serialize(SerializerContext context, DataVisitor visitor, ClientInformation clientInformation) {
        Serializer<String> stringSerializer = context.serializerProvider().getFor(String.class);
        Serializer<Byte> byteSerializer = context.serializerProvider().getFor(Byte.class);
        Serializer<ChatMode> chatModeSerializer = context.serializerProvider().getFor(ChatMode.class);
        Serializer<Boolean> booleanSerializer = context.serializerProvider().getFor(Boolean.class);
        Serializer<MainHand> mainHandSerializer = context.serializerProvider().getFor(MainHand.class);
        Serializer<ParticleStatus> particleStatusSerializer = context.serializerProvider().getFor(ParticleStatus.class);
        visitor.write(context, stringSerializer, clientInformation.locale());
        visitor.write(context, byteSerializer, clientInformation.viewDistance());
        visitor.write(context, chatModeSerializer, clientInformation.chatMode());
        visitor.write(context, booleanSerializer, clientInformation.chatColors());
        visitor.write(context, byteSerializer, SkinPart.toBitmask(clientInformation.skinParts()));
        visitor.write(context, mainHandSerializer, clientInformation.mainHand());
        visitor.write(context, booleanSerializer, clientInformation.enableTextFiltering());
        visitor.write(context, booleanSerializer, clientInformation.enableServerListing());
        visitor.write(context, particleStatusSerializer, clientInformation.particleStatus());
    }

    @Override
    public ClientInformation deserialize(SerializerContext context, DataVisitor visitor) {
        Serializer<String> stringSerializer = context.serializerProvider().getFor(String.class);
        Serializer<Byte> byteSerializer = context.serializerProvider().getFor(Byte.class);
        Serializer<Integer> intSerializer = context.serializerProvider().getFor(Integer.class);
        Serializer<Boolean> booleanSerializer = context.serializerProvider().getFor(Boolean.class);
        return new ClientInformation(
                visitor.read(context, stringSerializer), // Locale
                visitor.read(context, byteSerializer), // View Distance
                ChatMode.values()[visitor.read(context, intSerializer)], // Chat Mode
                visitor.read(context, booleanSerializer), // Chat Colors
                SkinPart.fromBitmask(visitor.read(context, byteSerializer)), // Skin Parts
                MainHand.values()[visitor.read(context, intSerializer)], // Main Hand
                visitor.read(context, booleanSerializer), // Text Filtering
                visitor.read(context, booleanSerializer), // Allow Server Listing
                ParticleStatus.values()[visitor.read(context, intSerializer)] // Particle Status
        );
    }

}
