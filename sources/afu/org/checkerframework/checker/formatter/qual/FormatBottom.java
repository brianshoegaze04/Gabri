package afu.org.checkerframework.checker.formatter.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.framework.qual.TargetLocations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@TargetLocations({DefaultLocation.EXPLICIT_LOWER_BOUNDS, DefaultLocation.EXPLICIT_UPPER_BOUNDS})
@Target({ElementType.TYPE_USE})
@ImplicitFor(trees = {Kind.NULL_LITERAL}, typeNames = {Void.class})
@DefaultFor({DefaultLocation.LOWER_BOUNDS})
@SubtypeOf({Format.class, InvalidFormat.class})
public @interface FormatBottom {
}
