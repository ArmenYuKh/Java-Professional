// Создать класс Animal и Eagle.
// Создать 3 поля в классе Animal, Eagle должен наследовать класс Animal.
// Клонировать объект Eagle.

package task3;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle", 1, true);
        System.out.println("Original eagle = " + eagle);

        Eagle copiedEagle = Eagle.deepCopyEagle(eagle);
        System.out.println("Copied eagle = " + copiedEagle);
    }
}
