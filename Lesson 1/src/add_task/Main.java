//        В папке с примерами, ex_004_comparable.
//        Дописать логику, чтобы метод compareTo() осуществил поиск по скорости(если же скорость у 2-х объектов
//        равна, то ищем по цене) -> цене - > весу -> породе.

package add_task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 4000);
        Animal dog = new Animal("Labrador", 7, 25, 4000);
        Animal bird = new Animal("King Penguin", 7, 25, 4000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
