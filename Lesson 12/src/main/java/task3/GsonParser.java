package task3;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GsonParser {
    public static void parseGson(String text) throws IOException {
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
        String gson = new Gson().toJson(lhm);
        System.out.println("\nGSON: " + gson);

        Files.write(Paths.get("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 12\\src\\main\\resources\\gson.json"),
                gson.getBytes(), StandardOpenOption.CREATE);
    }
}
