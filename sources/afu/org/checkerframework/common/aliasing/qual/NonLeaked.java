package afu.org.checkerframework.common.aliasing.qual;

import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE})
@SubtypeOf({})
@Retention(RetentionPolicy.RUNTIME)
public @interface NonLeaked {
}
