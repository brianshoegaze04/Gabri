package afu.org.checkerframework.checker.fenum.qual;

import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.framework.qual.TargetLocations;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@TargetLocations({DefaultLocation.EXPLICIT_LOWER_BOUNDS, DefaultLocation.EXPLICIT_UPPER_BOUNDS})
@Documented
@Target({ElementType.TYPE_USE})
@DefaultFor({DefaultLocation.LOCAL_VARIABLE, DefaultLocation.RESOURCE_VARIABLE})
@SubtypeOf({})
@Retention(RetentionPolicy.RUNTIME)
public @interface FenumTop {
}
