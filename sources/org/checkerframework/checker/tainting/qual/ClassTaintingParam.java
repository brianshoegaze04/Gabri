package org.checkerframework.checker.tainting.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Repeatable(MultiClassTaintingParam.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassTaintingParam {
    String value() default "_primary";
}
