package afu.org.checkerframework.checker.javari.qual;

import afu.org.checkerframework.framework.qual.PolymorphicQualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@PolymorphicQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PolyRead {
}
