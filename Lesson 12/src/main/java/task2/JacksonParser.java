// Создать 2 класса: JacksonParser, Main
// Создать строку с содержимым в формате JSON (к примеру): Страна: Украина, город: Киев, улица: Крещатик.
// Строку обработать и записать в JSON файл, используя Jackson-библиотеку.

package task2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class JacksonParser {
    public static void parseJson(String text) throws IOException {
        System.out.println("Исходная строка: " + text);
        String[] splitText = text.split(",\\s");
        // Используем LinkedHashMap, чтобы создать связный список элементов в карте,
        // расположенных в том порядке, в котором они вставлялись
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        // Разбиваем на отдельные слова и помещаем в HashMap
        for (int i = 0; i < splitText.length; i++) {
            String[] splitWord = splitText[i].split(":\\s");
            lhm.put(splitWord[0], splitWord[1]);
        }
        System.out.println("LinkedHashMap: " + lhm);
        String json = new ObjectMapper().writeValueAsString(lhm);
        System.out.println("\nJSON: " + json);

        Files.write(Paths.get("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 12\\src\\main\\resources\\json.json"),
                json.getBytes(), StandardOpenOption.CREATE);
    }
}
