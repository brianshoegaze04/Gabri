package afu.org.checkerframework.checker.i18n.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ImplicitFor(trees = {Kind.INT_LITERAL, Kind.LONG_LITERAL, Kind.FLOAT_LITERAL, Kind.DOUBLE_LITERAL, Kind.BOOLEAN_LITERAL, Kind.NULL_LITERAL})
@SubtypeOf({UnknownLocalized.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface Localized {
}
