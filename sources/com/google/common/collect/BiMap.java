package com.google.common.collect;

import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public interface BiMap<K, V> extends Map<K, V> {
    @Nullable
    V forcePut(@Nullable K k, @Nullable V v);

    BiMap<V, K> inverse();

    @Nullable
    V put(@Nullable K k, @Nullable V v);

    void putAll(Map<? extends K, ? extends V> map);

    Set<V> values();
}
