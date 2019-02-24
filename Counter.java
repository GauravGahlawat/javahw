package javaniitwork;

import java.util.Collection;
import java.util.List;

public class Counter {
    public static <T> long countIf(Collection<T> collection) {
        return collection.stream()
                         .count();
    }
}