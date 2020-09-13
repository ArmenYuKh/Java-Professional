//        Минимальное из N чисел(использовать LinkedList):
//        1. Ввести с клавиатуры число N.
//        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//        3. Найти минимальное число среди элементов списка - метод getMinimum.

package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите колчество целых чисел, которое необходимо считать: ");
        int N = Integer.parseInt(reader.readLine());
        list = getIntegerList(N);
        // Выводим на экран все содержимое
        for (Integer temp : list) {
            System.out.println(temp);
        }
        System.out.println("\nМинимальное число среди элементов списка: " + getMinimum(list));
    }
    public static List<Integer> getIntegerList(Integer N) throws IOException {
        List<Integer> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.println("Введите число [" + i + "]");
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
        }
        System.out.println("\nСписок введённых с клавиатуры чисел: ");
        return list;
    }

    public static int getMinimum(List<Integer> list) {
        // Находим минимум
        return Collections.min(list);
    }
}
