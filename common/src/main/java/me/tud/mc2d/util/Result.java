package me.tud.mc2d.util;

import com.google.common.base.Preconditions;
import org.jetbrains.annotations.Contract;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public sealed interface Result<T, E> {

    boolean isOk();

    boolean isErr();

    T get();

    T expect(String message);

    E expectErr(String message);

    T orNull();

    T or(T def);

    T orGet(Supplier<? extends T> def);

    T orElseThrow(Function<? super E, ? extends RuntimeException> function);

    E error();

    <U> Result<U, E> map(Function<? super T, ? extends U> mapper);

    <U> Result<U, E> flatMap(Function<? super T, ? extends Result<U, E>> mapper);

    <U> Result<T, U> mapErr(Function<? super E, ? extends U> mapper);

    Result<T, E> filter(Predicate<? super T> filter, Supplier<? extends E> err);

    Result<T, E> onOk(Consumer<? super T> consumer);

    Result<T, E> onErr(Consumer<? super E> consumer);

    @Contract(value = "_ -> new", pure = true)
    static <T, E> Result<T, E> ok(T value) {
        return new Ok<>(value);
    }

    @Contract(value = "_ -> new", pure = true)
    static <T, E> Result<T, E> err(E error) {
        return new Err<>(error);
    }

    record Ok<T, E>(T value) implements Result<T, E> {

        public Ok {
            Preconditions.checkNotNull(value, "value");
        }

        @Override
        public boolean isOk() {
            return true;
        }

        @Override
        public boolean isErr() {
            return false;
        }

        @Override
        public T get() {
            return value;
        }

        @Override
        public T expect(String message) {
            return value;
        }

        @Override
        public E expectErr(String message) {
            throw new IllegalStateException(message + " (was Ok)");
        }

        @Override
        public T orNull() {
            return value;
        }

        @Override
        public T or(T def) {
            return value;
        }

        @Override
        public T orGet(Supplier<? extends T> def) {
            return value;
        }

        @Override
        public T orElseThrow(Function<? super E, ? extends RuntimeException> function) {
            return value;
        }

        @Override
        public E error() {
            throw new IllegalStateException("Tried to get Err value from Ok result.");
        }

        @Override
        public <U> Result<U, E> map(Function<? super T, ? extends U> mapper) {
            return Result.ok(mapper.apply(value));
        }

        @Override
        public <U> Result<U, E> flatMap(Function<? super T, ? extends Result<U, E>> mapper) {
            return mapper.apply(value);
        }

        @Override
        public <U> Result<T, U> mapErr(Function<? super E, ? extends U> mapper) {
            return Result.ok(value);
        }

        @Override
        public Result<T, E> filter(Predicate<? super T> filter, Supplier<? extends E> err) {
            return filter.test(value) ? Result.ok(value) : Result.err(err.get());
        }

        @Override
        public Result<T, E> onOk(Consumer<? super T> consumer) {
            consumer.accept(value);
            return this;
        }

        @Override
        public Result<T, E> onErr(Consumer<? super E> consumer) {
            return this;
        }

    }

    record Err<T, E>(E error) implements Result<T, E> {

        public Err {
            Preconditions.checkNotNull(error, "error");
        }

        @Override
        public boolean isOk() {
            return false;
        }

        @Override
        public boolean isErr() {
            return true;
        }

        @Override
        public T get() {
            return expect("Tried to get Ok value from Err result.");
        }

        @Override
        public T expect(String message) {
            String suffix = "was Err";
            if (error instanceof Summarizable summarizable)
                suffix += ": " + summarizable.summarize();
            throw new IllegalStateException(message + " (" + suffix + ")");
        }

        @Override
        public E expectErr(String message) {
            return error;
        }

        @Override
        @Contract("-> null")
        public T orNull() {
            return null;
        }

        @Override
        @Contract("_ -> param1")
        public T or(T def) {
            return def;
        }

        @Override
        public T orGet(Supplier<? extends T> def) {
            return def.get();
        }

        @Override
        public T orElseThrow(Function<? super E, ? extends RuntimeException> function) {
            throw function.apply(error);
        }

        @Override
        public E error() {
            return error;
        }

        @Override
        public <U> Result<U, E> map(Function<? super T, ? extends U> mapper) {
            return Result.err(error);
        }

        @Override
        public <U> Result<U, E> flatMap(Function<? super T, ? extends Result<U, E>> mapper) {
            return Result.err(error);
        }

        @Override
        public <U> Result<T, U> mapErr(Function<? super E, ? extends U> mapper) {
            return Result.err(mapper.apply(error));
        }

        @Override
        public Result<T, E> filter(Predicate<? super T> filter, Supplier<? extends E> err) {
            return Result.err(error);
        }

        @Override
        public Result<T, E> onOk(Consumer<? super T> consumer) {
            return this;
        }

        @Override
        public Result<T, E> onErr(Consumer<? super E> consumer) {
            consumer.accept(error);
            return this;
        }

    }

}
