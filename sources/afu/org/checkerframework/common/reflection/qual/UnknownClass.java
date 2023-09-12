package afu.org.checkerframework.common.reflection.qual;

import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.InvisibleQualifier;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.framework.qual.TargetLocations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@TargetLocations({DefaultLocation.EXPLICIT_LOWER_BOUNDS, DefaultLocation.EXPLICIT_UPPER_BOUNDS})
@Target({ElementType.TYPE_USE})
@InvisibleQualifier
@SubtypeOf({})
@DefaultQualifierInHierarchy
public @interface UnknownClass {
}
