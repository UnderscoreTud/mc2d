package me.tud.mc2d.network.packets.processor.serverbound.login;

import me.tud.mc2d.Main;
import me.tud.mc2d.canvas.view.ClientCanvasViewer;
import me.tud.mc2d.datapack.DataPack;
import me.tud.mc2d.network.ConnectionState;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationFinishConfiguration;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationKnownPacks;
import me.tud.mc2d.network.packets.clientbound.configuration.ClientboundConfigurationRegistryData;
import me.tud.mc2d.network.packets.pluginmessage.clientbound.ClientboundPluginMessage;
import me.tud.mc2d.network.packets.processor.PacketProcessor;
import me.tud.mc2d.network.packets.serverbound.login.ServerboundLoginLoginAcknowledged;
import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.registry.DataDrivenRegistry;
import me.tud.mc2d.registry.Registry;
import me.tud.mc2d.registry.RegistryAccess;
import me.tud.mc2d.registry.RegistryKey;
import me.tud.mc2d.util.NBTSerializable;

import java.util.ArrayList;
import java.util.List;

public class ServerboundLoginLoginAcknowledgedProcessor implements PacketProcessor<ServerboundLoginLoginAcknowledged> {

    @Override
    public void process(ServerboundLoginLoginAcknowledged packet, ClientConnection connection) {
        connection.state(ConnectionState.CONFIGURATION);
        connection.configure();
        connection.finishConfiguration();
    }

}
