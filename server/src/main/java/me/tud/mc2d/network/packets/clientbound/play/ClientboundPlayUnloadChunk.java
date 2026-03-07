package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.chunk.data.ChunkData;
import me.tud.mc2d.chunk.data.LightData;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.serializers.WritableSerializer;
import org.machinemc.paklet.Packet;
import org.machinemc.paklet.modifiers.SerializeWith;
import org.machinemc.paklet.serialization.Serializers;

@Data
@Packet(
        id = Packets.Play.Clientbound.FORGET_LEVEL_CHUNK,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@RequiredArgsConstructor
public class ClientboundPlayUnloadChunk implements ClientboundPacket {

    private @SerializeWith(Serializers.Integer.class) int z, x;

    public ClientboundPlayUnloadChunk(int x, int z) {
        this.x = x;
        this.z = z;
    }

}
