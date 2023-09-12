package afu.org.checkerframework.checker.lock.qual;

import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE})
@SubtypeOf({})
@DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
public @interface LockPossiblyHeld {
}
