// Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.

package task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаём массив случайных целых чисел
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }

        System.out.println("Массив до сортировки:");
        for (int temp : array) {
            System.out.println(temp);
        }

        // Сортируем массив случайных целых чисел
        Arrays.sort(array);

        System.out.println("Массив после сортировки:");
        for (int temp : array) {
            System.out.println(temp);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 4\\src\\task3\\int_file.txt"))) {
            // Чтение построчно и запись в файл
            for (int i = 0; i < array.length; i++)
            {
                bw.write(array[i] + "\n");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
