// Создайте классы Currency, Parser, Main
// Подключиться к NBU API(https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json)
// и вывести в консоль 3 валюты на выбор

package add_task.parser;

import add_task.entity.Currency;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Parser {
    public static void parseJson (String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Currency[] currencyRates = objectMapper.readValue(new URL(url), Currency[].class);

        // Выводим 3 валюты на выбор - первые 3 валюты
        for (int i = 0; i < 3; i++) {
            System.out.println(currencyRates[i]);
        }

//        for (Currency currency : currencyRates) {
//            System.out.println(currency);
//        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                                        .writeValueAsString(currencyRates);

        Files.write(Paths.get("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 12\\src\\main\\resources\\jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
