package afu.org.checkerframework.checker.signature.qual;

import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Target;

@SubtypeOf({})
@DefaultQualifierInHierarchy
@Target({})
public @interface UnannotatedString {
}
