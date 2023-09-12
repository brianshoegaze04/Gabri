package afu.org.checkerframework.checker.nullness.qual;

import afu.org.checkerframework.framework.qual.InheritedAnnotation;
import afu.org.checkerframework.framework.qual.PostconditionAnnotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PostconditionAnnotation(qualifier = NonNull.class)
@InheritedAnnotation
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresNonNull {
    String[] value();
}
