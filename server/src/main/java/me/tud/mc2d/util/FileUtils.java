package me.tud.mc2d.util;

import me.tud.mc2d.Main;

import java.io.File;
import java.net.URL;

public class FileUtils {

    private static File sourceLocation;

    static {
        URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
        try {
            sourceLocation = new File(location.toURI());
        } catch (Exception e) {
            sourceLocation = new File(location.getPath());
        }
    }

    public static File getSourceLocation() {
        return sourceLocation;
    }

}
