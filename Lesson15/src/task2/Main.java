// Создать список и заполнить рандомными числами 10 ячеек, нужно вывести сумму квадратов всех элементов списка.
// Мы используем метод map() для возведения в квадрат каждого элемента, а потом применяем метод reduce()
// для свертки всех элементов в одно число.

package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(new Number((int) (Math.random() * 20)));
        }

        System.out.println("Исходные числа: " + numbers.toString());

        Integer integer = numbers.stream()
                .map(num -> num.getNum() * num.getNum())
                .reduce(Integer::sum)
                .get();
        System.out.println("Сумма квадратов всех элементов списка: " + integer);
    }
}
