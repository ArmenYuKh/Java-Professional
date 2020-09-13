//Создать свою аннотацию используя аннотацию @Repeteable с Java 8,
// вызвать дважды аннотацию подтягивая разные параметры выполнить сложение 2-х чисел.
//@MathAnno(num1 = 50)
//@MathAnno(num2 = 100)
//public void mathSum(int num1, int num2)

package add_task.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MathRepeatedAnnos.class)
public @interface MathAnno {
    int num1() default 0;
    int num2() default 0;
}

