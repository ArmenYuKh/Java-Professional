//Создать свою аннотацию используя аннотацию @Repeteable с Java 8,
// вызвать дважды аннотацию подтягивая разные параметры выполнить сложение 2-х чисел.
//@MathAnno(num1 = 50)
//@MathAnno(num2 = 100)
//public void mathSum(int num1, int num2)

package add_task;


import add_task.annotation.MathAnno;
import add_task.annotation.MathRepeatedAnnos;
import add_task.handler.MathHandler;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();
        Class<?> cl = MathHandler.class;
        try {
            Method m = cl.getDeclaredMethod("mathSum", int.class, int.class);
//            MathAnno mathAnno = m.getAnnotation(MathAnno.class);
//            mathHandler.mathSum(mathAnno.num1(), mathAnno.num2());


            Annotation[] annos = m.getDeclaredAnnotations();
            for (Annotation a : annos){
                System.out.println(a);
            }
            Annotation annotation = annos[0];
            MathRepeatedAnnos repeatedAnnos = (MathRepeatedAnnos) annotation;
            MathAnno[] mathAnnos = repeatedAnnos.value();
            for (MathAnno a : mathAnnos){
                System.out.println(a);
            }

            mathHandler.mathSum(mathAnnos[0].num1(), mathAnnos[1].num2());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
