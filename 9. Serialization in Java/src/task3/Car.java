// Создайте класс Car.
// Опишите в нем 3 различных поля включая статические поля, создайте конструктор, методы.
// Посредством Java создайте файл и выполните сериализацию объекта Animal используя интерфейс Externalizable.

package task3;

import java.io.*;

public class Car implements Externalizable {
    private int price;
    private String model;
    private static int year;

    public Car() {
    }

    public Car(int price, String model, int year) {
        this.price = price;
        this.model = model;
        Car.year = year;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(price);
        out.writeObject(model);
        out.writeInt(year);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        price = in.readInt();
        model = (String) in.readObject();
        year = in.readInt();
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        Car.year = year;
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car(100000, "BMW", 2020);
        File f = new File("C:\\Users\\ASSASSIN\\Documents\\Java\\Java Professional\\MyHomeWork\\Lesson 9\\src\\task3\\external.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(car);
            car = (Car) inputStream.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
