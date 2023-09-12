package afu.org.checkerframework.common.aliasing.qual;

import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.InvisibleQualifier;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({})
@InvisibleQualifier
@SubtypeOf({LeakedToResult.class})
@DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
public @interface MaybeLeaked {
}
