// Создать класс Bird.
// Создать 3 поля (static, final и transient), методы, конструктор.
// Клонировать объект используя глубокое клонирование через сериализацию

package task2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bird implements Serializable {
    private static String name;
    private final int year = 2000;
    private transient int weight;

    public Bird() {
    }

    public Bird(String name, int weight) {
        Bird.name = name;
        this.weight = weight;
    }
    // Изменим стандартное поведение для возможости сериализации и десериализации transient-поля
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.writeInt(weight);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            weight = ois.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name=" + name +
                ", year=" + year +
                ", weight=" + weight +
                '}';
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Bird.name = name;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
