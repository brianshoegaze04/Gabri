package afu.org.checkerframework.checker.nullness.qual;

import afu.org.checkerframework.framework.qual.ConditionalPostconditionAnnotation;
import afu.org.checkerframework.framework.qual.InheritedAnnotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@InheritedAnnotation
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@ConditionalPostconditionAnnotation(qualifier = NonNull.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresNonNullIf {
    String[] expression();

    boolean result();
}
