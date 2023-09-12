package afu.org.checkerframework.checker.oigj.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.lang.model.type.TypeKind;

@ImplicitFor(trees = {Kind.NEW_CLASS}, types = {TypeKind.ARRAY})
@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor({DefaultLocation.IMPLICIT_UPPER_BOUNDS, DefaultLocation.IMPLICIT_LOWER_BOUNDS, DefaultLocation.EXCEPTION_PARAMETER})
@SubtypeOf({AssignsFields.class})
@DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
public @interface Mutable {
}
