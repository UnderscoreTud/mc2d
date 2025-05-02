package me.tud.mc2d.network.packets.serverbound.configuration;

import me.tud.mc2d.chat.ChatMode;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.packets.serverbound.ServerboundPacket;
import me.tud.mc2d.particle.ParticleStatus;
import me.tud.mc2d.player.ClientInformation;
import me.tud.mc2d.player.MainHand;
import me.tud.mc2d.player.SkinPart;
import me.tud.mc2d.util.FriendlyByteBuf;

public class ServerboundConfigurationClientInformation implements ServerboundPacket {

    private static final int ID = 0x00;

    private ClientInformation clientInformation;

    public ServerboundConfigurationClientInformation() {}

    public ServerboundConfigurationClientInformation(ClientInformation clientInformation) {
        this.clientInformation = clientInformation;
    }

    public ClientInformation clientInformation() {
        return clientInformation;
    }

    @Override
    public int id() {
        return ID;
    }

    @Override
    public ConnectionState state() {
        return ConnectionState.CONFIGURATION;
    }

    @Override
    public void serialize(FriendlyByteBuf buf) {
        buf.write(clientInformation);
    }

    @Override
    public void deserialize(FriendlyByteBuf buf) {
        clientInformation = ClientInformation.read(buf);
    }

}
