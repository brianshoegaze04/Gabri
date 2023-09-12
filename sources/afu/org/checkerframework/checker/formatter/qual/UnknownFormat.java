package afu.org.checkerframework.checker.formatter.qual;

import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.InvisibleQualifier;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Target;

@Target({})
@InvisibleQualifier
@SubtypeOf({})
@DefaultQualifierInHierarchy
public @interface UnknownFormat {
}
