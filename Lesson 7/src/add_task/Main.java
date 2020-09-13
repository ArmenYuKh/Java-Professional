// Создайте 2 класса, Animal и Cat.
// В классе Animal инициализируйте 3 поля различных модификаторов.
// В классе Cat, используя рефлексию, получите доступ к полям класса Animal и
// измените содержимое каждого из полей.

package add_task;

import java.lang.reflect.Field;

class Animal {
    public String name = "Ёжка";
    private int age = 2;
    protected boolean tail = false;
}

class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cl = Animal.class;
        Animal al = new Animal();

        Field field1 = cl.getField("name");
        Field field2 = cl.getDeclaredField("age");
        Field field3 = cl.getDeclaredField("tail");

        field1.setAccessible(true);
        field2.setAccessible(true);
        field3.setAccessible(true);

        System.out.println("Имя (класс Animal): " + field1.get(al));
        field1.set(al, "Мурка");
        System.out.println("Имя (класс Cat): " + field1.get(al));

        System.out.println("Возраст (класс Animal): " + field2.getInt(al));
        field2.setInt(al, 10);
        System.out.println("Возраст (класс Cat): " + field2.getInt(al));

        System.out.println("Хвост (класс Animal): " + field3.get(al));
        field3.set(al, true);
        System.out.println("Хвост (класс Cat): " + field3.get(al));
    }
}
