package add_task.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MathRepeatedAnnos {
    MathAnno[] value();
}
