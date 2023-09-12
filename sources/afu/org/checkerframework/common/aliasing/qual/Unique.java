package afu.org.checkerframework.common.aliasing.qual;

import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE})
@DefaultFor({DefaultLocation.LOWER_BOUNDS})
@SubtypeOf({MaybeAliased.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface Unique {
}
