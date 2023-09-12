package afu.org.checkerframework.checker.nullness.qual;

import afu.org.checkerframework.framework.qual.MonotonicQualifier;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE})
@MonotonicQualifier(NonNull.class)
@SubtypeOf({Nullable.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface MonotonicNonNull {
}
