package afu.org.checkerframework.checker.guieffect.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ImplicitFor(trees = {Kind.NULL_LITERAL})
@SubtypeOf({UI.class})
@DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
public @interface AlwaysSafe {
}
