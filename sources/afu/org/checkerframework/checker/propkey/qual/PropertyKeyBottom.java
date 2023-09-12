package afu.org.checkerframework.checker.propkey.qual;

import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ImplicitFor(typeNames = {Void.class})
@DefaultFor({DefaultLocation.LOWER_BOUNDS})
@SubtypeOf({PropertyKey.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface PropertyKeyBottom {
}
