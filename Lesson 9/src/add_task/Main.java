// Создайте класс Animal
// Опишите в нем 3 различных поля, создайте конструктор, методы.
// Создайте файл и выполните сериализацию объекта Animal.

package add_task;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Жучка", 4,true);

        File f = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 9\\src\\add_task\\animal.txt");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f))) {
            outputStream.writeObject(animal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
