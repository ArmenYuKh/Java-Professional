//        Вывод на экран элементов List:
//        Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.

package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        ListIterator<Integer> li = list.listIterator();

        while (li.hasNext()) {
            Integer tmp = li.next();
            System.out.print(tmp + " ");
        }
    }
}
