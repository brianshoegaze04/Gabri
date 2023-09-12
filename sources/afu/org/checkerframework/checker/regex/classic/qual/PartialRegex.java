package afu.org.checkerframework.checker.regex.classic.qual;

import afu.org.checkerframework.framework.qual.InvisibleQualifier;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Target;

@Target({})
@InvisibleQualifier
@SubtypeOf({UnknownRegex.class})
public @interface PartialRegex {
    String value() default "";
}
