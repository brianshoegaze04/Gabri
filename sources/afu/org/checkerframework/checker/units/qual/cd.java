package afu.org.checkerframework.checker.units.qual;

import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({Luminance.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface cd {
    Prefix value() default Prefix.one;
}
