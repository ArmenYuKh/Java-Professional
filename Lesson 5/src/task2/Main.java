//В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.

package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String Text = "Мир таков, каков он есть. Трудно предположить, чтобы мир был создан единственно для удовлетворения наших потребностей. Это было бы чудом из чудес. Мир нейтрален. Он не дружествен и не враждебен человеку. ";
        String[] splitText = Text.split("\\. ");
        System.out.println("Исходный текст: " + "\n" + Text);

        System.out.println("\nТекст после разбиения на отдельные предложения:");
        for (int i = 0; i < splitText.length; i++) {
            System.out.print(splitText[i] + "\n");
        }
        System.out.println("=========================");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < splitText.length; i++) {
            String[] splitSentence = splitText[i].split(" ");

            String tmp = splitSentence[0];
            splitSentence[0] = splitSentence[splitSentence.length - 1];
            splitSentence[splitSentence.length - 1] = tmp;

            System.out.println(Arrays.toString(splitSentence));

            sb.append(Arrays.toString(splitSentence));
        }
        System.out.println("\nТекст после перестановки слов: " + "\n" + sb);
    }
}
