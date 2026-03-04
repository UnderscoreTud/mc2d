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
        id = Packets.Play.Clientbound.LEVEL_CHUNK_WITH_LIGHT,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlayChunkDataAndUpdateLight implements ClientboundPacket {

    private @SerializeWith(Serializers.Integer.class) int x, z;
    private @SerializeWith(WritableSerializer.class) ChunkData chunkData;
    private @SerializeWith(WritableSerializer.class) LightData lightData;

}
