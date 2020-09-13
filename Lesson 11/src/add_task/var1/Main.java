// Создать XML файл со структурой: ...
// Создать класс AnimalParser.
// Вывести в консоль name, breed всех котов используя любой из рассматриваемых ранее парсеров.

package add_task.var1;

public class Main {
    public static void main(String[] args) {
        AnimalParser animal = new AnimalParser("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\" +
                "MyHomeWork\\Lesson 11\\src\\add_task\\var1\\1.xml");

        // Указываем путь, который будем считывать с файла xml

        String value1 = animal.get("animal/cat1/name");
        String value2 = animal.get("animal/cat1/breed");
        String value3 = animal.get("animal/cat2/name");
        String value4 = animal.get("animal/cat2/breed");
        System.out.println(value1 + " " + value2);
        System.out.println(value3 + " " + value4);
    }
}
