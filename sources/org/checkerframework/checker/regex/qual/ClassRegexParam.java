package org.checkerframework.checker.regex.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Repeatable(MultiClassRegexParam.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassRegexParam {
    String value() default "_primary";
}
