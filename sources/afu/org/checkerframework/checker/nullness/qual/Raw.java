package afu.org.checkerframework.checker.nullness.qual;

import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({DefaultLocation.LOCAL_VARIABLE, DefaultLocation.RESOURCE_VARIABLE})
@SubtypeOf({})
@Retention(RetentionPolicy.RUNTIME)
public @interface Raw {
    Class<?> value() default Object.class;
}
