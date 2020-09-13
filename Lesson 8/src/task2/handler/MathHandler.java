// Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
// Сделать полную документацию всех полей, методов, конструкторов класса используя
// аннотацию Documented, либо же документационные комментарии.

package task2.handler;

import task2.annotation.MathAnno;

public class MathHandler {
    @MathAnno(num1 = 10, num2 = 20)

    /**
     * @param num1 слагаемое 1
     * @param num2 слагаемое 2
     */
    public void mathSum (double num1, double num2) {
        System.out.println("Сумма двух чисел: " + (num1 + num2));
    }

    /**
     * @param num1 уменьшаемое
     * @param num2 вычитаемое
     */
    @MathAnno(num1 = 10, num2 = 20)
    public void mathSub (double num1, double num2) {
        System.out.println("Разность двух чисел: " + (num1 - num2));
    }

    /**
     * @param num1 множимое
     * @param num2 множитель
     */
    @MathAnno(num1 = 10, num2 = 20)
    public void mathMul (double num1, double num2) {
        System.out.println("Результат умножения двух чисел: " + (num1 * num2));
    }

    /**
     * @param num1 делимое
     * @param num2 делитель
     */
    @MathAnno(num1 = 10, num2 = 20)
    public void mathDiv (double num1, double num2) {
        System.out.println("Результат деления двух чисел: " + (num1 / num2));
    }
}
