package afu.org.checkerframework.checker.guieffect.qual;

import afu.org.checkerframework.framework.qual.PolymorphicQualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@PolymorphicQualifier(UI.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PolyUI {
}