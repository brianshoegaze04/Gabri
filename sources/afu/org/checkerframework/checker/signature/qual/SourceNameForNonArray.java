package afu.org.checkerframework.checker.signature.qual;

import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@SubtypeOf({SourceName.class, BinaryNameForNonArray.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface SourceNameForNonArray {
}
