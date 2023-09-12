package org.checkerframework.checker.tainting.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.qualframework.poly.qual.Wildcard;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Repeatable(MultiUntainted.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Untainted {
    String param() default "_primary";

    Wildcard wildcard() default Wildcard.NONE;
}
