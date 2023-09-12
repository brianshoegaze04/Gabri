package afu.org.checkerframework.common.util.report.qual;

import afu.org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import afu.org.checkerframework.framework.qual.InvisibleQualifier;
import afu.org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@InvisibleQualifier
@SubtypeOf({})
@DefaultQualifierInHierarchy
public @interface ReportUnqualified {
}
