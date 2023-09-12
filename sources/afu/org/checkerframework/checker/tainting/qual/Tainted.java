package afu.org.checkerframework.checker.tainting.qual;

import afu.org.checkerframework.qualframework.poly.qual.Wildcard;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Repeatable(MultiTainted.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tainted {
    String param() default "_primary";

    Wildcard wildcard() default Wildcard.NONE;
}
