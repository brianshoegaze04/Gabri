package afu.org.checkerframework.framework.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@SubtypeOf({})
@TargetLocations({DefaultLocation.EXPLICIT_LOWER_BOUNDS, DefaultLocation.EXPLICIT_UPPER_BOUNDS})
@Target({ElementType.TYPE_USE})
public @interface Bottom {
}
