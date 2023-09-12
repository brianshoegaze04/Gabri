package afu.org.checkerframework.checker.initialization.qual;

import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({DefaultLocation.IMPLICIT_UPPER_BOUNDS, DefaultLocation.IMPLICIT_LOWER_BOUNDS, DefaultLocation.EXCEPTION_PARAMETER})
@SubtypeOf({UnknownInitialization.class})
@DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
public @interface Initialized {
}
