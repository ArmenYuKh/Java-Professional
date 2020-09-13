// Напишите основные арифметические действия калькулятора, используя лямбда-выражения.

package add_task;

public class Main {
    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        double addition = add.calculate(20.9, 18.4);
        double subtraction = sub.calculate(20.9, 18.4);
        double multiplication = mul.calculate(20.9, 18.4);
        double division = div.calculate(20.9, 18.4);

        System.out.println("Результат сложения: " + addition);
        System.out.println("Результат вычитания: " + subtraction);
        System.out.println("Результат умножения: " + multiplication);
        System.out.println("Результат деления: " + division);
    }
}


@FunctionalInterface
interface Calculator {
    double calculate (double x, double y);
}
