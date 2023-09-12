package afu.org.checkerframework.checker.interning.qual;

import afu.com.sun.source.tree.LiteralTree;
import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedPrimitiveType;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ImplicitFor(treeClasses = {LiteralTree.class}, typeClasses = {AnnotatedPrimitiveType.class}, typeNames = {Void.class})
@DefaultFor({DefaultLocation.LOWER_BOUNDS})
@SubtypeOf({UnknownInterned.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface Interned {
}
