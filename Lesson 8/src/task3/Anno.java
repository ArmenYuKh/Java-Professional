package task3;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@SuppressWarnings("unused")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.LOCAL_VARIABLE})
public @interface Anno {
    String value();
    int i() default 100;
}

