package me.tud.mc2d.canvas.textdisplay;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Delegate;
import me.tud.mc2d.canvas.CanvasRegion;
import me.tud.mc2d.canvas.MemoryCanvas;
import me.tud.mc2d.canvas.lifecycle.Disposable;
import me.tud.mc2d.canvas.view.CanvasSession;
import me.tud.mc2d.canvas.view.CanvasViewer;
import me.tud.mc2d.canvas.view.ClientCanvasViewer;
import me.tud.mc2d.canvas.world.AbstractWorldCanvas;
import me.tud.mc2d.dimension.DimensionType;
import me.tud.mc2d.entity.TextDisplay;
import me.tud.mc2d.entity.metadata.Metadata;
import me.tud.mc2d.network.packets.clientbound.play.ClientboundPlaySetEntityMetadata;
import me.tud.mc2d.world.Biome;
import org.jetbrains.annotations.UnmodifiableView;
import org.joml.Vector3f;
import org.machinemc.scriptive.components.TextComponent;
import org.machinemc.scriptive.serialization.ComponentProperties;
import org.machinemc.scriptive.style.ChatStyle;
import org.machinemc.scriptive.style.HexColor;
import org.machinemc.scriptive.style.TextFormat;

import java.util.Collection;

@Getter
@ToString
public class TextDisplayCanvas extends AbstractWorldCanvas implements Disposable {

    static final String PIXEL_CHAR = " ";
    static final ChatStyle[] PIXEL_STYLE = new ChatStyle[]{ChatStyle.STRIKETHROUGH};
    static final Vector3f BASE_SCALE = new Vector3f(1, 4, 1);
    static final float PIXEL_LENGTH = 0.1f;

    private final @ToString.Exclude @Delegate MemoryCanvas base;
    private final Direction direction;

    private final @ToString.Exclude TextDisplay[] lines;

    public TextDisplayCanvas(Builder builder) {
        super(builder);
        this.base = new MemoryCanvas(builder);
        this.direction = builder.actualDirection;

        this.lines = new TextDisplay[height()];
        float x = (width() * PIXEL_LENGTH) / 2.0f;
        float y = (height() & 1) == 1 ? 0.5f : 0.45f; // for some reason I have to compensate if height is odd?
        for (int i = 0; i < lines.length; i++) {
            TextDisplay line = new TextDisplay();
            line.setMetadata(Metadata.TextDisplay.TRANSLATION, new Vector3f(x, (PIXEL_LENGTH * i) - y, 0));
            line.setMetadata(Metadata.TextDisplay.BACKGROUND_COLOR, 0x00000000);
            line.setMetadata(Metadata.TextDisplay.SCALE, new Vector3f(BASE_SCALE));
            line.setMetadata(Metadata.TextDisplay.LINE_WIDTH, width() * 100);
            line.setMetadata(Metadata.TextDisplay.TEXT, line(i));
            lines[i] = line;
        }
    }

    @Override
    public @UnmodifiableView Collection<? extends TextDisplayCanvasSession> sessions() {
        //noinspection unchecked
        return (Collection<? extends TextDisplayCanvasSession>) super.sessions();
    }

    @Override
    protected CanvasSession createSession(CanvasViewer viewer) {
        if (!(viewer instanceof ClientCanvasViewer clientViewer))
            throw new IllegalArgumentException("TextDisplayCanvas only supports ClientCanvasViewers");
        return new TextDisplayCanvasSession(this, clientViewer);
    }

    @Override
    public boolean isDirty() {
        return base.isDirty();
    }

    @Override
    public @UnmodifiableView Collection<CanvasRegion> dirtyRegions() {
        return base.dirtyRegions();
    }

    @Override
    public void clearDirty() {
        base.clearDirty();
    }

    @Override
    public void present() {
        if (!isDirty())
            return;

        IntSet dirtyLines = new IntArraySet();
        for (CanvasRegion dirtyRegion : dirtyRegions()) {
            for (int line = dirtyRegion.y(); line < dirtyRegion.maxY(); line++)
                dirtyLines.add(line);
        }

        for (Integer dirtyLine : dirtyLines) {
            TextDisplay display = lines[dirtyLine];
            display.setMetadata(Metadata.TextDisplay.TEXT, line(dirtyLine));
            ClientboundPlaySetEntityMetadata packet = new ClientboundPlaySetEntityMetadata(display);

            for (TextDisplayCanvasSession session : sessions()) {
                if (!session.active()) {
                    detach(session.viewer());
                    continue;
                }
    
                if (!session.initialized() && !session.initialize())
                    continue;
                if (!session.loaded() && !session.load())
                    continue;

                session.viewer().sendPacket(packet);
            }
        }
        clearDirty();
    }

    protected ComponentProperties line(int y) {
        TextComponent component = TextComponent.empty();
        for (int x = 0; x < width(); x++)
            component.append(PIXEL_CHAR, new TextFormat(new HexColor(getRGB(x, y)), PIXEL_STYLE));
        return component.getProperties();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends AbstractWorldCanvas.Builder<TextDisplayCanvas, Builder> {

        private Direction actualDirection = Direction.HORIZONTAL;

        protected Builder() {
            this.direction = Direction.DOWN;
        }

        @Override
        public Builder direction(Direction direction) {
            this.actualDirection = direction;
            return self();
        }

        @Override
        public Builder dimensionType(DimensionType dimensionType) {
            return super.dimensionType(dimensionType);
        }

        @Override
        public Builder biome(Biome biome) {
            return super.biome(biome);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public TextDisplayCanvas build() {
            this.worldWidth = 1;
            this.worldHeight = 1;
            return new TextDisplayCanvas(this);
        }

    }

}
