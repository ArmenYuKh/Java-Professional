// Создайте класс Car.
// Опишите в нем 3 различных поля, создайте конструктор, методы.
// Выполните поверхностное и глубокое клонирования объекта Car.

package add_task.ShallowCloning;

public class Car implements Cloneable {
    public String model;
    public int weight;
    public int year;

    public Car() {
    }

    public Car(String model, int weight, int year) {
        this.model = model;
        this.weight = weight;
        this.year = year;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}
