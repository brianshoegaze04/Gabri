package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

@SubtypeOf({Nullable.class})
@Documented
@Target({ElementType.TYPE_USE})
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
public @interface LazyNonNull {
}
