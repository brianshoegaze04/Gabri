package afu.org.checkerframework.common.aliasing.qual;

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
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@ImplicitFor(trees = {Kind.NULL_LITERAL}, typeNames = {Void.class})
@SubtypeOf({})
@DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
public @interface MaybeAliased {
}
