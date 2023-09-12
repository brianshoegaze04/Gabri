package afu.org.checkerframework.checker.lock.qual;

import afu.org.checkerframework.framework.qual.PostconditionAnnotation;
import afu.org.checkerframework.framework.qual.PreconditionAnnotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@PostconditionAnnotation(qualifier = LockHeld.class)
@PreconditionAnnotation(qualifier = LockHeld.class)
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Holding {
    String[] value();
}
