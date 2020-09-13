// Создайте классы Currency, Parser, Main
// Подключиться к NBU API(https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json)
// и вывести в консоль 3 валюты на выбор

package add_task;

import add_task.parser.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser.parseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}
