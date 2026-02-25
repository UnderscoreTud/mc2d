package me.tud.mc2d.world.blockdata;

import com.google.common.base.Preconditions;
import org.jetbrains.annotations.ApiStatus;

import java.util.Map;

public class BlockData {

    private final int startingID;

    @ApiStatus.Internal
    public BlockData(int startingID) {
        this.startingID = startingID;
    }

    int offsetID() {
        return 0;
    }

    public int maxOffset() {
        return 0;
    }

    public int id() {
        return startingID + offsetID();
    }

    public void load(int id) {
        int offset = id - startingID;
        Preconditions.checkArgument(0 <= offset && offset <= maxOffset(), "ID must be within [0, " + maxOffset() + "], got " + offset);
        loadFromOffset(offset);
    }

    void loadFromOffset(int offset) {}

    public void load(Map<String, String> properties) {}

}
