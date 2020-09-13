//Собственная Hashtable. Реализовать методы замещения, удаления в собственном классе SimpleHashtable, дополняя предыдущее задание.

package task2;

import java.util.Hashtable;
import java.util.Objects;

public class SimpleHashtable {
    public static void main(String[] args) {
        City city1 = new City("Москва");
        City city2 = new City("Киев");
        City city3 = new City("Лондон");
        City city4 = new City("Вашингтон");

        Hashtable<City, String> hm = new Hashtable<>();
        hm.put(city1,"Ивановы");
        hm.put(city2,"Петровы");
        hm.put(city3,"Абрамовичы");
        hm.put(city4,"Симпсоны");

        hm.replace(city1, "Сидоровы");
        hm.replace(city2, "Петровы", "Андреевы");
        hm.remove(city3);


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
