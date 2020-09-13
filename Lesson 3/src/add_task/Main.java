//        Программа определяет, какая семья (фамилия) живёт в городе:
//        Пример ввода:
//         Москва
//         Ивановы
//         Киев
//         Петровы
//         Лондон
//         Абрамовичи

//         Лондон
//        Пример вывода:
//         Абрамовичи

package add_task;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("Москва");
        City city2 = new City("Киев");
        City city3 = new City("Лондон");
        City city4 = new City("Вашингтон");

        HashMap<City, String> hm = new HashMap<>();
        hm.put(city1,"Ивановы");
        hm.put(city2,"Петровы");
        hm.put(city3,"Абрамовичы");
        hm.put(city4,"Симпсоны");

        City findFamily1 = new City("Москва");
        City findFamily2 = new City("Киев");
        City findFamily3 = new City("Лондон");
        City findFamily4 = new City("Вашингтон");
        System.out.println(hm.get(findFamily1));
        System.out.println(hm.get(findFamily2));
        System.out.println(hm.get(findFamily3));
        System.out.println(hm.get(findFamily4));
    }
}


class City {
    private String city;

    public City(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city == city1.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }
}
