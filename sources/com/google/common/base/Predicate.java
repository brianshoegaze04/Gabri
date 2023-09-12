package com.google.common.base;

import javax.annotation.Nullable;

public interface Predicate<T> {
    boolean apply(@Nullable T t);

    boolean equals(@Nullable Object obj);
}
