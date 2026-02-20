package me.tud.mc2d.network.packets;

import org.machinemc.paklet.Packet;
import org.machinemc.paklet.PacketRegistrationContext;

import java.util.Map;

/**
 * Util for assigning correct packet IDs to packets
 * that are in multiple different groups.
 */
public final class PacketIDMap {

    private PacketIDMap() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns ID of packet in current packet registration context.
     *
     * @param group1 first group
     * @param id1 ID in first group
     * @return current ID
     */
    public static int compute(final String group1, final int id1) {
        return compute(Map.of(group1, id1));
    }

    /**
     * Returns ID of packet in current packet registration context.
     *
     * @param group1 first group
     * @param id1 ID in first group
     * @param group2 second group
     * @param id2 second id
     * @return current ID
     */
    public static int compute(final String group1, final int id1, final String group2, final int id2) {
        return compute(Map.of(group1, id1, group2, id2));
    }

    /**
     * Returns ID of packet in current packet registration context.
     *
     * @param group1 first group
     * @param id1 ID in first group
     * @param group2 second group
     * @param id2 second id
     * @param group3 third group
     * @param id3 third id
     * @return current ID
     */
    public static int compute(final String group1, final int id1, final String group2, final int id2, final String group3, final int id3) {
        return compute(Map.of(group1, id1, group2, id2, group3, id3));
    }

    /**
     * Returns ID of packet in current packet registration context.
     *
     * @param map group <-> id map
     * @return current ID
     */
    public static int compute(final Map<String, Integer> map) {
        return map.getOrDefault(PacketRegistrationContext.get().getPacketGroup(), Packet.INVALID_PACKET);
    }

}
