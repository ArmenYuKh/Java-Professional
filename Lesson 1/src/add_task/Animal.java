//        В папке с примерами, ex_004_comparable.
//        Дописать логику, чтобы метод compareTo() осуществил поиск по скорости(если же скорость у 2-х объектов
//        равна, то ищем по цене) -> цене - > весу -> породе.


package add_task;

public class Animal implements Comparable <Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене/весу/породе
    public int compareTo(Animal o) {
        int tmp = this.speed - o.speed;
        if (tmp == 0) {
            tmp = this.price - o.price;
            if (tmp == 0) {
                tmp = this.weight - o.weight;
                if (tmp == 0) {
                    return this.breed.compareTo(o.breed);
                }
                else return tmp;
            }
            else {
                return tmp;
            }
        }
        else {
            return tmp;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.breed.compareTo(((Animal)o).breed);
    // return this.breed.compareTo(o.breed);
}