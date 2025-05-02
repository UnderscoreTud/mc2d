package me.tud.mc2d.network.server;

import org.jetbrains.annotations.Nullable;
import org.machinemc.scriptive.components.TextComponent;

public class ServerProperties {

    private int playerCount;
    private @Nullable Integer displayedPlayerCount;
    private boolean hidePlayers;
    private @Nullable TextComponent motd = TextComponent.of("A Minecraft Server");
    private @Nullable String icon;

    public int playerCount() {
        return playerCount;
    }

    public void playerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int displayedPlayerCount() {
        return displayedPlayerCount == null ? playerCount : displayedPlayerCount;
    }

    public void displayedPlayerCount(@Nullable Integer displayedPlayerCount) {
        this.displayedPlayerCount = displayedPlayerCount;
    }

    public boolean hidePlayers() {
        return hidePlayers;
    }

    public void hidePlayers(boolean hidePlayers) {
        this.hidePlayers = hidePlayers;
    }

    public @Nullable TextComponent motd() {
        return motd;
    }

    public void motd(TextComponent motd) {
        this.motd = motd;
    }

    public @Nullable String icon() {
        return icon;
    }

    public void icon(@Nullable String icon) {
        this.icon = icon;
    }

}
