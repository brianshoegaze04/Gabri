package afu.org.checkerframework.checker.regex.qual;

import afu.org.checkerframework.checker.regex.classic.qual.UnknownRegex;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.qualframework.poly.qual.Wildcard;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownRegex.class})
@Repeatable(MultiRegex.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Regex {
    String param() default "_primary";

    int value() default 0;

    Wildcard wildcard() default Wildcard.NONE;
}
