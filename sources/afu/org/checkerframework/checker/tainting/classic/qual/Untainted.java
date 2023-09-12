package afu.org.checkerframework.checker.tainting.classic.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ImplicitFor(trees = {Kind.STRING_LITERAL, Kind.NULL_LITERAL})
@DefaultFor({DefaultLocation.LOWER_BOUNDS})
@SubtypeOf({Tainted.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface Untainted {
}
