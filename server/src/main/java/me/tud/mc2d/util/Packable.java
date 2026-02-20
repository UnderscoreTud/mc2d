package me.tud.mc2d.util;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

public interface Packable {

    int mask();

    static <T extends Packable> int pack(Collection<T> collection) {
        int packed = 0;
        for (T value : collection)
            packed |= value.mask();
        return packed;
    }

    static <T extends Enum<T> & Packable> Set<T> unpack(Class<T> type, int packed) {
        Set<T> set = EnumSet.noneOf(type);
        for (T value : type.getEnumConstants()) {
            if ((packed & value.mask()) != 0)
                set.add(value);
        }
        return set;
    }

}
