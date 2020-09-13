// Создать класс Book, сделать 3 поля и соответствующие методы. Необходимо реализовать
// замыкание анонимного класса и лямбда-выражения.

package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("Н.В. Гоголь","Мёртвые души", 1842));
//        books.add(new Book("А.С. Пушкин","Евгений Онегин", 1825));
//        books.add(new Book("М.Ю. ЛермоList<Book> books = new ArrayList<>();
        Book book1 = new Book("Н.В. Гоголь","Мёртвые души", 1842);
        Book book2 = new Book("А.С. Пушкин","Евгений Онегин", 1825){
            @Override
            public int getYear(){
                newYear2 = 1995;
                return newYear2;
            }
        };
        Book book3 = new Book("М.Ю. Лермонтов","Герой нашего времени", 1840) {
            @Override
            public int getYear(){
                return newYear;
            }
        };


        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(book1.getYear());
        System.out.println(book2.getYear());
        System.out.println(book3.getYear());
    }
}
