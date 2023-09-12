package org.checkerframework.checker.regex.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.regex.classic.qual.UnknownRegex;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.qualframework.poly.qual.Wildcard;

@SubtypeOf({UnknownRegex.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Repeatable(MultiRegex.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Regex {
    String param() default "_primary";

    int value() default 0;

    Wildcard wildcard() default Wildcard.NONE;
}
