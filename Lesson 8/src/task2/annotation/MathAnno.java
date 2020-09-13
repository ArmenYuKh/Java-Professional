// Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
// Сделать полную документацию всех полей, методов, конструкторов класса используя
// аннотацию Documented, либо же документационные комментарии.

package task2.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для произведения математических операций над 2 числами.
 *
 * @author Armen
 * @since 12
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MathAnno {
    double num1() default 0;
    double num2() default 0;
}

