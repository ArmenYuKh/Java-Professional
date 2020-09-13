//        Используя коллекцию удвойте слово:
//        1. Введите с клавиатуры 5 слов в список строк.
//        2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
//        3. Используя цикл for выведите результат на экран, каждое значение с новой строки.

package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> al = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку [" + i + "]");
            String s = reader.readLine();
            al.add(s);
        }
            doubleValues(al);

        System.out.println("Список введённых с клавиатуры строк: ");
        // Выводим на экран все содержимое
        for (String temp : al) {
            System.out.println(temp);
        }
    }

    public static void doubleValues (ArrayList<String> al){
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            al.set(i, s + ", " + s);
        }
    }
}
