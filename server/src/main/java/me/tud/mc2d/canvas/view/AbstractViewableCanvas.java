package me.tud.mc2d.canvas.view;

import me.tud.mc2d.canvas.AbstractMutableCanvas;
import org.jetbrains.annotations.UnmodifiableView;

import java.util.*;

public abstract class AbstractViewableCanvas extends AbstractMutableCanvas implements ViewableCanvas {

    protected final Map<Object, CanvasSession> sessions = new LinkedHashMap<>();

    @Override
    public @UnmodifiableView Collection<? extends CanvasSession> sessions() {
        return Collections.unmodifiableCollection(sessions.values());
    }

    @Override
    public CanvasSession attach(CanvasViewer viewer) {
        return sessions.computeIfAbsent(viewer.identity(), _ -> createSession(viewer));
    }

    @Override
    public boolean detach(CanvasViewer viewer) {
        CanvasSession session = sessions.remove(viewer.identity());
        if (session == null)
            return false;
        if (session.active())
            session.close();
        return true;
    }

    protected abstract CanvasSession createSession(CanvasViewer viewer);

}
