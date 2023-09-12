package afu.org.checkerframework.checker.initialization.qual;

import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.ImplicitFor;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import afu.org.checkerframework.framework.qual.TargetLocations;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@TargetLocations({DefaultLocation.EXPLICIT_LOWER_BOUNDS, DefaultLocation.EXPLICIT_UPPER_BOUNDS})
@Documented
@Target({ElementType.TYPE_USE})
@ImplicitFor(trees = {Kind.NULL_LITERAL})
@SubtypeOf({UnderInitialization.class, Initialized.class})
@Retention(RetentionPolicy.RUNTIME)
public @interface FBCBottom {
}
