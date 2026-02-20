package me.tud.mc2d.network.packets;

import me.tud.mc2d.network.ConnectionState;

public interface Packet {

    Direction direction();
    
    static String group(ConnectionState state, Direction direction) {
        return switch (state) {
            case HANDSHAKE -> {
                if (direction == Direction.CLIENTBOUND)
                    throw new IllegalArgumentException("There is not client-bound handshaking state");
                yield Packets.Handshake.Serverbound.NAME;
            }
            case STATUS -> direction == Direction.CLIENTBOUND
                    ? Packets.Status.Clientbound.NAME
                    : Packets.Status.Serverbound.NAME;
            case LOGIN -> direction == Direction.CLIENTBOUND
                    ? Packets.Login.Clientbound.NAME
                    : Packets.Login.Serverbound.NAME;
            case CONFIGURATION -> direction == Direction.CLIENTBOUND
                    ? Packets.Configuration.Clientbound.NAME
                    : Packets.Configuration.Serverbound.NAME;
            case PLAY -> direction == Direction.CLIENTBOUND
                    ? Packets.Play.Clientbound.NAME
                    : Packets.Play.Serverbound.NAME;
        };
    }

    enum Direction {
        CLIENTBOUND,
        SERVERBOUND
    }

}
