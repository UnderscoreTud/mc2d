package me.tud.mc2d.canvas.runtime;

import io.netty.channel.ChannelFuture;
import lombok.Builder;
import me.tud.mc2d.canvas.runtime.server.ServerCanvasApp;
import me.tud.mc2d.canvas.runtime.server.ServerCanvasContext;
import me.tud.mc2d.network.server.Server;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

@Builder
public class CanvasRuntime {

    private final @Builder.Default String hostname = "0.0.0.0";
    private final @Builder.Default int port = 25565;
    private final @NotNull ServerCanvasApp app;

    public void run() throws IOException {
        Server server = new Server(hostname, port);
        server.init();
        server.run().addListener((ChannelFuture future) -> {
            if (!future.isSuccess())
                throw new RuntimeException("Failed to bind server", future.cause());

            ServerCanvasContext ctx = server.canvasContext();
            app.setup(ctx);

            future.channel().closeFuture().addListener(_ -> {
                try {
                    app.close(ctx);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });
    }

}
