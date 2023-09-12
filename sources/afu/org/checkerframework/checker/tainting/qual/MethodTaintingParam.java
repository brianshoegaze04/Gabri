package afu.org.checkerframework.checker.tainting.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Repeatable(MultiMethodTaintingParam.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodTaintingParam {
    String value() default "_primary";
}
