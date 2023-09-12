package com.google.common.collect;

import java.util.Map;
import javax.annotation.Nullable;

public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
    <T extends B> T getInstance(Class<T> cls);

    <T extends B> T putInstance(Class<T> cls, @Nullable T t);
}
