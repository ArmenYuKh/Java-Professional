// Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
// Сделать полную документацию всех полей, методов, конструкторов класса используя
// аннотацию Documented, либо же документационные комментарии.

package task2;


import task2.annotation.MathAnno;
import task2.handler.MathHandler;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathHandler mathHandler = new MathHandler();
        Class<?> cl = MathHandler.class;
        try {
            /**
             * Получаем метод по указанному имени
             * @param mathSum метод для суммирования двух чисел
             * @param double.class тип первого числа в методе
             * @param double.class тип второго числа в методе
             */
            Method m1 = cl.getDeclaredMethod("mathSum", double.class, double.class);

            /**
             * Получаем метод по указанному имени
             * @param mathSub метод для вычитания двух чисел
             * @param double.class тип первого числа в методе
             * @param double.class тип второго числа в методе
             */
            Method m2 = cl.getDeclaredMethod("mathSub", double.class, double.class);

            /**
             * Получаем метод по указанному имени
             * @param mathMul метод для умножения двух чисел
             * @param double.class тип первого числа в методе
             * @param double.class тип второго числа в методе
             */
            Method m3 = cl.getDeclaredMethod("mathMul", double.class, double.class);

            /**
             * Получаем метод по указанному имени
             * @param mathDiv метод для деления двух чисел
             * @param double.class тип первого числа в методе
             * @param double.class тип второго числа в методе
             */
            Method m4 = cl.getDeclaredMethod("mathDiv", double.class, double.class);

            MathAnno mathAnno1 = m1.getAnnotation(MathAnno.class);
            mathHandler.mathSum(mathAnno1.num1(), mathAnno1.num2());

            MathAnno mathAnno2 = m2.getAnnotation(MathAnno.class);
            mathHandler.mathSub(mathAnno2.num1(), mathAnno2.num2());

            MathAnno mathAnno3 = m3.getAnnotation(MathAnno.class);
            mathHandler.mathMul(mathAnno3.num1(), mathAnno3.num2());

            MathAnno mathAnno4 = m4.getAnnotation(MathAnno.class);
            mathHandler.mathDiv(mathAnno4.num1(), mathAnno4.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
