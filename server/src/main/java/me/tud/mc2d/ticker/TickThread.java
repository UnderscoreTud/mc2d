package me.tud.mc2d.ticker;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;

/**
 * Represents a thread with assigned ticker.
 */
public class TickThread extends Thread {

    private final Supplier<Ticker> ticker;

    protected TickThread(ThreadGroup group, Runnable task, Supplier<Ticker> ticker) {
        super(group, task);
        this.ticker = Preconditions.checkNotNull(ticker, "Ticker supplier can not be null");
    }

    /**
     * Returns the ticker associated with this thread.
     *
     * @return ticker
     */
    public Ticker ticker() {
        Ticker ticker = this.ticker.get();
        Preconditions.checkNotNull(ticker, "This tick thread has no assigned ticker to it");
        Preconditions.checkState(ticker.isTickThread(this), "Invalid ticker");
        return ticker;
    }

}
