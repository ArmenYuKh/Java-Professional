// Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.

package add_task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String Text = "Как далеко ты от меня! Там, в сказочном Париже, танцуешь на величественной театральной сцене на Елисейских полях. Я хорошо знаю это, и все же мне кажется, что в ночной тишине я слышу твои шаги, вижу твои глаза, которые блестят, словно звезды на зимнем небе. Сегодня твой черед. Танцуй!";
    String[] splitText = Text.split("[.;!?]");

    System.out.println("Исходный текст: " + "\n" + Text);
    System.out.println("\nТекст после разбиения на отдельные предложения:");
    for (int i = 0; i < splitText.length; i++) {
        System.out.print(splitText[i].trim() + "\n");
    }

    for (int i = 0; i < splitText.length - 1; i++) {
        for (int j = i + 1; j < splitText.length; j++) {
            if (splitText[i].split(" ").length > splitText[j].split(" ").length) {
                String tmp = splitText[i];
                splitText[i] = splitText[j];
                splitText[j] = tmp;
            }
        }
    }
    System.out.println("\nТекст после сортировки: " + Arrays.toString(splitText));

    }
}
