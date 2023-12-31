package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface ListMultimap<K, V> extends Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    boolean equals(@Nullable Object obj);

    List<V> get(@Nullable K k);

    List<V> removeAll(@Nullable Object obj);

    List<V> replaceValues(K k, Iterable<? extends V> iterable);
}
