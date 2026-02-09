package me.tud.mc2d.network.packets;

public interface PacketFactory {

    Packet createPacket(int packetID, byte[] data);

    <T extends Packet> T createPacket(Class<T> packetType, byte[] data);

}
