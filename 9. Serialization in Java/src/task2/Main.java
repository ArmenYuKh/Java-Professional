// Необходимо осуществить десериализацию с файла предыдущего проекта(Animal) и вывести на экран содержимое.

package task2;

import add_task.Animal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 9\\src\\add_task\\animal.txt");
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            Object animal = inputStream.readObject();
            System.out.println(animal);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
