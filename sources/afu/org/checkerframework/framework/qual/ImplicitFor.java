package afu.org.checkerframework.framework.qual;

import afu.com.sun.source.tree.Tree;
import afu.com.sun.source.tree.Tree.Kind;
import afu.org.checkerframework.framework.type.AnnotatedTypeMirror;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.lang.model.type.TypeKind;

@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ImplicitFor {
    String[] stringPatterns() default {};

    Class<? extends Tree>[] treeClasses() default {};

    Kind[] trees() default {};

    Class<? extends AnnotatedTypeMirror>[] typeClasses() default {};

    Class<?>[] typeNames() default {};

    TypeKind[] types() default {};
}
