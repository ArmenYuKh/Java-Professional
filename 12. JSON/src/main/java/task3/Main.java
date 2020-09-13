// Создать 2 класса: GsonParser, Main
// Создать строку с содержимым в формате JSON (к примеру): Страна: Украина, город: Киев, улица: Крещатик.
// Строку обработать и записать в JSON файл, используя GSON-библиотеку.

package task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String text = "Страна: Россия, город: Москва, улица: Никольская";
        GsonParser.parseGson(text);
    }
}