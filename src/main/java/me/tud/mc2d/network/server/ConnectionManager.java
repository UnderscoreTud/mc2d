package me.tud.mc2d.network.server;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import me.tud.mc2d.network.client.ClientConnection;
import me.tud.mc2d.network.exceptions.BroadcastException;
import me.tud.mc2d.network.packets.Packet;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionManager {

    private final Set<ClientConnection> clients = Collections.synchronizedSet(new HashSet<>());

    public void addClient(ClientConnection clientConnection) {
        clients.add(clientConnection);
    }

    public @UnmodifiableView Set<ClientConnection> clients() {
        return Collections.unmodifiableSet(clients);
    }

    public void removeClient(ClientConnection clientConnection) {
        clients.remove(clientConnection);
    }

    public ChannelFuture broadcast(Packet packet) {
        ChannelPromise globalPromise = clients.iterator().next().channel().newPromise();
        AtomicInteger remaining = new AtomicInteger(clients.size());
        List<Throwable> failureCauses = Collections.synchronizedList(new ArrayList<>());
        clients.forEach(client -> client.sendPacket(packet).addListener(future -> {
            if (!future.isSuccess())
                failureCauses.add(future.cause());
            if (remaining.decrementAndGet() != 0)
                return;
            if (failureCauses.isEmpty()) globalPromise.setSuccess();
            else globalPromise.setFailure(new BroadcastException(failureCauses));
        }));
        return globalPromise;
    }

}
