package me.tud.mc2d.util;

import java.util.function.Function;

public interface Codec<F, T> {

    T encode(F value);

    F decode(T value);
    
    default Function<F, T> encoder() {
        return this::encode;
    }

    default Function<T, F> decoder() {
        return this::decode;
    }
    
    default <U> Codec<F, U> then(Codec<T, U> next) {
        return of(encoder().andThen(next.encoder()), next.decoder().andThen(decoder()));
    }

    default <U> Codec<F, U> then(Function<T, U> encoder, Function<U, T> decoder) {
        return of(encoder().andThen(encoder), decoder.andThen(decoder()));
    }

    static <T> Codec<T, T> identity() {
        return of(Function.identity(), Function.identity());
    }

    static <F, T> Codec<F, T> of(Function<F, T> encoder, Function<T, F> decoder) {
        return new Codec<>() {
            @Override
            public T encode(F value) {
                return encoder.apply(value);
            }

            @Override
            public F decode(T value) {
                return decoder.apply(value);
            }
        };
    }

}
