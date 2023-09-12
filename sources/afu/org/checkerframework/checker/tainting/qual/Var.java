package afu.org.checkerframework.checker.tainting.qual;

import afu.org.checkerframework.qualframework.poly.qual.Wildcard;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Repeatable(MultiVar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Var {
    String arg() default "_primary";

    String param() default "_primary";

    Wildcard wildcard() default Wildcard.NONE;
}
