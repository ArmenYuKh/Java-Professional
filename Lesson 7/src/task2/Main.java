// Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает,
// какой именно класс интересует.

package task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class Elephant {
    public String name = "Джамбо";
    private int age = 3;
    protected boolean tail = true;

    public Elephant(){

    }
    public Elephant (String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}

class Cat {
    public String name = "Муся";
    private int age = 6;
    protected boolean tail = true;

    public Cat (String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}

class Dog {
    public String name = "Жучка";
    private int age = 6;
    protected boolean tail = true;

    public Dog (int age) {
        this.age = age;
    }

    public Dog (String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название класса, о котором хотите получить информацию. Доступные классы: Elephant, Cat, Dog.");
        String clName = in.nextLine();
        switch (clName) {
            case "Elephant":
                Elephant elephant = new Elephant();
                classInfo(elephant);
                break;
            case "Cat":
                Cat cat = new Cat("Василиса", 12, true);
                classInfo(cat);
                break;
            case "Dog":
                Dog dog = new Dog("Аполлон", 1, true);
                classInfo(dog);
                break;
            default:
                System.out.println("Класс с указанным Вами именем не существует! Повторите попытку!");
        }
    }

    public static <T> void classInfo(T classObject) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        Class<?> cl = classObject.getClass();

        System.out.println(s + "Constructors:" + s1);
        // Получаем массив конструкторов
        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            // Выводим типы параметров каждого конструктора
            System.out.print(s + "\tConstructor " + (++i) + ": ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(s1 + paramType.getName() + " ");
            }
            System.out.println();
        }
        try {
            // Выводим все имеющиеся поля со значениями
            Field field1 = cl.getField("name");
            Field field2 = cl.getDeclaredField("age");
            Field field3 = cl.getDeclaredField("tail");

            field2.setAccessible(true); // чтобы получить доступ к полю с модификатором private

            Object n = field1.get(classObject);
            Object a = field2.getInt(classObject);
            Object t = field3.getBoolean(classObject);
            System.out.println(s + "Fields: " + s1 + "Name - " + n + ", Age - " + a + ", Tail - " + t);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println(s + "Name: " + s2 + method.getName());
            System.out.println(s + "\tReturn type: " + s1 + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(s + "\tParam types:" + s1);
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();

        }
    }

}