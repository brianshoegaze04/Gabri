package afu.org.checkerframework.checker.javari.qual;

import afu.org.checkerframework.framework.qual.DefaultFor;
import afu.org.checkerframework.framework.qual.DefaultLocation;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Target;

@DefaultFor({DefaultLocation.FIELD})
@SubtypeOf({ReadOnly.class})
@Target({})
public @interface ThisMutable {
}
