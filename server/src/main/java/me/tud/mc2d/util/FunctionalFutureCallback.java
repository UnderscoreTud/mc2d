package me.tud.mc2d.util;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FutureCallback;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

/**
 * Util for simple creation of future callbacks.
 */
public final class FunctionalFutureCallback {

    private FunctionalFutureCallback() {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates new future call back from two consumers.
     *
     * @param onSuccess runs on success
     * @param onFailure runs on failure
     * @return new future callback using the two consumers
     * @param <T> type on success
     */
    public static <T> FutureCallback<T> create(final Consumer<T> onSuccess, final Consumer<Throwable> onFailure) {
        Preconditions.checkNotNull(onSuccess, "Success consumer can not be null");
        Preconditions.checkNotNull(onFailure, "Failure consumer can not be null");
        return new FutureCallback<>() {
            @Override
            public void onSuccess(final T result) {
                onSuccess.accept(result);
            }

            @Override
            public void onFailure(final @NotNull Throwable throwable) {
                onFailure.accept(throwable);
            }
        };
    }

}
