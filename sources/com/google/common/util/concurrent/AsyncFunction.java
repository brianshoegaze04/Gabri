package com.google.common.util.concurrent;

import javax.annotation.Nullable;

public interface AsyncFunction<I, O> {
    ListenableFuture<O> apply(@Nullable I i) throws Exception;
}
