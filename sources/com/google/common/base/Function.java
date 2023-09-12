package com.google.common.base;

import javax.annotation.Nullable;

public interface Function<F, T> {
    @Nullable
    T apply(@Nullable F f);

    boolean equals(@Nullable Object obj);
}
