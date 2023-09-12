package afu.org.checkerframework.checker.nullness.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedNoType;
import afu.org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedPrimitiveType;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.lang.model.type.TypeKind;

@ImplicitFor(trees = {Kind.NEW_CLASS, Kind.NEW_ARRAY, Kind.PLUS, Kind.BOOLEAN_LITERAL, Kind.CHAR_LITERAL, Kind.DOUBLE_LITERAL, Kind.FLOAT_LITERAL, Kind.INT_LITERAL, Kind.LONG_LITERAL, Kind.STRING_LITERAL}, typeClasses = {AnnotatedPrimitiveType.class, AnnotatedNoType.class}, types = {TypeKind.PACKAGE})
@DefaultInUncheckedCodeFor({DefaultLocation.PARAMETERS, DefaultLocation.LOWER_BOUNDS})
@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({DefaultLocation.EXCEPTION_PARAMETER})
@SubtypeOf({MonotonicNonNull.class})
@DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
public @interface NonNull {
}
