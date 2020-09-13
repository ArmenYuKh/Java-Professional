// Создать класс Animal и Eagle.
// Создать 3 поля в классе Animal, Eagle должен наследовать класс Animal.
// Клонировать объект Eagle.

package task3;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal() {
    }

    Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';
    }
}

class Eagle extends Animal {
   public Eagle(String name, int age, boolean tail) {
       super(name, age, tail);
   }

    public static Eagle deepCopyEagle(Eagle eagleToCopy) {
        Eagle copiedEagle = new Eagle("Eagle", 12, true);
        copiedEagle.name = eagleToCopy.name;
        copiedEagle.age = eagleToCopy.age;
        copiedEagle.tail = eagleToCopy.tail;
        return copiedEagle;
    }
}
