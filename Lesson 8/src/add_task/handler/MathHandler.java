package add_task.handler;

import add_task.annotation.MathAnno;

public class MathHandler {
    @MathAnno(num1 = 50)
    @MathAnno(num2 = 100)
    public void mathSum (int num1, int num2) {
        System.out.println("Сумма двух чисел: " + (num1 + num2));
    }
}
