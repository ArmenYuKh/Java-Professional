// Создайте класс Car.
// Опишите в нем 3 различных поля, создайте конструктор, методы.
// Выполните поверхностное и глубокое клонирования объекта Car.

package add_task.DeepCloning;

public class DeepCloning {
    public static void main(String[] args) {
        Car originalCar = new Car ("Mercedes-Benz", 180, 2000);
        Car cloneCar = new Car (originalCar);

        System.out.println(originalCar);
        System.out.println(cloneCar);
    }
}
