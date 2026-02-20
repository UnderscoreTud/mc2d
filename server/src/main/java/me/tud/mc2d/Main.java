package me.tud.mc2d;

import me.tud.mc2d.network.server.Server;
import me.tud.mc2d.ticker.Tick;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static final ClassLoader CLASS_LOADER = Main.class.getClassLoader();

    public static void main(String[] args) throws IOException {
        Server server = new Server(25565);
        server.init();
        server.run();
    }

}
