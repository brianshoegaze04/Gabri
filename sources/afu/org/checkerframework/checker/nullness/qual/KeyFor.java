package afu.org.checkerframework.checker.nullness.qual;

import afu.org.checkerframework.framework.qual.FieldIsExpression;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@FieldIsExpression
@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({UnknownKeyFor.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface KeyFor {
    String[] value();
}
