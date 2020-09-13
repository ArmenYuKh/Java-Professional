// Необходимо создать строку с текстом (текст взять любой из интернета).
// Разбить эту строку на 2 подстроки равной длины и вывести на экран каждое предложения с новой строки.

package task3;


public class Main {
    public static void main(String[] args) {
        String Text = "Меньше часа езды от Флоренции, - и вы у старого замка. Хотя замка уже нет, от него остались одни развалины. Горячий летний ветер пахнет сеном.";
        StringBuilder sb = new StringBuilder(Text);
        System.out.println("Исходный текст: " + "\n" + sb);

        System.out.println("\nТекст после деления на 2 подстроки:");

        System.out.println(sb.substring(0, sb.length()/2));
        System.out.println(sb.substring(sb.length()/2, sb.length()));
    }
}
