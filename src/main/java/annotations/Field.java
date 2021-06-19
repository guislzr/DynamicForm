package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface Field {
    String name() default "";

    boolean required() default false;

    String defaultValue() default "";

    long size() default 20L;
}
