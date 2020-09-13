// Создайте несколько классов, один класс наследует другой и использует аннотацию @Inherited.
// Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.

package task3;


public class A {
    public void print () {
        System.out.println("Method from class A");
    }

    @Anno(value = "test", i = 10)
    public void show (int i) {
        System.out.println(i);
    }
}

@SuppressWarnings("unused") class B extends A {
    String s;
    @Override
    public void print () {
        System.out.println("Method from class B");
    }
}
