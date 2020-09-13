// Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.
// Под средством рефлексии получите всю информацию о полях, методах, конструкторах, а также модификаторах доступа

package task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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

public class Main {
    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";

        Class<?> cl1 = Elephant.class;
        System.out.println(s + "Constructors:" + s1);
        // Получаем массив конструкторов
        Constructor<?>[] constructors = cl1.getConstructors();
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
            Constructor<?> ctr = cl1.getConstructor();
            Elephant ep = (Elephant) ctr.newInstance();
            System.out.println(s + "Fields: " + s1 + " Age - " + ep.getAge() + ", Name - " + ep.getName() + ", Tail - " + ep.isTail());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Method[] methods = cl1.getMethods();
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
