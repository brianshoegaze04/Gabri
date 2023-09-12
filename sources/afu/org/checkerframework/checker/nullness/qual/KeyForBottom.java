package afu.org.checkerframework.checker.nullness.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.InvisibleQualifier;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ImplicitFor(trees = {Kind.NULL_LITERAL}, typeNames = {Void.class})
@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@InvisibleQualifier
@DefaultFor({DefaultLocation.LOWER_BOUNDS})
@SubtypeOf({KeyFor.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface KeyForBottom {
}
