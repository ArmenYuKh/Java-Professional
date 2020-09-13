//        Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
//        1. Создать список строк.
//        2. Ввести строки с клавиатуры и добавить их в список.
//        3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end". "end" не учитывать.
//        4. Вывести строки на экран, каждую с новой строки.


package add_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Создаем объект ArrayList
        ArrayList <String> al = new ArrayList<>();

        // Создаем объект BufferedReader для дальнейшего ввода с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean cnt = false; // количество введённых строк

        // Циклом заполняем коллекцию arrayList значениями с клавиатуры
        for (int i = 0; ; i++) {
            System.out.println("Введите строку [" + i + "]");
            String s = reader.readLine();
            // Добавляем значение в конец массива

            if (s.equals("End") || s.equals("end") || s.equals("")) {
                break;
            }
            else
            {
                cnt = true;
                al.add(s);
            }
        }

        if (cnt == false)
            System.out.println("Нет строк для отображения, поскольку программа была прервана или была введена пустая строка!");
        else
            {
                System.out.println("Список введённых с клавиатуры строк: ");
                // Выводим на экран все содержимое
                for (String temp : al) {
                    System.out.println(temp);
                }
            }
    }
}
