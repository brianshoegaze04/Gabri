package org.checkerframework.checker.units.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.ImplicitFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeUseLocation;

@DefaultFor({TypeUseLocation.LOWER_BOUND})
@SubtypeOf({})
@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ImplicitFor(typeNames = {Void.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface UnitsBottom {
}