package afu.org.checkerframework.checker.oigj.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.framework.qual.TargetLocations;
import afu.org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedPrimitiveType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@TargetLocations({DefaultLocation.EXPLICIT_LOWER_BOUNDS, DefaultLocation.EXPLICIT_UPPER_BOUNDS})
@Target({ElementType.TYPE_USE})
@ImplicitFor(trees = {Kind.NULL_LITERAL, Kind.CLASS, Kind.ENUM, Kind.INTERFACE, Kind.ANNOTATION_TYPE, Kind.NEW_ARRAY}, typeClasses = {AnnotatedPrimitiveType.class}, typeNames = {Void.class})
@DefaultFor({DefaultLocation.LOWER_BOUNDS})
@SubtypeOf({Mutable.class, Immutable.class, I.class, Modifier.class, O.class})
public @interface OIGJMutabilityBottom {
}
