package me.tud.mc2d.util;

import java.util.NoSuchElementException;

public interface IDProvider<T> {

    int getID(T t);

    T getByID(int id);

    static <T> IDProvider<T> singleton(T value) {
        return new IDProvider<>() {
            @Override
            public int getID(T t) {
                if (!value.equals(t))
                    throw new NoSuchElementException();
                return 0;
            }

            @Override
            public T getByID(int id) {
                if (id != 0)
                    throw new IndexOutOfBoundsException("ID out of bounds: " + id);
                return value;
            }
        };
    }

}
