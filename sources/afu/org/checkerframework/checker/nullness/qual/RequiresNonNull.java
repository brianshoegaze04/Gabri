package afu.org.checkerframework.checker.nullness.qual;

import afu.org.checkerframework.framework.qual.PreconditionAnnotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PreconditionAnnotation(qualifier = NonNull.class)
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresNonNull {
    String[] value();
}
