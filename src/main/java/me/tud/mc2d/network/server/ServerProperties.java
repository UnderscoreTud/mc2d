package me.tud.mc2d.network.server;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;
import org.machinemc.scriptive.components.TextComponent;

@Getter
@Setter
public class ServerProperties {

    private int playerCount;
    private @Nullable Integer displayedPlayerCount;
    private boolean hidePlayers;
    private @Nullable TextComponent motd = TextComponent.of("A Minecraft Server");
    private @Nullable String icon;

    public int displayedPlayerCount() {
        return displayedPlayerCount == null ? playerCount : displayedPlayerCount;
    }

    public void displayedPlayerCount(@Nullable Integer displayedPlayerCount) {
        this.displayedPlayerCount = displayedPlayerCount;
    }

}
