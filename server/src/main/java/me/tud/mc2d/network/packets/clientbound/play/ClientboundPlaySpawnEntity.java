package me.tud.mc2d.network.packets.clientbound.play;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import me.tud.mc2d.entity.Entity;
import me.tud.mc2d.network.packets.Packets;
import me.tud.mc2d.network.packets.clientbound.ClientboundPacket;
import me.tud.mc2d.network.packets.serializers.Angle;
import me.tud.mc2d.network.packets.serializers.LpVec3;
import org.joml.Vector3d;
import org.machinemc.paklet.Packet;

import java.util.UUID;

@Data
@Packet(
        id = Packets.Play.Clientbound.ADD_ENTITY,
        group = Packets.Play.Clientbound.NAME,
        catalogue = Packets.Play.Clientbound.class
)
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientboundPlaySpawnEntity implements ClientboundPacket {

    private int entityID;
    private UUID uuid;
    private int type;
    private Vector3d position;
    private @LpVec3 Vector3d velocity;
    private @Angle float pitch, yaw, headYaw;
    private int data;

    public ClientboundPlaySpawnEntity(Entity entity) {
        this(entity.entityID(), entity.uuid(), entity.type().id(), entity.position(), entity.velocity(), entity.pitch(), entity.yaw(), entity.headYaw(), 0);
    }

}
