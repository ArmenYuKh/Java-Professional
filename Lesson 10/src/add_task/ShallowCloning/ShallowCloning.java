// Создайте класс Car.
// Опишите в нем 3 различных поля, создайте конструктор, методы.
// Выполните поверхностное и глубокое клонирования объекта Car.

package add_task.ShallowCloning;

public class ShallowCloning {
    public static void main(String[] args) {
       Car car = new Car ("Lamborghini", 150, 2020);

        try {
            Car cloneCar = (Car) car.clone();
            System.out.println(car);
            System.out.println(cloneCar);

            cloneCar.model = "BMW";
            cloneCar.weight = 130;
            cloneCar.year = 2019;

            System.out.println("После клонирования и передачи новых значений:");

            System.out.println(car);
            System.out.println(cloneCar);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
